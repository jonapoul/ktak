package ktak.compose.text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import ktak.compose.core.TakColors

@Stable
public interface TakIntegerPickerColors {
  public val textBackgroundColor: Color

  @Composable
  public fun borderColor(enabled: Boolean): State<Color>

  @Composable
  public fun buttonBackgroundColor(enabled: Boolean, pressed: Boolean): State<Color>

  @Composable
  public fun buttonForegroundColor(enabled: Boolean): State<Color>

  @Composable
  public fun textForegroundColor(enabled: Boolean): State<Color>
}

@Stable
@Immutable
public data class DefaultTakIntegerPickerColors(
  override val textBackgroundColor: Color = Color.Transparent,
  val borderColor: Color = TakColors.Sand,
  val borderColorDisabled: Color = TakColors.Ash,
  val buttonBackgroundColor: Color = TakColors.Sand,
  val buttonBackgroundColorPressed: Color = TakColors.Ash,
  val buttonBackgroundColorDisabled: Color = TakColors.Charcoal,
  val buttonForegroundColor: Color = TakColors.Ink,
  val buttonForegroundColorDisabled: Color = TakColors.Ash,
  val textForegroundColor: Color = TakColors.Cloud,
  val textForegroundColorDisabled: Color = TakColors.Ash,
) : TakIntegerPickerColors {
  @Composable
  override fun borderColor(enabled: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> borderColorDisabled
      else -> borderColor
    },
  )

  @Composable
  override fun buttonBackgroundColor(enabled: Boolean, pressed: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> buttonBackgroundColorDisabled
      pressed -> buttonBackgroundColorPressed
      else -> buttonBackgroundColor
    },
  )

  @Composable
  override fun buttonForegroundColor(enabled: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> buttonForegroundColorDisabled
      else -> buttonForegroundColor
    },
  )

  @Composable
  override fun textForegroundColor(enabled: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> textForegroundColorDisabled
      else -> textForegroundColor
    },
  )
}
