package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyDetailUI$14
  implements DialogInterface.OnClickListener
{
  LuckyMoneyDetailUI$14(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(42663);
    ab.i("MicroMsg.LuckyMoneyDetailUI", "RealnameGuideHelper dialog click cancel");
    LuckyMoneyDetailUI.E(this.oeA);
    AppMethodBeat.o(42663);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.14
 * JD-Core Version:    0.6.2
 */