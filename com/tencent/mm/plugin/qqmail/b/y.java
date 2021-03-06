package com.tencent.mm.plugin.qqmail.b;

import android.content.Context;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.LinkedList;

public final class y
{
  x puW;

  public y()
  {
    AppMethodBeat.i(68027);
    String str = (String)g.RP().Ry().get(282625, "");
    try
    {
      x localx = new com/tencent/mm/plugin/qqmail/b/x;
      localx.<init>();
      this.puW = localx;
      this.puW.parseFrom(Base64.decode(str, 0));
      AppMethodBeat.o(68027);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localException, "", new Object[0]);
        ab.w("MicroMsg.ShareMailInfoMgr", "parse from config fail");
        this.puW = new x();
        AppMethodBeat.o(68027);
      }
    }
  }

  static void Vm(String paramString)
  {
    AppMethodBeat.i(68029);
    bi localbi = new bi();
    localbi.ju("qqmail");
    localbi.eJ(bf.oC("qqmail"));
    localbi.hO(0);
    localbi.setContent(String.format(ah.getContext().getString(2131302946), new Object[] { paramString }));
    localbi.setType(1);
    localbi.setStatus(3);
    ab.d("MicroMsg.ShareMailInfoMgr", "send mail fail, publish fail message, id: %d", new Object[] { Long.valueOf(((j)g.K(j.class)).bOr().Z(localbi)) });
    AppMethodBeat.o(68029);
  }

  public final void Vl(String paramString)
  {
    AppMethodBeat.i(68028);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ShareMailInfoMgr", "remove info fail, info is null");
      AppMethodBeat.o(68028);
      return;
    }
    for (int i = 0; ; i++)
      if (i < this.puW.oof.size())
      {
        if (((w)this.puW.oof.get(i)).ptN.equals(paramString))
          this.puW.oof.remove(i);
      }
      else
      {
        save();
        AppMethodBeat.o(68028);
        break;
      }
  }

  final void save()
  {
    AppMethodBeat.i(68030);
    try
    {
      String str = Base64.encodeToString(this.puW.toByteArray(), 0);
      ab.d("MicroMsg.ShareMailInfoMgr", "save %s", new Object[] { str });
      g.RP().Ry().set(282625, str);
      AppMethodBeat.o(68030);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localIOException, "", new Object[0]);
        ab.w("MicroMsg.ShareMailInfoMgr", "save to config fail");
        AppMethodBeat.o(68030);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.y
 * JD-Core Version:    0.6.2
 */