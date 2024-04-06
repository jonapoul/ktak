@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf
import ktak.compose.icons.navigation.BloodhoundNavLit
import ktak.compose.icons.navigation.BloodhoundNavUnlit
import ktak.compose.icons.navigation.BloodhoundRoute
import ktak.compose.icons.navigation.BloodhoundRouteDisabled
import ktak.compose.icons.navigation.CheckpointRerouteActive
import ktak.compose.icons.navigation.CheckpointRerouteInactive
import ktak.compose.icons.navigation.CheckpointRight
import ktak.compose.icons.navigation.CheckpointSlowDown
import ktak.compose.icons.navigation.CheckpointSpeedUp
import ktak.compose.icons.navigation.CheckpointStop
import ktak.compose.icons.navigation.CheckpointStraight
import ktak.compose.icons.navigation.CheckpointVeerLeft
import ktak.compose.icons.navigation.CheckpointVeerRight
import ktak.compose.icons.navigation.RouteNavigationDanger
import ktak.compose.icons.navigation.RouteNavigationHardLeft
import ktak.compose.icons.navigation.RouteNavigationHardRight
import ktak.compose.icons.navigation.RouteNavigationLeft
import ktak.compose.icons.navigation.RouteNavigationNoEntry
import ktak.compose.icons.navigation.RoverReceptionDisabled
import ktak.compose.icons.navigation.RoverReceptionEnabled
import ktak.compose.icons.navigation.RoverReceptionEnabled1
import ktak.compose.icons.navigation.RoverReceptionEnabled2
import ktak.compose.icons.navigation.RoverReceptionEnabled3
import ktak.compose.icons.navigation.RoverReceptionOff

/**
 * A standardized set of icons to be utilized within the in route navigation feature.
 */
public object NavigationTakIcons

private val allIcons = persistentListOf(
  TakIcons.Navigation.BloodhoundNavLit,
  TakIcons.Navigation.BloodhoundNavUnlit,
  TakIcons.Navigation.BloodhoundRoute,
  TakIcons.Navigation.BloodhoundRouteDisabled,
  TakIcons.Navigation.CheckpointRerouteActive,
  TakIcons.Navigation.CheckpointRerouteInactive,
  TakIcons.Navigation.CheckpointRight,
  TakIcons.Navigation.CheckpointSlowDown,
  TakIcons.Navigation.CheckpointSpeedUp,
  TakIcons.Navigation.CheckpointStop,
  TakIcons.Navigation.CheckpointStraight,
  TakIcons.Navigation.CheckpointVeerLeft,
  TakIcons.Navigation.CheckpointVeerRight,
  TakIcons.Navigation.RouteNavigationDanger,
  TakIcons.Navigation.RouteNavigationHardLeft,
  TakIcons.Navigation.RouteNavigationHardRight,
  TakIcons.Navigation.RouteNavigationLeft,
  TakIcons.Navigation.RouteNavigationNoEntry,
  TakIcons.Navigation.RoverReceptionDisabled,
  TakIcons.Navigation.RoverReceptionEnabled,
  TakIcons.Navigation.RoverReceptionEnabled1,
  TakIcons.Navigation.RoverReceptionEnabled2,
  TakIcons.Navigation.RoverReceptionEnabled3,
  TakIcons.Navigation.RoverReceptionOff,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
