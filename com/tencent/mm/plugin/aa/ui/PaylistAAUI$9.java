package com.tencent.mm.plugin.aa.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class PaylistAAUI$9
  implements d.a
{
  PaylistAAUI$9(PaylistAAUI paramPaylistAAUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(40874);
    ab.i("MicroMsg.PaylistAAUI", "onInterrupt: %s", new Object[] { paramObject });
    PaylistAAUI localPaylistAAUI = this.gpC;
    if (paramObject == null);
    for (paramObject = ""; ; paramObject = paramObject.toString())
    {
      PaylistAAUI.a(localPaylistAAUI, paramObject);
      AppMethodBeat.o(40874);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.9
 * JD-Core Version:    0.6.2
 */