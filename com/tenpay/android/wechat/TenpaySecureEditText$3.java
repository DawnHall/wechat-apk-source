package com.tenpay.android.wechat;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TenpaySecureEditText$3
  implements View.OnTouchListener
{
  TenpaySecureEditText$3(TenpaySecureEditText paramTenpaySecureEditText)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(49462);
    if ((TenpaySecureEditText.EditState.PASSWORD != this.this$0.mEditState) && (TenpaySecureEditText.EditState.CVV_PAYMENT != this.this$0.mEditState) && (TenpaySecureEditText.EditState.CVV_4_PAYMENT != this.this$0.mEditState))
    {
      paramView = this.this$0;
      if (paramView.getCompoundDrawables()[2] == null)
        AppMethodBeat.o(49462);
    }
    while (true)
    {
      return false;
      if (paramMotionEvent.getAction() != 1)
      {
        AppMethodBeat.o(49462);
      }
      else
      {
        if (paramMotionEvent.getX() > paramView.getWidth() - paramView.getPaddingRight() - TenpaySecureEditText.access$000(this.this$0).getIntrinsicWidth())
          paramView.setText("");
        AppMethodBeat.o(49462);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tenpay.android.wechat.TenpaySecureEditText.3
 * JD-Core Version:    0.6.2
 */