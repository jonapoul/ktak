package ktak.compose.toggle

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.TakPreview

@Composable
public fun TakToggleLarge(
  isChecked: Boolean,
  modifier: Modifier = Modifier,
  isEnabled: Boolean = true,
  onCheckedChanged: ((Boolean) -> Unit)? = null,
  colors: TakToggleLargeColors = DefaultTakToggleLargeColors(),
  dimensions: TakToggleDimensions = DefaultTakToggleDimensions.large(),
  textChecked: String = "ON",
  textUnchecked: String = "OFF",
) {
  TakToggleCommon(
    modifier = modifier,
    thumbOffset = dimensions.trackWidth - dimensions.thumbWidth,
    isChecked = isChecked,
    isEnabled = isEnabled,
    onCheckedChanged = onCheckedChanged,
    colors = colors,
    dimensions = dimensions,
    thumbContents = {
      val textColor by colors.textColor(isEnabled, isChecked)
      val text = if (isChecked) textChecked else textUnchecked
      Text(text = text, style = LargeThumbTextStyle, color = textColor)
    },
  )
}

@DarkPreview
@Composable
private fun LargeEnabledUnchecked() = TakPreview {
  var isChecked by remember { mutableStateOf(false) }
  TakToggleLarge(isChecked = isChecked, isEnabled = true, onCheckedChanged = { isChecked = !isChecked })
}

@DarkPreview
@Composable
private fun LargeEnabledChecked() = TakPreview {
  var isChecked by remember { mutableStateOf(true) }
  TakToggleLarge(isChecked = isChecked, isEnabled = true, onCheckedChanged = { isChecked = !isChecked })
}

@DarkPreview
@Composable
private fun LargeDisabledUnchecked() = TakPreview {
  var isChecked by remember { mutableStateOf(false) }
  TakToggleLarge(isChecked = isChecked, isEnabled = false, onCheckedChanged = { isChecked = !isChecked })
}

@DarkPreview
@Composable
private fun LargeDisabledChecked() = TakPreview {
  var isChecked by remember { mutableStateOf(true) }
  TakToggleLarge(isChecked = isChecked, isEnabled = false, onCheckedChanged = { isChecked = !isChecked })
}
