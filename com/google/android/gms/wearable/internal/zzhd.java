package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzhd extends zzgm<CapabilityApi.RemoveLocalCapabilityResult>
{
  public zzhd(BaseImplementation.ResultHolder<CapabilityApi.RemoveLocalCapabilityResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzfy paramzzfy)
  {
    AppMethodBeat.i(71392);
    zza(new zzu(zzgd.zzb(paramzzfy.statusCode)));
    AppMethodBeat.o(71392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzhd
 * JD-Core Version:    0.6.2
 */