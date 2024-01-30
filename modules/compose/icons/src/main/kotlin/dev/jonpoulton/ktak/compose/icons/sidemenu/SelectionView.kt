package dev.jonpoulton.ktak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.ktak.compose.core.TakColors
import dev.jonpoulton.ktak.compose.icons.PreviewIcon
import dev.jonpoulton.ktak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.SelectionView: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "SelectionView",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.64f, 6.5f)
        lineTo(28.08f, 6.5f)
        arcTo(1.92f, 1.92f, 0f, false, true, 30f, 8.42f)
        lineTo(30f, 8.42f)
        arcTo(1.92f, 1.92f, 0f, false, true, 28.08f, 10.34f)
        lineTo(14.64f, 10.34f)
        arcTo(1.92f, 1.92f, 0f, false, true, 12.72f, 8.42f)
        lineTo(12.72f, 8.42f)
        arcTo(1.92f, 1.92f, 0f, false, true, 14.64f, 6.5f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(7.92f, 15.14f)
        moveToRelative(-1.42f, 0f)
        arcToRelative(1.42f, 1.42f, 0f, true, true, 2.84f, 0f)
        arcToRelative(1.42f, 1.42f, 0f, true, true, -2.84f, 0f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(7.92f, 28.58f)
        moveToRelative(-1.42f, 0f)
        arcToRelative(1.42f, 1.42f, 0f, true, true, 2.84f, 0f)
        arcToRelative(1.42f, 1.42f, 0f, true, true, -2.84f, 0f)
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.64f, 13.22f)
        lineTo(28.08f, 13.22f)
        arcTo(1.92f, 1.92f, 0f, false, true, 30f, 15.14f)
        lineTo(30f, 15.14f)
        arcTo(1.92f, 1.92f, 0f, false, true, 28.08f, 17.06f)
        lineTo(14.64f, 17.06f)
        arcTo(1.92f, 1.92f, 0f, false, true, 12.72f, 15.14f)
        lineTo(12.72f, 15.14f)
        arcTo(1.92f, 1.92f, 0f, false, true, 14.64f, 13.22f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.64f, 19.94f)
        lineTo(28.08f, 19.94f)
        arcTo(1.92f, 1.92f, 0f, false, true, 30f, 21.86f)
        lineTo(30f, 21.86f)
        arcTo(1.92f, 1.92f, 0f, false, true, 28.08f, 23.78f)
        lineTo(14.64f, 23.78f)
        arcTo(1.92f, 1.92f, 0f, false, true, 12.72f, 21.86f)
        lineTo(12.72f, 21.86f)
        arcTo(1.92f, 1.92f, 0f, false, true, 14.64f, 19.94f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.64f, 26.66f)
        lineTo(28.08f, 26.66f)
        arcTo(1.92f, 1.92f, 0f, false, true, 30f, 28.58f)
        lineTo(30f, 28.58f)
        arcTo(1.92f, 1.92f, 0f, false, true, 28.08f, 30.5f)
        lineTo(14.64f, 30.5f)
        arcTo(1.92f, 1.92f, 0f, false, true, 12.72f, 28.58f)
        lineTo(12.72f, 28.58f)
        arcTo(1.92f, 1.92f, 0f, false, true, 14.64f, 26.66f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(6f, 8.3837f)
        lineTo(7.36f, 9.5f)
        lineTo(10f, 6.5f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(6f, 22.3837f)
        lineTo(7.36f, 23.5f)
        lineTo(10f, 20.5f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.SelectionView)
