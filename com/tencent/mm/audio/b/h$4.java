package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;

final class h$4
  implements Runnable
{
  h$4(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116498);
    ab.e("MicroMsg.SceneVoice.Recorder", "start record timeout");
    com.tencent.mm.plugin.report.service.h.pYm.a(357L, 51L, 1L, true);
    if (!h.access$1000())
    {
      if (d.vxr)
        com.tencent.mm.plugin.report.service.h.pYm.g("Record", "start record timeout", null);
      com.tencent.mm.plugin.report.service.h.pYm.a(357L, 52L, 1L, true);
    }
    h.Fa();
    AppMethodBeat.o(116498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.h.4
 * JD-Core Version:    0.6.2
 */