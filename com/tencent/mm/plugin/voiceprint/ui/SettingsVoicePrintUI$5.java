package com.tencent.mm.plugin.voiceprint.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class SettingsVoicePrintUI$5
  implements View.OnClickListener
{
  SettingsVoicePrintUI$5(SettingsVoicePrintUI paramSettingsVoicePrintUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26146);
    boolean bool = b.a(this.sMd, "android.permission.RECORD_AUDIO", 80, "", "");
    ab.i("MicroMsg.VoiceSettingsUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.sMd });
    if (!bool)
      AppMethodBeat.o(26146);
    while (true)
    {
      return;
      SettingsVoicePrintUI.a(this.sMd);
      AppMethodBeat.o(26146);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI.5
 * JD-Core Version:    0.6.2
 */