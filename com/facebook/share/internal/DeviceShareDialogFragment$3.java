package com.facebook.share.internal;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

class DeviceShareDialogFragment$3
  implements Runnable
{
  DeviceShareDialogFragment$3(DeviceShareDialogFragment paramDeviceShareDialogFragment)
  {
  }

  public void run()
  {
    AppMethodBeat.i(96955);
    DeviceShareDialogFragment.access$000(this.this$0).dismiss();
    AppMethodBeat.o(96955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.DeviceShareDialogFragment.3
 * JD-Core Version:    0.6.2
 */