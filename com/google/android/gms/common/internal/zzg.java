package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzg
  implements BaseGmsClient.BaseOnConnectionFailedListener
{
  zzg(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(61406);
    this.zzte.onConnectionFailed(paramConnectionResult);
    AppMethodBeat.o(61406);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzg
 * JD-Core Version:    0.6.2
 */