package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.record.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.chatting.d.a;

final class ao$2
  implements f
{
  ao$2(ao paramao, bi parambi, String paramString, int paramInt)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33384);
    ab.d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + paramInt1 + " errCode " + paramInt2 + "  scene " + paramm.getType());
    boolean bool = false;
    if (ao.a.flx != null)
      bool = ao.a.flx.fl(this.zhK.field_msgId);
    if ((!bool) && (paramInt1 == 0) && (paramInt2 == 0) && (((e)paramm).getMediaId().equals(this.IN)))
    {
      paramString = bi.ar(this.zhK);
      paramString.jv(this.zhK.field_reserved);
      paramString.setMsgId(-1L);
      ((aj)ao.a(this.zhM).aF(aj.class)).dFm().b(this.zhL, paramString);
    }
    aw.Rg().b(221, ao.b(this.zhM));
    ao.a(this.zhM, null);
    AppMethodBeat.o(33384);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ao.2
 * JD-Core Version:    0.6.2
 */