package dev.jonpoulton.ktak.compose.core

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import dev.jonpoulton.ktak.core.TakContexts

public val LocalTakContexts: ProvidableCompositionLocal<TakContexts> = compositionLocalOf {
  error("CompositionLocal TakContexts not present")
}
