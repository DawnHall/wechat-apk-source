package com.tencent.mm.plugin.game.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.k;

final class GameDetailUI2$15
  implements DialogInterface.OnClickListener
{
  GameDetailUI2$15(GameDetailUI2 paramGameDetailUI2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(111856);
    GameDetailUI2.i(this.nhI).biT();
    GameDetailUI2.m(this.nhI).a(GameDetailUI2.j(this.nhI), GameDetailUI2.k(this.nhI), GameDetailUI2.l(this.nhI), GameDetailUI2.i(this.nhI));
    AppMethodBeat.o(111856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailUI2.15
 * JD-Core Version:    0.6.2
 */