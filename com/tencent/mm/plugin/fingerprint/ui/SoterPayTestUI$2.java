package com.tencent.mm.plugin.fingerprint.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.a;

final class SoterPayTestUI$2
  implements View.OnClickListener
{
  SoterPayTestUI$2(SoterPayTestUI paramSoterPayTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41663);
    ab.i("MicroMsg.SoterPayTestUI", "hy: regen and upload ask");
    a.a(new SoterPayTestUI.2.1(this), false, null);
    AppMethodBeat.o(41663);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI.2
 * JD-Core Version:    0.6.2
 */