package com.tencent.mm.plugin.hp.b;

import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  public static void a(String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, String paramString4, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(90615);
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "msg is null");
      AppMethodBeat.o(90615);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "try to show dialog");
      al.d(new i.1(paramString1, paramString2, paramString3, paramString4, paramOnClickListener1, paramOnClickListener2));
      AppMethodBeat.o(90615);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.i
 * JD-Core Version:    0.6.2
 */