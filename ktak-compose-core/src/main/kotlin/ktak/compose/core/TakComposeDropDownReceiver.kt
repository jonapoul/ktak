package ktak.compose.core

import androidx.annotation.CallSuper
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
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
  private val contexts: TakContexts,
  mapView: MapView,
  protected val viewModelFactory: ViewModelProvider.Factory,
  key: String,
) : TakLifecycleDropDownReceiver(mapView, key),
  ViewModelStoreOwner,
  HasDocumentedIntentFilter,
  TakComposeHost {

  override val viewModelStore: ViewModelStore = ViewModelStore()

  protected open val colors: Colors = TakColors.colors

  override val composeContext: TakComposeContext = TakComposeContext(contexts)
  protected var composeView: ComposeView? = null

  @CallSuper
  override fun disposeImpl() {
    super.disposeImpl()
    Timber.v("disposeImpl")
    viewModelStore.clear()
    composeView = null
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
    composeView = TakComposeView(host = this, content)
    composeContent(content)
    showDropDown(
      composeView,
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
    composeView?.setTakContent(composeContext, colors) {
      CompositionLocalProvider(
        LocalViewModelStoreOwner provides this,
        LocalViewModelFactory provides viewModelFactory,
        LocalTakContexts provides contexts,
      ) {
        content()
      }
    }
  }
}
