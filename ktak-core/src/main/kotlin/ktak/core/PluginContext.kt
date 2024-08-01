package ktak.core

import android.content.Context
import android.content.ContextWrapper
import com.atak.plugins.impl.PluginContextProvider
import gov.tak.api.plugin.IServiceController

public class PluginContext(context: Context) : ContextWrapper(context)

public fun PluginContext(serviceController: IServiceController): PluginContext = PluginContext(
  context = serviceController
    .getService(PluginContextProvider::class.java)
    .pluginContext,
)
