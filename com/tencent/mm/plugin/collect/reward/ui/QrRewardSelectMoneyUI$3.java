package com.tencent.mm.plugin.collect.reward.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class QrRewardSelectMoneyUI$3
  implements a.a
{
  QrRewardSelectMoneyUI$3(QrRewardSelectMoneyUI paramQrRewardSelectMoneyUI, f paramf)
  {
  }

  public final void j(m paramm)
  {
    AppMethodBeat.i(41134);
    ab.e("MicroMsg.QrRewardSelectMoneyUI", "net error: %s", new Object[] { this.kEV });
    h.a(this.kEU.mController.ylL, this.kEU.getString(2131305389), null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(41133);
        QrRewardSelectMoneyUI.3.this.kEU.finish();
        AppMethodBeat.o(41133);
      }
    });
    AppMethodBeat.o(41134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI.3
 * JD-Core Version:    0.6.2
 */