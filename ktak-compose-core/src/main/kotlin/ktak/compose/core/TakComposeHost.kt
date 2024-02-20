package ktak.compose.core

import androidx.lifecycle.LifecycleOwner

public interface TakComposeHost : LifecycleOwner {
  public val composeContext: TakComposeContext
}
