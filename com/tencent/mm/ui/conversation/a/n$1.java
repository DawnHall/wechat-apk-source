package com.tencent.mm.ui.conversation.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class n$1
  implements DialogInterface.OnClickListener
{
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34699);
    ab.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]yes");
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    AppMethodBeat.o(34699);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.n.1
 * JD-Core Version:    0.6.2
 */