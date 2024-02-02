package dev.jonpoulton.ktak.plugin

import com.atakmap.android.maps.MapView
import dev.jonpoulton.ktak.core.AppContext
import dev.jonpoulton.ktak.core.PluginContext
import dev.jonpoulton.ktak.core.TakContexts
import gov.tak.api.plugin.IPlugin
import gov.tak.api.plugin.IServiceController
import timber.log.Timber

public abstract class TakPlugin(serviceController: IServiceController) : IPlugin {
  protected val mapView: MapView = MapView.getMapView()
  protected val pluginContext: PluginContext = PluginContext(serviceController)
  protected val appContext: AppContext = AppContext(mapView)
  protected val contexts: TakContexts = TakContexts(pluginContext, appContext)

  protected open val timberTree: Timber.Tree? = null

  override fun onStart() {
    timberTree?.let(Timber::plant)
  }

  override fun onStop() {
    timberTree?.let(Timber::uproot)
  }
}
