package com.tencent.mm.plugin.honey_pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

final class HoneyPayCheckPwdUI$1
  implements EditHintPasswdView.a
{
  HoneyPayCheckPwdUI$1(HoneyPayCheckPwdUI paramHoneyPayCheckPwdUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(41833);
    if (paramBoolean)
    {
      if (HoneyPayCheckPwdUI.a(this.nse) != 1)
        break label40;
      HoneyPayCheckPwdUI.b(this.nse);
    }
    while (true)
    {
      this.nse.aoB();
      AppMethodBeat.o(41833);
      return;
      label40: if (HoneyPayCheckPwdUI.a(this.nse) == 2)
        HoneyPayCheckPwdUI.c(this.nse);
      else if (HoneyPayCheckPwdUI.a(this.nse) == 3)
        HoneyPayCheckPwdUI.d(this.nse);
      else
        ab.w("MicroMsg.HoneyPayCheckPwdUI", "unknown scene: %s", new Object[] { Integer.valueOf(HoneyPayCheckPwdUI.a(this.nse)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.1
 * JD-Core Version:    0.6.2
 */