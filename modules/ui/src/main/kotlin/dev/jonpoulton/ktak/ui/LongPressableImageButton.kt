package dev.jonpoulton.ktak.ui

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton
import com.atakmap.android.maps.MapView
import dev.jonpoulton.ktak.core.toast

@SuppressLint("AppCompatCustomView")
public class LongPressableImageButton @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
) : ImageButton(context, attrs) {
  init {
    setOnLongClickListener {
      val desc = contentDescription?.toString()
      if (!desc.isNullOrBlank()) {
        MapView.getMapView().toast(desc)
        true
      } else {
        false
      }
    }
  }
}
