package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzah extends BroadcastReceiver
{
  zzah(zzaf paramzzaf)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(57548);
    Log.isLoggable("InstanceID", 3);
    this.zzcx.zzh(paramIntent);
    AppMethodBeat.o(57548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzah
 * JD-Core Version:    0.6.2
 */