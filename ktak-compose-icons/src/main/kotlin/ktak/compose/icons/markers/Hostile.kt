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
import ktak.compose.preview.DarkPreview

public val MarkersTakIcons.Hostile: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "Hostile",
      defaultWidth = 38.0.dp,
      defaultHeight = 37.0.dp,
      viewportWidth = 38.0f,
      viewportHeight = 37.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFFF8282)),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(19.0f, 2.0f)
        lineToRelative(16.9706f, 16.9706f)
        lineToRelative(-16.9706f, 16.9706f)
        lineToRelative(-16.9706f, -16.9706f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Hostile)
