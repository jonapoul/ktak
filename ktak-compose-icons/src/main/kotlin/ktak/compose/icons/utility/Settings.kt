package ktak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import ktak.compose.core.takVectorResource
import ktak.compose.icons.PreviewIcon
import ktak.compose.icons.R
import ktak.compose.icons.UtilityTakIcons
import ktak.compose.preview.DarkPreview

public val UtilityTakIcons.Settings: ImageVector
  @Composable
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = takVectorResource(id = R.drawable.tak_settings)
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Settings)
