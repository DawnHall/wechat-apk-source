package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;
import java.util.HashMap;

final class DataHolder$zza
  implements Comparator<HashMap<String, Object>>
{
  private final String zznz;

  DataHolder$zza(String paramString)
  {
    AppMethodBeat.i(61086);
    this.zznz = ((String)Preconditions.checkNotNull(paramString));
    AppMethodBeat.o(61086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder.zza
 * JD-Core Version:    0.6.2
 */