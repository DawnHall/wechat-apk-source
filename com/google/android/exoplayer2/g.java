package com.google.android.exoplayer2;

import android.content.Context;
import com.google.android.exoplayer2.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  public static v a(Context paramContext, h paramh)
  {
    AppMethodBeat.i(94775);
    paramContext = a(new d(paramContext), paramh, new c());
    AppMethodBeat.o(94775);
    return paramContext;
  }

  @Deprecated
  public static v a(Context paramContext, h paramh, m paramm)
  {
    AppMethodBeat.i(94774);
    paramContext = a(new d(paramContext), paramh, paramm);
    AppMethodBeat.o(94774);
    return paramContext;
  }

  private static v a(u paramu, h paramh, m paramm)
  {
    AppMethodBeat.i(94776);
    paramu = new v(paramu, paramh, paramm);
    AppMethodBeat.o(94776);
    return paramu;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g
 * JD-Core Version:    0.6.2
 */