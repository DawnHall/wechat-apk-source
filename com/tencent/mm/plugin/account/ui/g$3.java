package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.MMActivity;

final class g$3
  implements Runnable
{
  g$3(g paramg, MMActivity paramMMActivity)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125083);
    Intent localIntent = a.gkE.bh(this.cgq);
    localIntent.addFlags(67108864);
    this.cgq.startActivity(localIntent);
    this.cgq.finish();
    AppMethodBeat.o(125083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.g.3
 * JD-Core Version:    0.6.2
 */