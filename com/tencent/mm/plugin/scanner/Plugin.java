package com.tencent.mm.plugin.scanner;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements com.tencent.mm.pluginsdk.b.c
{
  public o createApplication()
  {
    AppMethodBeat.i(80772);
    c localc = new c();
    AppMethodBeat.o(80772);
    return localc;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(80773);
    e locale = new e();
    AppMethodBeat.o(80773);
    return locale;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.Plugin
 * JD-Core Version:    0.6.2
 */