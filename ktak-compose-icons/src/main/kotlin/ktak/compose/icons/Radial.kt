@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ktak.compose.icons.radial.AddHostile
import ktak.compose.icons.radial.AngleUnits
import ktak.compose.icons.radial.Back
import ktak.compose.icons.radial.BlastRings
import ktak.compose.icons.radial.Bloodhound
import ktak.compose.icons.radial.Bluetooth
import ktak.compose.icons.radial.Breadcrumbs
import ktak.compose.icons.radial.Bullseye
import ktak.compose.icons.radial.Camera
import ktak.compose.icons.radial.Cas
import ktak.compose.icons.radial.Cff
import ktak.compose.icons.radial.CffAlt
import ktak.compose.icons.radial.CffPlus
import ktak.compose.icons.radial.Chat
import ktak.compose.icons.radial.Clamp
import ktak.compose.icons.radial.ClearTracks
import ktak.compose.icons.radial.Close
import ktak.compose.icons.radial.CompassRose
import ktak.compose.icons.radial.Connections
import ktak.compose.icons.radial.Copy
import ktak.compose.icons.radial.DataPackage
import ktak.compose.icons.radial.Deg
import ktak.compose.icons.radial.DegGrid
import ktak.compose.icons.radial.DegMag
import ktak.compose.icons.radial.DegMil
import ktak.compose.icons.radial.DegTrue
import ktak.compose.icons.radial.Delete
import ktak.compose.icons.radial.DetailsProgress
import ktak.compose.icons.radial.Display
import ktak.compose.icons.radial.DistUnit
import ktak.compose.icons.radial.DistanceLock
import ktak.compose.icons.radial.DropPin
import ktak.compose.icons.radial.Edit
import ktak.compose.icons.radial.EnterCoordinates
import ktak.compose.icons.radial.Expand
import ktak.compose.icons.radial.FahRedx
import ktak.compose.icons.radial.Fine
import ktak.compose.icons.radial.FovDirection
import ktak.compose.icons.radial.FovSize
import ktak.compose.icons.radial.FovVisibility
import ktak.compose.icons.radial.Geofence
import ktak.compose.icons.radial.GoTo
import ktak.compose.icons.radial.GpsError
import ktak.compose.icons.radial.GreenFlag
import ktak.compose.icons.radial.Hostile
import ktak.compose.icons.radial.HostileList
import ktak.compose.icons.radial.Id
import ktak.compose.icons.radial.ImageOverlay
import ktak.compose.icons.radial.Kmm
import ktak.compose.icons.radial.Label
import ktak.compose.icons.radial.Lock
import ktak.compose.icons.radial.LrfSlide
import ktak.compose.icons.radial.ManualPointEntry
import ktak.compose.icons.radial.MgrsLocation
import ktak.compose.icons.radial.MiddlePoint
import ktak.compose.icons.radial.Mils
import ktak.compose.icons.radial.MilsGrid
import ktak.compose.icons.radial.MilsMag
import ktak.compose.icons.radial.MultiPolyline
import ktak.compose.icons.radial.Nineline
import ktak.compose.icons.radial.Nm
import ktak.compose.icons.radial.NoPoint
import ktak.compose.icons.radial.PairingLine
import ktak.compose.icons.radial.PairingLineToSelf
import ktak.compose.icons.radial.PolarEntry
import ktak.compose.icons.radial.Range
import ktak.compose.icons.radial.RedsMsds
import ktak.compose.icons.radial.Rotate
import ktak.compose.icons.radial.Send
import ktak.compose.icons.radial.Support
import ktak.compose.icons.radial.Tasking
import ktak.compose.icons.radial.TrackDetails
import ktak.compose.icons.radial.UnitFt
import ktak.compose.icons.radial.Video
import ktak.compose.icons.radial.ViewshedLine

/**
 * A standardized set of icons to be utilized for the radial menu and child menu components.
 */
public object RadialTakIcons

private val allIcons = listOf(
  TakIcons.Radial.AddHostile,
  TakIcons.Radial.AngleUnits,
  TakIcons.Radial.Back,
  TakIcons.Radial.BlastRings,
  TakIcons.Radial.Bloodhound,
  TakIcons.Radial.Bluetooth,
  TakIcons.Radial.Breadcrumbs,
  TakIcons.Radial.Bullseye,
  TakIcons.Radial.Camera,
  TakIcons.Radial.Cas,
  TakIcons.Radial.Cff,
  TakIcons.Radial.CffAlt,
  TakIcons.Radial.CffPlus,
  TakIcons.Radial.Chat,
  TakIcons.Radial.Clamp,
  TakIcons.Radial.ClearTracks,
  TakIcons.Radial.Close,
  TakIcons.Radial.CompassRose,
  TakIcons.Radial.Connections,
  TakIcons.Radial.Copy,
  TakIcons.Radial.DataPackage,
  TakIcons.Radial.Deg,
  TakIcons.Radial.DegGrid,
  TakIcons.Radial.DegMag,
  TakIcons.Radial.DegMil,
  TakIcons.Radial.DegTrue,
  TakIcons.Radial.Delete,
  TakIcons.Radial.DetailsProgress,
  TakIcons.Radial.Display,
  TakIcons.Radial.DistanceLock,
  TakIcons.Radial.DistUnit,
  TakIcons.Radial.DropPin,
  TakIcons.Radial.Edit,
  TakIcons.Radial.EnterCoordinates,
  TakIcons.Radial.Expand,
  TakIcons.Radial.FahRedx,
  TakIcons.Radial.Fine,
  TakIcons.Radial.FovDirection,
  TakIcons.Radial.FovSize,
  TakIcons.Radial.FovVisibility,
  TakIcons.Radial.Geofence,
  TakIcons.Radial.GoTo,
  TakIcons.Radial.GpsError,
  TakIcons.Radial.GreenFlag,
  TakIcons.Radial.Hostile,
  TakIcons.Radial.HostileList,
  TakIcons.Radial.Id,
  TakIcons.Radial.ImageOverlay,
  TakIcons.Radial.Kmm,
  TakIcons.Radial.Label,
  TakIcons.Radial.Lock,
  TakIcons.Radial.LrfSlide,
  TakIcons.Radial.ManualPointEntry,
  TakIcons.Radial.MgrsLocation,
  TakIcons.Radial.MiddlePoint,
  TakIcons.Radial.Mils,
  TakIcons.Radial.MilsGrid,
  TakIcons.Radial.MilsMag,
  TakIcons.Radial.MultiPolyline,
  TakIcons.Radial.Nineline,
  TakIcons.Radial.Nm,
  TakIcons.Radial.NoPoint,
  TakIcons.Radial.PairingLine,
  TakIcons.Radial.PairingLineToSelf,
  TakIcons.Radial.PolarEntry,
  TakIcons.Radial.Range,
  TakIcons.Radial.RedsMsds,
  TakIcons.Radial.Rotate,
  TakIcons.Radial.Send,
  TakIcons.Radial.Support,
  TakIcons.Radial.Tasking,
  TakIcons.Radial.TrackDetails,
  TakIcons.Radial.UnitFt,
  TakIcons.Radial.Video,
  TakIcons.Radial.ViewshedLine,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
