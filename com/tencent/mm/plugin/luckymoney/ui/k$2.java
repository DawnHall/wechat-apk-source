package com.tencent.mm.plugin.luckymoney.ui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class k$2
  implements MediaPlayer.OnCompletionListener
{
  k$2(String paramString)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(43071);
    if (paramMediaPlayer == null);
    for (int i = -1; ; i = paramMediaPlayer.hashCode())
    {
      ab.i("MicroMsg.LuckySoundUtil", "play completion mp:%d  path:%s", new Object[] { Integer.valueOf(i), this.bSt });
      if (paramMediaPlayer != null)
        paramMediaPlayer.release();
      AppMethodBeat.o(43071);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.k.2
 * JD-Core Version:    0.6.2
 */