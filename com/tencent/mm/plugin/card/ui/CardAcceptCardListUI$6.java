package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardAcceptCardListUI$6
  implements DialogInterface.OnClickListener
{
  CardAcceptCardListUI$6(CardAcceptCardListUI paramCardAcceptCardListUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88220);
    paramDialogInterface.dismiss();
    CardAcceptCardListUI.a(this.kiw, 2);
    AppMethodBeat.o(88220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.6
 * JD-Core Version:    0.6.2
 */