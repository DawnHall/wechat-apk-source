package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WrappingGridView extends GridView
{
  public WrappingGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public WrappingGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40413);
    if (getLayoutParams().height == -2)
      paramInt2 = View.MeasureSpec.makeMeasureSpec(536870911, -2147483648);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(40413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView
 * JD-Core Version:    0.6.2
 */