package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiOperateMusicPlayer$OperateMusicPlayer$5
  implements Runnable
{
  JsApiOperateMusicPlayer$OperateMusicPlayer$5(JsApiOperateMusicPlayer.OperateMusicPlayer paramOperateMusicPlayer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130723);
    ab.i("MicroMsg.JsApiOperateMusicPlayer", "stop ok");
    this.hAH.action = -1;
    this.hAH.error = false;
    this.hAH.errorMsg = "";
    JsApiOperateMusicPlayer.OperateMusicPlayer.g(this.hAH);
    AppMethodBeat.o(130723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer.OperateMusicPlayer.5
 * JD-Core Version:    0.6.2
 */