package com.tencent.mm.sandbox.monitor;

import java.io.File;
import java.io.FilenameFilter;

final class a$1
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    return paramString.endsWith(".crashlog");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.a.1
 * JD-Core Version:    0.6.2
 */