package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzl
{
  private final int zzet;
  private final ConnectionResult zzeu;

  zzl(ConnectionResult paramConnectionResult, int paramInt)
  {
    AppMethodBeat.i(60939);
    Preconditions.checkNotNull(paramConnectionResult);
    this.zzeu = paramConnectionResult;
    this.zzet = paramInt;
    AppMethodBeat.o(60939);
  }

  final ConnectionResult getConnectionResult()
  {
    return this.zzeu;
  }

  final int zzu()
  {
    return this.zzet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzl
 * JD-Core Version:    0.6.2
 */