package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.ui.tools.m;

final class RemittanceDetailUI$2$2
  implements a.a
{
  RemittanceDetailUI$2$2(RemittanceDetailUI.2 param2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44996);
    RemittanceDetailUI.k(this.pVA.pVw).setVisibility(0);
    RemittanceDetailUI.l(this.pVA.pVw).setVisibility(8);
    m.a(this.pVA.pVw, (ScrollView)this.pVA.pVw.findViewById(2131820884), this.pVA.pVw.findViewById(2131827020), this.pVA.pVw.findViewById(2131827024), this.pVA.pVw.findViewById(2131827058));
    AppMethodBeat.o(44996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.2.2
 * JD-Core Version:    0.6.2
 */