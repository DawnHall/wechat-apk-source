package com.tencent.mm.plugin.music.model.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a$j
  implements i<IPCVoid, IPCBoolean>
{
  private static IPCBoolean bUq()
  {
    AppMethodBeat.i(104953);
    try
    {
      ab.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc showAudioToast");
      boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xQW, Boolean.FALSE)).booleanValue();
      IPCBoolean localIPCBoolean1 = new com/tencent/mm/ipcinvoker/type/IPCBoolean;
      localIPCBoolean1.<init>(bool);
      AppMethodBeat.o(104953);
      return localIPCBoolean1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", localException, "ipc showAudioToast task", new Object[0]);
        IPCBoolean localIPCBoolean2 = new IPCBoolean(false);
        AppMethodBeat.o(104953);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a.a.j
 * JD-Core Version:    0.6.2
 */