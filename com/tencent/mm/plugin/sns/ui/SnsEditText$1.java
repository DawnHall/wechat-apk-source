package com.tencent.mm.plugin.sns.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsEditText$1
  implements TextWatcher
{
  SnsEditText$1(SnsEditText paramSnsEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38931);
    if (paramCharSequence != null)
      SnsEditText.b(this.rrR, paramCharSequence.length());
    AppMethodBeat.o(38931);
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(38930);
    if (paramCharSequence != null);
    try
    {
      if (paramCharSequence.length() < a.qFE)
      {
        SnsEditText.a(this.rrR, 0);
        AppMethodBeat.o(38930);
      }
      while (true)
      {
        return;
        if (paramCharSequence.length() - SnsEditText.a(this.rrR) > a.qFE)
          SnsEditText.a(this.rrR, paramCharSequence.length() - SnsEditText.a(this.rrR));
        AppMethodBeat.o(38930);
      }
    }
    catch (Exception paramCharSequence)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsEditText", paramCharSequence, "", new Object[0]);
        AppMethodBeat.o(38930);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsEditText.1
 * JD-Core Version:    0.6.2
 */