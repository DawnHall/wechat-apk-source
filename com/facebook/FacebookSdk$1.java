package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class FacebookSdk$1
  implements ThreadFactory
{
  private final AtomicInteger counter;

  FacebookSdk$1()
  {
    AppMethodBeat.i(71597);
    this.counter = new AtomicInteger(0);
    AppMethodBeat.o(71597);
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(71598);
    paramRunnable = new Thread(paramRunnable, "FacebookSdk #" + this.counter.incrementAndGet());
    AppMethodBeat.o(71598);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookSdk.1
 * JD-Core Version:    0.6.2
 */