package ktak.compose.plugin

import androidx.annotation.CallSuper
import androidx.compose.material.Colors
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.maps.MapView
import ktak.compose.core.LocalTakContexts
import ktak.compose.core.TakColors
import ktak.compose.core.TakComposeContext
import ktak.compose.core.TakComposeHost
import ktak.compose.core.TakComposeView
import ktak.compose.core.TakScreen
import ktak.compose.core.TakScreenNavigator
import ktak.compose.core.setTakContent
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
  TakScreenNavigator,
  HasDocumentedIntentFilter,
  TakComposeHost {

  override val viewModelStore: ViewModelStore = ViewModelStore()

  protected open val colors: Colors = TakColors.colors
  protected val navStack: MutableList<TakScreen> = arrayListOf()

  override val composeContext: TakComposeContext = TakComposeContext(contexts)
  protected var composeView: ComposeView? = null

  @CallSuper
  override fun disposeImpl() {
    super.disposeImpl()
    Timber.v("disposeImpl")
    viewModelStore.clear()
    navStack.clear()
    composeView = null
  }

  protected fun showDropDown(
    dimensions: TakScreen.Dimensions = TakScreen.HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
    screen: TakScreen,
  ) {
    Timber.v("showDropDown $dimensions $ignoreBackButton $switchable $stateListener $screen")
    navStack.add(screen)
    composeView = TakComposeView(host = this)
    composeScreen(screen)
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

  override fun navigateForward(screen: TakScreen) {
    Timber.v("navigateForward $screen")
    navStack.add(screen)
    composeScreen(screen)
  }

  override fun navigateReplace(screen: TakScreen) {
    Timber.v("navigateReplace $screen")
    navStack.removeLast()
    navigateForward(screen)
  }

  override fun navigateBack(forceNavBack: Boolean) {
    Timber.v("navigateBack $forceNavBack")
    when (navStack.size) {
      0 -> error("Can't navigate back, nav stack is empty!")
      1 -> close()
      else -> {
        navStack.removeLast()
        composeScreen(navStack.last())
      }
    }
  }

  override fun close() {
    Timber.v("close")
    disposeImpl()
    closeDropDown()
  }

  override fun onBackButtonPressed(): Boolean {
    Timber.v("onBackButtonPressed")
    navigateBack()
    return true // ignore the signal
  }

  protected fun composeScreen(screen: TakScreen) {
    Timber.v("composeScreen $screen")
    composeView?.setTakContent(composeContext, colors) {
      CompositionLocalProvider(
        LocalViewModelStoreOwner provides this,
        LocalViewModelFactory provides viewModelFactory,
        LocalTakContexts provides contexts,
      ) {
        screen.Compose()
      }
    }
  }
}
