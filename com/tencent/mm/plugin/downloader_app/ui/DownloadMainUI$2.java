package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.c.a;
import com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI;

final class DownloadMainUI$2
  implements MenuItem.OnMenuItemClickListener
{
  DownloadMainUI$2(DownloadMainUI paramDownloadMainUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(136225);
    this.kQk.startActivity(new Intent(this.kQk, DownloadSearchUI.class));
    a.a(10, 1001, 1, 2, "", "", "");
    AppMethodBeat.o(136225);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.2
 * JD-Core Version:    0.6.2
 */