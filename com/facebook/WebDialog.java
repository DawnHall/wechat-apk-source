package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class WebDialog
{
  public static int getWebDialogTheme()
  {
    AppMethodBeat.i(96597);
    int i = com.facebook.internal.WebDialog.getWebDialogTheme();
    AppMethodBeat.o(96597);
    return i;
  }

  public static void setWebDialogTheme(int paramInt)
  {
    AppMethodBeat.i(96598);
    com.facebook.internal.WebDialog.setWebDialogTheme(paramInt);
    AppMethodBeat.o(96598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.WebDialog
 * JD-Core Version:    0.6.2
 */