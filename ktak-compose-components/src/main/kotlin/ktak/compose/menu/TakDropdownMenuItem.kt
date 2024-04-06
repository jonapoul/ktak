package ktak.compose.menu

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ktak.compose.core.TakTypography
import ktak.compose.icons.TakIcons
import ktak.compose.icons.utility.Walking
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.PreviewCallback
import ktak.compose.preview.TakPreview

@Composable
public fun TakDropdownMenuItem(
  icon: ImageVector,
  text: String,
  modifier: Modifier = Modifier,
  style: TextStyle = TakTypography.body1,
  color: Color = Color.White,
  onClick: () -> Unit,
) {
  DropdownMenuItem(
    modifier = modifier,
    onClick = { onClick() },
  ) {
    Icon(
      modifier = Modifier.size(IconSize),
      imageVector = icon,
      contentDescription = null,
      tint = color,
    )

    Spacer(modifier = Modifier.width(SpacerWidth))

    Text(
      modifier = Modifier,
      text = text,
      color = color,
      style = style,
      fontSize = FontSize,
    )
  }
}

private val SpacerWidth = 12.dp

private val IconSize = 24.dp

private val FontSize = 14.sp

@Composable
@DarkPreview
private fun Preview() = TakPreview {
  TakDropdownMenuItem(
    icon = TakIcons.Utility.Walking,
    text = "Something",
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun PreviewMenuItem() = TakPreview {
  TakDropdownMenuItem(
    icon = Icons.Filled.Edit,
    text = "Some Text",
    onClick = PreviewCallback,
  )
}
