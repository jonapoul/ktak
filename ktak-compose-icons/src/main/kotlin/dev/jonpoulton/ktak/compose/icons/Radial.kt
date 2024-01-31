@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.ktak.compose.icons.radial.AddHostile
import dev.jonpoulton.ktak.compose.icons.radial.AngleUnits
import dev.jonpoulton.ktak.compose.icons.radial.Back
import dev.jonpoulton.ktak.compose.icons.radial.BlastRings
import dev.jonpoulton.ktak.compose.icons.radial.Bloodhound
import dev.jonpoulton.ktak.compose.icons.radial.Bluetooth
import dev.jonpoulton.ktak.compose.icons.radial.Breadcrumbs
import dev.jonpoulton.ktak.compose.icons.radial.Bullseye
import dev.jonpoulton.ktak.compose.icons.radial.Camera
import dev.jonpoulton.ktak.compose.icons.radial.Cas
import dev.jonpoulton.ktak.compose.icons.radial.Cff
import dev.jonpoulton.ktak.compose.icons.radial.CffAlt
import dev.jonpoulton.ktak.compose.icons.radial.CffPlus
import dev.jonpoulton.ktak.compose.icons.radial.Chat
import dev.jonpoulton.ktak.compose.icons.radial.Clamp
import dev.jonpoulton.ktak.compose.icons.radial.ClearTracks
import dev.jonpoulton.ktak.compose.icons.radial.Close
import dev.jonpoulton.ktak.compose.icons.radial.CompassRose
import dev.jonpoulton.ktak.compose.icons.radial.Connections
import dev.jonpoulton.ktak.compose.icons.radial.Copy
import dev.jonpoulton.ktak.compose.icons.radial.DataPackage
import dev.jonpoulton.ktak.compose.icons.radial.Deg
import dev.jonpoulton.ktak.compose.icons.radial.DegGrid
import dev.jonpoulton.ktak.compose.icons.radial.DegMag
import dev.jonpoulton.ktak.compose.icons.radial.DegMil
import dev.jonpoulton.ktak.compose.icons.radial.DegTrue
import dev.jonpoulton.ktak.compose.icons.radial.Delete
import dev.jonpoulton.ktak.compose.icons.radial.DetailsProgress
import dev.jonpoulton.ktak.compose.icons.radial.Display
import dev.jonpoulton.ktak.compose.icons.radial.DistUnit
import dev.jonpoulton.ktak.compose.icons.radial.DistanceLock
import dev.jonpoulton.ktak.compose.icons.radial.DropPin
import dev.jonpoulton.ktak.compose.icons.radial.Edit
import dev.jonpoulton.ktak.compose.icons.radial.EnterCoordinates
import dev.jonpoulton.ktak.compose.icons.radial.Expand
import dev.jonpoulton.ktak.compose.icons.radial.FahRedx
import dev.jonpoulton.ktak.compose.icons.radial.Fine
import dev.jonpoulton.ktak.compose.icons.radial.FovDirection
import dev.jonpoulton.ktak.compose.icons.radial.FovSize
import dev.jonpoulton.ktak.compose.icons.radial.FovVisibility
import dev.jonpoulton.ktak.compose.icons.radial.Geofence
import dev.jonpoulton.ktak.compose.icons.radial.GoTo
import dev.jonpoulton.ktak.compose.icons.radial.GpsError
import dev.jonpoulton.ktak.compose.icons.radial.GreenFlag
import dev.jonpoulton.ktak.compose.icons.radial.Hostile
import dev.jonpoulton.ktak.compose.icons.radial.HostileList
import dev.jonpoulton.ktak.compose.icons.radial.Id
import dev.jonpoulton.ktak.compose.icons.radial.ImageOverlay
import dev.jonpoulton.ktak.compose.icons.radial.Kmm
import dev.jonpoulton.ktak.compose.icons.radial.Label
import dev.jonpoulton.ktak.compose.icons.radial.Lock
import dev.jonpoulton.ktak.compose.icons.radial.LrfSlide
import dev.jonpoulton.ktak.compose.icons.radial.ManualPointEntry
import dev.jonpoulton.ktak.compose.icons.radial.MgrsLocation
import dev.jonpoulton.ktak.compose.icons.radial.MiddlePoint
import dev.jonpoulton.ktak.compose.icons.radial.Mils
import dev.jonpoulton.ktak.compose.icons.radial.MilsGrid
import dev.jonpoulton.ktak.compose.icons.radial.MilsMag
import dev.jonpoulton.ktak.compose.icons.radial.MultiPolyline
import dev.jonpoulton.ktak.compose.icons.radial.Nineline
import dev.jonpoulton.ktak.compose.icons.radial.Nm
import dev.jonpoulton.ktak.compose.icons.radial.NoPoint
import dev.jonpoulton.ktak.compose.icons.radial.PairingLine
import dev.jonpoulton.ktak.compose.icons.radial.PairingLineToSelf
import dev.jonpoulton.ktak.compose.icons.radial.PolarEntry
import dev.jonpoulton.ktak.compose.icons.radial.Range
import dev.jonpoulton.ktak.compose.icons.radial.RedsMsds
import dev.jonpoulton.ktak.compose.icons.radial.Rotate
import dev.jonpoulton.ktak.compose.icons.radial.Send
import dev.jonpoulton.ktak.compose.icons.radial.Support
import dev.jonpoulton.ktak.compose.icons.radial.Tasking
import dev.jonpoulton.ktak.compose.icons.radial.TrackDetails
import dev.jonpoulton.ktak.compose.icons.radial.UnitFt
import dev.jonpoulton.ktak.compose.icons.radial.Video
import dev.jonpoulton.ktak.compose.icons.radial.ViewshedLine

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
