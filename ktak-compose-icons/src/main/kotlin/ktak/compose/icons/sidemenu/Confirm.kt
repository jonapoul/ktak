@file:Suppress("MagicNumber", "UnusedReceiverParameter", "FunctionName")
@file:SuppressLint("ComposableNaming")

package ktak.compose.icons.sidemenu

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
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

@Stable
@Composable
public fun SideMenuTakIcons.Confirm(strokeWidth: Float): ImageVector = remember(strokeWidth) {
  ImageVector.Builder(
    name = "Confirm",
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
      moveTo(9f, 20.5465f)
      lineTo(15.3256f, 26.5f)
      lineTo(27.6047f, 10.5f)
    }
  }
    .build()
}

public val SideMenuTakIcons.Confirm: ImageVector
  @Composable
  get() = Confirm(strokeWidth = 1.5f)

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Confirm)

@Composable
@DarkPreview
private fun PreviewThicker() = PreviewIcon(icon = SideMenuTakIcons.Confirm(strokeWidth = 4f))
