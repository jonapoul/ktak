@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf
import ktak.compose.icons.toolbar.Android
import ktak.compose.icons.toolbar.Blank
import ktak.compose.icons.toolbar.Bloodhound
import ktak.compose.icons.toolbar.Brightness
import ktak.compose.icons.toolbar.Camera
import ktak.compose.icons.toolbar.Casevac
import ktak.compose.icons.toolbar.Center
import ktak.compose.icons.toolbar.Close
import ktak.compose.icons.toolbar.Collapse
import ktak.compose.icons.toolbar.Contacts
import ktak.compose.icons.toolbar.DataPackage
import ktak.compose.icons.toolbar.Delete
import ktak.compose.icons.toolbar.Draw
import ktak.compose.icons.toolbar.Elevation
import ktak.compose.icons.toolbar.Export
import ktak.compose.icons.toolbar.File
import ktak.compose.icons.toolbar.FireTools
import ktak.compose.icons.toolbar.Gallery
import ktak.compose.icons.toolbar.GoTo
import ktak.compose.icons.toolbar.Grid
import ktak.compose.icons.toolbar.GroupChat
import ktak.compose.icons.toolbar.Hamburger
import ktak.compose.icons.toolbar.Import
import ktak.compose.icons.toolbar.Info
import ktak.compose.icons.toolbar.Lasso
import ktak.compose.icons.toolbar.Maps
import ktak.compose.icons.toolbar.Marker
import ktak.compose.icons.toolbar.More
import ktak.compose.icons.toolbar.Nightvision
import ktak.compose.icons.toolbar.Notifications
import ktak.compose.icons.toolbar.Orientation
import ktak.compose.icons.toolbar.OverlayManager
import ktak.compose.icons.toolbar.Plugins
import ktak.compose.icons.toolbar.PointAtIntersect
import ktak.compose.icons.toolbar.PointAtSelf
import ktak.compose.icons.toolbar.PointDropper
import ktak.compose.icons.toolbar.Power
import ktak.compose.icons.toolbar.QuickNav
import ktak.compose.icons.toolbar.QuickPic
import ktak.compose.icons.toolbar.Radio
import ktak.compose.icons.toolbar.RangeAndBearing
import ktak.compose.icons.toolbar.RedX
import ktak.compose.icons.toolbar.Resection
import ktak.compose.icons.toolbar.Restart
import ktak.compose.icons.toolbar.Routes
import ktak.compose.icons.toolbar.RubberSheet
import ktak.compose.icons.toolbar.Server
import ktak.compose.icons.toolbar.Settings
import ktak.compose.icons.toolbar.Toolbars
import ktak.compose.icons.toolbar.TrackHistory
import ktak.compose.icons.toolbar.UpdateLocation
import ktak.compose.icons.toolbar.Video
import ktak.compose.icons.toolbar.Viewshed

/**
 * A standardized set of icons to be utilized within the main toolbar component.
 */
public object ToolbarTakIcons

private val allIcons = persistentListOf(
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
