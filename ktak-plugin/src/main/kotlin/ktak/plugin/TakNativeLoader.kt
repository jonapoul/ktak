package ktak.plugin

import android.annotation.SuppressLint
import ktak.core.PluginContext
import timber.log.Timber
import java.io.File

public object TakNativeLoader {
  private var nativeLibraryDir: String? = null

  /**
   * If a plugin wishes to make use of this class, they will need to copy it into their plugin.
   * The classloader that loads this class is a key component of getting System.load to work
   * properly.   If it is desirable to use this in a plugin, it will need to be a direct copy in a
   * non-conflicting package name.
   */
  @Suppress("DEPRECATION")
  @Synchronized
  public fun init(pluginContext: PluginContext) {
    if (nativeLibraryDir == null) {
      try {
        val nativeDir = pluginContext.packageManager
          .getApplicationInfo(pluginContext.packageName, 0)
          .nativeLibraryDir
        nativeLibraryDir = nativeDir
      } catch (e: Exception) {
          Timber.e(e)
        error("Native library loading will fail, unable to grab the nativeLibraryDir from ${pluginContext.packageName}")
      }
    }
  }

  /**
   * Security guidance from our recent audit:
   * Pass an absolute path to System.load(). Avoid System.loadLibrary() because its behavior
   * depends upon its implementation which often relies on environmental features that can be
   * manipulated. Use only validated, sanitized absolute paths.
   */
  @SuppressLint("UnsafeDynamicallyLoadedCode")
  public fun loadLibrary(name: String) {
    if (nativeLibraryDir != null) {
      val libFile = File(nativeLibraryDir, System.mapLibraryName(name))
      if (libFile.exists()) {
        System.load(libFile.absolutePath)
      } else {
        error("Library file $libFile doesn't exist, can't load!")
      }
    } else {
      error("NativeLoader not initialized")
    }
  }
}
