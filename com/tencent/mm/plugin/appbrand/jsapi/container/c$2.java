package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2
  implements ValueAnimator.AnimatorUpdateListener
{
  c$2(c paramc, View paramView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(126282);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.val$view.setY(f);
    AppMethodBeat.o(126282);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.container.c.2
 * JD-Core Version:    0.6.2
 */