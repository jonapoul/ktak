package ktak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ktak.compose.icons.MarkersTakIcons
import ktak.compose.icons.PreviewIcon
import ktak.compose.preview.PreviewDark

public val MarkersTakIcons.Orange: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "Orange",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFEF7705)),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.8906f, 5.75f)
        lineTo(15.8906f, 5.75f)
        arcTo(11.1406f, 11.1406f, 0.0f, false, true, 27.0312f, 16.8906f)
        lineTo(27.0312f, 16.8906f)
        arcTo(11.1406f, 11.1406f, 0.0f, false, true, 15.8906f, 28.0312f)
        lineTo(15.8906f, 28.0312f)
        arcTo(11.1406f, 11.1406f, 0.0f, false, true, 4.75f, 16.8906f)
        lineTo(4.75f, 16.8906f)
        arcTo(11.1406f, 11.1406f, 0.0f, false, true, 15.8906f, 5.75f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Orange)
