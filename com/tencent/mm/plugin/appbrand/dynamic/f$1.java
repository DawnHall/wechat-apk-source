package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements b.a
{
  f$1(f paramf)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(10682);
    if ((paramInt1 != 0) || (paramInt2 != 0))
      ab.e("MicroMsg.DynamicPageViewStateMonitor", "widget alarm cgi fail, msg[%s]", new Object[] { paramString });
    AppMethodBeat.o(10682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.f.1
 * JD-Core Version:    0.6.2
 */