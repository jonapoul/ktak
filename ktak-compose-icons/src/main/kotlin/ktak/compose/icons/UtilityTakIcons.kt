@file:Suppress("MatchingDeclarationName")

package ktak.compose.icons

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf
import ktak.compose.icons.utility.Add
import ktak.compose.icons.utility.Aircraft
import ktak.compose.icons.utility.BulkSelectionEmpty
import ktak.compose.icons.utility.BulkSelectionFilled
import ktak.compose.icons.utility.CheckEmpty
import ktak.compose.icons.utility.CheckSelected
import ktak.compose.icons.utility.Collapse
import ktak.compose.icons.utility.Delete
import ktak.compose.icons.utility.Download
import ktak.compose.icons.utility.Drawing
import ktak.compose.icons.utility.Edit
import ktak.compose.icons.utility.Expand
import ktak.compose.icons.utility.Export
import ktak.compose.icons.utility.Forward
import ktak.compose.icons.utility.Info
import ktak.compose.icons.utility.Maps
import ktak.compose.icons.utility.Nineline
import ktak.compose.icons.utility.Pointer
import ktak.compose.icons.utility.Polygon
import ktak.compose.icons.utility.RadioEmpty
import ktak.compose.icons.utility.RadioFilled
import ktak.compose.icons.utility.Routes
import ktak.compose.icons.utility.Screenshot
import ktak.compose.icons.utility.Search
import ktak.compose.icons.utility.SelectionFull
import ktak.compose.icons.utility.SelectionPartial
import ktak.compose.icons.utility.Send
import ktak.compose.icons.utility.Settings
import ktak.compose.icons.utility.Square
import ktak.compose.icons.utility.Stream
import ktak.compose.icons.utility.Subtract
import ktak.compose.icons.utility.Swimming
import ktak.compose.icons.utility.Switch
import ktak.compose.icons.utility.Target
import ktak.compose.icons.utility.Trash
import ktak.compose.icons.utility.User
import ktak.compose.icons.utility.Vehicle
import ktak.compose.icons.utility.Video
import ktak.compose.icons.utility.VisibilityInvisible
import ktak.compose.icons.utility.VisibilityPartial
import ktak.compose.icons.utility.VisibilityVisible
import ktak.compose.icons.utility.Walking
import ktak.compose.icons.utility.Watercraft

/**
 * A standardized set of icons to be utilized within the components designated for items within the side menu.
 */
public object UtilityTakIcons

private val allIcons
  @Composable
  get() = persistentListOf(
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
