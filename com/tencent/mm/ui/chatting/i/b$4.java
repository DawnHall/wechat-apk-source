package com.tencent.mm.ui.chatting.i;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.i;
import java.util.Set;

final class b$4
  implements DialogInterface.OnClickListener
{
  b$4(b paramb, Set paramSet, bi parambi)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32536);
    ab.i("MicroMsg.BaseHistoryListPresenter", "delete message");
    i.a(this.yZb.mContext, this.yUY, new b.4.1(this));
    AppMethodBeat.o(32536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.b.4
 * JD-Core Version:    0.6.2
 */