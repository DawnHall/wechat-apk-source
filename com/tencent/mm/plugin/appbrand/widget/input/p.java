package com.tencent.mm.plugin.appbrand.widget.input;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.tools.f.a;
import java.lang.ref.WeakReference;

public final class p extends c
{
  private p(WeakReference<EditText> paramWeakReference)
  {
    super(paramWeakReference);
  }

  public static p a(EditText paramEditText)
  {
    AppMethodBeat.i(123696);
    paramEditText = new p(new WeakReference(paramEditText));
    AppMethodBeat.o(123696);
    return paramEditText;
  }

  public final f a(int paramInt, f.a parama)
  {
    AppMethodBeat.i(123697);
    parama = new p.b(this, paramInt, parama);
    AppMethodBeat.o(123697);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.p
 * JD-Core Version:    0.6.2
 */