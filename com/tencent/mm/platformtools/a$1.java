package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements b
{
  public final void cN(boolean paramBoolean)
  {
    AppMethodBeat.i(124504);
    ab.i("MicroMsg.AddrBookSyncHelper", "syncAddrBookAndUpload onSyncEnd suc:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      AppMethodBeat.o(124504);
    while (true)
    {
      return;
      System.currentTimeMillis();
      l.apX();
      al localal = new al(l.aqb(), l.aqa());
      g.Rg().a(localal, 0);
      AppMethodBeat.o(124504);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.a.1
 * JD-Core Version:    0.6.2
 */