package ktak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import ktak.compose.core.takVectorResource
import ktak.compose.icons.PreviewIcon
import ktak.compose.icons.R
import ktak.compose.icons.SideMenuTakIcons
import ktak.compose.preview.PreviewDark

public val SideMenuTakIcons.Edit: ImageVector
  @Composable
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = takVectorResource(id = R.drawable.tak_edit)
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Edit)
