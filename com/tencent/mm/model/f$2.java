package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.secinforeport.a.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class f$2
  implements Runnable
{
  f$2(f paramf, Map paramMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16264);
    int i = bo.getInt((String)this.fkC.get(".sysmsg.ClientCheckGetExtInfo.ReportContext"), 0);
    if (bo.getInt((String)this.fkC.get(".sysmsg.ClientCheckGetExtInfo.Basic"), 0) != 0)
    {
      d.qjp.ff(i, 0);
      AppMethodBeat.o(16264);
    }
    while (true)
    {
      return;
      d.qjp.ff(i, 15);
      AppMethodBeat.o(16264);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.f.2
 * JD-Core Version:    0.6.2
 */