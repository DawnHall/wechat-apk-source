package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.platformtools.bo;

final class FTSAddWw$4
  implements View.OnClickListener
{
  FTSAddWw$4(FTSAddWw paramFTSAddWw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(61756);
    if (!bo.isNullOrNil(this.mIg.query))
    {
      this.mIg.mHT = true;
      an.l(this.mIg.query, FTSAddWw.b(this.mIg), 1, 16);
    }
    FTSAddWw.c(this.mIg);
    AppMethodBeat.o(61756);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddWw.4
 * JD-Core Version:    0.6.2
 */