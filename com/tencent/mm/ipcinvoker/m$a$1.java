package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.h.b;
import java.util.concurrent.ThreadFactory;

final class m$a$1
  implements ThreadFactory
{
  int index = 0;

  m$a$1(m.a parama)
  {
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(114058);
    Object localObject = new StringBuilder("ThreadPool#Thread-");
    int i = this.index;
    this.index = (i + 1);
    localObject = i;
    paramRunnable = new Thread(new m.a.1.1(this, paramRunnable), (String)localObject);
    b.i("IPC.ExecutorServiceCreatorImpl", "newThread(thread : %s)", new Object[] { localObject });
    AppMethodBeat.o(114058);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.m.a.1
 * JD-Core Version:    0.6.2
 */