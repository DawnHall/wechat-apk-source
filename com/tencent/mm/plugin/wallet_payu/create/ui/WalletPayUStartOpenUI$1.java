package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUStartOpenUI$1
  implements TextWatcher
{
  WalletPayUStartOpenUI$1(WalletPayUStartOpenUI paramWalletPayUStartOpenUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(48395);
    WalletPayUStartOpenUI.a(this.tTw);
    AppMethodBeat.o(48395);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI.1
 * JD-Core Version:    0.6.2
 */