package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener;
import java.util.concurrent.atomic.AtomicBoolean;

final class a$16
  implements TencentMap.OnScreenShotListener
{
  a$16(a parama)
  {
  }

  public final void onMapScreenShot(Bitmap paramBitmap)
  {
    AppMethodBeat.i(138424);
    ab.v("MicroMsg.DefaultTencentMapView", "updateScreenCapture end");
    if (paramBitmap != null)
      this.hNv.cAw.setImageBitmap(paramBitmap);
    this.hNv.hNt.set(false);
    AppMethodBeat.o(138424);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.16
 * JD-Core Version:    0.6.2
 */