package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

final class MobileFriendUI$7
  implements View.OnClickListener
{
  MobileFriendUI$7(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13725);
    MMWizardActivity.J(this.gtZ, new Intent(this.gtZ, BindMContactIntroUI.class));
    AppMethodBeat.o(13725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.7
 * JD-Core Version:    0.6.2
 */