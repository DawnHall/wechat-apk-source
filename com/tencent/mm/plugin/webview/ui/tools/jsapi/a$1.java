package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

final class a$1 extends HashSet<String>
{
  a$1()
  {
    AppMethodBeat.i(8850);
    add("application/msword");
    add("application/vnd.ms-powerpoint");
    add("application/vnd.ms-excel");
    add("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
    add("application/vnd.openxmlformats-officedocument.presentationml.presentation");
    add("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    add("application/kswps");
    add("application/kset");
    add("application/ksdps");
    add("application/pdf");
    add("text/plain");
    AppMethodBeat.o(8850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.a.1
 * JD-Core Version:    0.6.2
 */