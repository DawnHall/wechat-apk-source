package com.tencent.mm.ui.chatting.i;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.a.c.b;

final class a$2$2
  implements n.d
{
  a$2$2(a.2 param2, c.b paramb)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(32508);
    aw.ZK();
    bi localbi = c.XO().jf(this.yYV.cvx);
    this.yYU.yYS.d(paramMenuItem.getItemId(), localbi);
    AppMethodBeat.o(32508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.a.2.2
 * JD-Core Version:    0.6.2
 */