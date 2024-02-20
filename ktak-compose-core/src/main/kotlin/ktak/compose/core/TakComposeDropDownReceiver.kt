package ktak.compose.core

import androidx.annotation.CallSuper
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.maps.MapView
import ktak.compose.viewmodel.LocalViewModelFactory
import ktak.core.TakContexts
import ktak.lifecycle.TakLifecycleDropDownReceiver
import ktak.plugin.HasDocumentedIntentFilter
import timber.log.Timber

public abstract class TakComposeDropDownReceiver(
  contexts: TakContexts,
  mapView: MapView,
  protected val viewModelFactory: ViewModelProvider.Factory,
) : TakLifecycleDropDownReceiver(mapView),
  ViewModelStoreOwner,
  HasDocumentedIntentFilter,
  TakComposeHost {

  override val viewModelStore: ViewModelStore = ViewModelStore()
  override val composeContext: TakComposeContext = TakComposeContext(contexts)

  protected open val colors: Colors = TakColors.colors

  protected lateinit var fragment: TakComposeFragment

  @CallSuper
  override fun disposeImpl() {
    Timber.v("disposeImpl")
    lifecycle.currentState = Lifecycle.State.DESTROYED
    viewModelStore.clear()
  }

  @CallSuper
  protected open fun showDropDown(
    dimensions: TakDimensions = TakDimensions.HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
    content: @Composable () -> Unit,
  ) {
    Timber.v("showDropDown $dimensions $ignoreBackButton $switchable $stateListener")
    lifecycle.currentState = Lifecycle.State.INITIALIZED
    fragment = TakComposeFragment(mapView, host = this)
    composeContent(content)
    showDropDown(
      fragment,
      dimensions.lwFraction,
      dimensions.lhFraction,
      dimensions.pwFraction,
      dimensions.phFraction,
      ignoreBackButton,
      switchable,
      stateListener,
    )
  }

  protected fun composeContent(content: @Composable () -> Unit) {
    Timber.v("composeContent $content")
    fragment.setTakContent(colors) {
      CompositionLocalProvider(
        LocalViewModelStoreOwner provides this,
        LocalViewModelFactory provides viewModelFactory,
      ) {
        content()
      }
    }
  }
}
