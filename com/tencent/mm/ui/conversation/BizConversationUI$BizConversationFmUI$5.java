package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class BizConversationUI$BizConversationFmUI$5
  implements MMSlideDelView.g
{
  BizConversationUI$BizConversationFmUI$5(BizConversationUI.BizConversationFmUI paramBizConversationFmUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34120);
    BizConversationUI.BizConversationFmUI.d(this.zqR).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(34120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI.5
 * JD-Core Version:    0.6.2
 */