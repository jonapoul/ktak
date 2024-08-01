package ktak.compose.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import ktak.compose.core.TakColors
import ktak.compose.core.TakToast
import ktak.compose.icons.TakIcons
import ktak.compose.icons.sidemenu.Add
import ktak.compose.icons.sidemenu.Alpha
import ktak.compose.icons.sidemenu.Settings
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.PreviewCallback
import ktak.compose.preview.TakPreview

@Composable
public fun TakIconButton(
  icon: ImageVector,
  contentDescription: String,
  modifier: Modifier = Modifier,
  isError: Boolean = false,
  isDisabled: Boolean = false,
  shape: Shape = RoundedShape,
  colors: TakButtonColors = DefaultTakIconButtonColors(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  contentScale: ContentScale = ContentScale.Fit,
  iconSize: DpSize = DefaultTakIconButtonSize,
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed, isError)
  val foregroundColor by colors.foregroundColor(!isDisabled, isPressed, isError)

  var isLongPressed by remember { mutableStateOf(false) }
  val haptics = LocalHapticFeedback.current

  Box(
    modifier = modifier.background(backgroundColor, shape),
  ) {
    Image(
      modifier = Modifier
        .size(iconSize)
        .padding(5.dp)
        .combinedClickable(
          interactionSource,
          enabled = !isDisabled,
          onClick = onClick,
          onLongClick = {
            haptics.performHapticFeedback(HapticFeedbackType.LongPress)
            isLongPressed = true
          },
          indication = null,
        ),
      imageVector = icon,
      contentDescription = contentDescription,
      contentScale = contentScale,
      colorFilter = ColorFilter.tint(foregroundColor),
    )
  }

  if (isLongPressed) {
    TakToast(text = contentDescription)
    isLongPressed = false
  }
}

private val defaultButtonSize = 36.dp
public val DefaultTakIconButtonSize: DpSize = DpSize(defaultButtonSize, defaultButtonSize)

private val RoundedShape = RoundedCornerShape(corner = CornerSize(5.dp))

@Stable
@Immutable
public data class DefaultTakIconButtonColors(
  val normalBackgroundColor: Color = Color.Transparent,
  val pressedBackgroundColor: Color = TakColors.Ash,
  val errorBackgroundColor: Color = TakColors.Charcoal,
  val disabledBackgroundColor: Color = TakColors.Charcoal,
  val normalForegroundColor: Color = TakColors.Sand,
  val pressedForegroundColor: Color = TakColors.Cyber,
  val errorForegroundColor: Color = TakColors.Alert,
  val disabledForegroundColor: Color = TakColors.Ash,
) : TakButtonColors {
  @Stable
  @Composable
  override fun backgroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledBackgroundColor
      pressed -> pressedBackgroundColor
      error -> errorBackgroundColor
      else -> normalBackgroundColor
    },
  )

  @Stable
  @Composable
  override fun foregroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledForegroundColor
      pressed -> pressedForegroundColor
      error -> errorForegroundColor
      else -> normalForegroundColor
    },
  )
}

@DarkPreview
@Composable
private fun Add() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Add,
    contentDescription = "",
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun AddBigger() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Add,
    contentDescription = "",
    onClick = PreviewCallback,
    iconSize = DpSize(72.dp, 72.dp),
  )
}

@DarkPreview
@Composable
private fun Alpha() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Alpha,
    contentDescription = "",
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun Settings() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    contentDescription = "",
    onClick = PreviewCallback,
  )
}

@DarkPreview
@Composable
private fun SettingsError() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    contentDescription = "",
    onClick = PreviewCallback,
    isError = true,
  )
}

@DarkPreview
@Composable
private fun SettingsDisabled() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    contentDescription = "",
    onClick = PreviewCallback,
    isDisabled = true,
  )
}
