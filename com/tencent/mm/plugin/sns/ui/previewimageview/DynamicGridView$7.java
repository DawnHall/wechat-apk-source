package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

final class DynamicGridView$7
  implements TypeEvaluator<Rect>
{
  DynamicGridView$7(DynamicGridView paramDynamicGridView)
  {
  }

  private static int e(int paramInt1, int paramInt2, float paramFloat)
  {
    return (int)(paramInt1 + (paramInt2 - paramInt1) * paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.7
 * JD-Core Version:    0.6.2
 */