package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class BrandServiceIndexUI$4$1
  implements Runnable
{
  BrandServiceIndexUI$4$1(BrandServiceIndexUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13917);
    Intent localIntent = aa.cVd();
    localIntent.putExtra("KRightBtn", true);
    localIntent.putExtra("ftsneedkeyboard", true);
    localIntent.putExtra("key_load_js_without_delay", true);
    localIntent.putExtra("ftsType", 1);
    localIntent.putExtra("ftsbizscene", 6);
    Map localMap = aa.d(6, true, 0);
    String str = aa.HP(bo.ank((String)localMap.get("scene")));
    localMap.put("sessionId", str);
    localMap.put("subSessionId", str);
    localIntent.putExtra("sessionId", str);
    localIntent.putExtra("rawUrl", aa.E(localMap));
    d.b(ah.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", localIntent);
    AppMethodBeat.o(13917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI.4.1
 * JD-Core Version:    0.6.2
 */