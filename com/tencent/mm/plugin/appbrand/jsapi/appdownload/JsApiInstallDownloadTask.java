package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import org.json.JSONObject;

public final class JsApiInstallDownloadTask extends a<c>
{
  public static final int CTRL_INDEX = 442;
  public static final String NAME = "installDownloadTask";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130689);
    AppBrandMainProcessService.a(new JsApiInstallDownloadTask.InstallDownloadTask(this, paramc, paramInt, paramJSONObject));
    AppMethodBeat.o(130689);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask
 * JD-Core Version:    0.6.2
 */