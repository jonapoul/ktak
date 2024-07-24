package ktak.compose.core

import android.content.res.Resources
import android.util.TypedValue
import androidx.annotation.ArrayRes
import androidx.annotation.BoolRes
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.PluralsRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import timber.log.Timber

/**
 * Mostly copies of [androidx.compose.ui.res] methods, but with a [LocalTakComposeContext] instead of a regular
 * [LocalContext].
 */

@Composable
@ReadOnlyComposable
public fun takResources(): Resources {
//   LocalConfiguration.current // Removed: not relevant in ATAK plugins
  return LocalTakComposeContext.current.resources
}

@Composable
@ReadOnlyComposable
public fun takDimensionResource(@DimenRes id: Int): Dp {
  val density = LocalDensity.current
  val pxValue = takResources().getDimension(id)
  return Dp(pxValue / density.density)
}

@Composable
@ReadOnlyComposable
public fun takFontSizeResource(@DimenRes id: Int): TextUnit {
  val density = LocalDensity.current
  val pxValue = takResources().getDimension(id)
  return (pxValue / density.density).sp
}

@Composable
@ReadOnlyComposable
public fun takStringResource(@StringRes id: Int): String {
  val resources = takResources()
  return resources.getString(id)
}

@Composable
@ReadOnlyComposable
public fun takBooleanResource(@BoolRes id: Int): Boolean {
  val resources = takResources()
  return resources.getBoolean(id)
}

@Composable
@ReadOnlyComposable
public fun takIntegerResource(@IntegerRes id: Int): Int {
  val resources = takResources()
  return resources.getInteger(id)
}

@Composable
@ReadOnlyComposable
public fun takIntegerArrayResource(@ArrayRes id: Int): IntArray {
  val resources = takResources()
  return resources.getIntArray(id)
}

@Composable
@ReadOnlyComposable
public fun takStringResource(@StringRes id: Int, vararg formatArgs: Any): String {
  val resources = takResources()
  return resources.getString(id, *formatArgs)
}

@Composable
@ReadOnlyComposable
public fun takStringArrayResource(@ArrayRes id: Int): Array<String> {
  val resources = takResources()
  return resources.getStringArray(id)
}

@Composable
@ReadOnlyComposable
public fun takPluralStringResource(@PluralsRes id: Int, count: Int): String {
  val resources = takResources()
  return resources.getQuantityString(id, count)
}

@Composable
@ReadOnlyComposable
public fun takPluralStringResource(@PluralsRes id: Int, count: Int, vararg formatArgs: Any): String {
  val resources = takResources()
  return resources.getQuantityString(id, count, *formatArgs)
}

@Composable
public fun takVectorResource(@DrawableRes id: Int): ImageVector {
  val context = LocalTakComposeContext.current
  val res = takResources()
  val theme = context.theme
  return remember(id, res, theme, res.configuration) { ImageVector.vectorResource(theme, res, id) }
}

@Composable
public fun takBitmapResource(@DrawableRes id: Int): ImageBitmap {
  val res = takResources()
  return loadBitmap(res, id)
}

@Composable
public fun takPainterResource(@DrawableRes id: Int): Painter {
  val context = LocalTakComposeContext.current
  val res = takResources()
  val value = remember { TypedValue() }
  res.getValue(id, value, true)
  val path = value.string

  return if (path?.endsWith(".xml") == true) {
    // Assume .xml suffix implies loading a VectorDrawable resource
    val imageVector = takVectorResource(id)
    rememberVectorPainter(imageVector)
  } else {
    // Otherwise load the bitmap resource
    val imageBitmap = remember(path, id, context.theme) { loadBitmap(res, id) }
    BitmapPainter(imageBitmap)
  }
}

private fun loadBitmap(res: Resources, @DrawableRes id: Int): ImageBitmap {
  return try {
    ImageBitmap.imageResource(res, id)
  } catch (e: Exception) {
    Timber.w(e, "Failed loading bitmap resource $id from $res")
    throw e
  }
}
