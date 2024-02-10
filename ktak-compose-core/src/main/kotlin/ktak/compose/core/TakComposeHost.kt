package ktak.compose.core

import androidx.lifecycle.Lifecycle

public interface TakComposeHost {
  public val lifecycle: Lifecycle
  public val composeContext: TakComposeContext
}
