package dev.jonpoulton.ktak.dagger

import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.kotlin.core.MainDispatcher
import dev.jonpoulton.ktak.core.AppContext
import dev.jonpoulton.ktak.core.PluginContext
import dev.jonpoulton.ktak.core.TakToaster

@Module
public class TakToasterModule {
  @Provides
  public fun toaster(
    appContext: AppContext,
    pluginContext: PluginContext,
    main: MainDispatcher,
  ): TakToaster = TakToaster(appContext, pluginContext, main)
}
