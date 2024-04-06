@file:Suppress("CompositionLocalAllowlist")

package ktak.compose.core

import android.view.View
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.ViewModelProvider
import ktak.core.TakContexts

public val LocalMapView: ProvidableCompositionLocal<View> = compositionLocalOf {
  error("CompositionLocal LocalMapView not present")
}

public val LocalTakContexts: ProvidableCompositionLocal<TakContexts> = compositionLocalOf {
  error("CompositionLocal TakContexts not present")
}

public val LocalTakComposeContext: ProvidableCompositionLocal<TakComposeContext> = compositionLocalOf {
  error("CompositionLocal TakComposeContext not present")
}

public val LocalViewModelFactory: ProvidableCompositionLocal<ViewModelProvider.Factory> = compositionLocalOf {
  error("CompositionLocal ViewModelFactory not present")
}
