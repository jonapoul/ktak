package ktak.plugin

import com.atakmap.android.ipc.AtakBroadcast.DocumentedIntentFilter

public interface HasDocumentedIntentFilter {
  public fun intentFilter(): DocumentedIntentFilter
}
