package com.tencent.mm.plugin.backup.backuppcui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.c.a;

final class BackupPcUI$3$15
  implements View.OnClickListener
{
  BackupPcUI$3$15(BackupPcUI.3 param3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17609);
    b.aTD().aTa().stop();
    b.aTD().aSu().jqW = -100;
    BackupPcUI.j(this.jwQ.jwP);
    AppMethodBeat.o(17609);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.15
 * JD-Core Version:    0.6.2
 */