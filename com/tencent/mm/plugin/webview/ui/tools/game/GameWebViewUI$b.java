package com.tencent.mm.plugin.webview.ui.tools.game;

import android.webkit.ConsoleMessage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.g;
import com.tencent.mm.plugin.wepkg.c;

public final class GameWebViewUI$b extends WebViewUI.g
{
  protected GameWebViewUI$b(GameWebViewUI paramGameWebViewUI)
  {
    super(paramGameWebViewUI);
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(8733);
    if (GameWebViewUI.j(this.uEh) != null)
      GameWebViewUI.j(this.uEh).a(paramConsoleMessage);
    boolean bool = super.onConsoleMessage(paramConsoleMessage);
    AppMethodBeat.o(8733);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.b
 * JD-Core Version:    0.6.2
 */