package com.tencent.mm.sdk.g.c;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;

@Deprecated
public final class a
{
  private ThreadGroup cme;
  private final AtomicInteger xEF;

  public a()
  {
    AppMethodBeat.i(52677);
    this.xEF = new AtomicInteger(1);
    this.cme = new ThreadGroup("MM_FREE_THREAD_GROUP");
    AppMethodBeat.o(52677);
  }

  public static HandlerThread em(String paramString, int paramInt)
  {
    AppMethodBeat.i(52678);
    Assert.assertNotNull("newThread arg name is null!", paramString);
    paramString = new a("mmt_h".concat(String.valueOf(paramString)), paramInt);
    AppMethodBeat.o(52678);
    return paramString;
  }

  static final class a extends HandlerThread
  {
    a(String paramString, int paramInt)
    {
      super(paramInt);
    }

    public final void run()
    {
      AppMethodBeat.i(52676);
      super.run();
      AppMethodBeat.o(52676);
    }

    public final void start()
    {
      AppMethodBeat.i(52675);
      super.start();
      AppMethodBeat.o(52675);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.c.a
 * JD-Core Version:    0.6.2
 */