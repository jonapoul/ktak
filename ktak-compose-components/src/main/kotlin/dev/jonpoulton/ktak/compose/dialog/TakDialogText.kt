package ktak.compose.dialog

import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ktak.compose.core.TakColors
import ktak.compose.core.TakFonts
import ktak.compose.core.TakTextStyles

@Composable
public fun TakDialogTitleText(content: @Composable () -> Unit) {
  CompositionLocalProvider(LocalTextStyle provides TitleTextStyle) {
    content()
  }
}

@Composable
public fun TakDialogContentText(content: @Composable () -> Unit) {
  CompositionLocalProvider(LocalTextStyle provides ContentTextStyle) {
    content()
  }
}

private val TitleTextStyle = TextStyle(
  fontFamily = TakFonts.Family,
  fontSize = 16.sp,
  fontWeight = FontWeight.Bold,
  color = TakColors.Ink,
)

private val ContentTextStyle = TakTextStyles.H3.copy(color = TakColors.Ink)
