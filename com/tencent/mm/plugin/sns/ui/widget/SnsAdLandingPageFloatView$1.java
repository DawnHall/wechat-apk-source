package com.tencent.mm.plugin.sns.ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class SnsAdLandingPageFloatView$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public SnsAdLandingPageFloatView$1(SnsAdLandingPageFloatView paramSnsAdLandingPageFloatView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40438);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    SnsAdLandingPageFloatView.a(this.rMI).setScaleX(f);
    SnsAdLandingPageFloatView.a(this.rMI).setScaleY(f);
    AppMethodBeat.o(40438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.1
 * JD-Core Version:    0.6.2
 */