package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;

final class k$1
  implements n.b
{
  k$1(k paramk)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(11401);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.i("MicroMsg.ReportLocation", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(11401);
    }
    while (true)
    {
      return;
      if ((this.fwA.userName.equals((String)paramObject)) && (this.fwA.fwt == 1))
      {
        ab.i("MicroMsg.ReportLocation", "contactStgUpdate, %s", new Object[] { this.fwA.userName });
        this.fwA.rj(this.fwA.userName);
        ((j)g.K(j.class)).XM().b(this.fwA.fwy);
      }
      AppMethodBeat.o(11401);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.k.1
 * JD-Core Version:    0.6.2
 */