package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.c.a;
import com.tencent.mm.plugin.exdevice.service.j;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

final class d$2 extends c.a
{
  d$2(d paramd, j paramj)
  {
    super(0);
  }

  public final void onServiceConnected()
  {
    AppMethodBeat.i(19098);
    if (!u.bpy().lqX.a(this.lrl))
      ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    AppMethodBeat.o(19098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d.2
 * JD-Core Version:    0.6.2
 */