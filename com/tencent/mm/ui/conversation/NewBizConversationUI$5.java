package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class NewBizConversationUI$5
  implements MMSlideDelView.g
{
  NewBizConversationUI$5(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34536);
    NewBizConversationUI.f(this.zvm).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(34536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.5
 * JD-Core Version:    0.6.2
 */