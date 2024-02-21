package ktak.compose.navigation

import android.annotation.SuppressLint
import androidx.annotation.CallSuper
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.maps.MapView
import ktak.compose.core.TakComposeDropDownReceiver
import ktak.compose.core.TakComposeFragment
import ktak.compose.core.TakDimensions
import ktak.core.TakContexts
import timber.log.Timber

public abstract class TakNavigationDropDownReceiver(
  contexts: TakContexts,
  mapView: MapView,
  viewModelFactory: ViewModelProvider.Factory,
) : TakComposeDropDownReceiver(contexts, mapView, viewModelFactory), TakScreenNavigator {
  protected val navStack: MutableList<TakScreen> = arrayListOf()

  @CallSuper
  override fun disposeImpl() {
    super.disposeImpl()
    Timber.v("disposeImpl")
    navStack.clear()
  }

  protected fun showDropDown(
    dimensions: TakDimensions = TakDimensions.HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
    screen: TakScreen,
  ) {
    Timber.v("showDropDown $dimensions $ignoreBackButton $switchable $stateListener $screen")
    navStack.add(screen)
    fragment = TakComposeFragment(mapView, composeContext)
    composeScreen(screen)
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

  @SuppressLint("MissingSuperCall")
  @Suppress("DeprecatedCallableAddReplaceWith")
  @Deprecated(
    message = "Use the showDropDown method with TakScreen",
    level = DeprecationLevel.ERROR,
  )
  override fun showDropDown(
    dimensions: TakDimensions,
    ignoreBackButton: Boolean,
    switchable: Boolean,
    stateListener: DropDown.OnStateListener?,
    content: @Composable () -> Unit,
  ): Unit = error("Invalid method")

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
    composeContent { screen.Compose() }
  }
}
