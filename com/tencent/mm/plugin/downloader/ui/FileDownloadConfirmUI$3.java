package com.tencent.mm.plugin.downloader.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FileDownloadConfirmUI$3
  implements DialogInterface.OnDismissListener
{
  FileDownloadConfirmUI$3(FileDownloadConfirmUI paramFileDownloadConfirmUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(2517);
    this.kNL.finish();
    AppMethodBeat.o(2517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI.3
 * JD-Core Version:    0.6.2
 */