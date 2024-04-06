package ktak.plugin

import com.atakmap.android.maps.MapView
import gov.tak.api.plugin.IPlugin
import gov.tak.api.plugin.IServiceController
import ktak.core.AppContext
import ktak.core.PluginContext
import ktak.core.TakContexts
import timber.log.Timber

@Suppress("UnnecessaryAbstractClass")
public abstract class TakPlugin(serviceController: IServiceController) : IPlugin {
  protected val mapView: MapView = MapView.getMapView()
  protected val pluginContext: PluginContext = PluginContext(serviceController)
  protected val appContext: AppContext = AppContext(mapView)
  protected val contexts: TakContexts = TakContexts(pluginContext, appContext)

  protected open val timberTree: Timber.Tree? = null

  override fun onStart() {
    timberTree?.let(Timber.Forest::plant)
  }

  override fun onStop() {
    timberTree?.let(Timber.Forest::uproot)
  }
}
