package com.tencent.mm.plugin.emoji;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public static void a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, String paramString3)
  {
    AppMethodBeat.i(62306);
    ab.i("MicroMsg.emoji.EmojiReportHepler", "report kv stat md5:%s, downType:%d donwloadResult:%d verifyResult:%d productID:%s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2 });
    h.pYm.e(12007, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2, Integer.valueOf(paramInt4), paramString3 });
    AppMethodBeat.o(62306);
  }

  public static void hF(long paramLong)
  {
    AppMethodBeat.i(62305);
    ab.i("MicroMsg.emoji.EmojiReportHepler", "report id stat key:%d, value:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(1L) });
    h.pYm.a(96L, paramLong, 1L, false);
    AppMethodBeat.o(62305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.c
 * JD-Core Version:    0.6.2
 */