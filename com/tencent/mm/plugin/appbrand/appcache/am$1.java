package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;

final class am$1
  implements FilenameFilter
{
  am$1(am paramam, String paramString)
  {
  }

  public final boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(59480);
    boolean bool = paramString.endsWith("_" + this.val$appId);
    AppMethodBeat.o(59480);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.am.1
 * JD-Core Version:    0.6.2
 */