package ktak.compose.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ktak.compose.core.TakColors
import ktak.compose.preview.DarkPreview
import ktak.compose.preview.TakPreview

@Composable
public fun TakDialogButtons(
  modifier: Modifier = Modifier,
  dismissDialog: () -> Unit = {},
  positive: TakDialogPositiveButton? = null,
  neutral: TakDialogNeutralButton? = null,
  negative: TakDialogNegativeButton? = null,
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(48.dp),
  ) {
    if (negative != null) TakDialogButton(negative, dismissDialog = dismissDialog)

    if (negative != null && (neutral != null || positive != null)) {
      VerticalDivider()
    }
    if (neutral != null) TakDialogButton(neutral, dismissDialog = dismissDialog)

    if (neutral != null && positive != null) {
      VerticalDivider()
    }

    if (positive != null) TakDialogButton(positive, dismissDialog = dismissDialog)
  }
}

@Composable
private fun VerticalDivider() {
  Box(
    Modifier
      .fillMaxHeight()
      .width(1.dp)
      .background(color = TakColors.Ink),
  )
}

@DarkPreview
@Composable
private fun PreviewThree() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      positive = PreviewPositiveButton,
      neutral = PreviewNeutralButton,
      negative = PreviewNegativeButton,
    )
  }
}

@DarkPreview
@Composable
private fun PreviewTwo() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      positive = PreviewPositiveButton,
      negative = PreviewNegativeButton,
    )
  }
}

@DarkPreview
@Composable
private fun PreviewOne() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      positive = PreviewPositiveButton,
    )
  }
}

@DarkPreview
@Composable
private fun PreviewNegative() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      negative = PreviewNegativeButton,
    )
  }
}
