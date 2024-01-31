@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.ktak.compose.icons.toolbar.Android
import dev.jonpoulton.ktak.compose.icons.toolbar.Blank
import dev.jonpoulton.ktak.compose.icons.toolbar.Bloodhound
import dev.jonpoulton.ktak.compose.icons.toolbar.Brightness
import dev.jonpoulton.ktak.compose.icons.toolbar.Camera
import dev.jonpoulton.ktak.compose.icons.toolbar.Casevac
import dev.jonpoulton.ktak.compose.icons.toolbar.Center
import dev.jonpoulton.ktak.compose.icons.toolbar.Close
import dev.jonpoulton.ktak.compose.icons.toolbar.Collapse
import dev.jonpoulton.ktak.compose.icons.toolbar.Contacts
import dev.jonpoulton.ktak.compose.icons.toolbar.DataPackage
import dev.jonpoulton.ktak.compose.icons.toolbar.Delete
import dev.jonpoulton.ktak.compose.icons.toolbar.Draw
import dev.jonpoulton.ktak.compose.icons.toolbar.Elevation
import dev.jonpoulton.ktak.compose.icons.toolbar.Export
import dev.jonpoulton.ktak.compose.icons.toolbar.File
import dev.jonpoulton.ktak.compose.icons.toolbar.FireTools
import dev.jonpoulton.ktak.compose.icons.toolbar.Gallery
import dev.jonpoulton.ktak.compose.icons.toolbar.GoTo
import dev.jonpoulton.ktak.compose.icons.toolbar.Grid
import dev.jonpoulton.ktak.compose.icons.toolbar.GroupChat
import dev.jonpoulton.ktak.compose.icons.toolbar.Hamburger
import dev.jonpoulton.ktak.compose.icons.toolbar.Import
import dev.jonpoulton.ktak.compose.icons.toolbar.Info
import dev.jonpoulton.ktak.compose.icons.toolbar.Lasso
import dev.jonpoulton.ktak.compose.icons.toolbar.Maps
import dev.jonpoulton.ktak.compose.icons.toolbar.Marker
import dev.jonpoulton.ktak.compose.icons.toolbar.More
import dev.jonpoulton.ktak.compose.icons.toolbar.Nightvision
import dev.jonpoulton.ktak.compose.icons.toolbar.Notifications
import dev.jonpoulton.ktak.compose.icons.toolbar.Orientation
import dev.jonpoulton.ktak.compose.icons.toolbar.OverlayManager
import dev.jonpoulton.ktak.compose.icons.toolbar.Plugins
import dev.jonpoulton.ktak.compose.icons.toolbar.PointAtIntersect
import dev.jonpoulton.ktak.compose.icons.toolbar.PointAtSelf
import dev.jonpoulton.ktak.compose.icons.toolbar.PointDropper
import dev.jonpoulton.ktak.compose.icons.toolbar.Power
import dev.jonpoulton.ktak.compose.icons.toolbar.QuickNav
import dev.jonpoulton.ktak.compose.icons.toolbar.QuickPic
import dev.jonpoulton.ktak.compose.icons.toolbar.Radio
import dev.jonpoulton.ktak.compose.icons.toolbar.RangeAndBearing
import dev.jonpoulton.ktak.compose.icons.toolbar.RedX
import dev.jonpoulton.ktak.compose.icons.toolbar.Resection
import dev.jonpoulton.ktak.compose.icons.toolbar.Restart
import dev.jonpoulton.ktak.compose.icons.toolbar.Routes
import dev.jonpoulton.ktak.compose.icons.toolbar.RubberSheet
import dev.jonpoulton.ktak.compose.icons.toolbar.Server
import dev.jonpoulton.ktak.compose.icons.toolbar.Settings
import dev.jonpoulton.ktak.compose.icons.toolbar.Toolbars
import dev.jonpoulton.ktak.compose.icons.toolbar.TrackHistory
import dev.jonpoulton.ktak.compose.icons.toolbar.UpdateLocation
import dev.jonpoulton.ktak.compose.icons.toolbar.Video
import dev.jonpoulton.ktak.compose.icons.toolbar.Viewshed

/**
 * A standardized set of icons to be utilized within the main toolbar component.
 */
public object ToolbarTakIcons

private val allIcons = listOf(
  TakIcons.Toolbar.Android,
  TakIcons.Toolbar.Blank,
  TakIcons.Toolbar.Bloodhound,
  TakIcons.Toolbar.Brightness,
  TakIcons.Toolbar.Camera,
  TakIcons.Toolbar.Casevac,
  TakIcons.Toolbar.Center,
  TakIcons.Toolbar.Close,
  TakIcons.Toolbar.Collapse,
  TakIcons.Toolbar.Contacts,
  TakIcons.Toolbar.DataPackage,
  TakIcons.Toolbar.Delete,
  TakIcons.Toolbar.Draw,
  TakIcons.Toolbar.Elevation,
  TakIcons.Toolbar.Export,
  TakIcons.Toolbar.File,
  TakIcons.Toolbar.FireTools,
  TakIcons.Toolbar.Gallery,
  TakIcons.Toolbar.GoTo,
  TakIcons.Toolbar.Grid,
  TakIcons.Toolbar.GroupChat,
  TakIcons.Toolbar.Hamburger,
  TakIcons.Toolbar.Import,
  TakIcons.Toolbar.Info,
  TakIcons.Toolbar.Lasso,
  TakIcons.Toolbar.Maps,
  TakIcons.Toolbar.Marker,
  TakIcons.Toolbar.More,
  TakIcons.Toolbar.Nightvision,
  TakIcons.Toolbar.Notifications,
  TakIcons.Toolbar.Orientation,
  TakIcons.Toolbar.OverlayManager,
  TakIcons.Toolbar.Plugins,
  TakIcons.Toolbar.PointAtIntersect,
  TakIcons.Toolbar.PointAtSelf,
  TakIcons.Toolbar.PointDropper,
  TakIcons.Toolbar.Power,
  TakIcons.Toolbar.QuickNav,
  TakIcons.Toolbar.QuickPic,
  TakIcons.Toolbar.Radio,
  TakIcons.Toolbar.RangeAndBearing,
  TakIcons.Toolbar.RedX,
  TakIcons.Toolbar.Resection,
  TakIcons.Toolbar.Restart,
  TakIcons.Toolbar.Routes,
  TakIcons.Toolbar.RubberSheet,
  TakIcons.Toolbar.Server,
  TakIcons.Toolbar.Settings,
  TakIcons.Toolbar.Toolbars,
  TakIcons.Toolbar.TrackHistory,
  TakIcons.Toolbar.UpdateLocation,
  TakIcons.Toolbar.Video,
  TakIcons.Toolbar.Viewshed,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
