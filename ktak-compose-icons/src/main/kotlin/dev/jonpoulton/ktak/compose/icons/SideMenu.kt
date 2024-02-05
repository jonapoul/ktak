@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ktak.compose.icons.sidemenu.Add
import ktak.compose.icons.sidemenu.AddTrack
import ktak.compose.icons.sidemenu.Alpha
import ktak.compose.icons.sidemenu.AlphaReverse
import ktak.compose.icons.sidemenu.Attach
import ktak.compose.icons.sidemenu.Back
import ktak.compose.icons.sidemenu.BookmarkDefault
import ktak.compose.icons.sidemenu.BookmarkSelected
import ktak.compose.icons.sidemenu.BulkSelect
import ktak.compose.icons.sidemenu.Chat
import ktak.compose.icons.sidemenu.ChatUnread
import ktak.compose.icons.sidemenu.Close
import ktak.compose.icons.sidemenu.ColorPicker
import ktak.compose.icons.sidemenu.Confirm
import ktak.compose.icons.sidemenu.Copy
import ktak.compose.icons.sidemenu.Delete
import ktak.compose.icons.sidemenu.Dictation
import ktak.compose.icons.sidemenu.DigitalPointer
import ktak.compose.icons.sidemenu.DigitalPointeractive
import ktak.compose.icons.sidemenu.Down
import ktak.compose.icons.sidemenu.Download
import ktak.compose.icons.sidemenu.DownloadComplete
import ktak.compose.icons.sidemenu.DownloadError
import ktak.compose.icons.sidemenu.Edit
import ktak.compose.icons.sidemenu.Elevation
import ktak.compose.icons.sidemenu.Export
import ktak.compose.icons.sidemenu.Favorite
import ktak.compose.icons.sidemenu.FavoriteSelected
import ktak.compose.icons.sidemenu.Filter
import ktak.compose.icons.sidemenu.Folder
import ktak.compose.icons.sidemenu.Fullscreen
import ktak.compose.icons.sidemenu.FullscreenAlternate
import ktak.compose.icons.sidemenu.Gallery
import ktak.compose.icons.sidemenu.GeoPackage
import ktak.compose.icons.sidemenu.Ghost
import ktak.compose.icons.sidemenu.Grid
import ktak.compose.icons.sidemenu.HandleShade
import ktak.compose.icons.sidemenu.Hashtag
import ktak.compose.icons.sidemenu.Hide
import ktak.compose.icons.sidemenu.HideAlternate
import ktak.compose.icons.sidemenu.Hint
import ktak.compose.icons.sidemenu.History
import ktak.compose.icons.sidemenu.HomeSettings
import ktak.compose.icons.sidemenu.Hostile
import ktak.compose.icons.sidemenu.Id
import ktak.compose.icons.sidemenu.Imagery
import ktak.compose.icons.sidemenu.Link
import ktak.compose.icons.sidemenu.ListView
import ktak.compose.icons.sidemenu.LowBattery
import ktak.compose.icons.sidemenu.MaxBrightness
import ktak.compose.icons.sidemenu.Metrics
import ktak.compose.icons.sidemenu.MinBrightness
import ktak.compose.icons.sidemenu.Navigate
import ktak.compose.icons.sidemenu.NavigateAlternate
import ktak.compose.icons.sidemenu.Network
import ktak.compose.icons.sidemenu.Numeric
import ktak.compose.icons.sidemenu.Opacity
import ktak.compose.icons.sidemenu.Phone
import ktak.compose.icons.sidemenu.Point
import ktak.compose.icons.sidemenu.Prefix
import ktak.compose.icons.sidemenu.Remarks
import ktak.compose.icons.sidemenu.RemarksAlternate
import ktak.compose.icons.sidemenu.Remove
import ktak.compose.icons.sidemenu.RemoveTrack
import ktak.compose.icons.sidemenu.Reverse
import ktak.compose.icons.sidemenu.Rotation
import ktak.compose.icons.sidemenu.Routes
import ktak.compose.icons.sidemenu.RoverAdmin
import ktak.compose.icons.sidemenu.RoverNwActive
import ktak.compose.icons.sidemenu.RoverNwConfigure
import ktak.compose.icons.sidemenu.RoverNwInactive
import ktak.compose.icons.sidemenu.RoverNwInternal
import ktak.compose.icons.sidemenu.Ruler
import ktak.compose.icons.sidemenu.Scale
import ktak.compose.icons.sidemenu.SdCard
import ktak.compose.icons.sidemenu.SearchTrack
import ktak.compose.icons.sidemenu.SelectionView
import ktak.compose.icons.sidemenu.Send
import ktak.compose.icons.sidemenu.SendAlternate
import ktak.compose.icons.sidemenu.Sensor
import ktak.compose.icons.sidemenu.Settings
import ktak.compose.icons.sidemenu.SmallClock
import ktak.compose.icons.sidemenu.SortByProximity
import ktak.compose.icons.sidemenu.SortByStatus
import ktak.compose.icons.sidemenu.SortByTime
import ktak.compose.icons.sidemenu.SortByUnread
import ktak.compose.icons.sidemenu.Ss2
import ktak.compose.icons.sidemenu.Survey
import ktak.compose.icons.sidemenu.SyncDownload
import ktak.compose.icons.sidemenu.SyncFailed
import ktak.compose.icons.sidemenu.SyncSuccess
import ktak.compose.icons.sidemenu.ToEarth
import ktak.compose.icons.sidemenu.Up

/**
 * A standardized set of icons to be utilized for the side menu or dropdown menu component.
 */

public object SideMenuTakIcons

private val allIcons
  @Composable get() = listOf(
    TakIcons.SideMenu.Add,
    TakIcons.SideMenu.AddTrack,
    TakIcons.SideMenu.Alpha,
    TakIcons.SideMenu.AlphaReverse,
    TakIcons.SideMenu.Attach,
    TakIcons.SideMenu.Back,
    TakIcons.SideMenu.BookmarkDefault,
    TakIcons.SideMenu.BookmarkSelected,
    TakIcons.SideMenu.BulkSelect,
    TakIcons.SideMenu.Chat,
    TakIcons.SideMenu.ChatUnread,
    TakIcons.SideMenu.Close,
    TakIcons.SideMenu.ColorPicker,
    TakIcons.SideMenu.Confirm,
    TakIcons.SideMenu.Copy,
    TakIcons.SideMenu.Delete,
    TakIcons.SideMenu.Dictation,
    TakIcons.SideMenu.DigitalPointer,
    TakIcons.SideMenu.DigitalPointeractive,
    TakIcons.SideMenu.Down,
    TakIcons.SideMenu.Download,
    TakIcons.SideMenu.DownloadComplete,
    TakIcons.SideMenu.DownloadError,
    TakIcons.SideMenu.Edit,
    TakIcons.SideMenu.Elevation,
    TakIcons.SideMenu.Export,
    TakIcons.SideMenu.Favorite,
    TakIcons.SideMenu.FavoriteSelected,
    TakIcons.SideMenu.Filter,
    TakIcons.SideMenu.Folder,
    TakIcons.SideMenu.Fullscreen,
    TakIcons.SideMenu.FullscreenAlternate,
    TakIcons.SideMenu.Gallery,
    TakIcons.SideMenu.GeoPackage,
    TakIcons.SideMenu.Ghost,
    TakIcons.SideMenu.Grid,
    TakIcons.SideMenu.HandleShade,
    TakIcons.SideMenu.Hashtag,
    TakIcons.SideMenu.Hide,
    TakIcons.SideMenu.HideAlternate,
    TakIcons.SideMenu.Hint,
    TakIcons.SideMenu.History,
    TakIcons.SideMenu.HomeSettings,
    TakIcons.SideMenu.Hostile,
    TakIcons.SideMenu.Id,
    TakIcons.SideMenu.Imagery,
    TakIcons.SideMenu.Link,
    TakIcons.SideMenu.ListView,
    TakIcons.SideMenu.LowBattery,
    TakIcons.SideMenu.MaxBrightness,
    TakIcons.SideMenu.Metrics,
    TakIcons.SideMenu.MinBrightness,
    TakIcons.SideMenu.Navigate,
    TakIcons.SideMenu.NavigateAlternate,
    TakIcons.SideMenu.Network,
    TakIcons.SideMenu.Numeric,
    TakIcons.SideMenu.Opacity,
    TakIcons.SideMenu.Phone,
    TakIcons.SideMenu.Point,
    TakIcons.SideMenu.Prefix,
    TakIcons.SideMenu.Remarks,
    TakIcons.SideMenu.RemarksAlternate,
    TakIcons.SideMenu.Remove,
    TakIcons.SideMenu.RemoveTrack,
    TakIcons.SideMenu.Reverse,
    TakIcons.SideMenu.Rotation,
    TakIcons.SideMenu.Routes,
    TakIcons.SideMenu.RoverAdmin,
    TakIcons.SideMenu.RoverNwActive,
    TakIcons.SideMenu.RoverNwConfigure,
    TakIcons.SideMenu.RoverNwInactive,
    TakIcons.SideMenu.RoverNwInternal,
    TakIcons.SideMenu.Ruler,
    TakIcons.SideMenu.Scale,
    TakIcons.SideMenu.SdCard,
    TakIcons.SideMenu.SearchTrack,
    TakIcons.SideMenu.SelectionView,
    TakIcons.SideMenu.Send,
    TakIcons.SideMenu.SendAlternate,
    TakIcons.SideMenu.Sensor,
    TakIcons.SideMenu.Settings,
    TakIcons.SideMenu.SmallClock,
    TakIcons.SideMenu.SortByProximity,
    TakIcons.SideMenu.SortByStatus,
    TakIcons.SideMenu.SortByTime,
    TakIcons.SideMenu.SortByUnread,
    TakIcons.SideMenu.Ss2,
    TakIcons.SideMenu.Survey,
    TakIcons.SideMenu.SyncDownload,
    TakIcons.SideMenu.SyncFailed,
    TakIcons.SideMenu.SyncSuccess,
    TakIcons.SideMenu.ToEarth,
    TakIcons.SideMenu.Up,
  )

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
