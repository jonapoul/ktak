package ktak.plugin

import com.atakmap.android.dropdown.DropDown
import com.atakmap.android.dropdown.DropDownReceiver
import kotlin.reflect.jvm.jvmName

public operator fun DropDown.OnStateListener.plus(other: DropDown.OnStateListener?): DropDown.OnStateListener {
  other ?: return this

  return object : DropDown.OnStateListener {
    override fun onDropDownSelectionRemoved() {
      this@plus.onDropDownSelectionRemoved()
      other.onDropDownSelectionRemoved()
    }

    override fun onDropDownClose() {
      this@plus.onDropDownClose()
      other.onDropDownClose()
    }

    override fun onDropDownSizeChanged(width: Double, height: Double) {
      this@plus.onDropDownSizeChanged(width, height)
      other.onDropDownSizeChanged(width, height)
    }

    override fun onDropDownVisible(visible: Boolean) {
      this@plus.onDropDownVisible(visible)
      other.onDropDownVisible(visible)
    }
  }
}

public inline fun <reified D : DropDownReceiver> associationKey(): String {
  return D::class.qualifiedName
    ?: D::class.simpleName
    ?: D::class.jvmName
}
