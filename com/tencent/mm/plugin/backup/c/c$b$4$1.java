package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.g.d;
import com.tencent.mm.plugin.backup.i.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;

final class c$b$4$1
  implements f
{
  c$b$4$1(c.b.4 param4, boolean paramBoolean, ai paramai)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17184);
    paramm = ((aa)((d)paramm).jxy).jCG;
    ab.i(this.jsj.jsa.TAG, "Send Tag finish last:%b  cv:%s [%d,%d,%s] tag[%s,%s]", new Object[] { Boolean.valueOf(this.jsh), this.jsi, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, this.jsj.jsa.jrS, paramm });
    if ((this.jsh) && (this.jsj.jsa.jrS.equals(paramm)))
      this.jsi.open();
    AppMethodBeat.o(17184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.4.1
 * JD-Core Version:    0.6.2
 */