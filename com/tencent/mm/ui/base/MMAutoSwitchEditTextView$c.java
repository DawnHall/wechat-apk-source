package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

final class MMAutoSwitchEditTextView$c
  implements MMAutoSwitchEditText.b, MMAutoSwitchEditText.c, MMAutoSwitchEditText.d
{
  private MMAutoSwitchEditTextView$c(MMAutoSwitchEditTextView paramMMAutoSwitchEditTextView)
  {
  }

  public final void ND(int paramInt)
  {
    AppMethodBeat.i(106499);
    if ((MMAutoSwitchEditTextView.a(this.ytU) != null) && (paramInt < MMAutoSwitchEditTextView.a(this.ytU).size()))
      if (paramInt == 0)
        AppMethodBeat.o(106499);
    while (true)
    {
      return;
      MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)MMAutoSwitchEditTextView.a(this.ytU).get(paramInt - 1);
      if (localMMAutoSwitchEditText != null)
        localMMAutoSwitchEditText.requestFocus();
      AppMethodBeat.o(106499);
    }
  }

  public final void NE(int paramInt)
  {
    AppMethodBeat.i(106498);
    Object localObject = "";
    Iterator localIterator = MMAutoSwitchEditTextView.a(this.ytU).iterator();
    if (localIterator.hasNext())
    {
      MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)localIterator.next();
      if (bo.isNullOrNil(localMMAutoSwitchEditText.getText().toString().trim()))
        break label228;
      localObject = (String)localObject + localMMAutoSwitchEditText.getText().toString().trim();
    }
    label228: 
    while (true)
    {
      break;
      if ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).length() == MMAutoSwitchEditTextView.b(this.ytU) * MMAutoSwitchEditTextView.c(this.ytU)))
      {
        if (MMAutoSwitchEditTextView.d(this.ytU) != null)
          MMAutoSwitchEditTextView.d(this.ytU).wr((String)localObject);
        AppMethodBeat.o(106498);
      }
      while (true)
      {
        return;
        if (MMAutoSwitchEditTextView.e(this.ytU) != null)
          MMAutoSwitchEditTextView.e(this.ytU).aqK();
        if ((MMAutoSwitchEditTextView.a(this.ytU) != null) && (paramInt < MMAutoSwitchEditTextView.a(this.ytU).size() - 1))
        {
          localObject = (MMAutoSwitchEditText)MMAutoSwitchEditTextView.a(this.ytU).get(paramInt + 1);
          if (localObject != null)
            ((MMAutoSwitchEditText)localObject).requestFocus();
        }
        AppMethodBeat.o(106498);
      }
    }
  }

  public final void dzE()
  {
    AppMethodBeat.i(106500);
    String str = "";
    Iterator localIterator = MMAutoSwitchEditTextView.a(this.ytU).iterator();
    if (localIterator.hasNext())
    {
      MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)localIterator.next();
      if (bo.isNullOrNil(localMMAutoSwitchEditText.getText().toString().trim()))
        break label113;
      str = str + localMMAutoSwitchEditText.getText().toString().trim();
    }
    label113: 
    while (true)
    {
      break;
      if (MMAutoSwitchEditTextView.e(this.ytU) != null)
        MMAutoSwitchEditTextView.e(this.ytU).aqK();
      AppMethodBeat.o(106500);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSwitchEditTextView.c
 * JD-Core Version:    0.6.2
 */