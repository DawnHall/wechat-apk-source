package com.tencent.mm.plugin.luckymoney.model;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class x$1
  implements Animation.AnimationListener
{
  x$1(View paramView, ScaleAnimation paramScaleAnimation)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(42355);
    this.krT.startAnimation(this.krU);
    AppMethodBeat.o(42355);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.x.1
 * JD-Core Version:    0.6.2
 */