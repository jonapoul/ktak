package ktak.lifecycle

import androidx.lifecycle.LifecycleOwner
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.maps.MapView

public abstract class TakLifecycleDropDownReceiver(
  mapView: MapView,
) : DropDownReceiver(mapView), LifecycleOwner {

  final override val lifecycle: TakLifecycleRegistry by lazy { TakLifecycleRegistry(lifecycleOwner = this) }

  abstract override fun getAssociationKey(): String
}
