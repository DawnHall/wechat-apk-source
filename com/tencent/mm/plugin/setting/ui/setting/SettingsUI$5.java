package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsUI$5
  implements DialogInterface.OnClickListener
{
  SettingsUI$5(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127564);
    h.pYm.e(11545, new Object[] { Integer.valueOf(5) });
    ab.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
    AppMethodBeat.o(127564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.5
 * JD-Core Version:    0.6.2
 */