package dev.jonpoulton.ktak.ui

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.atakmap.android.maps.MapView
import dev.jonpoulton.ktak.core.AppContext
import dev.jonpoulton.ktak.core.PluginContext
import dev.jonpoulton.ktak.core.TakContexts

public class TakAlertDialogBuilder : AlertDialog.Builder {
  private val pluginContext: PluginContext

  public constructor(appContext: Context, pluginContext: PluginContext) : super(appContext) {
    this.pluginContext = pluginContext
  }

  public constructor(appContext: AppContext, pluginContext: PluginContext) : super(appContext) {
    this.pluginContext = pluginContext
  }

  public constructor(mapView: MapView, pluginContext: PluginContext) : super(mapView.context) {
    this.pluginContext = pluginContext
  }

  public constructor(contexts: TakContexts) : super(contexts.app) {
    this.pluginContext = contexts.plugin
  }

  override fun setView(@LayoutRes layoutResId: Int): TakAlertDialogBuilder =
    super.setView(LayoutInflater.from(pluginContext).inflate(layoutResId, null, false)) as TakAlertDialogBuilder

  override fun setView(view: View?): TakAlertDialogBuilder =
    super.setView(view) as TakAlertDialogBuilder

  override fun setTitle(@StringRes titleId: Int): TakAlertDialogBuilder =
    super.setTitle(pluginContext.getString(titleId)) as TakAlertDialogBuilder

  override fun setMessage(@StringRes messageId: Int): TakAlertDialogBuilder =
    super.setMessage(pluginContext.getString(messageId)) as TakAlertDialogBuilder

  override fun setMessage(message: CharSequence): TakAlertDialogBuilder =
    super.setMessage(message) as TakAlertDialogBuilder

  override fun setIcon(@DrawableRes iconId: Int): TakAlertDialogBuilder =
    super.setIcon(ContextCompat.getDrawable(pluginContext, iconId)) as TakAlertDialogBuilder

  public fun setSimplePositiveButton(
    @StringRes text: Int = android.R.string.ok,
    onClick: (() -> Unit)? = null,
  ): TakAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setPositiveButton(string, null) as TakAlertDialogBuilder
    } else {
      setPositiveButton(string) { _, _ -> onClick.invoke() } as TakAlertDialogBuilder
    }
  }

  public fun setSimpleNegativeButton(
    @StringRes text: Int = android.R.string.cancel,
    onClick: (() -> Unit)? = null,
  ): TakAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setNegativeButton(string, null) as TakAlertDialogBuilder
    } else {
      setNegativeButton(string) { _, _ -> onClick.invoke() } as TakAlertDialogBuilder
    }
  }

  public fun setSimpleNeutralButton(
    @StringRes text: Int,
    onClick: (() -> Unit)? = null,
  ): TakAlertDialogBuilder {
    val string = pluginContext.getString(text)
    return if (onClick == null) {
      setNeutralButton(string, null) as TakAlertDialogBuilder
    } else {
      setNeutralButton(string) { _, _ -> onClick.invoke() } as TakAlertDialogBuilder
    }
  }
}
