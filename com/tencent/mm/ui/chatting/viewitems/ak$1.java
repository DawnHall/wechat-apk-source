package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ak$1
  implements View.OnClickListener
{
  ak$1(ak paramak)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33283);
    ab.d("MicroMsg.ChattingItemNewXmlSysImpl", "hy: textview clicked");
    AppMethodBeat.o(33283);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ak.1
 * JD-Core Version:    0.6.2
 */