package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactSearchUI$1
  implements TextWatcher
{
  ContactSearchUI$1(ContactSearchUI paramContactSearchUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(25525);
    ContactSearchUI localContactSearchUI = this.svn;
    if (paramEditable.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localContactSearchUI.enableOptionMenu(bool);
      AppMethodBeat.o(25525);
      return;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI.1
 * JD-Core Version:    0.6.2
 */