package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class CancellationTokenSource
{
  private final zza zzafj;

  public CancellationTokenSource()
  {
    AppMethodBeat.i(57339);
    this.zzafj = new zza();
    AppMethodBeat.o(57339);
  }

  public void cancel()
  {
    AppMethodBeat.i(57340);
    this.zzafj.cancel();
    AppMethodBeat.o(57340);
  }

  public CancellationToken getToken()
  {
    return this.zzafj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.CancellationTokenSource
 * JD-Core Version:    0.6.2
 */