package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.model.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class l
  implements f
{
  public float ecs = -85.0F;
  public float ect = -1000.0F;
  private long updateTime = 0L;

  public final void O(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(87756);
    this.ecs = paramFloat1;
    this.ect = paramFloat2;
    this.updateTime = (System.currentTimeMillis() / 1000L);
    AppMethodBeat.o(87756);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87758);
    ab.i("MicroMsg.CardReportLBSManager", "rplbs onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.RO().eJo.b(1253, this);
    AppMethodBeat.o(87758);
  }

  public final void s(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(87757);
    if (System.currentTimeMillis() / 1000L - this.updateTime > 1800L)
    {
      this.ecs = -85.0F;
      this.ect = -1000.0F;
      ab.i("MicroMsg.CardReportLBSManager", "checkDataValid time is out");
    }
    if (this.ecs == -85.0F)
      ab.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLatitude ==  LocationGeo.INVALID_LAT");
    if (this.ect == -1000.0F)
      ab.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLongitude ==  LocationGeo.INVALID_LNG");
    g.RO().eJo.a(1253, this);
    paramString1 = new u(this.ecs, this.ect, paramString1, paramString2, paramInt);
    g.RO().eJo.a(paramString1, 0);
    AppMethodBeat.o(87757);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.l
 * JD-Core Version:    0.6.2
 */