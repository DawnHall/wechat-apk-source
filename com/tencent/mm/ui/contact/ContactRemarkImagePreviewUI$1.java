package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class ContactRemarkImagePreviewUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ContactRemarkImagePreviewUI$1(ContactRemarkImagePreviewUI paramContactRemarkImagePreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33615);
    paramMenuItem = new com.tencent.mm.ui.widget.a.d(this.zlA, 1, false);
    paramMenuItem.rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(33613);
        paramAnonymousl.e(0, ContactRemarkImagePreviewUI.1.this.zlA.getString(2131302711));
        if (com.tencent.mm.bp.d.afj("favorite"))
          paramAnonymousl.e(1, ContactRemarkImagePreviewUI.1.this.zlA.getString(2131301955));
        if (!ContactRemarkImagePreviewUI.a(ContactRemarkImagePreviewUI.1.this.zlA))
          paramAnonymousl.e(2, ContactRemarkImagePreviewUI.1.this.zlA.getString(2131296881));
        AppMethodBeat.o(33613);
      }
    };
    paramMenuItem.rBm = new ContactRemarkImagePreviewUI.1.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(33615);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.1
 * JD-Core Version:    0.6.2
 */