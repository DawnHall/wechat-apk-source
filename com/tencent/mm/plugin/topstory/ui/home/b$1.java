package com.tencent.mm.plugin.topstory.ui.home;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.a.a;
import com.tencent.mm.plugin.topstory.ui.webview.e;
import com.tencent.mm.plugin.topstory.ui.webview.e.12;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONException;
import org.json.JSONObject;

final class b$1
  implements a.a
{
  b$1(b paramb)
  {
  }

  public final void abA(String paramString)
  {
    AppMethodBeat.i(1566);
    e locale;
    JSONObject localJSONObject;
    if (this.sCf.sBL != null)
    {
      locale = this.sCf.sBL;
      localJSONObject = new JSONObject();
    }
    try
    {
      localJSONObject.put("params", paramString);
      al.d(new e.12(locale, localJSONObject.toString()));
      AppMethodBeat.o(1566);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebRecommendInfoUpdate json exception: " + paramString.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.1
 * JD-Core Version:    0.6.2
 */