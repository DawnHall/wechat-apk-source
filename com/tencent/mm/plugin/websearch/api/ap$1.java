package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.c;
import java.util.Map;

final class ap$1
  implements Runnable
{
  ap$1(ap paramap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124250);
    Object localObject = a.b.eGM;
    localObject = a.ll("100387");
    if (localObject == null)
    {
      ab.i("WebSearchXWeb", "openSearchPreload item is null");
      AppMethodBeat.o(124250);
      return;
    }
    ap localap = this.ubn;
    if ((((c)localObject).isValid()) && ("1".equals(((c)localObject).dru().get("isOpen"))));
    for (boolean bool = true; ; bool = false)
    {
      ap.a(localap, bool);
      AppMethodBeat.o(124250);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ap.1
 * JD-Core Version:    0.6.2
 */