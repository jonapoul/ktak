@file:JvmName("PoolingContainer")
@file:Suppress("MatchingDeclarationName")

package androidx.customview.poolingcontainer

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewParent
import androidx.annotation.UiThread
import dev.jonpoulton.ktak.poolingcontainer.R

/**
 * This whole file is a copypaste from the same file in androidx.customview:customview-poolingcontainer:1.0.0 but with
 * one main change - the implementation of [isWithinPoolingContainer] doesn't directly make a call to the "getAncestors"
 * extension method of the [View] class. Instead I've just copypasted the implementation in its place.
 *
 * Only reason is that ATAK gives runtime crashes when trying to call the regular implementation of this method,
 * giving an error like below:
 *
 *   java.lang.NoSuchMethodError: No static method getAncestors(Landroid/view/View;)Lkotlin/sequences/Sequence; in class
 *   Landroidx/core/view/ViewKt; or its super classes (declaration of 'androidx.core.view.ViewKt' appears in
 *   /data/app/~~GkwoAPhqp5zj0AM8ErAwGw==/com.atakmap.app.civ-lQemnLg4gb9PYdJ9ACahWA==/base.apk)
 *
 * Not sure why this happens, but a very simple workaround seems to fix it. Might be some dependency version mismatch
 * between the plugin and ATAK itself? Not sure.
 *
 * As part of this, you should also explicitly exclude the regular poolingcontainer library from your gradle build.
 */

public fun interface PoolingContainerListener {
  @UiThread
  public fun onRelease()
}

@SuppressLint("ExecutorRegistration") // This is a UI thread callback
public fun View.addPoolingContainerListener(listener: PoolingContainerListener) {
  this.poolingContainerListenerHolder.addListener(listener)
}

@SuppressLint("ExecutorRegistration") // This is a UI thread callback
public fun View.removePoolingContainerListener(listener: PoolingContainerListener) {
  this.poolingContainerListenerHolder.removeListener(listener)
}

public var View.isPoolingContainer: Boolean
  get() = getTag(IsPoolingContainerTag) as? Boolean ?: false
  set(value) {
    setTag(IsPoolingContainerTag, value)
  }

public val View.isWithinPoolingContainer: Boolean
  get() {
    // This call to generateSequence() is the only change
    generateSequence(parent, ViewParent::getParent).forEach {
      if (it is View && it.isPoolingContainer) {
        return true
      }
    }
    return false
  }

private val PoolingContainerListenerHolderTag = R.id.pooling_container_listener_holder_tag
private val IsPoolingContainerTag = R.id.is_pooling_container_tag

private class PoolingContainerListenerHolder {
  private val listeners = ArrayList<PoolingContainerListener>()

  fun addListener(listener: PoolingContainerListener) {
    listeners.add(listener)
  }

  fun removeListener(listener: PoolingContainerListener) {
    listeners.remove(listener)
  }

  fun onRelease() {
    for (i in listeners.lastIndex downTo 0) {
      listeners[i].onRelease()
    }
  }
}

private val View.poolingContainerListenerHolder: PoolingContainerListenerHolder
  get() {
    var lifecycle = getTag(PoolingContainerListenerHolderTag) as PoolingContainerListenerHolder?
    if (lifecycle == null) {
      lifecycle = PoolingContainerListenerHolder()
      setTag(PoolingContainerListenerHolderTag, lifecycle)
    }
    return lifecycle
  }
