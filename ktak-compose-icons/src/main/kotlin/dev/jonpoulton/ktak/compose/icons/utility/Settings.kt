package dev.jonpoulton.ktak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.ktak.compose.core.takVectorResource
import dev.jonpoulton.ktak.compose.icons.PreviewIcon
import dev.jonpoulton.ktak.compose.icons.R
import dev.jonpoulton.ktak.compose.icons.UtilityTakIcons

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
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Settings)
