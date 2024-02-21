package ktak.compose.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
public inline fun <reified VM : ViewModel> takViewModel(
  factory: ViewModelProvider.Factory? = LocalViewModelFactory.current,
): VM = viewModel(factory = factory)

public val LocalViewModelFactory: ProvidableCompositionLocal<ViewModelProvider.Factory> = compositionLocalOf {
  error("CompositionLocal ViewModelFactory not present")
}
