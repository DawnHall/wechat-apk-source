package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class c$1
  implements b.m
{
  c$1(c paramc, int paramInt, com.tencent.mm.plugin.appbrand.jsapi.c paramc1)
  {
  }

  public final void Bf(String paramString)
  {
    AppMethodBeat.i(93839);
    c.a locala = new c.a((byte)0);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hMD);
      localJSONObject.put("data", paramString);
      locala.AM(localJSONObject.toString());
      this.hIt.b(locala);
      AppMethodBeat.o(93839);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.e("MicroMsg.JsApiAddMapControls", "put JSON data error : %s", new Object[] { paramString });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.c.1
 * JD-Core Version:    0.6.2
 */