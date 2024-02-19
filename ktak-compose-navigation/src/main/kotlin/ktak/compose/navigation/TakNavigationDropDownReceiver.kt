package ktak.compose.navigation

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModelProvider
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.maps.MapView
import ktak.compose.core.TakComposeDropDownReceiver
import ktak.compose.core.TakComposeView
import ktak.compose.core.TakDimensions
import ktak.core.TakContexts
import timber.log.Timber

public abstract class TakNavigationDropDownReceiver(
  contexts: TakContexts,
  mapView: MapView,
  viewModelFactory: ViewModelProvider.Factory,
  key: String,
) : TakComposeDropDownReceiver(contexts, mapView, viewModelFactory, key), TakScreenNavigator {
  protected val navStack: MutableMap<TakScreenKey, TakScreenState> = hashMapOf()

  @CallSuper
  override fun disposeImpl() {
    super.disposeImpl()
    Timber.v("disposeImpl")
    navStack.clear()
    composeView = null
  }

  protected fun showDropDown(
    dimensions: TakDimensions = TakDimensions.HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
    screen: TakScreen,
  ) {
    Timber.v("showDropDown $dimensions $ignoreBackButton $switchable $stateListener $screen")
    navStack[screen.key] = TakScreenState(screen, state = null)
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
    navStack[screen.key] = TakScreenState(screen, state = null)
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
    composeContent { screen.Compose() }
  }
}
