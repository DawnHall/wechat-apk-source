package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class ContactSearchUI$2
  implements TextView.OnEditorActionListener
{
  ContactSearchUI$2(ContactSearchUI paramContactSearchUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(25526);
    if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66) && (!bo.isNullOrNil(ContactSearchUI.a(this.svn).getText().toString().trim())))
      ContactSearchUI.b(this.svn);
    AppMethodBeat.o(25526);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI.2
 * JD-Core Version:    0.6.2
 */