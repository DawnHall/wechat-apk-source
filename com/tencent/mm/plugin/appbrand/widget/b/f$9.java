package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class f$9
  implements View.OnClickListener
{
  public f$9(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134261);
    ab.i(f.TAG, "user clicked dialog outside");
    f.a(this.jck, false);
    this.jck.dismiss();
    AppMethodBeat.o(134261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.9
 * JD-Core Version:    0.6.2
 */