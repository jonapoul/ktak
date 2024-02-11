package ktak.compose.core

public data class TakDimensions(
  val lwFraction: Double,
  val lhFraction: Double,
  val pwFraction: Double,
  val phFraction: Double,
) {
  public companion object {
    public val HalfScreen: TakDimensions = TakDimensions(
      lwFraction = 0.5,
      lhFraction = 1.0,
      pwFraction = 1.0,
      phFraction = 0.5,
    )

    public val FullScreen: TakDimensions = TakDimensions(
      lwFraction = 1.0,
      lhFraction = 1.0,
      pwFraction = 1.0,
      phFraction = 1.0,
    )
  }
}
