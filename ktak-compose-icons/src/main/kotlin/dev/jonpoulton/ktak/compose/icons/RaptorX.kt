@file:Suppress("UnusedReceiverParameter")

package dev.jonpoulton.ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.ktak.compose.icons.raptorx.About
import dev.jonpoulton.ktak.compose.icons.raptorx.AddFavorite
import dev.jonpoulton.ktak.compose.icons.raptorx.App
import dev.jonpoulton.ktak.compose.icons.raptorx.Audio
import dev.jonpoulton.ktak.compose.icons.raptorx.Box
import dev.jonpoulton.ktak.compose.icons.raptorx.CacheCleaner
import dev.jonpoulton.ktak.compose.icons.raptorx.Camera
import dev.jonpoulton.ktak.compose.icons.raptorx.Circle
import dev.jonpoulton.ktak.compose.icons.raptorx.Cone
import dev.jonpoulton.ktak.compose.icons.raptorx.ConnectToMapSetElevation
import dev.jonpoulton.ktak.compose.icons.raptorx.ConnectToMapSetImagery
import dev.jonpoulton.ktak.compose.icons.raptorx.ConnectToServerElevation
import dev.jonpoulton.ktak.compose.icons.raptorx.ConnectToServerImagery
import dev.jonpoulton.ktak.compose.icons.raptorx.Connections
import dev.jonpoulton.ktak.compose.icons.raptorx.ConvertElevation
import dev.jonpoulton.ktak.compose.icons.raptorx.ConvertImagery
import dev.jonpoulton.ktak.compose.icons.raptorx.Cylinder
import dev.jonpoulton.ktak.compose.icons.raptorx.DefaultHeading
import dev.jonpoulton.ktak.compose.icons.raptorx.DefaultHeadingTilt
import dev.jonpoulton.ktak.compose.icons.raptorx.DefaultTilt
import dev.jonpoulton.ktak.compose.icons.raptorx.Devices
import dev.jonpoulton.ktak.compose.icons.raptorx.Ellipse
import dev.jonpoulton.ktak.compose.icons.raptorx.Ellipsoid
import dev.jonpoulton.ktak.compose.icons.raptorx.EventLog
import dev.jonpoulton.ktak.compose.icons.raptorx.File
import dev.jonpoulton.ktak.compose.icons.raptorx.Files
import dev.jonpoulton.ktak.compose.icons.raptorx.Freeform
import dev.jonpoulton.ktak.compose.icons.raptorx.GeoPing
import dev.jonpoulton.ktak.compose.icons.raptorx.GlobeView
import dev.jonpoulton.ktak.compose.icons.raptorx.GoToArea
import dev.jonpoulton.ktak.compose.icons.raptorx.GoToLocation
import dev.jonpoulton.ktak.compose.icons.raptorx.Image
import dev.jonpoulton.ktak.compose.icons.raptorx.KeepInView
import dev.jonpoulton.ktak.compose.icons.raptorx.KmlKmzExport
import dev.jonpoulton.ktak.compose.icons.raptorx.KmlKmzImport
import dev.jonpoulton.ktak.compose.icons.raptorx.ManageFavorite
import dev.jonpoulton.ktak.compose.icons.raptorx.MapSetBuilder
import dev.jonpoulton.ktak.compose.icons.raptorx.Media
import dev.jonpoulton.ktak.compose.icons.raptorx.NavigationLock
import dev.jonpoulton.ktak.compose.icons.raptorx.New
import dev.jonpoulton.ktak.compose.icons.raptorx.NewGlobe
import dev.jonpoulton.ktak.compose.icons.raptorx.Note
import dev.jonpoulton.ktak.compose.icons.raptorx.Open
import dev.jonpoulton.ktak.compose.icons.raptorx.Package
import dev.jonpoulton.ktak.compose.icons.raptorx.Path
import dev.jonpoulton.ktak.compose.icons.raptorx.Placemakers
import dev.jonpoulton.ktak.compose.icons.raptorx.Playback
import dev.jonpoulton.ktak.compose.icons.raptorx.PluginManager
import dev.jonpoulton.ktak.compose.icons.raptorx.Polygon
import dev.jonpoulton.ktak.compose.icons.raptorx.PolygonAlt
import dev.jonpoulton.ktak.compose.icons.raptorx.ProjectCleaner
import dev.jonpoulton.ktak.compose.icons.raptorx.ProjectSettings
import dev.jonpoulton.ktak.compose.icons.raptorx.Properties
import dev.jonpoulton.ktak.compose.icons.raptorx.Pyramid
import dev.jonpoulton.ktak.compose.icons.raptorx.R2d2
import dev.jonpoulton.ktak.compose.icons.raptorx.RAndBLine
import dev.jonpoulton.ktak.compose.icons.raptorx.RangeRings
import dev.jonpoulton.ktak.compose.icons.raptorx.RaptorXHelp
import dev.jonpoulton.ktak.compose.icons.raptorx.Rectangle
import dev.jonpoulton.ktak.compose.icons.raptorx.ReportIssue
import dev.jonpoulton.ktak.compose.icons.raptorx.Save
import dev.jonpoulton.ktak.compose.icons.raptorx.SaveAs
import dev.jonpoulton.ktak.compose.icons.raptorx.Screenshot
import dev.jonpoulton.ktak.compose.icons.raptorx.Search
import dev.jonpoulton.ktak.compose.icons.raptorx.Server
import dev.jonpoulton.ktak.compose.icons.raptorx.ServerPassword
import dev.jonpoulton.ktak.compose.icons.raptorx.Shp
import dev.jonpoulton.ktak.compose.icons.raptorx.Square
import dev.jonpoulton.ktak.compose.icons.raptorx.SuppressedDevices
import dev.jonpoulton.ktak.compose.icons.raptorx.SystemMessages
import dev.jonpoulton.ktak.compose.icons.raptorx.TerrainDiscovery
import dev.jonpoulton.ktak.compose.icons.raptorx.TextBox
import dev.jonpoulton.ktak.compose.icons.raptorx.TextLabel
import dev.jonpoulton.ktak.compose.icons.raptorx.Url
import dev.jonpoulton.ktak.compose.icons.raptorx.UserPreferences
import dev.jonpoulton.ktak.compose.icons.raptorx.Video
import dev.jonpoulton.ktak.compose.icons.raptorx.Wedge
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.CitySearch
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Connections
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Devices
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.EventLog
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Explorer
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Files
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Media
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Overlays
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Playback
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Plugins
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.PointDropper
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Properties
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.R2d2
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.Server
import dev.jonpoulton.ktak.compose.icons.raptorx.sidebar.SystemMessages

/**
 * A standardized set of icons to be utilized within the TAKX Application
 */
public object RaptorXTakIcons
public object RaptorXSidebarTakIcons

private val allIcons = listOf(
  TakIcons.RaptorX.About,
  TakIcons.RaptorX.AddFavorite,
  TakIcons.RaptorX.App,
  TakIcons.RaptorX.Audio,
  TakIcons.RaptorX.Box,
  TakIcons.RaptorX.CacheCleaner,
  TakIcons.RaptorX.Camera,
  TakIcons.RaptorX.Circle,
  TakIcons.RaptorX.Cone,
  TakIcons.RaptorX.Connections,
  TakIcons.RaptorX.ConnectToMapSetElevation,
  TakIcons.RaptorX.ConnectToMapSetImagery,
  TakIcons.RaptorX.ConnectToServerElevation,
  TakIcons.RaptorX.ConnectToServerImagery,
  TakIcons.RaptorX.ConvertElevation,
  TakIcons.RaptorX.ConvertImagery,
  TakIcons.RaptorX.Cylinder,
  TakIcons.RaptorX.DefaultHeading,
  TakIcons.RaptorX.DefaultHeadingTilt,
  TakIcons.RaptorX.DefaultTilt,
  TakIcons.RaptorX.Devices,
  TakIcons.RaptorX.Ellipse,
  TakIcons.RaptorX.Ellipsoid,
  TakIcons.RaptorX.EventLog,
  TakIcons.RaptorX.File,
  TakIcons.RaptorX.Files,
  TakIcons.RaptorX.Freeform,
  TakIcons.RaptorX.GeoPing,
  TakIcons.RaptorX.GlobeView,
  TakIcons.RaptorX.GoToArea,
  TakIcons.RaptorX.GoToLocation,
  TakIcons.RaptorX.Image,
  TakIcons.RaptorX.KeepInView,
  TakIcons.RaptorX.KmlKmzExport,
  TakIcons.RaptorX.KmlKmzImport,
  TakIcons.RaptorX.ManageFavorite,
  TakIcons.RaptorX.MapSetBuilder,
  TakIcons.RaptorX.Media,
  TakIcons.RaptorX.NavigationLock,
  TakIcons.RaptorX.New,
  TakIcons.RaptorX.NewGlobe,
  TakIcons.RaptorX.Note,
  TakIcons.RaptorX.Open,
  TakIcons.RaptorX.Package,
  TakIcons.RaptorX.Path,
  TakIcons.RaptorX.Placemakers,
  TakIcons.RaptorX.Playback,
  TakIcons.RaptorX.PluginManager,
  TakIcons.RaptorX.Polygon,
  TakIcons.RaptorX.PolygonAlt,
  TakIcons.RaptorX.ProjectCleaner,
  TakIcons.RaptorX.ProjectSettings,
  TakIcons.RaptorX.Properties,
  TakIcons.RaptorX.Pyramid,
  TakIcons.RaptorX.R2d2,
  TakIcons.RaptorX.RAndBLine,
  TakIcons.RaptorX.RangeRings,
  TakIcons.RaptorX.RaptorXHelp,
  TakIcons.RaptorX.Rectangle,
  TakIcons.RaptorX.ReportIssue,
  TakIcons.RaptorX.Save,
  TakIcons.RaptorX.SaveAs,
  TakIcons.RaptorX.Screenshot,
  TakIcons.RaptorX.Search,
  TakIcons.RaptorX.Server,
  TakIcons.RaptorX.ServerPassword,
  TakIcons.RaptorX.Shp,
  TakIcons.RaptorX.Square,
  TakIcons.RaptorX.SuppressedDevices,
  TakIcons.RaptorX.SystemMessages,
  TakIcons.RaptorX.TerrainDiscovery,
  TakIcons.RaptorX.TextBox,
  TakIcons.RaptorX.TextLabel,
  TakIcons.RaptorX.Url,
  TakIcons.RaptorX.UserPreferences,
  TakIcons.RaptorX.Video,
  TakIcons.RaptorX.Wedge,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)

private val sidebarIcons = listOf(
  TakIcons.RaptorXSidebar.Playback,
  TakIcons.RaptorXSidebar.Media,
  TakIcons.RaptorXSidebar.Server,
  TakIcons.RaptorXSidebar.Explorer,
  TakIcons.RaptorXSidebar.Plugins,
  TakIcons.RaptorXSidebar.Overlays,
  TakIcons.RaptorXSidebar.R2d2,
  TakIcons.RaptorXSidebar.PointDropper,
  TakIcons.RaptorXSidebar.CitySearch,
  TakIcons.RaptorXSidebar.SystemMessages,
  TakIcons.RaptorXSidebar.Files,
  TakIcons.RaptorXSidebar.EventLog,
  TakIcons.RaptorXSidebar.Properties,
  TakIcons.RaptorXSidebar.Connections,
  TakIcons.RaptorXSidebar.Devices,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewSidebarIcons() = PreviewIconGrid(sidebarIcons)

