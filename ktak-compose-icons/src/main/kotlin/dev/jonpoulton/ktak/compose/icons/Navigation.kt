@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.ktak.compose.icons.navigation.BloodhoundNavLit
import dev.jonpoulton.ktak.compose.icons.navigation.BloodhoundNavUnlit
import dev.jonpoulton.ktak.compose.icons.navigation.BloodhoundRoute
import dev.jonpoulton.ktak.compose.icons.navigation.BloodhoundRouteDisabled
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointRerouteActive
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointRerouteInactive
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointRight
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointSlowDown
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointSpeedUp
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointStop
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointStraight
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointVeerLeft
import dev.jonpoulton.ktak.compose.icons.navigation.CheckpointVeerRight
import dev.jonpoulton.ktak.compose.icons.navigation.RouteNavigationDanger
import dev.jonpoulton.ktak.compose.icons.navigation.RouteNavigationHardLeft
import dev.jonpoulton.ktak.compose.icons.navigation.RouteNavigationHardRight
import dev.jonpoulton.ktak.compose.icons.navigation.RouteNavigationLeft
import dev.jonpoulton.ktak.compose.icons.navigation.RouteNavigationNoEntry
import dev.jonpoulton.ktak.compose.icons.navigation.RoverReceptionDisabled
import dev.jonpoulton.ktak.compose.icons.navigation.RoverReceptionEnabled
import dev.jonpoulton.ktak.compose.icons.navigation.RoverReceptionEnabled1
import dev.jonpoulton.ktak.compose.icons.navigation.RoverReceptionEnabled2
import dev.jonpoulton.ktak.compose.icons.navigation.RoverReceptionEnabled3
import dev.jonpoulton.ktak.compose.icons.navigation.RoverReceptionOff

/**
 * A standardized set of icons to be utilized within the in route navigation feature.
 */
public object NavigationTakIcons

private val allIcons = listOf(
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
