package com.tencent.mm.plugin.websearch.ui;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebSearchVideoPlayerSeekBar$2
  implements View.OnLayoutChangeListener
{
  WebSearchVideoPlayerSeekBar$2(WebSearchVideoPlayerSeekBar paramWebSearchVideoPlayerSeekBar)
  {
  }

  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(73815);
    if (paramInt3 - paramInt1 != paramInt7 - paramInt5)
      this.ucn.aFQ();
    AppMethodBeat.o(73815);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.ui.WebSearchVideoPlayerSeekBar.2
 * JD-Core Version:    0.6.2
 */