@file:Suppress("UnusedReceiverParameter")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ktak.compose.icons.raptorx.About
import ktak.compose.icons.raptorx.AddFavorite
import ktak.compose.icons.raptorx.App
import ktak.compose.icons.raptorx.Audio
import ktak.compose.icons.raptorx.Box
import ktak.compose.icons.raptorx.CacheCleaner
import ktak.compose.icons.raptorx.Camera
import ktak.compose.icons.raptorx.Circle
import ktak.compose.icons.raptorx.Cone
import ktak.compose.icons.raptorx.ConnectToMapSetElevation
import ktak.compose.icons.raptorx.ConnectToMapSetImagery
import ktak.compose.icons.raptorx.ConnectToServerElevation
import ktak.compose.icons.raptorx.ConnectToServerImagery
import ktak.compose.icons.raptorx.Connections
import ktak.compose.icons.raptorx.ConvertElevation
import ktak.compose.icons.raptorx.ConvertImagery
import ktak.compose.icons.raptorx.Cylinder
import ktak.compose.icons.raptorx.DefaultHeading
import ktak.compose.icons.raptorx.DefaultHeadingTilt
import ktak.compose.icons.raptorx.DefaultTilt
import ktak.compose.icons.raptorx.Devices
import ktak.compose.icons.raptorx.Ellipse
import ktak.compose.icons.raptorx.Ellipsoid
import ktak.compose.icons.raptorx.EventLog
import ktak.compose.icons.raptorx.File
import ktak.compose.icons.raptorx.Files
import ktak.compose.icons.raptorx.Freeform
import ktak.compose.icons.raptorx.GeoPing
import ktak.compose.icons.raptorx.GlobeView
import ktak.compose.icons.raptorx.GoToArea
import ktak.compose.icons.raptorx.GoToLocation
import ktak.compose.icons.raptorx.Image
import ktak.compose.icons.raptorx.KeepInView
import ktak.compose.icons.raptorx.KmlKmzExport
import ktak.compose.icons.raptorx.KmlKmzImport
import ktak.compose.icons.raptorx.ManageFavorite
import ktak.compose.icons.raptorx.MapSetBuilder
import ktak.compose.icons.raptorx.Media
import ktak.compose.icons.raptorx.NavigationLock
import ktak.compose.icons.raptorx.New
import ktak.compose.icons.raptorx.NewGlobe
import ktak.compose.icons.raptorx.Note
import ktak.compose.icons.raptorx.Open
import ktak.compose.icons.raptorx.Package
import ktak.compose.icons.raptorx.Path
import ktak.compose.icons.raptorx.Placemakers
import ktak.compose.icons.raptorx.Playback
import ktak.compose.icons.raptorx.PluginManager
import ktak.compose.icons.raptorx.Polygon
import ktak.compose.icons.raptorx.PolygonAlt
import ktak.compose.icons.raptorx.ProjectCleaner
import ktak.compose.icons.raptorx.ProjectSettings
import ktak.compose.icons.raptorx.Properties
import ktak.compose.icons.raptorx.Pyramid
import ktak.compose.icons.raptorx.R2d2
import ktak.compose.icons.raptorx.RAndBLine
import ktak.compose.icons.raptorx.RangeRings
import ktak.compose.icons.raptorx.RaptorXHelp
import ktak.compose.icons.raptorx.Rectangle
import ktak.compose.icons.raptorx.ReportIssue
import ktak.compose.icons.raptorx.Save
import ktak.compose.icons.raptorx.SaveAs
import ktak.compose.icons.raptorx.Screenshot
import ktak.compose.icons.raptorx.Search
import ktak.compose.icons.raptorx.Server
import ktak.compose.icons.raptorx.ServerPassword
import ktak.compose.icons.raptorx.Shp
import ktak.compose.icons.raptorx.Square
import ktak.compose.icons.raptorx.SuppressedDevices
import ktak.compose.icons.raptorx.SystemMessages
import ktak.compose.icons.raptorx.TerrainDiscovery
import ktak.compose.icons.raptorx.TextBox
import ktak.compose.icons.raptorx.TextLabel
import ktak.compose.icons.raptorx.Url
import ktak.compose.icons.raptorx.UserPreferences
import ktak.compose.icons.raptorx.Video
import ktak.compose.icons.raptorx.Wedge
import ktak.compose.icons.raptorx.sidebar.CitySearch
import ktak.compose.icons.raptorx.sidebar.Connections
import ktak.compose.icons.raptorx.sidebar.Devices
import ktak.compose.icons.raptorx.sidebar.EventLog
import ktak.compose.icons.raptorx.sidebar.Explorer
import ktak.compose.icons.raptorx.sidebar.Files
import ktak.compose.icons.raptorx.sidebar.Media
import ktak.compose.icons.raptorx.sidebar.Overlays
import ktak.compose.icons.raptorx.sidebar.Playback
import ktak.compose.icons.raptorx.sidebar.Plugins
import ktak.compose.icons.raptorx.sidebar.PointDropper
import ktak.compose.icons.raptorx.sidebar.Properties
import ktak.compose.icons.raptorx.sidebar.R2d2
import ktak.compose.icons.raptorx.sidebar.Server
import ktak.compose.icons.raptorx.sidebar.SystemMessages

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

