package com.tencent.mm.plugin.fts.ui.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class d extends a
{
  public final e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(62043);
    paramContext = new com.tencent.mm.plugin.fts.ui.d.d(paramContext, paramb, paramInt);
    AppMethodBeat.o(62043);
    return paramContext;
  }

  public final int getPriority()
  {
    return 2147483647;
  }

  public final int getType()
  {
    return 4112;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.b.d
 * JD-Core Version:    0.6.2
 */