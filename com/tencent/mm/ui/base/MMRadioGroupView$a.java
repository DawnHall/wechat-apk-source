package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMRadioGroupView$a
  implements MMRadioImageButton.a
{
  MMRadioGroupView$a(MMRadioGroupView paramMMRadioGroupView)
  {
  }

  public final void a(MMRadioImageButton paramMMRadioImageButton)
  {
    AppMethodBeat.i(106747);
    if (MMRadioGroupView.a(this.ywU) != -1)
      MMRadioGroupView.a(this.ywU, MMRadioGroupView.a(this.ywU));
    int i = paramMMRadioImageButton.getId();
    MMRadioGroupView.a(this.ywU, paramMMRadioImageButton);
    MMRadioGroupView.b(this.ywU, i);
    AppMethodBeat.o(106747);
  }

  public final void b(MMRadioImageButton paramMMRadioImageButton)
  {
    AppMethodBeat.i(106748);
    MMRadioGroupView.c(this.ywU, paramMMRadioImageButton.getId());
    AppMethodBeat.o(106748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMRadioGroupView.a
 * JD-Core Version:    0.6.2
 */