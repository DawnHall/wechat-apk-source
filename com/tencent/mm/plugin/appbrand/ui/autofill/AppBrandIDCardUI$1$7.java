package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandIDCardUI$1$7
  implements DialogInterface.OnClickListener
{
  AppBrandIDCardUI$1$7(AppBrandIDCardUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(133221);
    ab.i("MicroMsg.AppBrandIDCardUI", "[showVerifySmsAlert] btn click");
    AppMethodBeat.o(133221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.1.7
 * JD-Core Version:    0.6.2
 */