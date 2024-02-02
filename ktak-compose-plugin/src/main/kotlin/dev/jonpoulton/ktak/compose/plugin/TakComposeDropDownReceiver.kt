package dev.jonpoulton.ktak.compose.plugin

import androidx.annotation.CallSuper
import androidx.compose.material.Colors
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.maps.MapView
import dev.jonpoulton.ktak.compose.core.LocalTakContexts
import dev.jonpoulton.ktak.compose.core.TakColors
import dev.jonpoulton.ktak.compose.core.TakComposeContext
import dev.jonpoulton.ktak.compose.core.TakComposeView
import dev.jonpoulton.ktak.compose.core.TakScreen
import dev.jonpoulton.ktak.compose.core.TakScreenNavigator
import dev.jonpoulton.ktak.compose.core.setTakContent
import dev.jonpoulton.ktak.compose.viewmodel.LocalViewModelFactory
import dev.jonpoulton.ktak.core.TakContexts
import dev.jonpoulton.ktak.plugin.HasDocumentedIntentFilter

public abstract class TakComposeDropDownReceiver(
  private val contexts: TakContexts,
  mapView: MapView,
  protected val viewModelFactory: ViewModelProvider.Factory,
) : DropDownReceiver(mapView), ViewModelStoreOwner, TakScreenNavigator, HasDocumentedIntentFilter {
  override val viewModelStore: ViewModelStore = ViewModelStore()

  protected open val colors: Colors = TakColors.colors
  protected val navStack: MutableList<TakScreen> = arrayListOf()

  protected val composeContext: TakComposeContext = TakComposeContext(contexts)
  protected var composeView: ComposeView? = null

  @CallSuper
  override fun disposeImpl() {
    viewModelStore.clear()
  }

  protected fun showDropDown(
    dimensions: TakScreen.Dimensions = TakScreen.HalfScreen,
    ignoreBackButton: Boolean = false,
    switchable: Boolean = false,
    stateListener: DropDown.OnStateListener? = null,
    screen: TakScreen,
  ) {
    navStack.add(screen)
    composeView = TakComposeView(composeContext)
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
    navStack.add(screen)
    composeScreen(screen)
  }

  override fun navigateReplace(screen: TakScreen) {
    navStack.removeLast()
    navigateForward(screen)
  }

  override fun navigateBack(forceNavBack: Boolean) {
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
    navStack.clear()
    composeView = null
    closeDropDown()
  }

  override fun onBackButtonPressed(): Boolean {
    navigateBack()
    return true // ignore the signal
  }

  protected fun composeScreen(screen: TakScreen) {
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
