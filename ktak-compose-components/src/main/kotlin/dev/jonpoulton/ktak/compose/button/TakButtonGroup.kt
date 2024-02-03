package dev.jonpoulton.ktak.compose.button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import dev.jonpoulton.ktak.compose.core.TakTextStyles
import dev.jonpoulton.ktak.compose.preview.PreviewCallback
import dev.jonpoulton.ktak.compose.preview.PreviewDark
import dev.jonpoulton.ktak.compose.preview.TakPreview
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Composable
public fun TakButtonGroup(
  modifier: Modifier = Modifier,
  isDisabled: Boolean = false,
  colors: TakButtonColors = DefaultTakButtonColors(),
  textStyle: TextStyle = TakTextStyles.H2,
  buttons: ImmutableList<TakGroupedButton>,
) {
  Row(
    modifier = Modifier
      .wrapContentHeight()
      .fillMaxWidth(),
  ) {
    buttons.forEach { button ->
      val isFirst = button == buttons.first()
      val isLast = button == buttons.last()
      val shape = when {
        // only one element
        isFirst && isLast -> TakButtonRoundedEdges

        // First element has rounded corners on the outside
        isFirst -> TakButtonRoundedEdgesStart

        // Last element has rounded corners on the outside
        isLast -> TakButtonRoundedEdgesEnd

        // All sharp corners
        else -> TakButtonRoundedEdgesMid
      }

      TakPrimaryButton(
        modifier = modifier.weight(1f),
        text = button.text,
        shape = shape,
        isDisabled = isDisabled || button.isDisabled,
        colors = colors,
        textStyle = textStyle,
        onClick = { button.onClick() },
      )

      if (!isLast) {
        Spacer(modifier = Modifier.width(1.dp))
      }
    }
  }
}

@Stable
@Immutable
public class TakGroupedButton(
  public val text: String,
  public val isDisabled: Boolean = false,
  public val onClick: () -> Unit,
)

@PreviewDark
@Composable
private fun OneButton() = TakPreview {
  Box(modifier = Modifier.width(300.dp)) {
    TakButtonGroup(
      modifier = Modifier,
      isDisabled = false,
      buttons = persistentListOf(
        TakGroupedButton(text = "ABCD", onClick = PreviewCallback),
      ),
    )
  }
}

@PreviewDark
@Composable
private fun TwoButtons() = TakPreview {
  Box(modifier = Modifier.width(300.dp)) {
    TakButtonGroup(
      modifier = Modifier,
      isDisabled = false,
      buttons = persistentListOf(
        TakGroupedButton(text = "ABCD", onClick = PreviewCallback),
        TakGroupedButton(text = "1234", onClick = PreviewCallback),
      ),
    )
  }
}

@PreviewDark
@Composable
private fun ThreeButtons() = TakPreview {
  Box(modifier = Modifier.width(300.dp)) {
    TakButtonGroup(
      modifier = Modifier,
      isDisabled = false,
      buttons = persistentListOf(
        TakGroupedButton(text = "ABCD", onClick = PreviewCallback),
        TakGroupedButton(text = "1234", onClick = PreviewCallback),
        TakGroupedButton(text = "WXYZ", onClick = PreviewCallback),
      ),
    )
  }
}

@PreviewDark
@Composable
private fun FourButtons() = TakPreview {
  Box(modifier = Modifier.width(300.dp)) {
    TakButtonGroup(
      modifier = Modifier,
      isDisabled = false,
      buttons = persistentListOf(
        TakGroupedButton(text = "ABCD", onClick = PreviewCallback),
        TakGroupedButton(text = "EFGH", onClick = PreviewCallback),
        TakGroupedButton(text = "1234", onClick = PreviewCallback),
        TakGroupedButton(text = "5678", onClick = PreviewCallback),
      ),
    )
  }
}

