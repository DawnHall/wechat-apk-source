package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class SettingsAboutMicroMsgUI$6
  implements DialogInterface.OnCancelListener
{
  SettingsAboutMicroMsgUI$6(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127096);
    h.pYm.a(405L, 23L, 1L, true);
    AppMethodBeat.o(127096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.6
 * JD-Core Version:    0.6.2
 */