package com.tencent.mm.plugin.kitchen;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.plugin.messenger.foundation.a.p;

public class PluginKitchen extends f
  implements a
{
  public void dependency()
  {
    AppMethodBeat.i(114437);
    dependsOn(p.class);
    AppMethodBeat.o(114437);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(114438);
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.kitchen.a.a.class, new com.tencent.mm.plugin.kitchen.b.a());
    AppMethodBeat.o(114438);
  }

  public void installed()
  {
    AppMethodBeat.i(114436);
    alias(a.class);
    AppMethodBeat.o(114436);
  }

  public String toString()
  {
    return "plugin-kitchen";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.PluginKitchen
 * JD-Core Version:    0.6.2
 */