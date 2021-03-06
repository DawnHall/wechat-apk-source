package com.tencent.mm.plugin.priority;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.priority.b.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.Calendar;

final class PluginPriority$a
  implements Runnable
{
  private PluginPriority$a(PluginPriority paramPluginPriority)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54867);
    long l1 = System.currentTimeMillis();
    int i = g.RP().Ry().getInt(ac.a.xWv, 0);
    if (i != 6)
    {
      ab.i("MicroMsg.Priority.PluginPriority", "New DB FILE %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(6) });
      g.RQ();
      com.tencent.mm.vfs.e.deleteFile(new File(g.RP().cachePath, "MicroMsgPriority.db").getAbsolutePath());
      g.RP().Ry().set(ac.a.xWv, Integer.valueOf(6));
    }
    Object localObject = this.pgh;
    g.RQ();
    PluginPriority.access$102((PluginPriority)localObject, new com.tencent.mm.plugin.priority.b.b(g.RP().cachePath));
    PluginPriority.access$202(this.pgh, PluginPriority.access$100(this.pgh).R(16777217L, 0L));
    if (PluginPriority.access$200(this.pgh) == 0L)
    {
      PluginPriority.access$202(this.pgh, System.currentTimeMillis());
      PluginPriority.access$100(this.pgh).S(16777217L, PluginPriority.access$200(this.pgh));
    }
    ab.i("MicroMsg.Priority.PluginPriority", "install priority time %s", new Object[] { com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd HH:mm:ss", PluginPriority.access$200(this.pgh) / 1000L) });
    PluginPriority.access$302(this.pgh, new c(PluginPriority.access$100(this.pgh)));
    PluginPriority.access$402(this.pgh, new com.tencent.mm.plugin.priority.b.a.d(PluginPriority.access$100(this.pgh)));
    PluginPriority.access$502(this.pgh, new com.tencent.mm.plugin.priority.b.d());
    PluginPriority.access$602(this.pgh, new com.tencent.mm.plugin.priority.b.a.b());
    PluginPriority.access$702(this.pgh, new com.tencent.mm.plugin.priority.b.a.a());
    localObject = PluginPriority.access$500(this.pgh);
    ab.i("MicroMsg.Priority.PriorityTaskRunner", "start tick");
    ((com.tencent.mm.plugin.priority.b.d)localObject).ju(0L);
    long l2 = PluginPriority.access$100(this.pgh).R(16777218L, -1L);
    long l3 = Calendar.getInstance().get(5);
    if (l3 != l2)
    {
      l2 = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ChatImgAutoDownloadMax"), 0);
      localObject = String.format("%d,%d", new Object[] { Long.valueOf(bo.a((Long)g.RP().Ry().get(ac.a.xJY, null), 0L)), Long.valueOf(l2) });
      ab.i("MicroMsg.Priority.PriorityReportLogic", "report16341 %s", new Object[] { localObject });
      com.tencent.mm.plugin.report.e.pXa.X(16341, (String)localObject);
      PluginPriority.access$100(this.pgh).S(16777218L, l3);
    }
    ((j)g.K(j.class)).bOr().a(PluginPriority.access$800(this.pgh), null);
    ab.i("MicroMsg.Priority.PluginPriority", "Init Priority Use Time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(54867);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.PluginPriority.a
 * JD-Core Version:    0.6.2
 */