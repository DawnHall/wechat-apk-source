package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import java.io.ByteArrayOutputStream;

final class d$b$1
  implements g.a
{
  d$b$1(a parama, Intent paramIntent, bi parambi, b paramb)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(32804);
    boolean bool1;
    boolean bool2;
    if (paramc != null)
    {
      bool1 = true;
      if (paramd == null)
        break label114;
      bool2 = true;
      label20: ab.i("MicroMsg.AppMessageUtil", "summerbig cdnCallback mediaId:%s startRet:%d proginfo:[%s] res:[%s], progressing[%b], finish[%b], onlyCheckExist[%b]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(paramBoolean) });
      if (paramd != null)
      {
        if (!paramd.field_exist_whencheck)
          break label120;
        this.zbG.startActivity(this.val$intent);
      }
    }
    while (true)
    {
      AppMethodBeat.o(32804);
      return 0;
      bool1 = false;
      break;
      label114: bool2 = false;
      break label20;
      label120: if ((this.fku.dtH()) || ((this.yIN != null) && (d.b.e(this.fku, this.yIN.field_fileFullPath))))
      {
        ab.i("MicroMsg.AppMessageUtil", "appmsg is expired or clean!!!");
        h.a(this.zbG.yTx.getContext(), this.zbG.yTx.getContext().getString(2131299789), this.zbG.yTx.getContext().getString(2131297061), new d.b.1.1(this));
      }
      else
      {
        h.b(this.zbG.yTx.getContext(), this.zbG.yTx.getMMResources().getString(2131298779), "", true);
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.b.1
 * JD-Core Version:    0.6.2
 */