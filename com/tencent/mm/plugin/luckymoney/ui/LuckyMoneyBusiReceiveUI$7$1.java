package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyBusiReceiveUI$7$1
  implements View.OnClickListener
{
  LuckyMoneyBusiReceiveUI$7$1(LuckyMoneyBusiReceiveUI.7 param7)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42622);
    h.pYm.e(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
    x.a(this.odm.odj, 1, false);
    AppMethodBeat.o(42622);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI.7.1
 * JD-Core Version:    0.6.2
 */