package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.z.c.e.a;

final class a$1
  implements e.a
{
  public final void I(String paramString, int paramInt)
  {
    AppMethodBeat.i(10803);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", paramString);
    localBundle.putInt("status", paramInt);
    f.a("com.tencent.mm", localBundle, a.a.class, null);
    AppMethodBeat.o(10803);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.debugger.a.1
 * JD-Core Version:    0.6.2
 */