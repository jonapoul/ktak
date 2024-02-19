package ktak.compose.navigation

import androidx.compose.runtime.Composable

public interface TakScreen {
  public val key: TakScreenKey

  @Composable
  public fun Compose()
}

public interface TakScreenKey : Comparable<TakScreenKey>

public data class TakScreenState(
  public val screen: TakScreen,
  public val state: Any?,
)
