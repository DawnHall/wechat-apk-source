package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShuffleView$6
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$6(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42231);
    if (ShuffleView.z(this.nWl) != null)
      ShuffleView.z(this.nWl).a(paramValueAnimator, ShuffleView.w(this.nWl));
    AppMethodBeat.o(42231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.6
 * JD-Core Version:    0.6.2
 */