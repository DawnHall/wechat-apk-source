package com.tencent.mm.plugin.music.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
{
  public static String ph(int paramInt)
  {
    AppMethodBeat.i(137654);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("errCode:" + paramInt + ", err:");
    switch (paramInt)
    {
    default:
      ((StringBuilder)localObject).append("unknow exception");
    case 53:
    case 54:
    case 55:
    case 62:
    case 63:
    case 64:
    case 66:
    case 67:
    case 69:
    case 70:
    case 74:
    case 80:
    case 101:
    case 102:
    case 500:
    case 501:
    case 502:
    case 503:
    case 504:
    case 600:
    case 601:
    case 602:
    case 603:
    case 604:
    case 605:
    case 701:
    case 702:
    case 703:
    case 704:
    case 705:
    case 706:
    case 707:
    }
    while (true)
    {
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(137654);
      return localObject;
      ((StringBuilder)localObject).append("file not found");
      continue;
      ((StringBuilder)localObject).append("file can not read");
      continue;
      ((StringBuilder)localObject).append("unknow format");
      continue;
      ((StringBuilder)localObject).append("load or init native decode so fail");
      continue;
      ((StringBuilder)localObject).append("get audio info fail");
      continue;
      ((StringBuilder)localObject).append("invalid audio info");
      continue;
      ((StringBuilder)localObject).append("create AudioTrack fail");
      continue;
      ((StringBuilder)localObject).append("decode audio fail");
      continue;
      ((StringBuilder)localObject).append("so file not found");
      continue;
      ((StringBuilder)localObject).append("create temp file fail");
      continue;
      ((StringBuilder)localObject).append("invalid seek or seek fail");
      continue;
      ((StringBuilder)localObject).append("connect network fail");
      continue;
      ((StringBuilder)localObject).append("recognition audio format error");
      continue;
      ((StringBuilder)localObject).append("write AudioTrack data fail");
      continue;
      ((StringBuilder)localObject).append("error URL format");
      continue;
      ((StringBuilder)localObject).append("error player to prepare");
      continue;
      ((StringBuilder)localObject).append("error player to start");
      continue;
      ((StringBuilder)localObject).append("error player to pause");
      continue;
      ((StringBuilder)localObject).append("error player to stop");
      continue;
      ((StringBuilder)localObject).append("error create player fail, exceed max count audio players");
      continue;
      ((StringBuilder)localObject).append("error, not found audioId");
      continue;
      ((StringBuilder)localObject).append("error, not found param");
      continue;
      ((StringBuilder)localObject).append("error, ready exist audioId");
      continue;
      ((StringBuilder)localObject).append("error, invalid audioID");
      continue;
      ((StringBuilder)localObject).append("error, invalid param");
      continue;
      ((StringBuilder)localObject).append("error, invalid param");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer set source occur error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer media format error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer create MediaCode error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer get audio info error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer decode error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer create audio track orror");
    }
  }

  public static int zS(int paramInt)
  {
    int i = 10001;
    AppMethodBeat.i(137653);
    ab.i("MicroMsg.PlayerErrorHandler", "getErrCodeType, errorCode: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      paramInt = -1;
      AppMethodBeat.o(137653);
    case 62:
    case 66:
    case 67:
    case 69:
    case 70:
    case 74:
    case 102:
    case 702:
    case 704:
    case 706:
    case 707:
    case 80:
    case 53:
    case 54:
    case 55:
    case 63:
    case 64:
    case 101:
    case 701:
    case 703:
    case 705:
    case 500:
    case 501:
    case 502:
    case 503:
    case 504:
    case 600:
    case 601:
    case 602:
    case 603:
    case 604:
    case 605:
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(137653);
      paramInt = i;
      continue;
      paramInt = 10002;
      AppMethodBeat.o(137653);
      continue;
      paramInt = 10003;
      AppMethodBeat.o(137653);
      continue;
      paramInt = 10004;
      AppMethodBeat.o(137653);
      continue;
      AppMethodBeat.o(137653);
      paramInt = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.e
 * JD-Core Version:    0.6.2
 */