package com.tencent.liteav.basic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

class c$1
  implements Runnable
{
  c$1(c paramc, Runnable paramRunnable, boolean[] paramArrayOfBoolean)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66022);
    this.a.run();
    this.b[0] = true;
    synchronized (c.a(this.c))
    {
      c.a(this.c).notifyAll();
      AppMethodBeat.o(66022);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.util.c.1
 * JD-Core Version:    0.6.2
 */