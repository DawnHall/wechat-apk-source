package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;

public class JsError
{
  private final IX5JsError a;

  protected JsError(IX5JsError paramIX5JsError)
  {
    this.a = paramIX5JsError;
  }

  public String getMessage()
  {
    AppMethodBeat.i(63927);
    String str = this.a.getMessage();
    AppMethodBeat.o(63927);
    return str;
  }

  public String getStack()
  {
    AppMethodBeat.i(63928);
    String str = this.a.getStack();
    AppMethodBeat.o(63928);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.JsError
 * JD-Core Version:    0.6.2
 */