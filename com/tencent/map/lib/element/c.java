package com.tencent.map.lib.element;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class c
{
  public final String a;
  public final String b;
  public final int c;
  public final String[] d;

  public c(String paramString1, String paramString2, String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(97861);
    this.a = paramString1;
    this.b = paramString2;
    this.d = a(paramArrayOfString);
    this.c = paramInt;
    AppMethodBeat.o(97861);
  }

  private String[] a(String[] paramArrayOfString)
  {
    AppMethodBeat.i(97862);
    if (paramArrayOfString == null)
    {
      paramArrayOfString = null;
      AppMethodBeat.o(97862);
    }
    while (true)
    {
      return paramArrayOfString;
      String[] arrayOfString = new String[paramArrayOfString.length];
      System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, arrayOfString.length);
      AppMethodBeat.o(97862);
      paramArrayOfString = arrayOfString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.element.c
 * JD-Core Version:    0.6.2
 */