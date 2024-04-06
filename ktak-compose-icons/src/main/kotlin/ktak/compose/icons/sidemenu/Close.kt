@file:Suppress("MagicNumber", "UnusedReceiverParameter", "FunctionName")

package ktak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ktak.compose.core.TakColors
import ktak.compose.icons.PreviewIcon
import ktak.compose.icons.SideMenuTakIcons
import ktak.compose.preview.DarkPreview

public fun SideMenuTakIcons.Close(strokeWidth: Float): ImageVector {
  return ImageVector.Builder(
    name = "Close",
    defaultWidth = 36.dp,
    defaultHeight = 37.dp,
    viewportWidth = 36f,
    viewportHeight = 37f,
  ).apply {
    path(
      fill = SolidColor(Color.Transparent),
      stroke = SolidColor(TakColors.Sand),
      strokeLineWidth = strokeWidth,
      strokeLineCap = Round,
      strokeLineJoin = Miter,
      strokeLineMiter = 4f,
      pathFillType = NonZero,
    ) {
      moveTo(10.2759f, 10.7759f)
      lineTo(25.7241f, 26.2241f)
    }
    path(
      fill = SolidColor(Color.Transparent),
      stroke = SolidColor(TakColors.Sand),
      strokeLineWidth = strokeWidth,
      strokeLineCap = Round,
      strokeLineJoin = Miter,
      strokeLineMiter = 4f,
      pathFillType = NonZero,
    ) {
      moveTo(25.7241f, 10.7759f)
      lineTo(10.2759f, 26.2241f)
    }
  }
    .build()
}

public val SideMenuTakIcons.Close: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Close(strokeWidth = 2f)
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Close)

@Composable
@DarkPreview
private fun PreviewThicker() = PreviewIcon(icon = SideMenuTakIcons.Close(strokeWidth = 4f))
