package com.tencent.mm.plugin.appbrand.widget.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class e$4 extends AnimatorListenerAdapter
{
  e$4(e parame, View paramView, j paramj)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(77407);
    onAnimationEnd(paramAnimator);
    AppMethodBeat.o(77407);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(77408);
    this.jcb.setVisibility(8);
    e.b(this.jbZ).remove(this.jca);
    e.c(this.jbZ);
    this.jbZ.post(new e.4.1(this));
    AppMethodBeat.o(77408);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.e.4
 * JD-Core Version:    0.6.2
 */