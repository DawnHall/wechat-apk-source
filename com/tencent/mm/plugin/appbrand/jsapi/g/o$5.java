package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.n;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b.q;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class o$5
  implements b.n
{
  o$5(o paramo, int paramInt, e parame)
  {
  }

  public final boolean b(b.q paramq)
  {
    AppMethodBeat.i(93856);
    o.d locald = new o.d();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mapId", this.hCN);
      localJSONObject.put("data", paramq.data);
      locald.AM(localJSONObject.toString());
      this.hMK.b(locald);
      AppMethodBeat.o(93856);
      return false;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", new Object[] { paramq });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.o.5
 * JD-Core Version:    0.6.2
 */