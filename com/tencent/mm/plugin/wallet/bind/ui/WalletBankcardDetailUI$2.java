package com.tencent.mm.plugin.wallet.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBankcardDetailUI$2
  implements View.OnClickListener
{
  WalletBankcardDetailUI$2(WalletBankcardDetailUI paramWalletBankcardDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45741);
    this.tlK.showDialog(0);
    AppMethodBeat.o(45741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.2
 * JD-Core Version:    0.6.2
 */