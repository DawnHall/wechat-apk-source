package com.tencent.mm.plugin.scanner.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

final class p$1
  implements g.a
{
  p$1(p paramp)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(81483);
    if (paramc == null)
    {
      paramc = "null";
      if (paramd != null)
        break label119;
    }
    label119: for (String str = "null"; ; str = paramd.toString())
    {
      ab.i("MicroMsg.ScannerCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramString, Integer.valueOf(paramInt), paramc, str });
      paramc = new p.b(this.qiP);
      if (paramInt == 0)
        break label129;
      ab.e("MicroMsg.ScannerCdnService", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramInt), paramString });
      paramc.errCode = paramInt;
      p.a(this.qiP, paramString, paramc);
      AppMethodBeat.o(81483);
      return 0;
      paramc = paramc.toString();
      break;
    }
    label129: if (paramd != null)
    {
      paramc.errCode = paramd.field_retCode;
      if (paramd.field_retCode == 0)
        break label199;
      ab.e("MicroMsg.ScannerCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramString, Integer.valueOf(paramd.field_retCode), paramd });
    }
    while (true)
    {
      p.a(this.qiP, paramString, paramc);
      AppMethodBeat.o(81483);
      break;
      label199: ab.i("MicroMsg.ScannerCdnService", "cdn trans suceess, media id : %s", new Object[] { paramString });
      paramc.fileId = paramd.field_fileId;
      paramc.aeskey = paramd.field_aesKey;
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(81484);
    ab.i("MicroMsg.ScannerCdnService", "getCdnAuthInfo, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(81484);
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(81485);
    ab.i("MicroMsg.ScannerCdnService", "decodePrepareResponse, mediaId = %s", new Object[] { paramString });
    AppMethodBeat.o(81485);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.p.1
 * JD-Core Version:    0.6.2
 */