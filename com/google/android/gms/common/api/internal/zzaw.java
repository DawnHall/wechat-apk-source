package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzaw
  implements GmsClientEventManager.GmsClientEventState
{
  zzaw(zzav paramzzav)
  {
  }

  public final Bundle getConnectionHint()
  {
    return null;
  }

  public final boolean isConnected()
  {
    AppMethodBeat.i(60809);
    boolean bool = this.zzit.isConnected();
    AppMethodBeat.o(60809);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzaw
 * JD-Core Version:    0.6.2
 */