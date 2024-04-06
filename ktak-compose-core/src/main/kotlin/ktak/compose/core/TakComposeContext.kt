package ktak.compose.core

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Resources
import androidx.compose.ui.text.font.createFontFamilyResolver
import ktak.core.AppContext
import ktak.core.PluginContext
import ktak.core.TakContexts

/**
 * This class is a workaround for the fact that ComposeView needs the plugin to load resources, but also uses
 * the app's application context for non-resource-related work.
 */
public class TakComposeContext(public val contexts: TakContexts) : ContextWrapper(contexts.plugin) {
  public constructor(plugin: PluginContext, app: AppContext) : this(TakContexts(plugin, app))

  private val applicationContext = TakComposeApplicationContext(contexts)

  override fun getApplicationContext(): Context = applicationContext

  // Useful in the debugger, otherwise it only shows up as a ContextWrapper
  override fun toString(): String = "TakComposeContext(${contexts.plugin}, ${contexts.app})"

  /**
   * Needed for font resolution. [androidx.compose.ui.platform.AndroidComposeView] creates its own call to
   * [createFontFamilyResolver], so we can't choose which context to pass in. Internally, it calls [getResources]
   * on the [TakComposeContext]'s application context, so we need to make sure it's pointing to the right place.
   */
  private class TakComposeApplicationContext(
    private val contexts: TakContexts,
  ) : ContextWrapper(contexts.app.applicationContext) {
    override fun getResources(): Resources = contexts.plugin.resources
  }
}
