package com.tencent.mm.plugin.messenger.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Map;

final class a$3
  implements Runnable
{
  a$3(a parama, String paramString, e.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136921);
    ab.i("MicroMsg.SysMsgTemplateImp", "hy: removing Received listener: %s", new Object[] { this.orb });
    HashSet localHashSet = (HashSet)a.a(this.ora).get(this.orb);
    if (localHashSet == null)
      AppMethodBeat.o(136921);
    while (true)
    {
      return;
      localHashSet.remove(this.orc);
      if (localHashSet.size() == 0)
      {
        a.a(this.ora).remove(this.orb);
        AppMethodBeat.o(136921);
      }
      else
      {
        a.a(this.ora).put(this.orb, localHashSet);
        AppMethodBeat.o(136921);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.b.a.3
 * JD-Core Version:    0.6.2
 */