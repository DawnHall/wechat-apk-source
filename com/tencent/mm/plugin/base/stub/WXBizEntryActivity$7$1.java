package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WXBizEntryActivity$7$1
  implements DialogInterface.OnClickListener
{
  WXBizEntryActivity$7$1(WXBizEntryActivity.7 param7)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18145);
    WXBizEntryActivity.c(this.jDH.jDz);
    this.jDH.jDz.finish();
    AppMethodBeat.o(18145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXBizEntryActivity.7.1
 * JD-Core Version:    0.6.2
 */