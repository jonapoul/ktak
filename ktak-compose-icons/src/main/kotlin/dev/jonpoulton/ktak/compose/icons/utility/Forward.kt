package dev.jonpoulton.ktak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.ktak.compose.core.TakLegacyColors
import dev.jonpoulton.ktak.compose.icons.PreviewIcon
import dev.jonpoulton.ktak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Forward: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "Forward",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.6f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(10.875f, 22.9584f)
        lineTo(19.3333f, 14.7729f)
        lineTo(10.875f, 6.0417f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Forward)
