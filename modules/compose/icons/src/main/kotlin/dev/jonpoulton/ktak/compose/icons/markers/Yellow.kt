package dev.jonpoulton.ktak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.ktak.compose.icons.MarkersTakIcons
import dev.jonpoulton.ktak.compose.icons.PreviewIcon

public val MarkersTakIcons.Yellow: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "Yellow",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFFFF89D)),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 5.75f)
        lineTo(16.0f, 5.75f)
        arcTo(11.25f, 11.25f, 0.0f, false, true, 27.25f, 17.0f)
        lineTo(27.25f, 17.0f)
        arcTo(11.25f, 11.25f, 0.0f, false, true, 16.0f, 28.25f)
        lineTo(16.0f, 28.25f)
        arcTo(11.25f, 11.25f, 0.0f, false, true, 4.75f, 17.0f)
        lineTo(4.75f, 17.0f)
        arcTo(11.25f, 11.25f, 0.0f, false, true, 16.0f, 5.75f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Yellow)
