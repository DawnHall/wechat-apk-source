package com.tencent.mm.plugin.wenote;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.o;

public final class Plugin
  implements com.tencent.mm.pluginsdk.b.c
{
  public final o createApplication()
  {
    AppMethodBeat.i(26583);
    a locala = new a();
    AppMethodBeat.o(26583);
    return locala;
  }

  public final at createSubCore()
  {
    AppMethodBeat.i(26584);
    com.tencent.mm.plugin.wenote.model.c localc = new com.tencent.mm.plugin.wenote.model.c();
    AppMethodBeat.o(26584);
    return localc;
  }

  public final b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.Plugin
 * JD-Core Version:    0.6.2
 */