package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.sport.a.d;

final class a$4
  implements View.OnClickListener
{
  a$4(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20005);
    d.kT(8);
    paramView = new AppBrandStatObject();
    paramView.scene = 1063;
    ((e)g.K(e.class)).a(a.b(this.lBA), null, "wx3fca79fc5715b185", 0, 0, "", paramView);
    AppMethodBeat.o(20005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.a.4
 * JD-Core Version:    0.6.2
 */