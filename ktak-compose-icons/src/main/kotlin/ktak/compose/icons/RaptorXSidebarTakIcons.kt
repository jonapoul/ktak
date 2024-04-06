package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf
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

public object RaptorXSidebarTakIcons

private val sidebarIcons = persistentListOf(
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
