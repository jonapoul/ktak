@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf
import ktak.compose.icons.dropdown.AddHostile
import ktak.compose.icons.dropdown.Circle
import ktak.compose.icons.dropdown.Freeform
import ktak.compose.icons.dropdown.HostileGoTo
import ktak.compose.icons.dropdown.HostileManager
import ktak.compose.icons.dropdown.HostileSpi
import ktak.compose.icons.dropdown.Lasso
import ktak.compose.icons.dropdown.Polygon
import ktak.compose.icons.dropdown.RAndBBullseye
import ktak.compose.icons.dropdown.RAndBCircle
import ktak.compose.icons.dropdown.RAndBDynamicLine
import ktak.compose.icons.dropdown.RAndBLine
import ktak.compose.icons.dropdown.RotationLock
import ktak.compose.icons.dropdown.RotationLockAlt
import ktak.compose.icons.dropdown.Square
import ktak.compose.icons.dropdown.ThreeDimensional
import ktak.compose.icons.dropdown.ThreeDimensionalLock
import ktak.compose.icons.dropdown.ThreeDimensionalLockAlt

/**
 * A standardized set of icons to be utilized within the dropdown child menu for the toolbar component.
 */
public object DropdownTakIcons

private val allIcons = persistentListOf(
  TakIcons.Dropdown.AddHostile,
  TakIcons.Dropdown.Circle,
  TakIcons.Dropdown.Freeform,
  TakIcons.Dropdown.HostileGoTo,
  TakIcons.Dropdown.HostileManager,
  TakIcons.Dropdown.HostileSpi,
  TakIcons.Dropdown.Lasso,
  TakIcons.Dropdown.Polygon,
  TakIcons.Dropdown.RAndBBullseye,
  TakIcons.Dropdown.RAndBCircle,
  TakIcons.Dropdown.RAndBDynamicLine,
  TakIcons.Dropdown.RAndBLine,
  TakIcons.Dropdown.RotationLock,
  TakIcons.Dropdown.RotationLockAlt,
  TakIcons.Dropdown.Square,
  TakIcons.Dropdown.ThreeDimensional,
  TakIcons.Dropdown.ThreeDimensionalLock,
  TakIcons.Dropdown.ThreeDimensionalLockAlt,
)

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewIcons() = PreviewIconGrid(allIcons)
