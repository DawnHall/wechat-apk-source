package com.tencent.mm.plugin.u.a;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$6 extends SparseIntArray
{
  c$6()
  {
    AppMethodBeat.i(80763);
    put(2, 1048);
    put(1, 1049);
    AppMethodBeat.o(80763);
  }

  public final int get(int paramInt)
  {
    AppMethodBeat.i(80764);
    paramInt = super.get(paramInt, 1047);
    AppMethodBeat.o(80764);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.c.6
 * JD-Core Version:    0.6.2
 */