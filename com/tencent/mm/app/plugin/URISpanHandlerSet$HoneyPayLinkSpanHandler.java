package com.tencent.mm.app.plugin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;

@URISpanHandlerSet.a
class URISpanHandlerSet$HoneyPayLinkSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$HoneyPayLinkSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 46, 47 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15672);
    if (paramm.type == 46)
    {
      ab.i("MicroMsg.URISpanHandlerSet", "go to honey pay proxy");
      if ((paramm.data != null) && ((paramm.data instanceof Bundle)))
      {
        paramg = Uri.parse(paramm.url);
        paramm = paramg.getQueryParameter("cardNo");
        boolean bool = paramg.getQueryParameter("isPayer").equals("1");
        paramg = new Intent();
        paramg.putExtra("key_card_no", paramm);
        paramg.putExtra("key_is_payer", bool);
        d.b(URISpanHandlerSet.a(this.cgy), "honey_pay", ".ui.HoneyPayProxyUI", paramg);
      }
    }
    while (true)
    {
      AppMethodBeat.o(15672);
      return false;
      if (paramm.type == 47)
      {
        ab.i("MicroMsg.URISpanHandlerSet", "go to bank card list");
        paramm = new Intent();
        paramm.putExtra("intent_finish_self", true);
        d.b(URISpanHandlerSet.a(this.cgy), "wallet", ".bind.ui.WalletBankcardManageUI", paramm);
        h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      }
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15671);
    if (paramString.trim().startsWith("native://wcpay/honeypay"))
    {
      paramString = new m(paramString, 46, null);
      AppMethodBeat.o(15671);
    }
    while (true)
    {
      return paramString;
      if (paramString.trim().startsWith("weixin://wcpay/bankCardList"))
      {
        paramString = new m(paramString, 47, null);
        AppMethodBeat.o(15671);
      }
      else
      {
        AppMethodBeat.o(15671);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.HoneyPayLinkSpanHandler
 * JD-Core Version:    0.6.2
 */