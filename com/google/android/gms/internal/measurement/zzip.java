package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzip
  implements Runnable
{
  zzip(zzii paramzzii, zzdz paramzzdz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69328);
    zzey localzzey = zzii.zzd(this.zzape);
    if (localzzey == null)
    {
      this.zzape.zzge().zzim().log("Failed to send measurementEnabled to service");
      AppMethodBeat.o(69328);
    }
    while (true)
    {
      return;
      try
      {
        localzzey.zzb(this.zzane);
        zzii.zze(this.zzape);
        AppMethodBeat.o(69328);
      }
      catch (RemoteException localRemoteException)
      {
        this.zzape.zzge().zzim().zzg("Failed to send measurementEnabled to the service", localRemoteException);
        AppMethodBeat.o(69328);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzip
 * JD-Core Version:    0.6.2
 */