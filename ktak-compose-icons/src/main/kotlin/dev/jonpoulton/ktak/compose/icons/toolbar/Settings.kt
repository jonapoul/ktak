package ktak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ktak.compose.icons.PreviewIcon
import ktak.compose.icons.ToolbarTakIcons
import ktak.compose.preview.PreviewDark

public val ToolbarTakIcons.Settings: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = ImageVector.Builder(
      name = "Settings",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(21.3847f, 6.25f)
        curveTo(22.2549f, 6.25f, 22.9709f, 6.9202f, 23.0439f, 7.7718f)
        lineTo(23.05f, 7.9153f)
        verticalLineTo(8.754f)
        lineTo(23.2884f, 8.8237f)
        curveTo(23.8493f, 8.9973f, 24.3953f, 9.2116f, 24.9236f, 9.4656f)
        lineTo(25.3164f, 9.6634f)
        lineTo(25.533f, 9.782f)
        lineTo(26.1269f, 9.1898f)
        curveTo(26.6853f, 8.632f, 27.5998f, 8.5666f, 28.2418f, 8.9931f)
        lineTo(28.3664f, 9.085f)
        lineTo(28.4826f, 9.1899f)
        lineTo(30.8007f, 11.508f)
        curveTo(31.1147f, 11.8227f, 31.2881f, 12.2415f, 31.2881f, 12.686f)
        curveTo(31.2881f, 13.0746f, 31.1552f, 13.4443f, 30.9116f, 13.7411f)
        lineTo(30.8005f, 13.8636f)
        lineTo(30.207f, 14.456f)
        lineTo(30.327f, 14.6735f)
        curveTo(30.6007f, 15.1922f, 30.8352f, 15.7301f, 31.0292f, 16.2838f)
        lineTo(31.1671f, 16.702f)
        lineTo(31.236f, 16.94f)
        lineTo(32.0756f, 16.9409f)
        curveTo(32.8945f, 16.9409f, 33.577f, 17.5345f, 33.7157f, 18.3143f)
        lineTo(33.7352f, 18.4626f)
        lineTo(33.7414f, 18.6062f)
        verticalLineTo(21.8847f)
        curveTo(33.7414f, 22.7549f, 33.0712f, 23.4709f, 32.2197f, 23.5439f)
        lineTo(32.0761f, 23.55f)
        horizontalLineTo(31.236f)
        lineTo(31.1678f, 23.788f)
        curveTo(30.9943f, 24.3485f, 30.7799f, 24.8945f, 30.5258f, 25.4231f)
        lineTo(30.3278f, 25.8163f)
        lineTo(30.207f, 26.033f)
        lineTo(30.8012f, 26.6275f)
        curveTo(31.0367f, 26.8634f, 31.1931f, 27.158f, 31.2566f, 27.4779f)
        lineTo(31.2806f, 27.6398f)
        lineTo(31.2886f, 27.8049f)
        curveTo(31.2886f, 28.194f, 31.1558f, 28.5638f, 30.9121f, 28.8605f)
        lineTo(30.801f, 28.9831f)
        lineTo(28.483f, 31.3011f)
        curveTo(27.8873f, 31.8963f, 26.8868f, 31.9316f, 26.2435f, 31.4061f)
        lineTo(26.1273f, 31.301f)
        lineTo(25.533f, 30.707f)
        lineTo(25.3168f, 30.8276f)
        curveTo(24.7975f, 31.1014f, 24.2598f, 31.3359f, 23.7064f, 31.5298f)
        lineTo(23.2885f, 31.6677f)
        lineTo(23.05f, 31.736f)
        verticalLineTo(32.5761f)
        curveTo(23.05f, 33.3951f, 22.4563f, 34.0776f, 21.6765f, 34.2158f)
        lineTo(21.5282f, 34.2353f)
        lineTo(21.3847f, 34.2414f)
        horizontalLineTo(18.1067f)
        curveTo(17.2365f, 34.2414f, 16.5205f, 33.5712f, 16.4475f, 32.7197f)
        lineTo(16.4414f, 32.5761f)
        lineTo(16.441f, 31.736f)
        lineTo(16.2034f, 31.6678f)
        curveTo(15.643f, 31.4943f, 15.0969f, 31.2799f, 14.5683f, 31.0258f)
        lineTo(14.1751f, 30.8278f)
        lineTo(13.958f, 30.707f)
        lineTo(13.3642f, 31.3009f)
        curveTo(12.8061f, 31.8596f, 11.891f, 31.9251f, 11.249f, 31.4981f)
        lineTo(11.1245f, 31.4061f)
        lineTo(11.0083f, 31.301f)
        lineTo(8.6903f, 28.9829f)
        curveTo(8.3762f, 28.6682f, 8.2028f, 28.2494f, 8.2028f, 27.8049f)
        curveTo(8.2028f, 27.4163f, 8.3357f, 27.0466f, 8.5793f, 26.7498f)
        lineTo(8.6904f, 26.6273f)
        lineTo(9.283f, 26.034f)
        lineTo(9.1638f, 25.8168f)
        curveTo(8.89f, 25.2975f, 8.6555f, 24.7598f, 8.4616f, 24.2064f)
        lineTo(8.3238f, 23.7885f)
        lineTo(8.254f, 23.55f)
        horizontalLineTo(7.4153f)
        curveTo(6.5962f, 23.55f, 5.9138f, 22.9562f, 5.7756f, 22.1761f)
        lineTo(5.7561f, 22.0278f)
        lineTo(5.75f, 21.8842f)
        verticalLineTo(18.6062f)
        curveTo(5.75f, 17.736f, 6.4202f, 17.02f, 7.2718f, 16.947f)
        lineTo(7.4153f, 16.9409f)
        lineTo(8.255f, 16.94f)
        lineTo(8.3235f, 16.7027f)
        curveTo(8.4968f, 16.1418f, 8.7112f, 15.5955f, 8.9653f, 15.0672f)
        lineTo(9.1633f, 14.6743f)
        lineTo(9.283f, 14.457f)
        lineTo(8.6897f, 13.864f)
        curveTo(8.4542f, 13.628f, 8.2978f, 13.3334f, 8.2343f, 13.0135f)
        lineTo(8.2104f, 12.8516f)
        lineTo(8.2023f, 12.6865f)
        curveTo(8.2023f, 12.2974f, 8.3351f, 11.9277f, 8.5788f, 11.6309f)
        lineTo(8.6899f, 11.5083f)
        lineTo(11.0078f, 9.1904f)
        curveTo(11.6031f, 8.5951f, 12.6046f, 8.5598f, 13.2475f, 9.0853f)
        lineTo(13.3636f, 9.1904f)
        lineTo(13.956f, 9.783f)
        lineTo(14.1741f, 9.6638f)
        curveTo(14.6934f, 9.39f, 15.2312f, 9.1555f, 15.7845f, 8.9616f)
        lineTo(16.2024f, 8.8238f)
        lineTo(16.44f, 8.754f)
        lineTo(16.4409f, 7.9153f)
        curveTo(16.4409f, 7.0963f, 17.0346f, 6.4138f, 17.8144f, 6.2756f)
        lineTo(17.9627f, 6.2561f)
        lineTo(18.1062f, 6.25f)
        horizontalLineTo(21.3847f)
        close()
        moveTo(21.3842f, 7.7682f)
        horizontalLineTo(18.1062f)
        curveTo(18.0415f, 7.7682f, 17.9862f, 7.8106f, 17.9666f, 7.8689f)
        lineTo(17.9591f, 7.9153f)
        verticalLineTo(9.9424f)
        lineTo(17.3721f, 10.0791f)
        curveTo(16.3986f, 10.3053f, 15.469f, 10.6681f, 14.6024f, 11.1595f)
        lineTo(14.2349f, 11.378f)
        lineTo(13.7232f, 11.6968f)
        lineTo(12.2899f, 10.2635f)
        curveTo(12.2442f, 10.2177f, 12.1752f, 10.2085f, 12.12f, 10.2362f)
        lineTo(12.0817f, 10.2638f)
        lineTo(9.7635f, 12.582f)
        curveTo(9.7177f, 12.6277f, 9.7085f, 12.6967f, 9.7362f, 12.7519f)
        lineTo(9.7638f, 12.7902f)
        lineTo(11.1968f, 14.2232f)
        lineTo(10.878f, 14.7348f)
        curveTo(10.3505f, 15.5823f, 9.9501f, 16.4961f, 9.6846f, 17.4574f)
        lineTo(9.5791f, 17.8723f)
        lineTo(9.4424f, 18.4591f)
        horizontalLineTo(7.4153f)
        curveTo(7.3506f, 18.4591f, 7.2953f, 18.5015f, 7.2757f, 18.5598f)
        lineTo(7.2682f, 18.6062f)
        verticalLineTo(21.8847f)
        curveTo(7.2682f, 21.9494f, 7.3106f, 22.0047f, 7.3689f, 22.0243f)
        lineTo(7.4153f, 22.0318f)
        horizontalLineTo(9.4424f)
        lineTo(9.5791f, 22.6188f)
        curveTo(9.8053f, 23.5923f, 10.1681f, 24.5219f, 10.6595f, 25.3885f)
        lineTo(10.878f, 25.756f)
        lineTo(11.1968f, 26.2677f)
        lineTo(9.7635f, 27.701f)
        curveTo(9.7177f, 27.7467f, 9.7085f, 27.8157f, 9.7362f, 27.8709f)
        lineTo(9.7638f, 27.9092f)
        lineTo(12.082f, 30.2274f)
        curveTo(12.1277f, 30.2732f, 12.1966f, 30.2824f, 12.2519f, 30.2547f)
        lineTo(12.2902f, 30.2271f)
        lineTo(13.7232f, 28.7941f)
        lineTo(14.2348f, 29.1128f)
        curveTo(15.0827f, 29.6404f, 15.9966f, 30.0408f, 16.9576f, 30.3063f)
        lineTo(17.3723f, 30.4119f)
        lineTo(17.9591f, 30.5485f)
        verticalLineTo(32.5756f)
        curveTo(17.9591f, 32.6403f, 18.0015f, 32.6956f, 18.0598f, 32.7152f)
        lineTo(18.1062f, 32.7227f)
        horizontalLineTo(21.3847f)
        curveTo(21.4494f, 32.7227f, 21.5047f, 32.6803f, 21.5243f, 32.622f)
        lineTo(21.5318f, 32.5756f)
        verticalLineTo(30.5485f)
        lineTo(22.1188f, 30.4118f)
        curveTo(23.0923f, 30.1856f, 24.0219f, 29.8228f, 24.8885f, 29.3314f)
        lineTo(25.256f, 29.1129f)
        lineTo(25.7677f, 28.7941f)
        lineTo(27.201f, 30.2274f)
        curveTo(27.2467f, 30.2733f, 27.3157f, 30.2824f, 27.3709f, 30.2547f)
        lineTo(27.4092f, 30.2271f)
        lineTo(29.7274f, 27.9089f)
        curveTo(29.7732f, 27.8632f, 29.7824f, 27.7942f, 29.7547f, 27.739f)
        lineTo(29.7271f, 27.7007f)
        lineTo(28.2941f, 26.2677f)
        lineTo(28.6128f, 25.7561f)
        curveTo(29.1404f, 24.9082f, 29.5408f, 23.9943f, 29.8063f, 23.0333f)
        lineTo(29.9119f, 22.6186f)
        lineTo(30.0485f, 22.0318f)
        horizontalLineTo(32.0756f)
        curveTo(32.1403f, 22.0318f, 32.1956f, 21.9894f, 32.2152f, 21.9311f)
        lineTo(32.2227f, 21.8847f)
        verticalLineTo(18.6062f)
        curveTo(32.2227f, 18.5415f, 32.1803f, 18.4862f, 32.122f, 18.4666f)
        lineTo(32.0756f, 18.4591f)
        horizontalLineTo(30.0485f)
        lineTo(29.9118f, 17.8721f)
        curveTo(29.6856f, 16.8981f, 29.3228f, 15.9685f, 28.8314f, 15.1022f)
        lineTo(28.6129f, 14.7349f)
        lineTo(28.2941f, 14.2232f)
        lineTo(29.7274f, 12.7899f)
        curveTo(29.7732f, 12.7442f, 29.7824f, 12.6753f, 29.7547f, 12.62f)
        lineTo(29.7271f, 12.5817f)
        lineTo(27.4089f, 10.2635f)
        curveTo(27.3633f, 10.2177f, 27.2943f, 10.2085f, 27.239f, 10.2362f)
        lineTo(27.2007f, 10.2638f)
        lineTo(25.7677f, 11.6968f)
        lineTo(25.2561f, 11.3781f)
        curveTo(24.4082f, 10.8505f, 23.4943f, 10.4501f, 22.5333f, 10.1846f)
        lineTo(22.1186f, 10.079f)
        lineTo(21.5318f, 9.9424f)
        verticalLineTo(7.9153f)
        curveTo(21.5318f, 7.8344f, 21.4655f, 7.7682f, 21.3842f, 7.7682f)
        close()
        moveTo(19.7455f, 12.8682f)
        curveTo(23.8137f, 12.8682f, 27.1227f, 16.1772f, 27.1227f, 20.2455f)
        curveTo(27.1227f, 24.3137f, 23.8137f, 27.6227f, 19.7455f, 27.6227f)
        curveTo(15.6772f, 27.6227f, 12.3682f, 24.3137f, 12.3682f, 20.2455f)
        curveTo(12.3682f, 16.1772f, 15.6772f, 12.8682f, 19.7455f, 12.8682f)
        close()
        moveTo(19.7455f, 14.3864f)
        curveTo(16.5149f, 14.3864f, 13.8864f, 17.0149f, 13.8864f, 20.2455f)
        curveTo(13.8864f, 23.476f, 16.5149f, 26.1045f, 19.7455f, 26.1045f)
        curveTo(22.976f, 26.1045f, 25.6045f, 23.476f, 25.6045f, 20.2455f)
        curveTo(25.6045f, 17.0149f, 22.976f, 14.3864f, 19.7455f, 14.3864f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Settings)
