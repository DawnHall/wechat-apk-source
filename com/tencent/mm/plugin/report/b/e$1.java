package com.tencent.mm.plugin.report.b;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements Runnable
{
  e$1(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(72673);
    SmcLogic.OnReportResp(3, -1, null, this.pXs.cIb);
    AppMethodBeat.o(72673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.e.1
 * JD-Core Version:    0.6.2
 */