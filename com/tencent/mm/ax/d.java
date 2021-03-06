package com.tencent.mm.ax;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.chg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bm;
import com.tencent.mm.storage.bn;

public final class d
  implements f
{
  public d.a fKT = null;

  public static void b(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(78426);
    bm localbm = com.tencent.mm.plugin.r.a.bVu().Ms(paramInt1);
    Object localObject;
    if (localbm == null)
    {
      localObject = new bm();
      ((bm)localObject).field_tipId = paramInt1;
      ((bm)localObject).field_tipVersion = 1;
      ((bm)localObject).field_tipkey = paramString1;
      ((bm)localObject).field_tipType = paramInt2;
      if (((bm)localObject).field_tipsShowInfo == null)
        ((bm)localObject).field_tipsShowInfo = new chg();
      ((bm)localObject).field_tipsShowInfo.path = paramString2;
      com.tencent.mm.plugin.r.a.bVu().f((bm)localObject);
      if ((paramInt2 != b.fKB) || ((((bm)localObject).field_isExit) && (1 == ((bm)localObject).field_tipVersion)))
        break label301;
      paramString1 = new a(paramInt1, paramString1);
      g.Rg().a(paramString1, 0);
      ab.d("MicroMsg.NewTipsManager", "dancy doScene NetScenePushNewTips！！");
      AppMethodBeat.o(78426);
    }
    while (true)
    {
      return;
      if ((paramInt2 == b.fKB) && ((!localbm.field_isExit) || (1 != localbm.field_tipVersion)))
      {
        localObject = new a(paramInt1, paramString1);
        g.Rg().a((m)localObject, 0);
        ab.d("MicroMsg.NewTipsManager", "dancy doScene NetScenePushNewTips！！");
      }
      if (((paramInt2 == b.fKB) && (1 != localbm.field_tipVersion)) || ((paramInt2 == b.fKC) && (localbm.field_tipVersion <= 0)))
      {
        localbm.field_tipId = paramInt1;
        localbm.field_tipVersion = 1;
        localbm.field_tipkey = paramString1;
        localbm.field_tipType = paramInt2;
        localbm.field_isExit = false;
        if (localbm.field_tipsShowInfo == null)
          localbm.field_tipsShowInfo = new chg();
        localbm.field_tipsShowInfo.path = paramString2;
        com.tencent.mm.plugin.r.a.bVu().a(localbm, new String[0]);
      }
      label301: AppMethodBeat.o(78426);
    }
  }

  public static void lR(int paramInt)
  {
    AppMethodBeat.i(78427);
    bm localbm = com.tencent.mm.plugin.r.a.bVu().Ms(paramInt);
    if (localbm == null)
    {
      ab.e("MicroMsg.NewTipsManager", "newTipsInfo is null , makeRead failed!!");
      AppMethodBeat.o(78427);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NewTipsManager", "dancy new tips tipsId:%s, make read: %s", new Object[] { Integer.valueOf(paramInt), Boolean.TRUE });
      if (localbm.field_tipType == b.fKB)
      {
        localbm.field_hadRead = true;
        com.tencent.mm.plugin.r.a.bVu().a(localbm, new String[0]);
      }
      if (localbm.field_tipType == b.fKC)
      {
        localbm.field_hadRead = true;
        com.tencent.mm.plugin.r.a.bVu().a(localbm, new String[0]);
      }
      long l = bo.anU();
      ah.getContext().getSharedPreferences(ah.doA() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", l).commit();
      AppMethodBeat.o(78427);
    }
  }

  public static void u(int paramInt, long paramLong)
  {
    AppMethodBeat.i(78428);
    bm localbm = com.tencent.mm.plugin.r.a.bVu().Ms(paramInt);
    if (localbm == null)
    {
      ab.e("MicroMsg.NewTipsManager", "setPageStayTime fail! newTipsInfo is null!!");
      AppMethodBeat.o(78428);
    }
    while (true)
    {
      return;
      localbm.field_pagestaytime = paramLong;
      com.tencent.mm.plugin.r.a.bVu().a(localbm, new String[0]);
      AppMethodBeat.o(78428);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78425);
    ab.i("MicroMsg.NewTipsManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramm.getType() == 597)
      if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(78425);
    while (true)
    {
      return;
      boolean bool = ((a)paramm).fKz;
      paramInt1 = ((a)paramm).fKA;
      paramString = com.tencent.mm.plugin.r.a.bVu().Ms(paramInt1);
      if (paramString != null)
      {
        paramString.field_isReject = bool;
        ab.i("MicroMsg.NewTipsManager", "Newtips push is reject: %s", new Object[] { Boolean.valueOf(bool) });
        com.tencent.mm.plugin.r.a.bVu().a(paramString, new String[0]);
      }
      AppMethodBeat.o(78425);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ax.d
 * JD-Core Version:    0.6.2
 */