package com.tencent.mm.plugin.wallet_payu.create.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class c$1 extends g
{
  c$1(c paramc, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48372);
    if ((paramm instanceof b))
    {
      ab.d("MicroMsg.PayUOpenProcess", "hy: scene gen otp, errCode %d, errType %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (b)paramm;
        this.tTg.mqu.putString("payu_reference", paramString.cEW);
        ab.d("MicroMsg.PayUOpenProcess", "hy: session: %s", new Object[] { paramString.cEW });
        this.tTg.mqu.putBoolean("key_is_has_mobile", paramString.tTz);
        a.j(this.hwd, this.tTg.mqu);
        AppMethodBeat.o(48372);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48372);
      bool = false;
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48373);
    this.Agm.a(new b(this.tTg.mqu.getString("dial_code"), this.tTg.mqu.getString("key_mobile")), true);
    AppMethodBeat.o(48373);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.a.c.1
 * JD-Core Version:    0.6.2
 */