package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzjz
{
  final String name;
  final String origin;
  final Object value;
  final long zzaqz;
  final String zzti;

  zzjz(String paramString1, String paramString2, String paramString3, long paramLong, Object paramObject)
  {
    AppMethodBeat.i(69497);
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkNotEmpty(paramString3);
    Preconditions.checkNotNull(paramObject);
    this.zzti = paramString1;
    this.origin = paramString2;
    this.name = paramString3;
    this.zzaqz = paramLong;
    this.value = paramObject;
    AppMethodBeat.o(69497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjz
 * JD-Core Version:    0.6.2
 */