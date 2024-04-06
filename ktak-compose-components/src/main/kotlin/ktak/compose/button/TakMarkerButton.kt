package ktak.compose.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ktak.compose.icons.TakIcons
import ktak.compose.icons.markers.Blue
import ktak.compose.icons.markers.Neutral
import ktak.compose.icons.markers.Purple
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.PreviewCallback
import ktak.compose.preview.TakPreview

@Composable
public fun TakMarkerButton(
  markerIcon: ImageVector,
  modifier: Modifier = Modifier,
  isDisabled: Boolean = false,
  colors: TakMarkerButtonColors = DefaultTakMarkerButtonColors(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed)
  val borderColor by colors.borderColor(!isDisabled, isPressed)

  Box(
    modifier = modifier
      .border(1.dp, color = borderColor)
      .background(shape = TakButtonRoundedEdges, color = backgroundColor)
      .clickable(interactionSource, enabled = !isDisabled, onClick = onClick, indication = null),
  ) {
    Image(
      modifier = Modifier.padding(5.dp),
      imageVector = markerIcon,
      contentDescription = null,
    )
  }
}

@DarkPreview
@Composable
private fun Purple() = TakPreview {
  TakMarkerButton(
    markerIcon = TakIcons.Markers.Purple,
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun Blue() = TakPreview {
  TakMarkerButton(
    markerIcon = TakIcons.Markers.Blue,
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun Neutral() = TakPreview {
  TakMarkerButton(
    markerIcon = TakIcons.Markers.Neutral,
    onClick = PreviewCallback,
  )
}
