package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzay
  implements GoogleApiClient.OnConnectionFailedListener
{
  zzay(zzav paramzzav, StatusPendingResult paramStatusPendingResult)
  {
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(60811);
    this.zziv.setResult(new Status(8));
    AppMethodBeat.o(60811);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzay
 * JD-Core Version:    0.6.2
 */