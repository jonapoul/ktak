package ktak.compose.text

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ktak.compose.core.TakTextStyles
import ktak.compose.icons.TakIcons
import ktak.compose.icons.input.Message
import ktak.compose.icons.utility.Walking
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.PreviewCallback
import ktak.compose.preview.TakPreview

@Composable
public fun TakMessageTextInput(
  value: String,
  onValueChanged: (String) -> Unit,
  hint: String,
  modifier: Modifier = Modifier,
  startIcon: ImageVector? = null,
  endIcon: ImageVector? = TakIcons.Input.Message,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  textStyle: TextStyle = TakTextStyles.H3,
  error: Boolean = false,
  colors: TakTextInputColors = DefaultTakTextInputColors(),
  dimensions: TakTextInputDimensions = DefaultTakTextInputDimensions(),
  cornerRadius: Dp = 22.dp,
  textInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  buttonInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onClickSend: () -> Unit,
) {
  val entered = value.isNotBlank()
  val pressed by textInteractionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(enabled, pressed, error)
  val borderColor by colors.borderColor(enabled, pressed, error)
  val shape = RoundedCornerShape(size = cornerRadius)

  Box(
    modifier = modifier
      .background(backgroundColor, shape)
      .border(dimensions.borderThicknessSmall, borderColor, shape),
    contentAlignment = Alignment.Center,
  ) {
    Row {
      TakTextInputIcon(startIcon, borderColor, dimensions.iconPadding, dimensions.iconSize)

      Box(modifier = Modifier.weight(1f)) {
        val padding = calculateTextPadding(dimensions.textPadding, startIcon, endIcon)

        // Show the input text
        val textColor by colors.textColor(enabled, pressed, error)
        BasicTextField(
          value = value,
          onValueChange = onValueChanged,
          modifier = Modifier.padding(padding),
          enabled = enabled,
          readOnly = readOnly,
          textStyle = textStyle.copy(color = textColor),
          interactionSource = textInteractionSource,
          cursorBrush = SolidColor(textColor),
        )

        if (!entered) {
          // No text to show, so show the hint instead
          val hintColor by colors.hintColor(enabled, pressed, error)
          Text(
            modifier = Modifier.padding(padding),
            text = hint,
            style = TakTextStyles.H3,
            color = hintColor,
          )
        }
      }

      if (!enabled || value.isBlank()) {
        // "disable" the send button
        val endButtonColor by colors.borderColor(enabled = false, pressed = false, error = false)
        TakTextInputIcon(
          endIcon,
          endButtonColor,
          dimensions.iconPadding,
          dimensions.iconSize,
          onClick = null,
        )
      } else {
        TakTextInputIcon(
          endIcon,
          borderColor,
          dimensions.iconPadding,
          dimensions.iconSize,
          buttonInteractionSource,
          onClickSend,
        )
      }
    }
  }
}

@DarkPreview
@Composable
private fun StartIcon() = TakPreview {
  var state by remember { mutableStateOf("") }
  TakMessageTextInput(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    hint = "Walking",
    startIcon = TakIcons.Utility.Walking,
    onClickSend = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun EmptySearch() = TakPreview {
  var state by remember { mutableStateOf("") }
  TakMessageTextInput(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    hint = "Search",
    onClickSend = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun FilledSearch() = TakPreview {
  var state by remember { mutableStateOf("My message") }
  TakMessageTextInput(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    hint = "Search",
    onClickSend = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun ErrorSearch() = TakPreview {
  var state by remember { mutableStateOf("My message") }
  TakMessageTextInput(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    hint = "Search",
    error = true,
    onClickSend = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun ErrorEmpty() = TakPreview {
  var state by remember { mutableStateOf("") }
  TakMessageTextInput(
    modifier = Modifier.width(200.dp),
    value = state,
    onValueChanged = { state = it },
    hint = "Search",
    error = true,
    onClickSend = PreviewCallback,
  )
}
