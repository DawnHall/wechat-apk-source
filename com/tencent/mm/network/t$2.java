package com.tencent.mm.network;

import com.tencent.mars.magicbox.IPxxLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;

final class t$2 extends bj<Object>
{
  t$2(t paramt, String paramString)
  {
    super(1000L, null, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58552);
    ab.dot();
    IPxxLogic.onIPxx(this.gde, 0);
    AppMethodBeat.o(58552);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.2
 * JD-Core Version:    0.6.2
 */