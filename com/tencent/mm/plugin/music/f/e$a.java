package com.tencent.mm.plugin.music.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$a
  implements Runnable
{
  boolean isStop = true;

  private e$a(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137610);
    ab.i("MicroMsg.Music.QQMusicPlayer", "start run play progress task");
    while (true)
      if (!this.isStop)
        try
        {
          if ((this.oNL.oKc != null) && (this.oNL.aie()))
            this.oNL.bTk();
          try
          {
            Thread.sleep(200L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.Music.QQMusicPlayer", "PlayProgressTask run exception:" + localException.getMessage());
        }
    AppMethodBeat.o(137610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.e.a
 * JD-Core Version:    0.6.2
 */