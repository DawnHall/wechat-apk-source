package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.storage.ak;

final class c$2
  implements DialogInterface.OnClickListener
{
  c$2(Context paramContext, String paramString, ak paramak, PBool paramPBool, ProgressDialog paramProgressDialog, Runnable paramRunnable)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34155);
    c.a(this.ewn, this.xXy, this.zqU, this.zqV);
    if (this.zqW != null)
      this.zqW.run();
    if (f.qY(this.ewn))
    {
      paramDialogInterface = z.afc();
      k.a(this.ewn, 14, 0, 0.0F, 0.0F, 0, null, 0, paramDialogInterface.fwz, null);
    }
    AppMethodBeat.o(34155);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c.2
 * JD-Core Version:    0.6.2
 */