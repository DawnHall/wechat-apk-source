package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.g.d;

public class k extends a<h>
{
  public static final int CTRL_INDEX = 98;
  public static final String NAME = "removeStorage";

  private void a(h paramh, String paramString, int paramInt)
  {
    AppMethodBeat.i(102061);
    JsApiRemoveStorageTask localJsApiRemoveStorageTask = new JsApiRemoveStorageTask();
    localJsApiRemoveStorageTask.appId = u(paramh);
    localJsApiRemoveStorageTask.hXg = paramInt;
    localJsApiRemoveStorageTask.key = paramString;
    AppBrandMainProcessService.a(localJsApiRemoveStorageTask);
    AppMethodBeat.o(102061);
  }

  private void b(h paramh, String paramString, int paramInt)
  {
    AppMethodBeat.i(102062);
    d.post(new k.1(this, paramInt, paramh, paramString), "JsApiRemoveStorage");
    AppMethodBeat.o(102062);
  }

  protected String u(c paramc)
  {
    AppMethodBeat.i(102063);
    paramc = paramc.getAppId();
    AppMethodBeat.o(102063);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.k
 * JD-Core Version:    0.6.2
 */