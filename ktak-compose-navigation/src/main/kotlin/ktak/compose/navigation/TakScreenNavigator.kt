package ktak.compose.navigation

import androidx.compose.runtime.Stable
import java.io.Closeable

@Stable
public interface TakScreenNavigator : Closeable {
  public fun navigateForward(screen: TakScreen)
  public fun navigateReplace(screen: TakScreen)
  public fun navigateBack(forceNavBack: Boolean = false)
}
