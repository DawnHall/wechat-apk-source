package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgr extends zzgm<CapabilityApi.GetCapabilityResult>
{
  public zzgr(BaseImplementation.ResultHolder<CapabilityApi.GetCapabilityResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzdk paramzzdk)
  {
    AppMethodBeat.i(71379);
    Status localStatus = zzgd.zzb(paramzzdk.statusCode);
    if (paramzzdk.zzdq == null);
    for (paramzzdk = null; ; paramzzdk = new zzw(paramzzdk.zzdq))
    {
      zza(new zzy(localStatus, paramzzdk));
      AppMethodBeat.o(71379);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgr
 * JD-Core Version:    0.6.2
 */