package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$5
  implements Animator.AnimatorListener
{
  b$5(b paramb)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.uCL.isAnimating = false;
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(8579);
    this.uCL.isAnimating = false;
    if (this.uCL.uCy != null)
      this.uCL.uCy.onAnimationEnd();
    AppMethodBeat.o(8579);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(8578);
    this.uCL.isAnimating = true;
    if (this.uCL.uCy != null)
      this.uCL.uCy.onAnimationStart();
    AppMethodBeat.o(8578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.b.5
 * JD-Core Version:    0.6.2
 */