@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf
import ktak.compose.icons.mapcontrol.Compass
import ktak.compose.icons.mapcontrol.LockOnSelf
import ktak.compose.icons.mapcontrol.LockOnSelfActive
import ktak.compose.icons.mapcontrol.LockOnSelfActiveAlt
import ktak.compose.icons.mapcontrol.ThreeDimensionalCompass
import ktak.compose.icons.mapcontrol.ThreeDimensionalCompassDirection
import ktak.compose.icons.mapcontrol.ThreeDimensionalCompassTilt
import ktak.compose.icons.mapcontrol.ZoomControl

/**
 * A standardized set of icons that appear on map in the main nav stack.
 */
public object MapControlTakIcons

private val allIcons = persistentListOf(
  TakIcons.MapControl.ThreeDimensionalCompassDirection,
  TakIcons.MapControl.ZoomControl,
  TakIcons.MapControl.LockOnSelfActiveAlt,
  TakIcons.MapControl.ThreeDimensionalCompass,
  TakIcons.MapControl.LockOnSelf,
  TakIcons.MapControl.LockOnSelfActive,
  TakIcons.MapControl.Compass,
  TakIcons.MapControl.ThreeDimensionalCompassTilt,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
