package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class o$3
  implements f.c
{
  o$3(o paramo, e parame, String paramString, JSONObject paramJSONObject)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(93854);
    ab.i("MicroMsg.JsApiInsertMap", "onDestroy");
    this.hMK.b(this);
    g.ck(this.val$appId, f.g(this.hMK, this.hsm));
    AppMethodBeat.o(93854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.3
 * JD-Core Version:    0.6.2
 */