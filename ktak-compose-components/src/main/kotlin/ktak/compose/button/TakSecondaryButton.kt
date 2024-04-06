package ktak.compose.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ktak.compose.core.TakColors
import ktak.compose.core.TakTextStyles
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.PreviewCallback
import ktak.compose.preview.TakPreview

@Composable
public fun TakSecondaryButton(
  text: String,
  modifier: Modifier = Modifier,
  isDisabled: Boolean = false,
  forceUppercase: Boolean = true,
  paddingValues: PaddingValues = DefaultPadding,
  colors: TakSecondaryButtonColors = DefaultTakSecondaryButtonColors(),
  textStyle: TextStyle = TakTextStyles.H4,
  fontSize: TextUnit = textStyle.fontSize,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  shape: Shape = TakButtonRoundedEdges,
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val foregroundColor by colors.foregroundColor(!isDisabled, isPressed)
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed)
  val borderColor by colors.borderColor(!isDisabled, isPressed)

  Box(
    modifier = Modifier
      .width(IntrinsicSize.Max)
      .height(IntrinsicSize.Max)
      .background(backgroundColor, shape = shape)
      .border(width = 1.dp, color = borderColor, shape = shape)
      .padding(paddingValues)
      .clickable(interactionSource, indication = null, enabled = !isDisabled, onClick = onClick)
      .then(modifier),
    contentAlignment = Alignment.Center,
  ) {
    Text(
      text = if (forceUppercase) text.uppercase() else text,
      modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(),
      textAlign = TextAlign.Center,
      color = foregroundColor,
      style = textStyle,
      fontSize = fontSize,
    )
  }
}

private val DefaultPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)

@DarkPreview
@Composable
private fun RegularWithIcon() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun WithoutForcedUppercase() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    forceUppercase = false,
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun NoPadding() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    paddingValues = PaddingValues(4.dp),
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun SpecificSize() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    modifier = Modifier.height(10.dp),
    paddingValues = PaddingValues(2.dp),
    fontSize = 8.sp,
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun RegularWithPadding() = TakPreview {
  TakSecondaryButton(
    modifier = Modifier.padding(8.dp),
    text = "Confirm",
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun DifferentColor() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    colors = DefaultTakSecondaryButtonColors(TakColors.Cyber),
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun Disabled() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    onClick = PreviewCallback,
    isDisabled = true,
  )
}
