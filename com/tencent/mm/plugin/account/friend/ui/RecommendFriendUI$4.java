package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class RecommendFriendUI$4
  implements View.OnClickListener
{
  RecommendFriendUI$4(RecommendFriendUI paramRecommendFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108631);
    BackwardSupportUtil.c.a(RecommendFriendUI.e(this.gye));
    AppMethodBeat.o(108631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI.4
 * JD-Core Version:    0.6.2
 */