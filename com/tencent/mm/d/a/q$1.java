package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class q$1
  implements JavaCallback
{
  q$1(q paramq)
  {
  }

  public final Object invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(113868);
    if ((paramV8Array.length() <= 0) || (paramV8Array.getType(0) != 1))
    {
      ab.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
      paramV8Object = null;
      AppMethodBeat.o(113868);
    }
    while (true)
    {
      return paramV8Object;
      int i = paramV8Array.getInteger(0);
      ab.i("MicroMsg.V8DirectApiSharedBuffer", "get, id:%d", new Object[] { Integer.valueOf(i) });
      paramV8Object = this.cim.chP.go(i);
      AppMethodBeat.o(113868);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.q.1
 * JD-Core Version:    0.6.2
 */