package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class e extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 353;
  public static final String NAME = "stopHCE";

  static void a(c paramc, int paramInt, String paramString)
  {
    AppMethodBeat.i(137883);
    ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo stopHCE callback result: %s", new Object[] { paramString });
    if (paramc != null)
      paramc.M(paramInt, paramString);
    AppMethodBeat.o(137883);
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137882);
    a(new e.1(this, paramc, paramInt));
    AppMethodBeat.o(137882);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.e
 * JD-Core Version:    0.6.2
 */