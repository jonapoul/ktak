package ktak.compose.toggle

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.TakPreview

@Composable
public fun TakToggleSmall(
  isChecked: Boolean,
  modifier: Modifier = Modifier,
  isEnabled: Boolean = true,
  onCheckedChanged: ((Boolean) -> Unit)? = null,
  colors: TakToggleSmallColors = DefaultTakToggleSmallColors(),
  dimensions: TakToggleDimensions = DefaultTakToggleDimensions.small(),
) {
  TakToggleCommon(
    modifier = modifier,
    thumbOffset = dimensions.trackWidth - dimensions.thumbWidth,
    isChecked = isChecked,
    isEnabled = isEnabled,
    onCheckedChanged = onCheckedChanged,
    colors = colors,
    dimensions = dimensions,
    thumbContents = null,
  )
}

@DarkPreview
@Composable
private fun SmallEnabledUnchecked() = TakPreview {
  var isChecked by remember { mutableStateOf(false) }
  TakToggleSmall(isChecked = isChecked, isEnabled = true, onCheckedChanged = { isChecked = !isChecked })
}

@DarkPreview
@Composable
private fun SmallEnabledChecked() = TakPreview {
  var isChecked by remember { mutableStateOf(true) }
  TakToggleSmall(isChecked = isChecked, isEnabled = true, onCheckedChanged = { isChecked = !isChecked })
}

@DarkPreview
@Composable
private fun SmallDisabledUnchecked() = TakPreview {
  var isChecked by remember { mutableStateOf(false) }
  TakToggleSmall(isChecked = isChecked, isEnabled = false, onCheckedChanged = { isChecked = !isChecked })
}

@DarkPreview
@Composable
private fun SmallDisabledChecked() = TakPreview {
  var isChecked by remember { mutableStateOf(true) }
  TakToggleSmall(isChecked = isChecked, isEnabled = false, onCheckedChanged = { isChecked = !isChecked })
}
