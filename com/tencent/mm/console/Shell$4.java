package com.tencent.mm.console;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$4
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(16112);
    ab.d("MicroMsg.Shell", "dkcrash begin tid:%d [%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName() });
    Object[] arrayOfObject = new Object[1];
    throw new NullPointerException();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.4
 * JD-Core Version:    0.6.2
 */