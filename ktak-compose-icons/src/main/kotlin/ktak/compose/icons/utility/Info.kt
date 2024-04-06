package ktak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val UtilityTakIcons.Info: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "Info",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.875f, 25.375f)
        curveTo(20.8811f, 25.375f, 25.75f, 20.5061f, 25.75f, 14.5f)
        curveTo(25.75f, 8.4939f, 20.8811f, 3.625f, 14.875f, 3.625f)
        curveTo(8.8689f, 3.625f, 4f, 8.4939f, 4f, 14.5f)
        curveTo(4f, 20.5061f, 8.8689f, 25.375f, 14.875f, 25.375f)
        close()
        moveTo(17.2141f, 8.8415f)
        curveTo(17.2141f, 10.1346f, 16.1657f, 11.1829f, 14.8726f, 11.1829f)
        curveTo(13.5794f, 11.1829f, 12.5311f, 10.1346f, 12.5311f, 8.8415f)
        curveTo(12.5311f, 7.5483f, 13.5794f, 6.5f, 14.8726f, 6.5f)
        curveTo(16.1657f, 6.5f, 17.2141f, 7.5483f, 17.2141f, 8.8415f)
        close()
        moveTo(11.7501f, 13.1036f)
        curveTo(11.7501f, 12.6894f, 12.0859f, 12.3536f, 12.5001f, 12.3536f)
        horizontalLineTo(16.0733f)
        curveTo(16.4875f, 12.3536f, 16.8233f, 12.6894f, 16.8233f, 13.1036f)
        verticalLineTo(14.3354f)
        lineTo(16.8231f, 14.3521f)
        verticalLineTo(19.7684f)
        horizontalLineTo(17.2439f)
        curveTo(17.6581f, 19.7684f, 17.9939f, 20.1042f, 17.9939f, 20.5184f)
        verticalLineTo(21.7501f)
        curveTo(17.9939f, 22.1643f, 17.6581f, 22.5001f, 17.2439f, 22.5001f)
        horizontalLineTo(12.5f)
        curveTo(12.0858f, 22.5001f, 11.75f, 22.1643f, 11.75f, 21.7501f)
        verticalLineTo(20.5184f)
        curveTo(11.75f, 20.1042f, 12.0858f, 19.7684f, 12.5f, 19.7684f)
        horizontalLineTo(12.9207f)
        verticalLineTo(15.0854f)
        horizontalLineTo(12.5001f)
        curveTo(12.0859f, 15.0854f, 11.7501f, 14.7496f, 11.7501f, 14.3354f)
        verticalLineTo(13.1036f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.8233f, 14.3354f)
        lineTo(17.3233f, 14.3408f)
        verticalLineTo(14.3354f)
        horizontalLineTo(16.8233f)
        close()
        moveTo(16.8231f, 14.3521f)
        lineTo(16.3231f, 14.3466f)
        verticalLineTo(14.3521f)
        horizontalLineTo(16.8231f)
        close()
        moveTo(16.8231f, 19.7684f)
        horizontalLineTo(16.3231f)
        verticalLineTo(20.2684f)
        horizontalLineTo(16.8231f)
        verticalLineTo(19.7684f)
        close()
        moveTo(12.9207f, 19.7684f)
        verticalLineTo(20.2684f)
        horizontalLineTo(13.4207f)
        verticalLineTo(19.7684f)
        horizontalLineTo(12.9207f)
        close()
        moveTo(12.9207f, 15.0854f)
        horizontalLineTo(13.4207f)
        verticalLineTo(14.5854f)
        horizontalLineTo(12.9207f)
        verticalLineTo(15.0854f)
        close()
        moveTo(25.25f, 14.5f)
        curveTo(25.25f, 20.23f, 20.605f, 24.875f, 14.875f, 24.875f)
        verticalLineTo(25.875f)
        curveTo(21.1572f, 25.875f, 26.25f, 20.7822f, 26.25f, 14.5f)
        horizontalLineTo(25.25f)
        close()
        moveTo(14.875f, 4.125f)
        curveTo(20.605f, 4.125f, 25.25f, 8.7701f, 25.25f, 14.5f)
        horizontalLineTo(26.25f)
        curveTo(26.25f, 8.2178f, 21.1572f, 3.125f, 14.875f, 3.125f)
        verticalLineTo(4.125f)
        close()
        moveTo(4.5f, 14.5f)
        curveTo(4.5f, 8.7701f, 9.1451f, 4.125f, 14.875f, 4.125f)
        verticalLineTo(3.125f)
        curveTo(8.5928f, 3.125f, 3.5f, 8.2178f, 3.5f, 14.5f)
        horizontalLineTo(4.5f)
        close()
        moveTo(14.875f, 24.875f)
        curveTo(9.1451f, 24.875f, 4.5f, 20.23f, 4.5f, 14.5f)
        horizontalLineTo(3.5f)
        curveTo(3.5f, 20.7822f, 8.5928f, 25.875f, 14.875f, 25.875f)
        verticalLineTo(24.875f)
        close()
        moveTo(14.8726f, 11.6829f)
        curveTo(16.4419f, 11.6829f, 17.7141f, 10.4108f, 17.7141f, 8.8415f)
        horizontalLineTo(16.7141f)
        curveTo(16.7141f, 9.8585f, 15.8896f, 10.6829f, 14.8726f, 10.6829f)
        verticalLineTo(11.6829f)
        close()
        moveTo(12.0311f, 8.8415f)
        curveTo(12.0311f, 10.4108f, 13.3033f, 11.6829f, 14.8726f, 11.6829f)
        verticalLineTo(10.6829f)
        curveTo(13.8556f, 10.6829f, 13.0311f, 9.8585f, 13.0311f, 8.8415f)
        horizontalLineTo(12.0311f)
        close()
        moveTo(14.8726f, 6f)
        curveTo(13.3033f, 6f, 12.0311f, 7.2722f, 12.0311f, 8.8415f)
        horizontalLineTo(13.0311f)
        curveTo(13.0311f, 7.8245f, 13.8556f, 7f, 14.8726f, 7f)
        verticalLineTo(6f)
        close()
        moveTo(17.7141f, 8.8415f)
        curveTo(17.7141f, 7.2722f, 16.4419f, 6f, 14.8726f, 6f)
        verticalLineTo(7f)
        curveTo(15.8896f, 7f, 16.7141f, 7.8245f, 16.7141f, 8.8415f)
        horizontalLineTo(17.7141f)
        close()
        moveTo(12.5001f, 11.8536f)
        curveTo(11.8098f, 11.8536f, 11.2501f, 12.4133f, 11.2501f, 13.1036f)
        horizontalLineTo(12.2501f)
        curveTo(12.2501f, 12.9656f, 12.362f, 12.8536f, 12.5001f, 12.8536f)
        verticalLineTo(11.8536f)
        close()
        moveTo(16.0733f, 11.8536f)
        horizontalLineTo(12.5001f)
        verticalLineTo(12.8536f)
        horizontalLineTo(16.0733f)
        verticalLineTo(11.8536f)
        close()
        moveTo(17.3233f, 13.1036f)
        curveTo(17.3233f, 12.4133f, 16.7636f, 11.8536f, 16.0733f, 11.8536f)
        verticalLineTo(12.8536f)
        curveTo(16.2114f, 12.8536f, 16.3233f, 12.9656f, 16.3233f, 13.1036f)
        horizontalLineTo(17.3233f)
        close()
        moveTo(17.3233f, 14.3354f)
        verticalLineTo(13.1036f)
        horizontalLineTo(16.3233f)
        verticalLineTo(14.3354f)
        horizontalLineTo(17.3233f)
        close()
        moveTo(17.3231f, 14.3576f)
        lineTo(17.3233f, 14.3408f)
        lineTo(16.3233f, 14.3299f)
        lineTo(16.3231f, 14.3466f)
        lineTo(17.3231f, 14.3576f)
        close()
        moveTo(17.3231f, 19.7684f)
        verticalLineTo(14.3521f)
        horizontalLineTo(16.3231f)
        verticalLineTo(19.7684f)
        horizontalLineTo(17.3231f)
        close()
        moveTo(17.2439f, 19.2684f)
        horizontalLineTo(16.8231f)
        verticalLineTo(20.2684f)
        horizontalLineTo(17.2439f)
        verticalLineTo(19.2684f)
        close()
        moveTo(18.4939f, 20.5184f)
        curveTo(18.4939f, 19.828f, 17.9343f, 19.2684f, 17.2439f, 19.2684f)
        verticalLineTo(20.2684f)
        curveTo(17.382f, 20.2684f, 17.4939f, 20.3803f, 17.4939f, 20.5184f)
        horizontalLineTo(18.4939f)
        close()
        moveTo(18.4939f, 21.7501f)
        verticalLineTo(20.5184f)
        horizontalLineTo(17.4939f)
        verticalLineTo(21.7501f)
        horizontalLineTo(18.4939f)
        close()
        moveTo(17.2439f, 23.0001f)
        curveTo(17.9343f, 23.0001f, 18.4939f, 22.4405f, 18.4939f, 21.7501f)
        horizontalLineTo(17.4939f)
        curveTo(17.4939f, 21.8882f, 17.382f, 22.0001f, 17.2439f, 22.0001f)
        verticalLineTo(23.0001f)
        close()
        moveTo(12.5f, 23.0001f)
        horizontalLineTo(17.2439f)
        verticalLineTo(22.0001f)
        horizontalLineTo(12.5f)
        verticalLineTo(23.0001f)
        close()
        moveTo(11.25f, 21.7501f)
        curveTo(11.25f, 22.4405f, 11.8096f, 23.0001f, 12.5f, 23.0001f)
        verticalLineTo(22.0001f)
        curveTo(12.3619f, 22.0001f, 12.25f, 21.8882f, 12.25f, 21.7501f)
        horizontalLineTo(11.25f)
        close()
        moveTo(11.25f, 20.5184f)
        verticalLineTo(21.7501f)
        horizontalLineTo(12.25f)
        verticalLineTo(20.5184f)
        horizontalLineTo(11.25f)
        close()
        moveTo(12.5f, 19.2684f)
        curveTo(11.8096f, 19.2684f, 11.25f, 19.828f, 11.25f, 20.5184f)
        horizontalLineTo(12.25f)
        curveTo(12.25f, 20.3803f, 12.3619f, 20.2684f, 12.5f, 20.2684f)
        verticalLineTo(19.2684f)
        close()
        moveTo(12.9207f, 19.2684f)
        horizontalLineTo(12.5f)
        verticalLineTo(20.2684f)
        horizontalLineTo(12.9207f)
        verticalLineTo(19.2684f)
        close()
        moveTo(12.4207f, 15.0854f)
        verticalLineTo(19.7684f)
        horizontalLineTo(13.4207f)
        verticalLineTo(15.0854f)
        horizontalLineTo(12.4207f)
        close()
        moveTo(12.5001f, 15.5854f)
        horizontalLineTo(12.9207f)
        verticalLineTo(14.5854f)
        horizontalLineTo(12.5001f)
        verticalLineTo(15.5854f)
        close()
        moveTo(11.2501f, 14.3354f)
        curveTo(11.2501f, 15.0257f, 11.8098f, 15.5854f, 12.5001f, 15.5854f)
        verticalLineTo(14.5854f)
        curveTo(12.362f, 14.5854f, 12.2501f, 14.4734f, 12.2501f, 14.3354f)
        horizontalLineTo(11.2501f)
        close()
        moveTo(11.2501f, 13.1036f)
        verticalLineTo(14.3354f)
        horizontalLineTo(12.2501f)
        verticalLineTo(13.1036f)
        horizontalLineTo(11.2501f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@DarkPreview
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Info)
