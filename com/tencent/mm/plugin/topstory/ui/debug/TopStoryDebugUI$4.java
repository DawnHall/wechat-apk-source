package com.tencent.mm.plugin.topstory.ui.debug;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryDebugUI$4
  implements View.OnClickListener
{
  TopStoryDebugUI$4(TopStoryDebugUI paramTopStoryDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1551);
    try
    {
      paramView = new java/lang/StringBuilder;
      paramView.<init>();
      paramView = com.tencent.mm.vfs.e.cy(com.tencent.mm.compatible.util.e.eSn + "topstory/trace.info");
      TopStoryDebugUI.aV(this.sBD, paramView);
      AppMethodBeat.o(1551);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        AppMethodBeat.o(1551);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI.4
 * JD-Core Version:    0.6.2
 */