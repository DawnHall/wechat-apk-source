package com.tencent.mm.plugin.notification.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fts.a.n;

public final class a extends q
  implements b
{
  public a()
  {
    super(com.tencent.mm.bp.c.akt("notification"));
    AppMethodBeat.i(23118);
    AppMethodBeat.o(23118);
  }

  public final void parallelsDependency()
  {
    AppMethodBeat.i(23119);
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(n.class));
    AppMethodBeat.o(23119);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.a
 * JD-Core Version:    0.6.2
 */