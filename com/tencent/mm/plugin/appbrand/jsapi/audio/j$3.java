package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class j$3
  implements a.a
{
  j$3(j paramj, q paramq, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(130744);
    if (paramInt != 116)
      AppMethodBeat.o(130744);
    while (true)
    {
      return;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        ab.i("MicroMsg.Record.JsApiOperateRecorder", "PERMISSION_GRANTED, do invoke again");
        this.hAL.a(this.hsD, this.hsm, this.eIl);
        AppMethodBeat.o(130744);
      }
      else
      {
        ab.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, SYS_PERM_DENIED");
        this.hsD.M(this.eIl, this.hAL.j("fail:system permission denied", null));
        AppMethodBeat.o(130744);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.j.3
 * JD-Core Version:    0.6.2
 */