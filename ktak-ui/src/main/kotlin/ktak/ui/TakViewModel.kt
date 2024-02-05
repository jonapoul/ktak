package ktak.ui

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import timber.log.Timber

public abstract class TakViewModel : ViewModel() {
  protected val viewModelScope: CoroutineScope =
      CoroutineScope(context = Dispatchers.Main.immediate)

  init {
      Timber.v("init ${javaClass.simpleName}")
  }

  @CallSuper
  override fun onCleared() {
    super.onCleared()
      Timber.v("onCleared ${javaClass.simpleName}")
    viewModelScope.cancel()
  }
}
