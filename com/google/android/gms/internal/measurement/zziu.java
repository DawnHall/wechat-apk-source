package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zziu
  implements Runnable
{
  zziu(zzii paramzzii, boolean paramBoolean, zzjx paramzzjx, zzdz paramzzdz)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(69333);
    zzey localzzey = zzii.zzd(this.zzape);
    if (localzzey == null)
    {
      this.zzape.zzge().zzim().log("Discarding data. Failed to set user attribute");
      AppMethodBeat.o(69333);
      return;
    }
    zzii localzzii = this.zzape;
    if (this.zzaph);
    for (Object localObject = null; ; localObject = this.zzanl)
    {
      localzzii.zza(localzzey, (AbstractSafeParcelable)localObject, this.zzane);
      zzii.zze(this.zzape);
      AppMethodBeat.o(69333);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zziu
 * JD-Core Version:    0.6.2
 */