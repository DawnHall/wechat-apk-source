package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.a.e;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceRankInfoUI$23
  implements View.OnClickListener
{
  ExdeviceRankInfoUI$23(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20161);
    ab.d("MicroMsg.Sport.ExdeviceRankInfoUI", "ap: start change cover");
    e.e(this.lDC);
    AppMethodBeat.o(20161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.23
 * JD-Core Version:    0.6.2
 */