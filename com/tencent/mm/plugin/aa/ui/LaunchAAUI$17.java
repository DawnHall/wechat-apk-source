package com.tencent.mm.plugin.aa.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class LaunchAAUI$17
  implements d.a
{
  LaunchAAUI$17(LaunchAAUI paramLaunchAAUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40838);
    ab.i("MicroMsg.LaunchAAUI", "fetch operation data failed");
    AppMethodBeat.o(40838);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.17
 * JD-Core Version:    0.6.2
 */