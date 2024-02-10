package ktak.lifecycle

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.atakmap.android.dropdown.DropDown

public class TakLifecycleRegistry(
  lifecycleOwner: LifecycleOwner,
) : LifecycleRegistry(lifecycleOwner), DropDown.OnStateListener {
  override fun onDropDownSelectionRemoved() {
    println("onDropDownSelectionRemoved")
  }

  override fun onDropDownClose() {
    println("onDropDownClose")
    currentState = State.DESTROYED
  }

  override fun onDropDownSizeChanged(width: Double, height: Double) {
    println("onDropDownSizeChanged $width $height")
  }

  override fun onDropDownVisible(visible: Boolean) {
    println("onDropDownVisible $visible")
    currentState = if (visible) State.RESUMED else State.CREATED
  }
}
