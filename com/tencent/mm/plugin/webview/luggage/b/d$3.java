package com.tencent.mm.plugin.webview.luggage.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.webview.luggage.FavUrlTask;
import com.tencent.mm.ui.widget.snackbar.a.b;

final class d$3
  implements a.b
{
  d$3(d paramd)
  {
  }

  public final void aIu()
  {
    AppMethodBeat.i(6427);
    FavUrlTask localFavUrlTask = new FavUrlTask();
    localFavUrlTask.actionType = 2;
    AppBrandMainProcessService.a(localFavUrlTask);
    AppMethodBeat.o(6427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.d.3
 * JD-Core Version:    0.6.2
 */