package ktak.lifecycle

import androidx.annotation.CallSuper
import androidx.lifecycle.LifecycleOwner
import com.atakmap.android.dropdown.DropDownManager
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.maps.MapView

public abstract class TakLifecycleDropDownReceiver(
  mapView: MapView,
  private val key: String,
) : DropDownReceiver(mapView), LifecycleOwner {

  final override val lifecycle: TakLifecycleRegistry = TakLifecycleRegistry(lifecycleOwner = this)

  final override fun getAssociationKey(): String = key

  final override fun setAssociationKey(key: String?) {
    // no-op
  }

  init {
    DropDownManager.getInstance().addStateListener(key, lifecycle)
  }

  @CallSuper
  override fun disposeImpl() {
    DropDownManager.getInstance().removeStateListener(key, lifecycle)
  }
}
