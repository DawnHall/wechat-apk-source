package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.account.friend.a.b;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1$1
  implements a.a
{
  d$1$1(d.1 param1)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(13706);
    ab.i("MicroMsg.MobileFriendAdapter", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramString1, paramString2 });
    com.tencent.mm.plugin.account.friend.a.a locala = ((b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vW(paramString2);
    if (locala != null)
    {
      if (!paramBoolean1)
        break label178;
      locala.username = paramString1;
      locala.status = 2;
      locala.frT = 2;
      ab.d("MicroMsg.MobileFriendAdapter", "f :%s", new Object[] { locala.toString() });
      ((b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).a(paramString2, locala);
      this.gtM.gtL.KC();
      bv.aaq().c(26, new Object[0]);
      AppMethodBeat.o(13706);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.MobileFriendAdapter", "cpan mobile friend is null. qq:%s", new Object[] { paramString2 });
      label178: AppMethodBeat.o(13706);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.d.1.1
 * JD-Core Version:    0.6.2
 */