package com.tencent.mm.modelvoiceaddr.ui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoiceSearchLayout$2
  implements MediaPlayer.OnCompletionListener
{
  VoiceSearchLayout$2(VoiceSearchLayout paramVoiceSearchLayout)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(116765);
    paramMediaPlayer.release();
    AppMethodBeat.o(116765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.2
 * JD-Core Version:    0.6.2
 */