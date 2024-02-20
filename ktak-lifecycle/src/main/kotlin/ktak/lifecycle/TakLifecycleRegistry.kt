package ktak.lifecycle

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.atakmap.android.dropdown.DropDown
import timber.log.Timber

public class TakLifecycleRegistry(
  lifecycleOwner: LifecycleOwner,
) : LifecycleRegistry(lifecycleOwner), DropDown.OnStateListener {
  override fun onDropDownSelectionRemoved() {
    Timber.v("onDropDownSelectionRemoved")
  }

  override fun onDropDownClose() {
    Timber.v("onDropDownClose")
    currentState = State.DESTROYED
  }

  override fun onDropDownSizeChanged(width: Double, height: Double) {
    Timber.v("onDropDownSizeChanged $width $height")
  }

  override fun onDropDownVisible(visible: Boolean) {
    Timber.v("onDropDownVisible $visible")
    currentState = if (visible) State.RESUMED else State.CREATED
  }
}
