package ktak.compose.viewmodel

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.ViewModelProvider

public val LocalViewModelFactory: ProvidableCompositionLocal<ViewModelProvider.Factory> = compositionLocalOf {
  error("CompositionLocal ViewModelFactory not present")
}
