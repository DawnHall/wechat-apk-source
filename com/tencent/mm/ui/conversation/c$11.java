package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf;
import com.tencent.mm.pointers.PBool;

final class c$11
  implements DialogInterface.OnClickListener
{
  c$11(String paramString1, PBool paramPBool, ProgressDialog paramProgressDialog, String paramString2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34166);
    bf.a(this.ewn, new c.11.1(this));
    AppMethodBeat.o(34166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c.11
 * JD-Core Version:    0.6.2
 */