package com.tencent.smtt.sdk;

import android.webkit.GeolocationPermissions.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;

class SystemWebChromeClient$c
  implements GeolocationPermissionsCallback
{
  GeolocationPermissions.Callback a;

  SystemWebChromeClient$c(SystemWebChromeClient paramSystemWebChromeClient, GeolocationPermissions.Callback paramCallback)
  {
    this.a = paramCallback;
  }

  public void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(64164);
    this.a.invoke(paramString, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(64164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.SystemWebChromeClient.c
 * JD-Core Version:    0.6.2
 */