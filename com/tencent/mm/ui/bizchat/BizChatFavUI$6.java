package com.tencent.mm.ui.bizchat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.a.d.a.b;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.ab;

final class BizChatFavUI$6
  implements d.a
{
  BizChatFavUI$6(BizChatFavUI paramBizChatFavUI)
  {
  }

  public final void a(d.a.b paramb)
  {
    AppMethodBeat.i(30112);
    if ((paramb != null) && (paramb.fxB != null))
    {
      ab.i("MicroMsg.BizChatFavUI", "bizChatExtension bizChat change");
      ab.d("MicroMsg.BizChatFavUI", "needToUpdate:%s", new Object[] { Boolean.valueOf(z.aeT().aK(paramb.fxq).field_needToUpdate) });
      if (BizChatFavUI.b(this.yEt))
        BizChatFavUI.c(this.yEt).KC();
    }
    AppMethodBeat.o(30112);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatFavUI.6
 * JD-Core Version:    0.6.2
 */