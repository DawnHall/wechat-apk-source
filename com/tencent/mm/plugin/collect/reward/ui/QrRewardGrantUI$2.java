package com.tencent.mm.plugin.collect.reward.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class QrRewardGrantUI$2 extends s
{
  QrRewardGrantUI$2(QrRewardGrantUI paramQrRewardGrantUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(41064);
    int i = (int)Math.round(bo.getDouble(QrRewardGrantUI.a(this.kEd).getText(), 0.0D) * 100.0D);
    if (QrRewardGrantUI.a(this.kEd, i))
      QrRewardGrantUI.b(this.kEd);
    AppMethodBeat.o(41064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.2
 * JD-Core Version:    0.6.2
 */