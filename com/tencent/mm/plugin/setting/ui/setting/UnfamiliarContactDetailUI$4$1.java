package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class UnfamiliarContactDetailUI$4$1
  implements Runnable
{
  UnfamiliarContactDetailUI$4$1(UnfamiliarContactDetailUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127635);
    UnfamiliarContactDetailUI.e(this.qpZ.qpX).aop.notifyChanged();
    UnfamiliarContactDetailUI.c(this.qpZ.qpX, false);
    AppMethodBeat.o(127635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.4.1
 * JD-Core Version:    0.6.2
 */