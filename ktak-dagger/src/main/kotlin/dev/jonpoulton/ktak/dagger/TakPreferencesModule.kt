package dev.jonpoulton.ktak.dagger

import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dev.jonpoulton.ktak.core.AppContext
import javax.inject.Singleton

@Module
public class TakPreferencesModule {
  @Provides
  @Singleton
  @Suppress("DEPRECATION")
  public fun sharedPrefs(appContext: AppContext): SharedPreferences {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(appContext)
  }
}
