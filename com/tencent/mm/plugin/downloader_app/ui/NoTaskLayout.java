package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.c.a.a.f;

public class NoTaskLayout extends RelativeLayout
{
  private BottomEntranceView kQq;

  public NoTaskLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(136253);
    super.onFinishInflate();
    this.kQq = ((BottomEntranceView)findViewById(2131826358));
    AppMethodBeat.o(136253);
  }

  public void setData(f paramf)
  {
    AppMethodBeat.i(136254);
    this.kQq.setData(paramf);
    AppMethodBeat.o(136254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.NoTaskLayout
 * JD-Core Version:    0.6.2
 */