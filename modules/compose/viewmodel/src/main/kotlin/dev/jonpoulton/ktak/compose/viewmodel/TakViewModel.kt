package dev.jonpoulton.ktak.compose.viewmodel

import androidx.compose.runtime.Composable
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
public inline fun <reified VM : ViewModel> takViewModel(
    viewModelStoreOwner: ViewModelStoreOwner = checkNotNull(LocalViewModelStoreOwner.current) {
    "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
  },
    key: String? = null,
    factory: ViewModelProvider.Factory? = LocalViewModelFactory.current,
    extras: CreationExtras = if (viewModelStoreOwner is HasDefaultViewModelProviderFactory) {
    viewModelStoreOwner.defaultViewModelCreationExtras
  } else {
    CreationExtras.Empty
  },
): VM = viewModel(viewModelStoreOwner, key, factory, extras)
