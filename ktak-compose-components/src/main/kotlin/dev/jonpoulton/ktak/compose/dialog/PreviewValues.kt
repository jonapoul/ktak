package ktak.compose.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ktak.compose.core.TakColors
import ktak.compose.icons.TakIcons
import ktak.compose.icons.utility.Walking
import ktak.compose.preview.PreviewCallback

internal val PreviewPositiveButton = TakDialogPositiveButton(
  onClick = PreviewCallback
)

internal val PreviewNeutralButton = TakDialogNeutralButton(
  text = "FOOBAR",
  icon = TakIcons.Utility.Walking,
  onClick = PreviewCallback
)

internal val PreviewNegativeButton = TakDialogNegativeButton(
  onClick = PreviewCallback
)

@Composable
internal fun PreviewSandyBox(content: @Composable BoxScope.() -> Unit) {
  Box(
    modifier = Modifier.background(TakColors.Sand),
    content = content,
  )
}
