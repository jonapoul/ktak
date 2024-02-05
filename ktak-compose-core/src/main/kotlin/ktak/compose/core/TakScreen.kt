package ktak.compose.core

import androidx.compose.runtime.Composable

public interface TakScreen {
  @Composable
  public fun Compose()

  public data class Dimensions(
    val lwFraction: Double,
    val lhFraction: Double,
    val pwFraction: Double,
    val phFraction: Double,
  )

  public companion object {
    public val HalfScreen: Dimensions = Dimensions(
      lwFraction = 0.5,
      lhFraction = 1.0,
      pwFraction = 1.0,
      phFraction = 0.5,
    )

    public val FullScreen: Dimensions = Dimensions(
      lwFraction = 1.0,
      lhFraction = 1.0,
      pwFraction = 1.0,
      phFraction = 1.0,
    )
  }
}
