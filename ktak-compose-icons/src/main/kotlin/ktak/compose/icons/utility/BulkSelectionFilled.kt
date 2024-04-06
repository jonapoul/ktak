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

public val UtilityTakIcons.BulkSelectionFilled: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "BulkSelectionFilled",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(6f, 4f)
        lineTo(23f, 4f)
        arcTo(2f, 2f, 0f, false, true, 25f, 6f)
        lineTo(25f, 23f)
        arcTo(2f, 2f, 0f, false, true, 23f, 25f)
        lineTo(6f, 25f)
        arcTo(2f, 2f, 0f, false, true, 4f, 23f)
        lineTo(4f, 6f)
        arcTo(2f, 2f, 0f, false, true, 6f, 4f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 2f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(8.4584f, 15.6328f)
        lineTo(12.1359f, 19.3333f)
        lineTo(20.5417f, 10.875f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.BulkSelectionFilled)
