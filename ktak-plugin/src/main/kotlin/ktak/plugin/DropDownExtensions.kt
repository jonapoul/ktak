package ktak.plugin

import com.atakmap.android.dropdown.DropDownReceiver
import kotlin.reflect.jvm.jvmName

public inline fun <reified D : DropDownReceiver> associationKey(): String = D::class.qualifiedName
  ?: D::class.simpleName
  ?: D::class.jvmName
