package com.tencent.mm.plugin.appbrand.widget.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$6 extends c
{
  a$6(a parama)
  {
  }

  public final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(87535);
    super.a(paramString, paramd);
    ab.e("IconLoadErrorHandler ", "load icon fail: ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(87535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.a.6
 * JD-Core Version:    0.6.2
 */