package ktak.lifecycle

import android.content.Context
import androidx.annotation.CallSuper
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.atakmap.android.dropdown.DropDownManager
import com.atakmap.android.dropdown.DropDownMapComponent
import com.atakmap.android.dropdown.DropDownReceiver
import com.atakmap.android.ipc.AtakBroadcast
import com.atakmap.android.maps.MapView
import timber.log.Timber

public abstract class TakLifecycleMapComponent : DropDownMapComponent(), LifecycleEventObserver {
  private val dropDownManager = DropDownManager.getInstance()
  private val lifecycles = hashMapOf<String, TakLifecycleRegistry>()

  @CallSuper
  override fun registerDropDownReceiver(receiver: DropDownReceiver?, filter: AtakBroadcast.DocumentedIntentFilter?) {
    Timber.v("registerDropDownReceiver $receiver")
    super.registerDropDownReceiver(receiver, filter)
    if (receiver is TakLifecycleDropDownReceiver) {
      lifecycles[receiver.associationKey] = receiver.lifecycle
      receiver.lifecycle.addObserver(this)
      dropDownManager.addStateListener(receiver.associationKey, receiver.lifecycle)
    }
  }

  @CallSuper
  override fun onDestroyImpl(context: Context?, view: MapView?) {
    Timber.v("onDestroyImpl")
    super.onDestroyImpl(context, view)
    lifecycles.forEach { (key, lifecycle) ->
      dropDownManager.removeStateListener(key, lifecycle)
      lifecycle.removeObserver(this)
    }
    lifecycles.clear()
  }

  override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
    Timber.v("onStateChanged $source $event")
  }
}
