package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletMixOrderInfoUI$1
  implements DialogInterface.OnClickListener
{
  WalletMixOrderInfoUI$1(WalletMixOrderInfoUI paramWalletMixOrderInfoUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47411);
    paramDialogInterface.dismiss();
    WalletMixOrderInfoUI.a(this.tIa, this.tHZ);
    AppMethodBeat.o(47411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.1
 * JD-Core Version:    0.6.2
 */