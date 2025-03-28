package ktak.compose.text

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import ktak.compose.core.TakTextStyles
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.TakPreview

@Composable
public fun TakIntegerPicker(
  value: Int,
  onValueChanged: (Int) -> Unit,
  range: IntRange,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  textStyle: TextStyle = TakTextStyles.H1,
  colors: TakIntegerPickerColors = DefaultTakIntegerPickerColors(),
  dimensions: TakIntegerPickerDimensions = DefaultTakIntegerPickerDimensions(),
) {
  require(value in range) { "Current value $value is not in the given range $range" }

  Row(
    modifier = modifier.height(intrinsicSize = IntrinsicSize.Max),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    val cornerRadius = dimensions.cornerRadius
    val startShape = RoundedCornerShape(topStart = cornerRadius, bottomStart = cornerRadius)
    val borderColor by colors.borderColor(enabled)
    val textColor by colors.textForegroundColor(enabled)
    val borderThickness = with(LocalDensity.current) { dimensions.borderThickness.toPx() }

    TakIntegerPickerButton(
      startShape,
      image = Icons.Default.Remove,
      enabled = enabled,
      isInRange = value > range.first,
      colors = colors,
      dimensions = dimensions,
      onClick = { onValueChanged(value - 1) },
    )

    Box(
      modifier = Modifier
        .fillMaxHeight()
        .weight(1f)
        .drawBehind {
          topBorder(borderColor, borderThickness)
          bottomBorder(borderColor, borderThickness)
        },
      contentAlignment = Alignment.Center,
    ) {
      Text(
        text = value.toString(),
        style = textStyle,
        color = textColor,
      )
    }

    val endShape = RoundedCornerShape(topEnd = cornerRadius, bottomEnd = cornerRadius)
    TakIntegerPickerButton(
      endShape,
      image = Icons.Default.Add,
      enabled = enabled,
      isInRange = value < range.last,
      colors = colors,
      dimensions = dimensions,
      onClick = { onValueChanged(value + 1) },
    )
  }
}

@Composable
private fun TakIntegerPickerButton(
  shape: Shape,
  image: ImageVector,
  enabled: Boolean,
  isInRange: Boolean,
  colors: TakIntegerPickerColors,
  dimensions: TakIntegerPickerDimensions,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onClick: () -> Unit,
) {
  val pressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.buttonBackgroundColor(enabled && isInRange, pressed)
  val foregroundColor by colors.buttonForegroundColor(enabled && isInRange)
  val borderColor by colors.borderColor(enabled)

  Box(
    modifier = Modifier
      .background(backgroundColor, shape)
      .border(dimensions.borderThickness, borderColor, shape)
      .fillMaxHeight()
      .clickable(interactionSource, indication = null, enabled = enabled, onClick = onClick)
      .padding(dimensions.iconPadding),
    contentAlignment = Alignment.Center,
  ) {
    Image(
      modifier = Modifier.sizeIn(dimensions.iconSize),
      imageVector = image,
      contentDescription = null,
      colorFilter = ColorFilter.tint(foregroundColor),
    )
  }
}

@DarkPreview
@Composable
private fun AtMinimum() = TakPreview {
  var state by remember { mutableStateOf(0) }
  TakIntegerPicker(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    range = 0..10,
  )
}

@DarkPreview
@Composable
private fun MinPlusOne() = TakPreview {
  var state by remember { mutableStateOf(1) }
  TakIntegerPicker(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    range = 0..10,
  )
}

@DarkPreview
@Composable
private fun Midway() = TakPreview {
  var state by remember { mutableStateOf(5) }
  TakIntegerPicker(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    range = 0..10,
  )
}

@DarkPreview
@Composable
private fun MidwayBigger() = TakPreview {
  var state by remember { mutableStateOf(5) }
  TakIntegerPicker(
    modifier = Modifier.size(width = 300.dp, height = 200.dp),
    value = state,
    onValueChanged = { state = it },
    range = 0..10,
  )
}

@DarkPreview
@Composable
private fun MaxMinusOne() = TakPreview {
  var state by remember { mutableStateOf(9) }
  TakIntegerPicker(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    range = 0..10,
  )
}

@DarkPreview
@Composable
private fun AtMaximum() = TakPreview {
  var state by remember { mutableStateOf(10) }
  TakIntegerPicker(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    range = 0..10,
  )
}

@DarkPreview
@Composable
private fun Disabled() = TakPreview {
  var state by remember { mutableStateOf(5) }
  TakIntegerPicker(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    range = 0..10,
    enabled = false,
  )
}
