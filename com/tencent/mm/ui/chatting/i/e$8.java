package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$8 extends RecyclerView.h
{
  e$8(e parame, Context paramContext)
  {
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(32567);
    int i = (int)this.val$context.getResources().getDimension(2131427815);
    paramRect.bottom = i;
    paramRect.top = i;
    paramRect.left = i;
    paramRect.right = i;
    AppMethodBeat.o(32567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.8
 * JD-Core Version:    0.6.2
 */