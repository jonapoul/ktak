package ktak.compose.core

import android.view.View
import androidx.compose.material.Colors
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext

@Composable
public fun TakContent(
  composeContext: TakComposeContext,
  mapView: View,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  content: @Composable () -> Unit,
) {
  TakTheme(colors, shapes(), typography()) {
    CompositionLocalProvider(
      LocalContext provides composeContext,
      LocalTakComposeContext provides composeContext,
      LocalTakContexts provides composeContext.contexts,
      LocalMapView provides mapView,
    ) {
      content()
    }
  }
}
