package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.z;

final class EmailVerifyUI$3$1$1
  implements DialogInterface.OnCancelListener
{
  EmailVerifyUI$3$1$1(EmailVerifyUI.3.1 param1, z paramz)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124759);
    g.Rg().c(this.gAR);
    AppMethodBeat.o(124759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI.3.1.1
 * JD-Core Version:    0.6.2
 */