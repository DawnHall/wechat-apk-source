package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzgk
{
  private static Map<String, CapabilityInfo> zza(List<zzah> paramList)
  {
    AppMethodBeat.i(71371);
    HashMap localHashMap = new HashMap();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        zzah localzzah = (zzah)paramList.next();
        localHashMap.put(localzzah.getName(), new zzw(localzzah));
      }
    }
    AppMethodBeat.o(71371);
    return localHashMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgk
 * JD-Core Version:    0.6.2
 */