package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class HCEEventLogic$1 extends g.c
{
  public final void a(g.d paramd)
  {
    AppMethodBeat.i(137846);
    ab.i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onPause");
    super.a(paramd);
    HCEEventLogic.a(HCEEventLogic.access$000(), 23, null);
    AppMethodBeat.o(137846);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(137844);
    ab.i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onCreate");
    super.onCreate();
    HCEEventLogic.a(HCEEventLogic.access$000(), 21, null);
    AppMethodBeat.o(137844);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(137847);
    ab.i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onDestroy");
    super.onDestroy();
    HCEEventLogic.a(HCEEventLogic.access$000(), 24, null);
    AppMethodBeat.o(137847);
  }

  public final void onResume()
  {
    AppMethodBeat.i(137845);
    ab.i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onResume");
    super.onResume();
    HCEEventLogic.a(HCEEventLogic.access$000(), 22, null);
    AppMethodBeat.o(137845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic.1
 * JD-Core Version:    0.6.2
 */