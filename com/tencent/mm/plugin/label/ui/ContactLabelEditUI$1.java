package com.tencent.mm.plugin.label.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class ContactLabelEditUI$1 extends ak
{
  ContactLabelEditUI$1(ContactLabelEditUI paramContactLabelEditUI, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22540);
    int i = paramMessage.what;
    switch (i)
    {
    default:
      ab.w("MicroMsg.Label.ContactLabelEditUI", "unknow message. what is:%d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(22540);
    case 6001:
    case 6002:
    }
    while (true)
    {
      return;
      ContactLabelEditUI.a(this.nHW);
      AppMethodBeat.o(22540);
      continue;
      a.gkF.BS();
      AppMethodBeat.o(22540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.1
 * JD-Core Version:    0.6.2
 */