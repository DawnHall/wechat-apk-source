package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzhf extends zzgm<Status>
{
  public zzhf(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzbn paramzzbn)
  {
    AppMethodBeat.i(71394);
    zza(new Status(paramzzbn.statusCode));
    AppMethodBeat.o(71394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhf
 * JD-Core Version:    0.6.2
 */