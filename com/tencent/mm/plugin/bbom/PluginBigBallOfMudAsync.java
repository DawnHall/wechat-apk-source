package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.q.a;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.app.x;
import com.tencent.mm.app.y;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.plugin.fav.a.ad;
import com.tencent.mm.plugin.fav.a.v;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.welab.a.a.d;
import com.tencent.mm.plugin.welab.c.b;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.sdk.platformtools.ab;

public class PluginBigBallOfMudAsync extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.plugin.bbom.a.a
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(18318);
    if ((paramg.SG()) && (((h)paramg).mProfileCompat != null))
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).setNotification(((WorkerProfile)((h)paramg).mProfileCompat).getNotification());
    com.tencent.mm.pluginsdk.ui.applet.t.a.vlq = new PluginBigBallOfMudAsync.1(this);
    q.a.a(new PluginBigBallOfMudAsync.2(this));
    com.tencent.mm.pluginsdk.ui.e.c.a.vrD = new PluginBigBallOfMudAsync.3(this);
    com.tencent.mm.plugin.webview.ui.tools.widget.f.a.uJi = new PluginBigBallOfMudAsync.4(this);
    com.tencent.mm.plugin.webview.ui.tools.widget.g.a.uJj = new PluginBigBallOfMudAsync.5(this);
    com.tencent.mm.plugin.webview.ui.tools.widget.c.a.uJh = new PluginBigBallOfMudAsync.6(this);
    com.tencent.mm.plugin.webview.ui.tools.widget.a.a.uJg = new PluginBigBallOfMudAsync.7(this);
    com.tencent.mm.kernel.g.a(ad.class, new com.tencent.mm.pluginsdk.model.f());
    com.tencent.mm.kernel.g.a(v.class, new c());
    if ((((h)paramg).mProfileCompat != null) && (paramg.SG()))
    {
      WorkerProfile localWorkerProfile = (WorkerProfile)((h)paramg).mProfileCompat;
      y localy = localWorkerProfile.cfV;
      x localx = localWorkerProfile.cfW;
      com.tencent.mm.bp.c.vwA = localy;
      com.tencent.mm.bp.c.vwB = localx;
      new com.tencent.mm.plugin.e.e(localWorkerProfile).before(this).after(com.tencent.mm.kernel.g.M(p.class));
    }
    if (paramg.SG())
      ((p)com.tencent.mm.kernel.g.M(p.class)).setIDataTransferFactoryDelegate(new PluginBigBallOfMudAsync.8(this));
    AppMethodBeat.o(18318);
  }

  public void dependency()
  {
    AppMethodBeat.i(18317);
    dependsOn(PluginBigBallOfMud.class);
    dependsOn(com.tencent.mm.plugin.notification.b.a.class);
    AppMethodBeat.o(18317);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(18319);
    if ((((h)paramg).mProfileCompat != null) && (paramg.SG()))
    {
      ab.i("MicroMsg.PluginBigBallOfMudAsync", "before WorkerProfile oncreate.");
      ((h)paramg).mProfileCompat.onCreate();
    }
    if (paramg.SG())
    {
      ((d)com.tencent.mm.kernel.g.K(d.class)).a("labs1de6f3", new b());
      ((d)com.tencent.mm.kernel.g.K(d.class)).a(new com.tencent.mm.plugin.welab.e.a());
      ((d)com.tencent.mm.kernel.g.K(d.class)).a("labs_browse", new com.tencent.mm.plugin.welab.c.a());
    }
    AppMethodBeat.o(18319);
  }

  public void installed()
  {
    AppMethodBeat.i(18316);
    alias(com.tencent.mm.plugin.bbom.a.a.class);
    AppMethodBeat.o(18316);
  }

  public String toString()
  {
    return "plugin-big-ball-of-mud-async";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.PluginBigBallOfMudAsync
 * JD-Core Version:    0.6.2
 */