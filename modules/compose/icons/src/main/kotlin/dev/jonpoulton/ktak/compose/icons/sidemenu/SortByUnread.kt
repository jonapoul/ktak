package dev.jonpoulton.ktak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.ktak.compose.core.TakColors
import dev.jonpoulton.ktak.compose.icons.PreviewIcon
import dev.jonpoulton.ktak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.SortByUnread: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "SortByUnread",
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
        pathFillType = EvenOdd,
      ) {
        moveTo(18.521f, 24.8509f)
        curveTo(19.1068f, 24.2651f, 19.1068f, 23.3154f, 18.521f, 22.7296f)
        curveTo(17.9353f, 22.1438f, 16.9855f, 22.1438f, 16.3997f, 22.7296f)
        lineTo(14.1861f, 24.9432f)
        lineTo(14.1862f, 9.0076f)
        curveTo(14.1862f, 8.1791f, 13.5146f, 7.5076f, 12.6862f, 7.5076f)
        curveTo(11.8577f, 7.5075f, 11.1862f, 8.1791f, 11.1862f, 9.0076f)
        lineTo(11.1861f, 24.9461f)
        lineTo(8.9687f, 22.7288f)
        curveTo(8.3829f, 22.143f, 7.4331f, 22.143f, 6.8474f, 22.7288f)
        curveTo(6.2616f, 23.3145f, 6.2616f, 24.2643f, 6.8474f, 24.8501f)
        lineTo(11.624f, 29.6267f)
        curveTo(12.2097f, 30.2125f, 13.1595f, 30.2125f, 13.7453f, 29.6267f)
        lineTo(18.521f, 24.8509f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.031f, 10.7519f)
        curveTo(16.0629f, 10.7558f, 16.0944f, 10.766f, 16.124f, 10.7829f)
        lineTo(23f, 14.7121f)
        lineTo(29.876f, 10.7829f)
        curveTo(29.9056f, 10.766f, 29.9371f, 10.7558f, 29.969f, 10.7519f)
        curveTo(29.8586f, 10.3196f, 29.4666f, 10f, 29f, 10f)
        horizontalLineTo(17f)
        curveTo(16.5334f, 10f, 16.1414f, 10.3196f, 16.031f, 10.7519f)
        close()
        moveTo(25.9931f, 13.5776f)
        lineTo(23.124f, 15.2171f)
        lineTo(23f, 15.2879f)
        lineTo(22.876f, 15.2171f)
        lineTo(20.0069f, 13.5776f)
        curveTo(19.9942f, 13.6167f, 19.9716f, 13.6532f, 19.9393f, 13.6832f)
        lineTo(16.1701f, 17.1832f)
        curveTo(16.1301f, 17.2203f, 16.0813f, 17.2418f, 16.031f, 17.2481f)
        curveTo(16.1414f, 17.6804f, 16.5334f, 18f, 17f, 18f)
        horizontalLineTo(29f)
        curveTo(29.4666f, 18f, 29.8586f, 17.6804f, 29.969f, 17.2481f)
        curveTo(29.9187f, 17.2418f, 29.8699f, 17.2203f, 29.8299f, 17.1832f)
        lineTo(26.0607f, 13.6832f)
        curveTo(26.0284f, 13.6532f, 26.0058f, 13.6167f, 25.9931f, 13.5776f)
        close()
        moveTo(26.4194f, 13.334f)
        lineTo(30f, 16.6588f)
        verticalLineTo(11.2879f)
        lineTo(26.4194f, 13.334f)
        close()
        moveTo(16f, 11.2879f)
        lineTo(19.5806f, 13.334f)
        lineTo(16f, 16.6588f)
        verticalLineTo(11.2879f)
        close()
      }
      group {
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(16.124f, 10.7829f)
          lineTo(16.3721f, 10.3488f)
          lineTo(16.3721f, 10.3488f)
          lineTo(16.124f, 10.7829f)
          close()
          moveTo(16.031f, 10.7519f)
          lineTo(15.5466f, 10.6282f)
          lineTo(15.4062f, 11.1779f)
          lineTo(15.9692f, 11.248f)
          lineTo(16.031f, 10.7519f)
          close()
          moveTo(23f, 14.7121f)
          lineTo(22.7519f, 15.1462f)
          lineTo(23f, 15.2879f)
          lineTo(23.2481f, 15.1462f)
          lineTo(23f, 14.7121f)
          close()
          moveTo(29.876f, 10.7829f)
          lineTo(29.6279f, 10.3488f)
          verticalLineTo(10.3488f)
          lineTo(29.876f, 10.7829f)
          close()
          moveTo(29.969f, 10.7519f)
          lineTo(30.0308f, 11.248f)
          lineTo(30.5938f, 11.1779f)
          lineTo(30.4534f, 10.6282f)
          lineTo(29.969f, 10.7519f)
          close()
          moveTo(23.124f, 15.2171f)
          lineTo(22.876f, 14.7829f)
          lineTo(22.876f, 14.7829f)
          lineTo(23.124f, 15.2171f)
          close()
          moveTo(25.9931f, 13.5776f)
          lineTo(26.4685f, 13.4228f)
          lineTo(26.2784f, 12.8387f)
          lineTo(25.745f, 13.1435f)
          lineTo(25.9931f, 13.5776f)
          close()
          moveTo(23f, 15.2879f)
          lineTo(22.7519f, 15.7221f)
          lineTo(23f, 15.8638f)
          lineTo(23.2481f, 15.7221f)
          lineTo(23f, 15.2879f)
          close()
          moveTo(22.876f, 15.2171f)
          lineTo(23.124f, 14.7829f)
          lineTo(22.876f, 15.2171f)
          close()
          moveTo(20.0069f, 13.5776f)
          lineTo(20.255f, 13.1435f)
          lineTo(19.7216f, 12.8387f)
          lineTo(19.5315f, 13.4229f)
          lineTo(20.0069f, 13.5776f)
          close()
          moveTo(19.9393f, 13.6832f)
          lineTo(19.5991f, 13.3168f)
          verticalLineTo(13.3168f)
          lineTo(19.9393f, 13.6832f)
          close()
          moveTo(16.1701f, 17.1832f)
          lineTo(16.5103f, 17.5496f)
          lineTo(16.5103f, 17.5496f)
          lineTo(16.1701f, 17.1832f)
          close()
          moveTo(16.031f, 17.2481f)
          lineTo(15.9694f, 16.7519f)
          lineTo(15.4062f, 16.8218f)
          lineTo(15.5465f, 17.3718f)
          lineTo(16.031f, 17.2481f)
          close()
          moveTo(29.969f, 17.2481f)
          lineTo(30.4535f, 17.3717f)
          lineTo(30.5938f, 16.8218f)
          lineTo(30.0306f, 16.7519f)
          lineTo(29.969f, 17.2481f)
          close()
          moveTo(29.8299f, 17.1832f)
          lineTo(30.1701f, 16.8168f)
          lineTo(30.1701f, 16.8168f)
          lineTo(29.8299f, 17.1832f)
          close()
          moveTo(26.0607f, 13.6832f)
          lineTo(26.4009f, 13.3168f)
          lineTo(26.4009f, 13.3168f)
          lineTo(26.0607f, 13.6832f)
          close()
          moveTo(30f, 16.6588f)
          lineTo(29.6598f, 17.0252f)
          lineTo(30.5f, 17.8054f)
          verticalLineTo(16.6588f)
          horizontalLineTo(30f)
          close()
          moveTo(26.4194f, 13.334f)
          lineTo(26.1713f, 12.8999f)
          lineTo(25.5806f, 13.2374f)
          lineTo(26.0792f, 13.7004f)
          lineTo(26.4194f, 13.334f)
          close()
          moveTo(30f, 11.2879f)
          horizontalLineTo(30.5f)
          verticalLineTo(10.4263f)
          lineTo(29.7519f, 10.8538f)
          lineTo(30f, 11.2879f)
          close()
          moveTo(19.5806f, 13.334f)
          lineTo(19.9208f, 13.7004f)
          lineTo(20.4194f, 13.2374f)
          lineTo(19.8287f, 12.8999f)
          lineTo(19.5806f, 13.334f)
          close()
          moveTo(16f, 11.2879f)
          lineTo(16.2481f, 10.8538f)
          lineTo(15.5f, 10.4263f)
          verticalLineTo(11.2879f)
          horizontalLineTo(16f)
          close()
          moveTo(16f, 16.6588f)
          horizontalLineTo(15.5f)
          verticalLineTo(17.8054f)
          lineTo(16.3402f, 17.0252f)
          lineTo(16f, 16.6588f)
          close()
          moveTo(16.3721f, 10.3488f)
          curveTo(16.2841f, 10.2986f, 16.1891f, 10.2677f, 16.0929f, 10.2557f)
          lineTo(15.9692f, 11.248f)
          curveTo(15.9366f, 11.244f, 15.9048f, 11.2335f, 15.876f, 11.2171f)
          lineTo(16.3721f, 10.3488f)
          close()
          moveTo(23.2481f, 14.2779f)
          lineTo(16.3721f, 10.3488f)
          lineTo(15.876f, 11.2171f)
          lineTo(22.7519f, 15.1462f)
          lineTo(23.2481f, 14.2779f)
          close()
          moveTo(29.6279f, 10.3488f)
          lineTo(22.7519f, 14.2779f)
          lineTo(23.2481f, 15.1462f)
          lineTo(30.124f, 11.2171f)
          lineTo(29.6279f, 10.3488f)
          close()
          moveTo(29.9071f, 10.2557f)
          curveTo(29.811f, 10.2677f, 29.7159f, 10.2985f, 29.6279f, 10.3488f)
          lineTo(30.124f, 11.2171f)
          curveTo(30.0952f, 11.2335f, 30.0633f, 11.244f, 30.0308f, 11.248f)
          lineTo(29.9071f, 10.2557f)
          close()
          moveTo(29f, 10.5f)
          curveTo(29.2326f, 10.5f, 29.4293f, 10.6593f, 29.4845f, 10.8756f)
          lineTo(30.4534f, 10.6282f)
          curveTo(30.2879f, 9.9799f, 29.7006f, 9.5f, 29f, 9.5f)
          verticalLineTo(10.5f)
          close()
          moveTo(17f, 10.5f)
          horizontalLineTo(29f)
          verticalLineTo(9.5f)
          horizontalLineTo(17f)
          verticalLineTo(10.5f)
          close()
          moveTo(16.5155f, 10.8756f)
          curveTo(16.5707f, 10.6593f, 16.7674f, 10.5f, 17f, 10.5f)
          verticalLineTo(9.5f)
          curveTo(16.2994f, 9.5f, 15.7121f, 9.9799f, 15.5466f, 10.6282f)
          lineTo(16.5155f, 10.8756f)
          close()
          moveTo(23.3721f, 15.6512f)
          lineTo(26.2411f, 14.0117f)
          lineTo(25.745f, 13.1435f)
          lineTo(22.876f, 14.7829f)
          lineTo(23.3721f, 15.6512f)
          close()
          moveTo(23.2481f, 15.7221f)
          lineTo(23.3721f, 15.6512f)
          lineTo(22.876f, 14.7829f)
          lineTo(22.7519f, 14.8538f)
          lineTo(23.2481f, 15.7221f)
          close()
          moveTo(22.6279f, 15.6512f)
          lineTo(22.7519f, 15.7221f)
          lineTo(23.2481f, 14.8538f)
          lineTo(23.124f, 14.7829f)
          lineTo(22.6279f, 15.6512f)
          close()
          moveTo(19.7589f, 14.0117f)
          lineTo(22.6279f, 15.6512f)
          lineTo(23.124f, 14.7829f)
          lineTo(20.255f, 13.1435f)
          lineTo(19.7589f, 14.0117f)
          close()
          moveTo(20.2796f, 14.0496f)
          curveTo(20.3758f, 13.9603f, 20.444f, 13.8503f, 20.4824f, 13.7324f)
          lineTo(19.5315f, 13.4229f)
          curveTo(19.5444f, 13.3831f, 19.5675f, 13.3462f, 19.5991f, 13.3168f)
          lineTo(20.2796f, 14.0496f)
          close()
          moveTo(16.5103f, 17.5496f)
          lineTo(20.2796f, 14.0496f)
          lineTo(19.5991f, 13.3168f)
          lineTo(15.8299f, 16.8168f)
          lineTo(16.5103f, 17.5496f)
          close()
          moveTo(16.0926f, 17.7443f)
          curveTo(16.2436f, 17.7255f, 16.3909f, 17.6605f, 16.5103f, 17.5496f)
          lineTo(15.8299f, 16.8168f)
          curveTo(15.8694f, 16.7801f, 15.919f, 16.7582f, 15.9694f, 16.7519f)
          lineTo(16.0926f, 17.7443f)
          close()
          moveTo(17f, 17.5f)
          curveTo(16.7674f, 17.5f, 16.5707f, 17.3407f, 16.5155f, 17.1244f)
          lineTo(15.5465f, 17.3718f)
          curveTo(15.712f, 18.0201f, 16.2993f, 18.5f, 17f, 18.5f)
          verticalLineTo(17.5f)
          close()
          moveTo(29f, 17.5f)
          horizontalLineTo(17f)
          verticalLineTo(18.5f)
          horizontalLineTo(29f)
          verticalLineTo(17.5f)
          close()
          moveTo(29.4845f, 17.1244f)
          curveTo(29.4293f, 17.3407f, 29.2326f, 17.5f, 29f, 17.5f)
          verticalLineTo(18.5f)
          curveTo(29.7007f, 18.5f, 30.288f, 18.0201f, 30.4535f, 17.3717f)
          lineTo(29.4845f, 17.1244f)
          close()
          moveTo(29.4897f, 17.5496f)
          curveTo(29.6091f, 17.6605f, 29.7564f, 17.7255f, 29.9074f, 17.7443f)
          lineTo(30.0306f, 16.7519f)
          curveTo(30.081f, 16.7582f, 30.1306f, 16.7801f, 30.1701f, 16.8168f)
          lineTo(29.4897f, 17.5496f)
          close()
          moveTo(25.7204f, 14.0496f)
          lineTo(29.4897f, 17.5496f)
          lineTo(30.1701f, 16.8168f)
          lineTo(26.4009f, 13.3168f)
          lineTo(25.7204f, 14.0496f)
          close()
          moveTo(25.5176f, 13.7324f)
          curveTo(25.556f, 13.8503f, 25.6242f, 13.9603f, 25.7204f, 14.0496f)
          lineTo(26.4009f, 13.3168f)
          curveTo(26.4325f, 13.3462f, 26.4556f, 13.3831f, 26.4685f, 13.4228f)
          lineTo(25.5176f, 13.7324f)
          close()
          moveTo(30.3402f, 16.2924f)
          lineTo(26.7596f, 12.9676f)
          lineTo(26.0792f, 13.7004f)
          lineTo(29.6598f, 17.0252f)
          lineTo(30.3402f, 16.2924f)
          close()
          moveTo(29.5f, 11.2879f)
          verticalLineTo(16.6588f)
          horizontalLineTo(30.5f)
          verticalLineTo(11.2879f)
          horizontalLineTo(29.5f)
          close()
          moveTo(26.6675f, 13.7681f)
          lineTo(30.2481f, 11.7221f)
          lineTo(29.7519f, 10.8538f)
          lineTo(26.1713f, 12.8999f)
          lineTo(26.6675f, 13.7681f)
          close()
          moveTo(19.8287f, 12.8999f)
          lineTo(16.2481f, 10.8538f)
          lineTo(15.7519f, 11.7221f)
          lineTo(19.3325f, 13.7681f)
          lineTo(19.8287f, 12.8999f)
          close()
          moveTo(16.3402f, 17.0252f)
          lineTo(19.9208f, 13.7004f)
          lineTo(19.2404f, 12.9676f)
          lineTo(15.6598f, 16.2924f)
          lineTo(16.3402f, 17.0252f)
          close()
          moveTo(15.5f, 11.2879f)
          verticalLineTo(16.6588f)
          horizontalLineTo(16.5f)
          verticalLineTo(11.2879f)
          horizontalLineTo(15.5f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.SortByUnread)
