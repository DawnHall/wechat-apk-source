package com.tencent.mm.plugin.nearlife.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CheckInLifeUI$2
  implements View.OnClickListener
{
  CheckInLifeUI$2(CheckInLifeUI paramCheckInLifeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22954);
    CheckInLifeUI.a(this.oSq, paramView, true);
    AppMethodBeat.o(22954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI.2
 * JD-Core Version:    0.6.2
 */