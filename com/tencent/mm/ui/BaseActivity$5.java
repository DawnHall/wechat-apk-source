package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseActivity$5
  implements View.OnLongClickListener
{
  BaseActivity$5(BaseActivity paramBaseActivity, BaseActivity.b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(112449);
    boolean bool = BaseActivity.a(paramView, this.yfc);
    AppMethodBeat.o(112449);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.BaseActivity.5
 * JD-Core Version:    0.6.2
 */