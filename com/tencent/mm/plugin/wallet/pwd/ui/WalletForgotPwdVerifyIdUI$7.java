package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletForgotPwdVerifyIdUI$7
  implements View.OnFocusChangeListener
{
  WalletForgotPwdVerifyIdUI$7(WalletForgotPwdVerifyIdUI paramWalletForgotPwdVerifyIdUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(46312);
    if (paramBoolean)
    {
      ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " has focus");
      WalletForgotPwdVerifyIdUI.i(this.trW);
      AppMethodBeat.o(46312);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " lose focus");
      AppMethodBeat.o(46312);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.7
 * JD-Core Version:    0.6.2
 */