package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

public final class zzau
  implements zzbc
{
  private final zzbd zzhf;

  public zzau(zzbd paramzzbd)
  {
    this.zzhf = paramzzbd;
  }

  public final void begin()
  {
    AppMethodBeat.i(60761);
    Iterator localIterator = this.zzhf.zzil.values().iterator();
    while (localIterator.hasNext())
      ((Api.Client)localIterator.next()).disconnect();
    this.zzhf.zzfq.zzim = Collections.emptySet();
    AppMethodBeat.o(60761);
  }

  public final void connect()
  {
    AppMethodBeat.i(60764);
    this.zzhf.zzbc();
    AppMethodBeat.o(60764);
  }

  public final boolean disconnect()
  {
    return true;
  }

  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    AppMethodBeat.i(60762);
    this.zzhf.zzfq.zzgo.add(paramT);
    AppMethodBeat.o(60762);
    return paramT;
  }

  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    AppMethodBeat.i(60763);
    paramT = new IllegalStateException("GoogleApiClient is not connected yet.");
    AppMethodBeat.o(60763);
    throw paramT;
  }

  public final void onConnected(Bundle paramBundle)
  {
  }

  public final void onConnectionSuspended(int paramInt)
  {
  }

  public final void zza(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzau
 * JD-Core Version:    0.6.2
 */