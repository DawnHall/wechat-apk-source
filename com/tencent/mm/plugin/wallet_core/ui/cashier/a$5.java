package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;

final class a$5
  implements View.OnClickListener
{
  a$5(a parama, Bankcard paramBankcard)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47740);
    paramView = new Intent();
    ab.i("MicroMsg.WcPayCashierBankcardDialog", "go to url %s", new Object[] { this.tgn.field_forbid_url });
    paramView.putExtra("rawUrl", this.tgn.field_forbid_url);
    paramView.putExtra("geta8key_username", r.Yz());
    paramView.putExtra("pay_channel", 1);
    d.b(a.c(this.tLI), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView, 1);
    AppMethodBeat.o(47740);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.a.5
 * JD-Core Version:    0.6.2
 */