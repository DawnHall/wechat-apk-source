package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.tools.f.a;

final class WebViewInputFooter$4
  implements View.OnClickListener
{
  WebViewInputFooter$4(WebViewInputFooter paramWebViewInputFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(10081);
    paramView = c.d(WebViewInputFooter.d(this.uKx)).PM(WebViewInputFooter.l(this.uKx));
    paramView.jeZ = f.a.zFu;
    paramView.zIx = true;
    paramView.a(new WebViewInputFooter.4.1(this));
    AppMethodBeat.o(10081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.4
 * JD-Core Version:    0.6.2
 */