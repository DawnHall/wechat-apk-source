package com.tencent.mm.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AllRemindMsgUI$2
  implements MenuItem.OnMenuItemClickListener
{
  AllRemindMsgUI$2(AllRemindMsgUI paramAllRemindMsgUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(29113);
    this.yex.onBackPressed();
    AppMethodBeat.o(29113);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.2
 * JD-Core Version:    0.6.2
 */