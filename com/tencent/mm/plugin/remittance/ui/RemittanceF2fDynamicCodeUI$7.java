package com.tencent.mm.plugin.remittance.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class RemittanceF2fDynamicCodeUI$7
  implements n.d
{
  RemittanceF2fDynamicCodeUI$7(RemittanceF2fDynamicCodeUI paramRemittanceF2fDynamicCodeUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(45057);
    if (paramInt == 0)
      RemittanceF2fDynamicCodeUI.a(this.pWg, 1);
    AppMethodBeat.o(45057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI.7
 * JD-Core Version:    0.6.2
 */