package com.tencent.mm.console;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import java.util.ArrayList;

final class b$4
  implements DialogInterface.OnClickListener
{
  b$4(String paramString, int paramInt, ArrayList paramArrayList, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16081);
    d.post(new b.4.1(this), "copy -n");
    AppMethodBeat.o(16081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.4
 * JD-Core Version:    0.6.2
 */