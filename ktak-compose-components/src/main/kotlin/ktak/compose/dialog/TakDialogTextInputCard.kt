package ktak.compose.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ktak.compose.icons.TakIcons
import ktak.compose.icons.utility.Add
import ktak.compose.icons.utility.Watercraft
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.PreviewCallback
import ktak.compose.preview.TakPreview
import ktak.compose.text.DefaultTakTextInputColors
import ktak.compose.text.TakTextInput
import ktak.compose.text.TakTextInputColors

@Composable
public fun TakDialogTextInputCard(
  text: String,
  onTextChanged: (String) -> Unit,
  hint: String,
  modifier: Modifier = Modifier,
  dismissDialog: () -> Unit = {},
  error: Boolean = false,
  colors: TakTextInputColors = DefaultTakTextInputColors(),
  textIcon: ImageVector? = null,
  title: String? = null,
  description: String? = null,
  focusRequester: FocusRequester? = null,
  shape: Shape = TakDialogCardShape,
  positiveButton: TakDialogPositiveButton? = null,
  neutralButton: TakDialogNeutralButton? = null,
  negativeButton: TakDialogNegativeButton? = null,
) {
  TakDialogCard(
    dismissDialog = dismissDialog,
    modifier = modifier,
    shape = shape,
    positiveButton = positiveButton,
    neutralButton = neutralButton,
    negativeButton = negativeButton,
  ) {
    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      if (title != null) {
        TakDialogTitleText {
          Text(
            modifier = Modifier.padding(bottom = 10.dp),
            text = title,
          )
        }
      }

      if (description != null) {
        TakDialogContentText {
          Text(
            modifier = Modifier.padding(bottom = 10.dp),
            text = description,
            textAlign = TextAlign.Center,
          )
        }
      }

      val focusModifier = if (focusRequester == null) {
        Modifier
      } else {
        Modifier.focusRequester(focusRequester)
      }

      TakTextInput(
        modifier = focusModifier,
        value = text,
        hint = hint,
        onValueChanged = onTextChanged,
        startIcon = textIcon,
        colors = colors,
        error = error,
      )
    }
  }
}

@DarkPreview
@Composable
private fun PreviewInput() = TakPreview {
  var text by remember { mutableStateOf("") }
  TakDialogTextInputCard(
    text = text,
    onTextChanged = { text = it },
    hint = "This is a hint",
    title = "Hello world",
    description = "This is my wicked message. Here's a bit more to show how it behaves splitting over multiple lines.",
    positiveButton = PreviewPositiveButton,
    neutralButton = PreviewNeutralButton,
    negativeButton = PreviewNegativeButton,
  )
}

@DarkPreview
@Composable
private fun PreviewNoButtons() = TakPreview {
  var text by remember { mutableStateOf("") }
  TakDialogTextInputCard(
    text = text,
    onTextChanged = { text = it },
    hint = "This is a hint",
    title = "Hello world",
    description = "This is a similar wicked message, this time without any buttons.",
  )
}

@DarkPreview
@Composable
private fun PreviewWithIcon() = TakPreview {
  var text by remember { mutableStateOf("") }
  TakDialogTextInputCard(
    text = text,
    onTextChanged = { text = it },
    hint = "This is a hint",
    title = "Hello world",
    textIcon = TakIcons.Utility.Watercraft,
    positiveButton = TakDialogPositiveButton(text = "Save", icon = TakIcons.Utility.Add, onClick = PreviewCallback),
  )
}

@DarkPreview
@Composable
private fun PreviewWithError() = TakPreview {
  var text by remember { mutableStateOf("Invalid text") }
  TakDialogTextInputCard(
    text = text,
    onTextChanged = { text = it },
    hint = "This is a hint",
    title = "Hello world",
    description = "Something is wrong!",
    error = true,
    textIcon = TakIcons.Utility.Watercraft,
    positiveButton = TakDialogPositiveButton(text = "Save", icon = TakIcons.Utility.Add, onClick = PreviewCallback),
  )
}
