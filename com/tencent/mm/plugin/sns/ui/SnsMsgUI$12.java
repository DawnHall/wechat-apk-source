package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class SnsMsgUI$12
  implements MMSlideDelView.c
{
  SnsMsgUI$12(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(39078);
    int i = SnsMsgUI.c(this.rub).getPositionForView(paramView);
    AppMethodBeat.o(39078);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.12
 * JD-Core Version:    0.6.2
 */