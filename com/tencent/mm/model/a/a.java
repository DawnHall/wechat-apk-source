package com.tencent.mm.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import java.util.Map;

public final class a
  implements n
{
  public final e.b a(String paramString, Map<String, String> paramMap, e.a parama)
  {
    Object localObject = null;
    AppMethodBeat.i(118139);
    paramMap = localObject;
    if (paramString != null)
    {
      paramMap = localObject;
      if (paramString.equals("abtest"))
      {
        paramString = e.d.bg(Integer.valueOf(-1879048184));
        if (paramString != null)
          break label50;
      }
    }
    label50: for (paramMap = localObject; ; paramMap = paramString.b(parama))
    {
      AppMethodBeat.o(118139);
      return paramMap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a.a
 * JD-Core Version:    0.6.2
 */