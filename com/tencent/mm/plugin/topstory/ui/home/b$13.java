package com.tencent.mm.plugin.topstory.ui.home;

import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class b$13 extends p
{
  b$13(b paramb)
  {
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(1595);
    ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "destroyItem pos:%s, v:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramObject.hashCode()) });
    paramViewGroup.removeView((View)paramObject);
    AppMethodBeat.o(1595);
  }

  public final int getCount()
  {
    AppMethodBeat.i(1593);
    int i = this.sCf.sBO.size();
    AppMethodBeat.o(1593);
    return i;
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(1594);
    ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "instantiateItem pos:%s, v:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(((b.a)this.sCf.rsl.get(paramInt)).sCu.hashCode()) });
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    paramViewGroup.addView(((b.a)this.sCf.rsl.get(paramInt)).sCu, localLayoutParams);
    paramViewGroup = ((b.a)this.sCf.rsl.get(paramInt)).sCu;
    AppMethodBeat.o(1594);
    return paramViewGroup;
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.13
 * JD-Core Version:    0.6.2
 */