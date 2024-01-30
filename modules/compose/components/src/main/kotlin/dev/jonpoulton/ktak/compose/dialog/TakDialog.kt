package dev.jonpoulton.ktak.compose.dialog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import dev.jonpoulton.ktak.compose.core.LocalMapView
import dev.jonpoulton.ktak.compose.core.LocalTakComposeContext

/**
 * Use this in conjunction with the various DialogCard composables, e.g.:
 * - [TakDialogTextCard] for text display
 * - [TakDialogTextInputCard] for text input from the user
 * - [TakDialogLoadingCard] for displaying a loading wheel
 *
 * Or use [TakDialogCard] to roll your own layouts.
 */
@Composable
public fun TakDialog(
  onDismissRequest: () -> Unit,
  properties: DialogProperties = DialogProperties(),
  content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
    LocalView provides LocalMapView.current,
    LocalContext provides LocalTakComposeContext.current,
  ) {
    Dialog(
      onDismissRequest = onDismissRequest,
      properties = properties,
      content = content,
    )
  }
}
