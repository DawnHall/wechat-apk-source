package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.sdk.platformtools.ab;

final class l$1$1
  implements Runnable
{
  l$1$1(l.1 param1, long paramLong, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131474);
    ab.i("MicroMsg.ShareHelper", "notifyToRefreshImg(cost : %s)", new Object[] { Long.valueOf(System.currentTimeMillis() - this.hXb) });
    this.hXc.putInt("action", 2);
    f.a("com.tencent.mm", this.hXc, a.class, null);
    AppMethodBeat.o(131474);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.l.1.1
 * JD-Core Version:    0.6.2
 */