package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgp extends zzgm<DataApi.DeleteDataItemsResult>
{
  public zzgp(BaseImplementation.ResultHolder<DataApi.DeleteDataItemsResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzdg paramzzdg)
  {
    AppMethodBeat.i(71377);
    zza(new zzch(zzgd.zzb(paramzzdg.statusCode), paramzzdg.zzdh));
    AppMethodBeat.o(71377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgp
 * JD-Core Version:    0.6.2
 */