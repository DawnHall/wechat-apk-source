package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class d$2$1
  implements ap.a
{
  d$2$1(d.2 param2)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(4971);
    ab.i("MicroMsg.VoipVoiceMiniManager", "click small view and time is up we remove it..");
    this.sZd.sZc.dismiss();
    if (d.a(this.sZd.sZc) != null)
      d.a(this.sZd.sZc).stopTimer();
    AppMethodBeat.o(4971);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.d.2.1
 * JD-Core Version:    0.6.2
 */