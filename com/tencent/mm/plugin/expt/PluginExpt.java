package com.tencent.mm.plugin.expt;

import android.app.Application;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public class PluginExpt extends f
  implements com.tencent.mm.kernel.api.c, a
{
  private static HashMap<Integer, h.d> jZD;
  private t.a jZF;

  static
  {
    AppMethodBeat.i(73322);
    HashMap localHashMap = new HashMap();
    jZD = localHashMap;
    localHashMap.put(Integer.valueOf("EXPT_TABLE".hashCode()), new PluginExpt.1());
    jZD.put(Integer.valueOf("EXPT_KEY_MAP_ID_TABLE".hashCode()), new PluginExpt.2());
    jZD.put(Integer.valueOf("CHATROOM_MUTE_EXPT_TABLE".hashCode()), new PluginExpt.3());
    AppMethodBeat.o(73322);
  }

  private void closeDB()
  {
    AppMethodBeat.i(73321);
    if (this.jZF != null)
      this.jZF.mJ(hashCode());
    this.jZF = null;
    com.tencent.mm.plugin.expt.b.a locala = com.tencent.mm.plugin.expt.b.a.bqR();
    locala.lNF = null;
    locala.lNG = null;
    AppMethodBeat.o(73321);
  }

  private void initDB()
  {
    AppMethodBeat.i(73320);
    if (this.jZF != null)
      closeDB();
    String str = com.tencent.mm.kernel.g.RP().cachePath + "WxExpt.db";
    this.jZF = t.a(hashCode(), str, jZD, true);
    AppMethodBeat.o(73320);
  }

  public void dependency()
  {
    AppMethodBeat.i(73316);
    dependsOn(p.class);
    AppMethodBeat.o(73316);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    int i = 0;
    AppMethodBeat.i(73317);
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.expt.a.a.class, com.tencent.mm.plugin.expt.b.a.bqR());
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.expt.roomexpt.d.class, com.tencent.mm.plugin.expt.roomexpt.a.brg());
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.expt.a.c.class, com.tencent.mm.plugin.expt.c.d.brb());
    if ((paramg != null) && (paramg.cc != null))
    {
      com.tencent.mm.plugin.expt.e.c.bru();
      if (bo.getInt(com.tencent.mm.plugin.expt.e.c.a(a.a.lIp, "", false), 0) > 0)
        i = 1;
      if (i != 0)
        paramg.cc.registerActivityLifecycleCallbacks(com.tencent.mm.plugin.expt.c.d.brb());
    }
    com.tencent.mm.plugin.expt.hellhound.b.d(paramg);
    AppMethodBeat.o(73317);
  }

  public void installed()
  {
    AppMethodBeat.i(73315);
    alias(a.class);
    AppMethodBeat.o(73315);
  }

  public void onAccountInitialized(e.c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(73318);
    ab.i("MicroMsg.PluginExpt", "Plugin expt onAccountInitialized [%d] [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(com.tencent.mm.plugin.expt.b.a.bqR().hashCode()) });
    initDB();
    com.tencent.mm.plugin.expt.b.a locala = com.tencent.mm.plugin.expt.b.a.bqR();
    paramc = this.jZF;
    int i = locala.hashCode();
    if (paramc != null)
      bool = true;
    ab.i("MicroMsg.ExptService", "reset DB [%d] dataDB[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
    if (paramc != null)
    {
      locala.lNF = new com.tencent.mm.plugin.expt.e.d(paramc);
      locala.lNG = new com.tencent.mm.plugin.expt.e.b(paramc);
    }
    com.tencent.mm.plugin.expt.roomexpt.a.brg().lOt = new com.tencent.mm.plugin.expt.roomexpt.b(this.jZF);
    AppMethodBeat.o(73318);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(73319);
    ab.i("MicroMsg.PluginExpt", "Plugin expt onAccountRelease [%d] [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(com.tencent.mm.plugin.expt.b.a.bqR().hashCode()) });
    closeDB();
    AppMethodBeat.o(73319);
  }

  public String toString()
  {
    return "plugin-expt";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.PluginExpt
 * JD-Core Version:    0.6.2
 */