package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class LuckyMoneyIndexUI$3
  implements View.OnClickListener
{
  LuckyMoneyIndexUI$3(LuckyMoneyIndexUI paramLuckyMoneyIndexUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42723);
    h.pYm.e(11701, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
    LuckyMoneyIndexUI.a(this.oeJ, 1);
    AppMethodBeat.o(42723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI.3
 * JD-Core Version:    0.6.2
 */