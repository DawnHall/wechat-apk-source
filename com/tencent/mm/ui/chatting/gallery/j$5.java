package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;

final class j$5
  implements Runnable
{
  j$5(j paramj, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32320);
    Object localObject = j.a(this.yWZ);
    int i = this.hVj;
    localObject = u.ut((String)localObject);
    if (localObject != null)
    {
      int j = ((s)localObject).fXd;
      if ((j <= 0) || (Math.abs(j - i) > 2))
      {
        ((s)localObject).fXd = i;
        ((s)localObject).bJt = 4096;
        ab.i("MicroMsg.VideoLogic", "repair video duration ret %b, duration[%d, %d]", new Object[] { Boolean.valueOf(u.f((s)localObject)), Integer.valueOf(j), Integer.valueOf(i) });
      }
    }
    AppMethodBeat.o(32320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.5
 * JD-Core Version:    0.6.2
 */