package ktak.lifecycle

import androidx.annotation.CallSuper
import androidx.lifecycle.LifecycleOwner
import com.atakmap.android.dropdown.DropDownManager
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.maps.MapView
import timber.log.Timber

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
    Timber.v("Registering lifecycle $lifecycle")
    DropDownManager.getInstance().addStateListener(key, lifecycle)
  }

  @CallSuper
  override fun disposeImpl() {
    Timber.v("Unregistering lifecycle $lifecycle")
    DropDownManager.getInstance().removeStateListener(key, lifecycle)
  }
}
