package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipAddressUI$3
  implements DialogInterface.OnClickListener
{
  VoipAddressUI$3(VoipAddressUI paramVoipAddressUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33970);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(33970);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.VoipAddressUI.3
 * JD-Core Version:    0.6.2
 */