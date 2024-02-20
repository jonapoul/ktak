package ktak.compose.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Colors
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.atakmap.android.maps.MapView
import timber.log.Timber

public class TakComposeFragment(
  private val mapView: MapView,
  private val host: TakComposeHost,
) : Fragment() {

  public constructor(
    mapView: MapView,
    host: TakComposeHost,
    content: @Composable () -> Unit,
  ) : this(mapView, host) {
    setTakContent(content = content)
  }

  private lateinit var composeView: ComposeView
  private lateinit var content: @Composable () -> Unit

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    Timber.v("onCreateView")
    composeView = TakComposeView(host)
    return composeView
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    Timber.v("onViewCreated")
    composeView.setContent(content)
  }

  override fun onDestroyView() {
    super.onDestroyView()
    Timber.v("onDestroyView")
  }

  public fun setTakContent(
    colors: Colors = TakColors.colors,
    shapes: @Composable () -> Shapes = { TakShapes },
    typography: @Composable () -> Typography = { TakTypography },
    content: @Composable () -> Unit,
  ) {
    Timber.v("setTakContent")
    this.content = {
      TakContent(
        composeContext = host.composeContext,
        colors = colors,
        shapes = shapes,
        typography = typography,
        mapView = mapView,
        content = content,
      )
    }
  }
}
