package com.tencent.mm.plugin.story.ui.view;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CommentsContainer$c
  implements View.OnClickListener
{
  CommentsContainer$c(CommentsContainer paramCommentsContainer)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138894);
    paramView = this.siQ.getItemClickListener();
    if (paramView != null)
    {
      paramView.invoke();
      AppMethodBeat.o(138894);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138894);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CommentsContainer.c
 * JD-Core Version:    0.6.2
 */