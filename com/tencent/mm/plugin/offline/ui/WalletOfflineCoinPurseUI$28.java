package com.tencent.mm.plugin.offline.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;

final class WalletOfflineCoinPurseUI$28
  implements Runnable
{
  WalletOfflineCoinPurseUI$28(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43535);
    c localc = WalletOfflineCoinPurseUI.z(this.pav);
    a.e(localc.mActivity, localc.oZq);
    WalletOfflineCoinPurseUI.H(this.pav);
    AppMethodBeat.o(43535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.28
 * JD-Core Version:    0.6.2
 */