@file:Suppress("MatchingDeclarationName")

package dev.jonpoulton.ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.jonpoulton.ktak.compose.icons.utility.Add
import dev.jonpoulton.ktak.compose.icons.utility.Aircraft
import dev.jonpoulton.ktak.compose.icons.utility.BulkSelectionEmpty
import dev.jonpoulton.ktak.compose.icons.utility.BulkSelectionFilled
import dev.jonpoulton.ktak.compose.icons.utility.CheckEmpty
import dev.jonpoulton.ktak.compose.icons.utility.CheckSelected
import dev.jonpoulton.ktak.compose.icons.utility.Collapse
import dev.jonpoulton.ktak.compose.icons.utility.Delete
import dev.jonpoulton.ktak.compose.icons.utility.Download
import dev.jonpoulton.ktak.compose.icons.utility.Drawing
import dev.jonpoulton.ktak.compose.icons.utility.Edit
import dev.jonpoulton.ktak.compose.icons.utility.Expand
import dev.jonpoulton.ktak.compose.icons.utility.Export
import dev.jonpoulton.ktak.compose.icons.utility.Forward
import dev.jonpoulton.ktak.compose.icons.utility.Info
import dev.jonpoulton.ktak.compose.icons.utility.Maps
import dev.jonpoulton.ktak.compose.icons.utility.Nineline
import dev.jonpoulton.ktak.compose.icons.utility.Pointer
import dev.jonpoulton.ktak.compose.icons.utility.Polygon
import dev.jonpoulton.ktak.compose.icons.utility.RadioEmpty
import dev.jonpoulton.ktak.compose.icons.utility.RadioFilled
import dev.jonpoulton.ktak.compose.icons.utility.Routes
import dev.jonpoulton.ktak.compose.icons.utility.Screenshot
import dev.jonpoulton.ktak.compose.icons.utility.Search
import dev.jonpoulton.ktak.compose.icons.utility.SelectionFull
import dev.jonpoulton.ktak.compose.icons.utility.SelectionPartial
import dev.jonpoulton.ktak.compose.icons.utility.Send
import dev.jonpoulton.ktak.compose.icons.utility.Settings
import dev.jonpoulton.ktak.compose.icons.utility.Square
import dev.jonpoulton.ktak.compose.icons.utility.Stream
import dev.jonpoulton.ktak.compose.icons.utility.Subtract
import dev.jonpoulton.ktak.compose.icons.utility.Swimming
import dev.jonpoulton.ktak.compose.icons.utility.Switch
import dev.jonpoulton.ktak.compose.icons.utility.Target
import dev.jonpoulton.ktak.compose.icons.utility.Trash
import dev.jonpoulton.ktak.compose.icons.utility.User
import dev.jonpoulton.ktak.compose.icons.utility.Vehicle
import dev.jonpoulton.ktak.compose.icons.utility.Video
import dev.jonpoulton.ktak.compose.icons.utility.VisibilityInvisible
import dev.jonpoulton.ktak.compose.icons.utility.VisibilityPartial
import dev.jonpoulton.ktak.compose.icons.utility.VisibilityVisible
import dev.jonpoulton.ktak.compose.icons.utility.Walking
import dev.jonpoulton.ktak.compose.icons.utility.Watercraft

/**
 * A standardized set of icons to be utilized within the components designated for items within the side menu.
 */
public object UtilityTakIcons

private val allIcons
  @Composable
  get() = listOf(
    TakIcons.Utility.Add,
    TakIcons.Utility.Aircraft,
    TakIcons.Utility.BulkSelectionEmpty,
    TakIcons.Utility.BulkSelectionFilled,
    TakIcons.Utility.CheckEmpty,
    TakIcons.Utility.CheckSelected,
    TakIcons.Utility.Collapse,
    TakIcons.Utility.Delete,
    TakIcons.Utility.Download,
    TakIcons.Utility.Drawing,
    TakIcons.Utility.Edit,
    TakIcons.Utility.Expand,
    TakIcons.Utility.Export,
    TakIcons.Utility.Forward,
    TakIcons.Utility.Info,
    TakIcons.Utility.Maps,
    TakIcons.Utility.Nineline,
    TakIcons.Utility.Pointer,
    TakIcons.Utility.Polygon,
    TakIcons.Utility.RadioEmpty,
    TakIcons.Utility.RadioFilled,
    TakIcons.Utility.Routes,
    TakIcons.Utility.Screenshot,
    TakIcons.Utility.Search,
    TakIcons.Utility.SelectionFull,
    TakIcons.Utility.SelectionPartial,
    TakIcons.Utility.Send,
    TakIcons.Utility.Settings,
    TakIcons.Utility.Square,
    TakIcons.Utility.Stream,
    TakIcons.Utility.Subtract,
    TakIcons.Utility.Swimming,
    TakIcons.Utility.Switch,
    TakIcons.Utility.Target,
    TakIcons.Utility.Trash,
    TakIcons.Utility.User,
    TakIcons.Utility.Vehicle,
    TakIcons.Utility.Video,
    TakIcons.Utility.VisibilityInvisible,
    TakIcons.Utility.VisibilityPartial,
    TakIcons.Utility.VisibilityVisible,
    TakIcons.Utility.Walking,
    TakIcons.Utility.Watercraft,
  )

@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewUtility() = PreviewIconGrid { allIcons }
