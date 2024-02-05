package ktak.plugin

import com.atakmap.android.ipc.AtakBroadcast

public interface HasDocumentedIntentFilter {
  public fun intentFilter(): AtakBroadcast.DocumentedIntentFilter
}
