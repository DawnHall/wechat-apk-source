package com.tencent.mm.plugin.appbrand.game.a;

import a.aa;
import a.f;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.i.k;
import a.k.m;
import a.l;
import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/game/config/WAGameDynamicConfig$Companion;", "", "()V", "TAG", "", "mCommandProcessor", "", "Lcom/tencent/mm/plugin/appbrand/game/config/WAGameDynamicConfig;", "getMCommandProcessor", "()Ljava/util/List;", "mCommandProcessor$delegate", "Lkotlin/Lazy;", "checkNotDuplicate", "", "registry", "processCommand", "context", "Landroid/content/Context;", "args", "", "(Landroid/content/Context;[Ljava/lang/String;)V", "plugin-appbrand-integration_release"})
public final class g$a
{
  static
  {
    AppMethodBeat.i(134631);
    eQB = new k[] { (k)v.a(new t(v.aN(a.class), "mCommandProcessor", "getMCommandProcessor()Ljava/util/List;")) };
    AppMethodBeat.o(134631);
  }

  public static void a(Context paramContext, String[] paramArrayOfString)
  {
    AppMethodBeat.i(134632);
    j.p(paramContext, "context");
    j.p(paramArrayOfString, "args");
    if (paramArrayOfString.length >= 3);
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramContext = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(134632);
      throw paramContext;
    }
    if ((paramArrayOfString[1] != null) && (paramArrayOfString[0] != null));
    for (i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramContext = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(134632);
      throw paramContext;
    }
    boolean bool = m.I("//wagame", paramArrayOfString[0], true);
    if ((aa.AUz) && (!bool))
    {
      paramContext = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(134632);
      throw paramContext;
    }
    Iterator localIterator = ((Iterable)g.aAF().getValue()).iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      g localg = (g)localObject;
      if (m.I(paramArrayOfString[1], localg.aAy(), false))
      {
        localObject = (g)localObject;
        if (localObject != null)
          break label266;
        Toast.makeText(ah.getContext(), (CharSequence)("Unknown config name " + paramArrayOfString[1]), 0).show();
        AppMethodBeat.o(134632);
      }
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label266: ((g)localObject).V(paramContext, paramArrayOfString[2]);
      AppMethodBeat.o(134632);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.g.a
 * JD-Core Version:    0.6.2
 */