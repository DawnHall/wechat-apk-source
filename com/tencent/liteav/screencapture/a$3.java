package com.tencent.liteav.screencapture;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;

class a$3
  implements Runnable
{
  a$3(a parama, Handler paramHandler, HandlerThread paramHandlerThread)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66766);
    this.c.a.post(new a.3.1(this));
    AppMethodBeat.o(66766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.a.3
 * JD-Core Version:    0.6.2
 */