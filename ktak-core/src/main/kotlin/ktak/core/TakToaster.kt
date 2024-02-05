package ktak.core

import android.widget.Toast
import androidx.annotation.StringRes
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

public class TakToaster(
  private val appContext: AppContext,
  private val pluginContext: PluginContext,
  private val main: CoroutineContext,
) {
  public fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(appContext, message, length).show()
  }

  public fun toast(@StringRes message: Int, length: Int = Toast.LENGTH_LONG) {
    toast(pluginContext.getString(message), length)
  }

  public suspend fun coToast(message: String, length: Int = Toast.LENGTH_LONG) {
    withContext(main) { Toast.makeText(appContext, message, length).show() }
  }

  public suspend fun coToast(@StringRes message: Int, length: Int = Toast.LENGTH_LONG) {
    coToast(pluginContext.getString(message), length)
  }
}
