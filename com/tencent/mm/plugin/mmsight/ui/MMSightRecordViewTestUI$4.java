package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.sdk.platformtools.al;

final class MMSightRecordViewTestUI$4
  implements View.OnClickListener
{
  MMSightRecordViewTestUI$4(MMSightRecordViewTestUI paramMMSightRecordViewTestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55122);
    MMSightRecordViewTestUI.a(this.oBu).osY.EL();
    al.n(new MMSightRecordViewTestUI.4.1(this), 5000L);
    AppMethodBeat.o(55122);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI.4
 * JD-Core Version:    0.6.2
 */