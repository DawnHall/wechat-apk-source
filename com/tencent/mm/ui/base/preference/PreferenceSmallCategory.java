package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PreferenceSmallCategory extends PreferenceCategory
{
  public PreferenceSmallCategory(Context paramContext)
  {
    this(paramContext, null);
  }

  public PreferenceSmallCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PreferenceSmallCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107283);
    setLayoutResource(2130970178);
    AppMethodBeat.o(107283);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.PreferenceSmallCategory
 * JD-Core Version:    0.6.2
 */