package ktak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ktak.compose.core.TakLegacyColors
import ktak.compose.icons.PreviewIcon
import ktak.compose.icons.UtilityTakIcons
import ktak.compose.preview.DarkPreview

public val UtilityTakIcons.RadioFilled: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "RadioFilled",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.5f, 14.5f)
        moveToRelative(-10.875f, 0f)
        arcToRelative(10.875f, 10.875f, 0f, true, true, 21.75f, 0f)
        arcToRelative(10.875f, 10.875f, 0f, true, true, -21.75f, 0f)
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 0.9f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.5f, 14.5f)
        moveToRelative(-6.5f, 0f)
        arcToRelative(6.5f, 6.5f, 0f, true, true, 13f, 0f)
        arcToRelative(6.5f, 6.5f, 0f, true, true, -13f, 0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.RadioFilled)
