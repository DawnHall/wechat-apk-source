package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;

final class a$2
  implements Runnable
{
  a$2(long paramLong, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124505);
    boolean bool;
    if ((a.anE() != null) && (a.anE().isAlive()))
    {
      bool = true;
      ab.i("MicroMsg.AddrBookSyncHelper", "syncAddrBook running:%b setSize:%d call:%d callback:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(a.ggH.size()), Long.valueOf(this.ggJ), this.ggK });
      a.ggH.add(this.ggK);
      if (!bool)
        break label95;
      AppMethodBeat.o(124505);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label95: a.b(d.a(new a.a((byte)0), "AddrBookSyncHelper_addrBookRead", 1));
      l.apP();
      a.anE().start();
      AppMethodBeat.o(124505);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.a.2
 * JD-Core Version:    0.6.2
 */