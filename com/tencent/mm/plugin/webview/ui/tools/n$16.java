package com.tencent.mm.plugin.webview.ui.tools;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.4;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class n$16
  implements Runnable
{
  n$16(n paramn, WebViewUI paramWebViewUI, d paramd, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7728);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7728);
    while (true)
    {
      return;
      if (this.uum != null)
      {
        d locald = this.uum;
        String str = this.uuv;
        byte[] arrayOfByte = this.uuz;
        Object localObject = this.lrr;
        if (!locald.ready)
        {
          ab.e("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice fail, not ready");
          AppMethodBeat.o(7728);
        }
        else
        {
          ab.i("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice: device id = %s, brandName = %s", new Object[] { str, localObject });
          if ((bo.isNullOrNil(str)) || (bo.isNullOrNil((String)localObject)) || (arrayOfByte == null))
          {
            ab.e("MicroMsg.JsApiHandler", "parameter error!!!");
            AppMethodBeat.o(7728);
          }
          else
          {
            localObject = new HashMap();
            ((Map)localObject).put("deviceId", str);
            ((Map)localObject).put("base64Data", Base64.encodeToString(arrayOfByte, 2));
            al.d(new d.4(locald, i.a.b("onReceiveDataFromWXDevice", (Map)localObject, locald.uFv, locald.uFw)));
          }
        }
      }
      else
      {
        AppMethodBeat.o(7728);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.16
 * JD-Core Version:    0.6.2
 */