package com.tencent.mm.plugin.account.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMClearEditText;

final class SimpleLoginUI$14
  implements View.OnTouchListener
{
  SimpleLoginUI$14(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(125610);
    SimpleLoginUI.c(this.gIp).setFocusableInTouchMode(true);
    boolean bool = SimpleLoginUI.c(this.gIp).getDefaultOnTouchListener().onTouch(paramView, paramMotionEvent);
    AppMethodBeat.o(125610);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.14
 * JD-Core Version:    0.6.2
 */