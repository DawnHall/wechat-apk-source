package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$3
  implements DialogInterface.OnCancelListener
{
  c$3(c paramc, c.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(102351);
    ab.i("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
    this.jbK.b(3, null);
    AppMethodBeat.o(102351);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.c.3
 * JD-Core Version:    0.6.2
 */