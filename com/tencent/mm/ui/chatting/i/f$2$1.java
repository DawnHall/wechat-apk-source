package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$2$1
  implements View.OnCreateContextMenuListener
{
  f$2$1(f.2 param2)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(32612);
    paramContextMenu.add(0, 0, 0, paramView.getContext().getString(2131302498));
    paramContextMenu.add(0, 1, 0, paramView.getContext().getString(2131298092));
    paramContextMenu.add(0, 2, 0, paramView.getContext().getString(2131298154));
    AppMethodBeat.o(32612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.f.2.1
 * JD-Core Version:    0.6.2
 */