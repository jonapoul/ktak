@file:Suppress("FunctionName")

package ktak.compose.core

import androidx.compose.material.Colors
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.lifecycle.Lifecycle
import ktak.core.AppContext
import ktak.core.PluginContext
import ktak.core.TakContexts

public fun TakComposeView(
  host: TakComposeHost,
): ComposeView = TakComposeView(
  composeContext = host.composeContext,
  lifecycle = host.lifecycle,
)

public fun TakComposeView(
  host: TakComposeHost,
  content: @Composable () -> Unit,
): ComposeView = TakComposeView(
  composeContext = host.composeContext,
  lifecycle = host.lifecycle,
  content = content,
)

public fun TakComposeView(
  contexts: TakContexts,
  lifecycle: Lifecycle?,
): ComposeView = TakComposeView(
  composeContext = TakComposeContext(contexts),
  lifecycle = lifecycle,
)

public fun TakComposeView(
  contexts: TakContexts,
  lifecycle: Lifecycle?,
  content: @Composable () -> Unit,
): ComposeView = TakComposeView(
  composeContext = TakComposeContext(contexts),
  lifecycle = lifecycle,
  content = content,
)

public fun TakComposeView(
  pluginContext: PluginContext,
  appContext: AppContext,
  lifecycle: Lifecycle?,
): ComposeView = TakComposeView(
  composeContext = TakComposeContext(pluginContext, appContext),
  lifecycle = lifecycle,
)

public fun TakComposeView(
  pluginContext: PluginContext,
  appContext: AppContext,
  lifecycle: Lifecycle?,
  content: @Composable () -> Unit,
): ComposeView = TakComposeView(
  composeContext = TakComposeContext(pluginContext, appContext),
  lifecycle = lifecycle,
  content = content,
)

public fun TakComposeView(
  composeContext: TakComposeContext,
  lifecycle: Lifecycle?,
): ComposeView = ComposeView(composeContext).apply {
  val strategy = if (lifecycle == null) {
    ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed
  } else {
    ViewCompositionStrategy.DisposeOnLifecycleDestroyed(lifecycle)
  }
  setViewCompositionStrategy(strategy)
}

public fun TakComposeView(
  composeContext: TakComposeContext,
  lifecycle: Lifecycle?,
  content: @Composable () -> Unit,
): ComposeView = TakComposeView(composeContext, lifecycle).apply {
  setTakContent(composeContext, content = content)
}

public fun ComposeView.setTakContent(
  composeContext: TakComposeContext,
  colors: Colors = TakColors.colors,
  shapes: @Composable () -> Shapes = { TakShapes },
  typography: @Composable () -> Typography = { TakTypography },
  content: @Composable () -> Unit,
) {
  setContent {
    TakTheme(colors, shapes(), typography()) {
      CompositionLocalProvider(
        LocalContext provides composeContext,
        LocalTakComposeContext provides composeContext,
        LocalMapView provides rootView,
      ) {
        content()
      }
    }
  }
}
