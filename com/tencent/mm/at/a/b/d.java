package com.tencent.mm.at.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.c.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
  implements f
{
  public final String sF(String paramString)
  {
    AppMethodBeat.i(116083);
    String str = null;
    if (!bo.isNullOrNil(paramString))
    {
      str = g.x(paramString.getBytes());
      ab.d("MicroMsg.imageloader.DefaultImageFileNameCreator", "[cpan] create image file name :%s", new Object[] { str });
    }
    AppMethodBeat.o(116083);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.b.d
 * JD-Core Version:    0.6.2
 */