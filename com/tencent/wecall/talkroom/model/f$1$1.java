package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.c;

final class f$1$1
  implements Runnable
{
  f$1$1(f.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127864);
    try
    {
      c.i("TalkRoomService", new Object[] { "initMediaComponent" });
      f.e(this.AKe.AKd);
      AppMethodBeat.o(127864);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        c.w("TalkRoomService", new Object[] { "keep_OnOpenSuccess initMediaComponent:  ", localThrowable });
        AppMethodBeat.o(127864);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.1.1
 * JD-Core Version:    0.6.2
 */