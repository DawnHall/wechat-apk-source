package com.tencent.mm.plugin.story.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class k$b
  implements Runnable
{
  k$b(k paramk, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109643);
    k.a(this.saa, this.rZg);
    k.b(this.saa, this.rZh);
    Object localObject1 = ((ArrayList)k.a(this.saa).get(this.rZg)).get(this.rZh);
    a.f.b.j.o(localObject1, "dateGalleryMap[row][column]");
    localObject1 = (g)localObject1;
    Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    localObject2 = j.a.cxT().Fe(((g)localObject1).rVZ.cNE);
    Object localObject3 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxT().aba(((g)localObject1).rVZ.cNE + '_' + ((g)localObject1).rVZ.fDG);
    if (localObject2 != null)
    {
      ab.i(k.f(this.saa), "LogStory: deleteItem2 storyinfo " + localObject1 + " deleteItemRow " + k.b(this.saa) + " deleteItemCol " + k.c(this.saa) + " localid " + ((g)localObject1).rVZ.cNE + ' ' + ((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID);
      if (((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID == 0L)
        break label301;
      if ((k.b(this.saa) != -1) && (k.c(this.saa) != -1))
      {
        localObject3 = n.rTi;
        n.a.D(((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID, ((g)localObject1).rVZ.cNE);
      }
    }
    while (true)
    {
      if (((g)localObject1).rVZ.cze())
      {
        localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cno().post((Runnable)new k.b.1(this, (g)localObject1));
      }
      AppMethodBeat.o(109643);
      return;
      label301: localObject2 = n.rTi;
      n.a.EL(((g)localObject1).rVZ.cNE);
      k.g(this.saa);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.k.b
 * JD-Core Version:    0.6.2
 */