package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzae
{
  private final zzh<?> zzhc;
  private final TaskCompletionSource<Boolean> zzhd;

  public zzae(zzh<?> paramzzh)
  {
    AppMethodBeat.i(60693);
    this.zzhd = new TaskCompletionSource();
    this.zzhc = paramzzh;
    AppMethodBeat.o(60693);
  }

  public final TaskCompletionSource<Boolean> zzao()
  {
    return this.zzhd;
  }

  public final zzh<?> zzm()
  {
    return this.zzhc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzae
 * JD-Core Version:    0.6.2
 */