package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class bv$7 extends bv.a
{
  bv$7(bv parambv)
  {
    super(parambv, (byte)0);
  }

  public final boolean a(bt parambt)
  {
    boolean bool = false;
    AppMethodBeat.i(72623);
    if ((System.currentTimeMillis() - parambt.eRt > 1800000L) && (bo.getInt(parambt.fns, 0) > 0))
    {
      bv.s(parambt.key, parambt.fns);
      parambt.fns = "0";
      parambt.eRt = System.currentTimeMillis();
      bool = true;
      AppMethodBeat.o(72623);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(72623);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bv.7
 * JD-Core Version:    0.6.2
 */