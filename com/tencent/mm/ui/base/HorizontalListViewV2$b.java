package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(11)
final class HorizontalListViewV2$b
{
  static
  {
    AppMethodBeat.i(106338);
    if (Build.VERSION.SDK_INT < 11)
    {
      RuntimeException localRuntimeException = new RuntimeException("sdk is >= 11!");
      AppMethodBeat.o(106338);
      throw localRuntimeException;
    }
    AppMethodBeat.o(106338);
  }

  public static void a(Scroller paramScroller)
  {
    AppMethodBeat.i(106337);
    if (paramScroller != null)
      paramScroller.setFriction(0.009F);
    AppMethodBeat.o(106337);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListViewV2.b
 * JD-Core Version:    0.6.2
 */