package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.d;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupPcUI$2
  implements DialogInterface.OnClickListener
{
  BackupPcUI$2(BackupPcUI paramBackupPcUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17589);
    ab.i("MicroMsg.BackupPcUI", "closeImpl merging user click close. stop recover merge.");
    h.pYm.a(400L, 26L, 1L, false);
    b.aTD().aTa().stop();
    b.aTD().aTG().c(true, true, -100);
    AppMethodBeat.o(17589);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.2
 * JD-Core Version:    0.6.2
 */