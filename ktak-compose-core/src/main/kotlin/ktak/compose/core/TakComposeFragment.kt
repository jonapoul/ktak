package ktak.compose.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Colors
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.fragment.app.Fragment
import com.atakmap.android.maps.MapView
import timber.log.Timber

public class TakComposeFragment(
  private val mapView: MapView,
  private val composeContext: TakComposeContext,
) : Fragment() {

  public constructor(
    mapView: MapView,
    composeContext: TakComposeContext,
    content: @Composable () -> Unit,
  ) : this(mapView, composeContext) {
    setTakContent(content = content)
  }

  private lateinit var composeView: ComposeView
  private lateinit var content: @Composable () -> Unit

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    Timber.v("onCreateView")
    composeView = ComposeView(composeContext)
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
      TakTheme(colors, shapes(), typography()) {
        CompositionLocalProvider(
          LocalContext provides composeContext,
          LocalTakComposeContext provides composeContext,
          LocalTakContexts provides composeContext.contexts,
          LocalMapView provides mapView,
        ) {
          content()
        }
      }
    }
  }

  public fun applyTakContent(
    colors: Colors = TakColors.colors,
    shapes: @Composable () -> Shapes = { TakShapes },
    typography: @Composable () -> Typography = { TakTypography },
    content: @Composable () -> Unit,
  ) {
    Timber.v("applyTakContent")
    setTakContent(colors, shapes, typography, content)
    composeView.setContent(this.content)
  }
}
