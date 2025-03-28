@file:Suppress("FunctionName")

package ktak.compose.core

import androidx.compose.material.Colors
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import com.atakmap.android.maps.MapView

public fun TakComposeView(
  mapView: MapView,
  composeContext: TakComposeContext,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  content: @Composable () -> Unit,
): ComposeView {
  val composeView = ComposeView(composeContext)
  composeView.setContent {
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
  return composeView
}
