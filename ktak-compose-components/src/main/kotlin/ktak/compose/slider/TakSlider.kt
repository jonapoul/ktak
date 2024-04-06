@file:Suppress(
  // https://publicobject.com/2024/01/30/internal-visibility/
  "CANNOT_OVERRIDE_INVISIBLE_MEMBER",
  "INVISIBLE_MEMBER",
  "INVISIBLE_REFERENCE",
)

package ktak.compose.slider

import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.TakPreview
import kotlin.math.max
import kotlin.math.min

@Composable
public fun TakSlider(
  value: Float,
  onValueChanged: (Float) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  valueRange: ClosedFloatingPointRange<Float> = DefaultTrackRange,
  steps: Int = 0,
  decimalPoints: Int = 1,
  colors: TakSliderColors = DefaultTakSliderColors(),
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  textPosition: TakSliderTextPosition = TakSliderTextPosition.AboveThumb,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onValueChangeFinished: (() -> Unit)? = null,
) {
  require(value in valueRange) { "$value is not in the given range $valueRange" }
  require(decimalPoints >= 0) { "Must have at least 0 decimal places, not $decimalPoints" }
  val onValueChangeState = rememberUpdatedState(onValueChanged)
  val tickFractions = remember(steps) { stepsToTickFractions(steps) }

  BoxWithConstraints(
    modifier = modifier
      .minimumInteractiveComponentSize()
      .requiredSizeIn(minWidth = dimensions.thumbRadius * 2, minHeight = dimensions.thumbRadius * 2)
      .sliderSemantics(value, enabled, onValueChanged, onValueChangeFinished, valueRange, steps)
      .focusable(enabled, interactionSource),
  ) {
    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
    val widthPx = constraints.maxWidth.toFloat()
    val maxPx: Float
    val minPx: Float

    with(LocalDensity.current) {
      maxPx = max(widthPx - dimensions.thumbRadius.toPx(), 0f)
      minPx = min(dimensions.thumbRadius.toPx(), maxPx)
    }
    val pixelRange = minPx..maxPx

    fun scaleToUserValue(offset: Float) = scale(minPx, maxPx, offset, valueRange.start, valueRange.endInclusive)
    fun scaleToOffset(userValue: Float) = scale(valueRange.start, valueRange.endInclusive, userValue, minPx, maxPx)

    val scope = rememberCoroutineScope()
    val rawOffset = remember { mutableStateOf(scaleToOffset(value)) }
    val pressOffset = remember { mutableStateOf(0f) }

    val draggableState = remember(minPx, maxPx, valueRange) {
      SliderDraggableState { delta ->
        rawOffset.value = (rawOffset.value + delta + pressOffset.value).coerceIn(pixelRange)
        pressOffset.value = 0f
        val offsetInTrack = rawOffset.value.coerceIn(minPx, maxPx)
        onValueChangeState.value.invoke(scaleToUserValue(offsetInTrack))
      }
    }

    CorrectValueSideEffect(::scaleToOffset, valueRange, minPx..maxPx, rawOffset, value)

    val gestureEndAction = rememberUpdatedState<(Float) -> Unit> { velocity: Float ->
      val current = rawOffset.value
      val target = snapValueToTick(current, tickFractions, minPx, maxPx)
      if (current != target) {
        scope.launch {
          animateToTarget(draggableState, current, target, velocity)
          onValueChangeFinished?.invoke()
        }
      } else if (!draggableState.isDragging) {
        // check ifDragging in case the change is still in progress (touch -> drag case)
        onValueChangeFinished?.invoke()
      }
    }

    val press = Modifier.sliderTapModifier(
      draggableState = draggableState,
      interactionSource = interactionSource,
      maxPx = widthPx,
      isRtl = isRtl,
      rawOffset = rawOffset,
      gestureEndAction = gestureEndAction,
      pressOffset = pressOffset,
      enabled = enabled,
    )

    val drag = Modifier.draggable(
      orientation = Orientation.Horizontal,
      reverseDirection = isRtl,
      interactionSource = interactionSource,
      onDragStopped = { velocity -> gestureEndAction.value.invoke(velocity) },
      startDragImmediately = draggableState.isDragging,
      state = draggableState,
    )

    val coerced = value.coerceIn(valueRange.start, valueRange.endInclusive)
    val fraction = calcFraction(valueRange.start, valueRange.endInclusive, coerced)

    Box(
      modifier = press
        .then(drag)
        .then(DefaultSliderConstraints),
      contentAlignment = when (textPosition) {
        TakSliderTextPosition.AboveThumb -> Alignment.BottomStart
        TakSliderTextPosition.BelowThumb -> Alignment.TopStart
        TakSliderTextPosition.None -> Alignment.CenterStart
      },
    ) {
      LinearTrack(
        positionFraction = fraction,
        enabled = enabled,
        textPosition = textPosition,
        modifier = Modifier.fillMaxSize(),
        stepFractions = tickFractions,
        dimensions = dimensions,
        colors = colors,
      )
      LinearThumb(
        rawOffset = rawOffset,
        decimalPoints = decimalPoints,
        enabled = enabled,
        interactionSource = interactionSource,
        valueRange = valueRange,
        pixelRange = pixelRange,
        textPosition = textPosition,
        dimensions = dimensions,
        colors = colors,
      )
    }
  }
}

private val PreviewModifier = Modifier
  .width(500.dp)
  .wrapContentHeight()

@DarkPreview
@Composable
private fun SliderWithTextAbove() = TakPreview {
  var state by remember { mutableStateOf(0f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      value = state,
      onValueChanged = { state = it },
      textPosition = TakSliderTextPosition.AboveThumb,
    )
  }
}

@DarkPreview
@Composable
private fun SliderWithTextBelow() = TakPreview {
  var state by remember { mutableStateOf(1f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      value = state,
      onValueChanged = { state = it },
      textPosition = TakSliderTextPosition.BelowThumb,
    )
  }
}

@DarkPreview
@Composable
private fun SliderWithNoText() = TakPreview {
  var state by remember { mutableStateOf(0.5f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      value = state,
      onValueChanged = { state = it },
      textPosition = TakSliderTextPosition.None,
    )
  }
}

@DarkPreview
@Composable
private fun Disabled() = TakPreview {
  var state by remember { mutableStateOf(0.5f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      value = state,
      onValueChanged = { state = it },
      enabled = false,
    )
  }
}
