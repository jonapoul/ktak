@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ktak.compose.icons.markers.AlarmGamma
import ktak.compose.icons.markers.AlarmNeutron
import ktak.compose.icons.markers.AltDipGray
import ktak.compose.icons.markers.AltDipGreen
import ktak.compose.icons.markers.Black
import ktak.compose.icons.markers.Blue
import ktak.compose.icons.markers.CheckpointBlue
import ktak.compose.icons.markers.CheckpointGreen
import ktak.compose.icons.markers.CheckpointRed
import ktak.compose.icons.markers.CheckpointYellow
import ktak.compose.icons.markers.ChemEffect
import ktak.compose.icons.markers.Damaged
import ktak.compose.icons.markers.Dip
import ktak.compose.icons.markers.DoubleRoundBlue
import ktak.compose.icons.markers.DoubleRoundGreen
import ktak.compose.icons.markers.DoubleRoundRed
import ktak.compose.icons.markers.DoubleRoundYellow
import ktak.compose.icons.markers.DpPoint1Active
import ktak.compose.icons.markers.DpPoint1Inactive
import ktak.compose.icons.markers.DpPoint1Locked
import ktak.compose.icons.markers.DpPoint2Active
import ktak.compose.icons.markers.DpPoint2Inactive
import ktak.compose.icons.markers.DpPoint2Locked
import ktak.compose.icons.markers.DpPoint3Active
import ktak.compose.icons.markers.DpPoint3Inactive
import ktak.compose.icons.markers.DpPoint3Locked
import ktak.compose.icons.markers.Emergency
import ktak.compose.icons.markers.Forest
import ktak.compose.icons.markers.Friendly
import ktak.compose.icons.markers.FriendlyDirection
import ktak.compose.icons.markers.Generic
import ktak.compose.icons.markers.Gray
import ktak.compose.icons.markers.Green
import ktak.compose.icons.markers.Hostile
import ktak.compose.icons.markers.Important
import ktak.compose.icons.markers.Iwmdt
import ktak.compose.icons.markers.LargeReticle
import ktak.compose.icons.markers.LightBlue
import ktak.compose.icons.markers.Lime
import ktak.compose.icons.markers.Lollipop
import ktak.compose.icons.markers.MapPingFlash
import ktak.compose.icons.markers.Maroon
import ktak.compose.icons.markers.Moneyshot
import ktak.compose.icons.markers.Mortar
import ktak.compose.icons.markers.NaPresence
import ktak.compose.icons.markers.Navy
import ktak.compose.icons.markers.Neutral
import ktak.compose.icons.markers.NucEffect
import ktak.compose.icons.markers.OffscreenIndicator
import ktak.compose.icons.markers.OpenCircle
import ktak.compose.icons.markers.Orange
import ktak.compose.icons.markers.PicMarker
import ktak.compose.icons.markers.Pin
import ktak.compose.icons.markers.PresenceCurrent
import ktak.compose.icons.markers.PresenceDead
import ktak.compose.icons.markers.PresenceStale
import ktak.compose.icons.markers.Purple
import ktak.compose.icons.markers.Red
import ktak.compose.icons.markers.Self
import ktak.compose.icons.markers.Spot
import ktak.compose.icons.markers.Teal
import ktak.compose.icons.markers.TeamHuman
import ktak.compose.icons.markers.ThreeDimensionalMap
import ktak.compose.icons.markers.ThreeDimensionalMapError
import ktak.compose.icons.markers.Unknown
import ktak.compose.icons.markers.Violet
import ktak.compose.icons.markers.WhiteStar
import ktak.compose.icons.markers.Yellow

/**
 * A standardized set of icons to be utilized on map throughout the application.
 */
public object MarkersTakIcons

private val allIcons = listOf(
  TakIcons.Markers.AlarmGamma,
  TakIcons.Markers.AlarmNeutron,
  TakIcons.Markers.AltDipGray,
  TakIcons.Markers.AltDipGreen,
  TakIcons.Markers.Black,
  TakIcons.Markers.Blue,
  TakIcons.Markers.CheckpointBlue,
  TakIcons.Markers.CheckpointGreen,
  TakIcons.Markers.CheckpointRed,
  TakIcons.Markers.CheckpointYellow,
  TakIcons.Markers.ChemEffect,
  TakIcons.Markers.Damaged,
  TakIcons.Markers.Dip,
  TakIcons.Markers.DoubleRoundBlue,
  TakIcons.Markers.DoubleRoundGreen,
  TakIcons.Markers.DoubleRoundRed,
  TakIcons.Markers.DoubleRoundYellow,
  TakIcons.Markers.DpPoint1Active,
  TakIcons.Markers.DpPoint1Inactive,
  TakIcons.Markers.DpPoint1Locked,
  TakIcons.Markers.DpPoint2Active,
  TakIcons.Markers.DpPoint2Inactive,
  TakIcons.Markers.DpPoint2Locked,
  TakIcons.Markers.DpPoint3Active,
  TakIcons.Markers.DpPoint3Inactive,
  TakIcons.Markers.DpPoint3Locked,
  TakIcons.Markers.Emergency,
  TakIcons.Markers.Forest,
  TakIcons.Markers.Friendly,
  TakIcons.Markers.FriendlyDirection,
  TakIcons.Markers.Generic,
  TakIcons.Markers.Gray,
  TakIcons.Markers.Green,
  TakIcons.Markers.Hostile,
  TakIcons.Markers.Important,
  TakIcons.Markers.Iwmdt,
  TakIcons.Markers.LargeReticle,
  TakIcons.Markers.LightBlue,
  TakIcons.Markers.Lime,
  TakIcons.Markers.Lollipop,
  TakIcons.Markers.MapPingFlash,
  TakIcons.Markers.Maroon,
  TakIcons.Markers.Moneyshot,
  TakIcons.Markers.Mortar,
  TakIcons.Markers.NaPresence,
  TakIcons.Markers.Navy,
  TakIcons.Markers.Neutral,
  TakIcons.Markers.NucEffect,
  TakIcons.Markers.OffscreenIndicator,
  TakIcons.Markers.OpenCircle,
  TakIcons.Markers.Orange,
  TakIcons.Markers.PicMarker,
  TakIcons.Markers.Pin,
  TakIcons.Markers.PresenceCurrent,
  TakIcons.Markers.PresenceDead,
  TakIcons.Markers.PresenceStale,
  TakIcons.Markers.Purple,
  TakIcons.Markers.Red,
  TakIcons.Markers.Self,
  TakIcons.Markers.Spot,
  TakIcons.Markers.Teal,
  TakIcons.Markers.TeamHuman,
  TakIcons.Markers.ThreeDimensionalMap,
  TakIcons.Markers.ThreeDimensionalMapError,
  TakIcons.Markers.Unknown,
  TakIcons.Markers.Violet,
  TakIcons.Markers.WhiteStar,
  TakIcons.Markers.Yellow,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
