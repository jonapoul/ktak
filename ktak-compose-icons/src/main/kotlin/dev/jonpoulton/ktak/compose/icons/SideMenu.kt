@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.ktak.compose.icons.sidemenu.Add
import dev.jonpoulton.ktak.compose.icons.sidemenu.AddTrack
import dev.jonpoulton.ktak.compose.icons.sidemenu.Alpha
import dev.jonpoulton.ktak.compose.icons.sidemenu.AlphaReverse
import dev.jonpoulton.ktak.compose.icons.sidemenu.Attach
import dev.jonpoulton.ktak.compose.icons.sidemenu.Back
import dev.jonpoulton.ktak.compose.icons.sidemenu.BookmarkDefault
import dev.jonpoulton.ktak.compose.icons.sidemenu.BookmarkSelected
import dev.jonpoulton.ktak.compose.icons.sidemenu.BulkSelect
import dev.jonpoulton.ktak.compose.icons.sidemenu.Chat
import dev.jonpoulton.ktak.compose.icons.sidemenu.ChatUnread
import dev.jonpoulton.ktak.compose.icons.sidemenu.Close
import dev.jonpoulton.ktak.compose.icons.sidemenu.ColorPicker
import dev.jonpoulton.ktak.compose.icons.sidemenu.Confirm
import dev.jonpoulton.ktak.compose.icons.sidemenu.Copy
import dev.jonpoulton.ktak.compose.icons.sidemenu.Delete
import dev.jonpoulton.ktak.compose.icons.sidemenu.Dictation
import dev.jonpoulton.ktak.compose.icons.sidemenu.DigitalPointer
import dev.jonpoulton.ktak.compose.icons.sidemenu.DigitalPointeractive
import dev.jonpoulton.ktak.compose.icons.sidemenu.Down
import dev.jonpoulton.ktak.compose.icons.sidemenu.Download
import dev.jonpoulton.ktak.compose.icons.sidemenu.DownloadComplete
import dev.jonpoulton.ktak.compose.icons.sidemenu.DownloadError
import dev.jonpoulton.ktak.compose.icons.sidemenu.Edit
import dev.jonpoulton.ktak.compose.icons.sidemenu.Elevation
import dev.jonpoulton.ktak.compose.icons.sidemenu.Export
import dev.jonpoulton.ktak.compose.icons.sidemenu.Favorite
import dev.jonpoulton.ktak.compose.icons.sidemenu.FavoriteSelected
import dev.jonpoulton.ktak.compose.icons.sidemenu.Filter
import dev.jonpoulton.ktak.compose.icons.sidemenu.Folder
import dev.jonpoulton.ktak.compose.icons.sidemenu.Fullscreen
import dev.jonpoulton.ktak.compose.icons.sidemenu.FullscreenAlternate
import dev.jonpoulton.ktak.compose.icons.sidemenu.Gallery
import dev.jonpoulton.ktak.compose.icons.sidemenu.GeoPackage
import dev.jonpoulton.ktak.compose.icons.sidemenu.Ghost
import dev.jonpoulton.ktak.compose.icons.sidemenu.Grid
import dev.jonpoulton.ktak.compose.icons.sidemenu.HandleShade
import dev.jonpoulton.ktak.compose.icons.sidemenu.Hashtag
import dev.jonpoulton.ktak.compose.icons.sidemenu.Hide
import dev.jonpoulton.ktak.compose.icons.sidemenu.HideAlternate
import dev.jonpoulton.ktak.compose.icons.sidemenu.Hint
import dev.jonpoulton.ktak.compose.icons.sidemenu.History
import dev.jonpoulton.ktak.compose.icons.sidemenu.HomeSettings
import dev.jonpoulton.ktak.compose.icons.sidemenu.Hostile
import dev.jonpoulton.ktak.compose.icons.sidemenu.Id
import dev.jonpoulton.ktak.compose.icons.sidemenu.Imagery
import dev.jonpoulton.ktak.compose.icons.sidemenu.Link
import dev.jonpoulton.ktak.compose.icons.sidemenu.ListView
import dev.jonpoulton.ktak.compose.icons.sidemenu.LowBattery
import dev.jonpoulton.ktak.compose.icons.sidemenu.MaxBrightness
import dev.jonpoulton.ktak.compose.icons.sidemenu.Metrics
import dev.jonpoulton.ktak.compose.icons.sidemenu.MinBrightness
import dev.jonpoulton.ktak.compose.icons.sidemenu.Navigate
import dev.jonpoulton.ktak.compose.icons.sidemenu.NavigateAlternate
import dev.jonpoulton.ktak.compose.icons.sidemenu.Network
import dev.jonpoulton.ktak.compose.icons.sidemenu.Numeric
import dev.jonpoulton.ktak.compose.icons.sidemenu.Opacity
import dev.jonpoulton.ktak.compose.icons.sidemenu.Phone
import dev.jonpoulton.ktak.compose.icons.sidemenu.Point
import dev.jonpoulton.ktak.compose.icons.sidemenu.Prefix
import dev.jonpoulton.ktak.compose.icons.sidemenu.Remarks
import dev.jonpoulton.ktak.compose.icons.sidemenu.RemarksAlternate
import dev.jonpoulton.ktak.compose.icons.sidemenu.Remove
import dev.jonpoulton.ktak.compose.icons.sidemenu.RemoveTrack
import dev.jonpoulton.ktak.compose.icons.sidemenu.Reverse
import dev.jonpoulton.ktak.compose.icons.sidemenu.Rotation
import dev.jonpoulton.ktak.compose.icons.sidemenu.Routes
import dev.jonpoulton.ktak.compose.icons.sidemenu.RoverAdmin
import dev.jonpoulton.ktak.compose.icons.sidemenu.RoverNwActive
import dev.jonpoulton.ktak.compose.icons.sidemenu.RoverNwConfigure
import dev.jonpoulton.ktak.compose.icons.sidemenu.RoverNwInactive
import dev.jonpoulton.ktak.compose.icons.sidemenu.RoverNwInternal
import dev.jonpoulton.ktak.compose.icons.sidemenu.Ruler
import dev.jonpoulton.ktak.compose.icons.sidemenu.Scale
import dev.jonpoulton.ktak.compose.icons.sidemenu.SdCard
import dev.jonpoulton.ktak.compose.icons.sidemenu.SearchTrack
import dev.jonpoulton.ktak.compose.icons.sidemenu.SelectionView
import dev.jonpoulton.ktak.compose.icons.sidemenu.Send
import dev.jonpoulton.ktak.compose.icons.sidemenu.SendAlternate
import dev.jonpoulton.ktak.compose.icons.sidemenu.Sensor
import dev.jonpoulton.ktak.compose.icons.sidemenu.Settings
import dev.jonpoulton.ktak.compose.icons.sidemenu.SmallClock
import dev.jonpoulton.ktak.compose.icons.sidemenu.SortByProximity
import dev.jonpoulton.ktak.compose.icons.sidemenu.SortByStatus
import dev.jonpoulton.ktak.compose.icons.sidemenu.SortByTime
import dev.jonpoulton.ktak.compose.icons.sidemenu.SortByUnread
import dev.jonpoulton.ktak.compose.icons.sidemenu.Ss2
import dev.jonpoulton.ktak.compose.icons.sidemenu.Survey
import dev.jonpoulton.ktak.compose.icons.sidemenu.SyncDownload
import dev.jonpoulton.ktak.compose.icons.sidemenu.SyncFailed
import dev.jonpoulton.ktak.compose.icons.sidemenu.SyncSuccess
import dev.jonpoulton.ktak.compose.icons.sidemenu.ToEarth
import dev.jonpoulton.ktak.compose.icons.sidemenu.Up

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
