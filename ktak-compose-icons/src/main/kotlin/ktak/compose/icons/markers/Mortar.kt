package ktak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ktak.compose.core.TakColors
import ktak.compose.icons.MarkersTakIcons
import ktak.compose.icons.PreviewIcon
import ktak.compose.preview.DarkPreview

public val MarkersTakIcons.Mortar: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "Mortar",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(10.3501f, 26.3398f)
        lineToRelative(5.6569f, -5.6569f)
        lineToRelative(5.6569f, 5.6569f)
        lineToRelative(-5.6569f, 5.6569f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(14.5f, 9.0f)
        horizontalLineToRelative(3.0f)
        verticalLineToRelative(14.0f)
        horizontalLineToRelative(-3.0f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(21.0f, 15.0f)
        lineToRelative(-0.0f, 2.0f)
        lineToRelative(-10.0f, 0.0f)
        lineToRelative(-0.0f, -2.0f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 1.0f)
        lineTo(21.1962f, 10.0f)
        horizontalLineTo(10.8038f)
        lineTo(16.0f, 1.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Mortar)
