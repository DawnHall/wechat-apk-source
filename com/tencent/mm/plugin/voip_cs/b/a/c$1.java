package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements c.a
{
  c$1(c paramc)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135361);
    ab.i("MicroMsg.cs.VoipCsAudioManager", "OnPcmRecListener onRecError %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(135361);
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(135360);
    if (paramInt <= 0)
    {
      ab.e("MicroMsg.cs.VoipCsAudioManager", "pcm data len <= 0");
      AppMethodBeat.o(135360);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.cs.VoipCsAudioManager", "onRecPcmDataReady,pcm data len:" + paramArrayOfByte.length);
      ab.d("MicroMsg.cs.VoipCsAudioManager", "recordCallback,ret:".concat(String.valueOf(com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.recordCallback(paramArrayOfByte, paramInt, 200))));
      AppMethodBeat.o(135360);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.c.1
 * JD-Core Version:    0.6.2
 */