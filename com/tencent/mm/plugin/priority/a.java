package com.tencent.mm.plugin.priority;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.comm.a.b;
import com.tencent.mm.plugin.priority.b.d;
import com.tencent.mm.storage.bi;
import java.lang.ref.WeakReference;

public final class a
  implements b
{
  public final void T(bi parambi)
  {
    AppMethodBeat.i(54880);
    if ((g.RK()) && (((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner() != null))
      ((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner().a(new a.b(this, parambi));
    AppMethodBeat.o(54880);
  }

  public final void U(bi parambi)
  {
    AppMethodBeat.i(54881);
    if ((g.RK()) && (((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner() != null))
      ((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner().a(new a.c(this, parambi));
    AppMethodBeat.o(54881);
  }

  public final void a(bi parambi, Runnable paramRunnable)
  {
    AppMethodBeat.i(54882);
    if ((g.RK()) && (((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner() != null))
      ((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner().a(new a.d(this, parambi, new WeakReference(paramRunnable)));
    AppMethodBeat.o(54882);
  }

  public final void b(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(54879);
    if ((g.RK()) && (((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner() != null))
      ((PluginPriority)g.M(PluginPriority.class)).getPriorityTaskRunner().a(new a.a(this, paramLong, paramBoolean1, paramBoolean2));
    AppMethodBeat.o(54879);
  }

  public final boolean bhI()
  {
    AppMethodBeat.i(54883);
    boolean bool = com.tencent.mm.plugin.priority.a.a.a.bhI();
    AppMethodBeat.o(54883);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.a
 * JD-Core Version:    0.6.2
 */