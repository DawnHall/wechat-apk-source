package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConsolePanel$5
  implements View.OnFocusChangeListener
{
  ConsolePanel$5(ConsolePanel paramConsolePanel)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(11141);
    if (!paramBoolean)
      f.cX(paramView);
    AppMethodBeat.o(11141);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel.5
 * JD-Core Version:    0.6.2
 */