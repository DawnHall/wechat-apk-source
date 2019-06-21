package com.tencent.mm.plugin.qqmail.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;

final class EmbedWebView$1 extends GestureDetector.SimpleOnGestureListener
{
  EmbedWebView$1(EmbedWebView paramEmbedWebView)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(68277);
    paramMotionEvent = this.pxN;
    ab.d("MicroMsg.EmbedWebView", "onDoubleTapm, before scale:" + paramMotionEvent.getScale());
    int i = 10;
    while (paramMotionEvent.getScale() != 1.0F)
    {
      i--;
      if (i <= 0)
        break;
      if (paramMotionEvent.getScale() > 1.0F)
        paramMotionEvent.zoomOut();
      else
        paramMotionEvent.zoomIn();
    }
    ab.d("MicroMsg.EmbedWebView", "onDoubleTapm, after scale:" + this.pxN.getScale());
    AppMethodBeat.o(68277);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.EmbedWebView.1
 * JD-Core Version:    0.6.2
 */