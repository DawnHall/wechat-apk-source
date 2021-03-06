package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapSkew";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93850);
    super.a(paramc, paramJSONObject, paramInt);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetMapSkew", "data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(93850);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiGetMapSkew", "data:%s", new Object[] { paramJSONObject });
      b localb = f(paramc, paramJSONObject);
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiGetMapSkew", "mapView is null, return");
        paramc.M(paramInt, j("fail:mapview is null", null));
        AppMethodBeat.o(93850);
      }
      else
      {
        paramJSONObject = new HashMap();
        paramJSONObject.put("skew", Float.valueOf(localb.getSkew()));
        ab.i("MicroMsg.JsApiGetMapSkew", "getMapSkew ok, values:%s", new Object[] { paramJSONObject.toString() });
        a(paramc, paramInt, j("ok", paramJSONObject), true, localb.aDU());
        AppMethodBeat.o(93850);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.m
 * JD-Core Version:    0.6.2
 */