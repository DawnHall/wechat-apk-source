package com.tencent.mm.plugin.recharge.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RechargeUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RechargeUI$1(RechargeUI paramRechargeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44307);
    this.pHV.aqX();
    this.pHV.finish();
    AppMethodBeat.o(44307);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.1
 * JD-Core Version:    0.6.2
 */