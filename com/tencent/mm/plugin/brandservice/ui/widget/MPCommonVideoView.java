package com.tencent.mm.plugin.brandservice.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.sdk.platformtools.ak;

public class MPCommonVideoView extends CommonVideoView
{
  public MPCommonVideoView(Context paramContext)
  {
    super(paramContext);
  }

  public MPCommonVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MPCommonVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void gR(long paramLong)
  {
    AppMethodBeat.i(138057);
    super.gR(paramLong);
    this.fbD.postDelayed(new MPCommonVideoView.1(this), paramLong);
    AppMethodBeat.o(138057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPCommonVideoView
 * JD-Core Version:    0.6.2
 */