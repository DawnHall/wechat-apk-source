package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/ui/collection/AppBrandLauncherCollectionList$onViewCreated$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "plugin-appbrand-integration_release"})
public final class AppBrandLauncherCollectionList$f
  implements ViewTreeObserver.OnPreDrawListener
{
  public final boolean onPreDraw()
  {
    AppMethodBeat.i(135057);
    Object localObject = AppBrandLauncherCollectionList.b(this.iLx);
    if (localObject != null)
    {
      localObject = ((i)localObject).getViewTreeObserver();
      if (localObject != null)
        ((ViewTreeObserver)localObject).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
    }
    AppBrandLauncherCollectionList.c(this.iLx);
    AppMethodBeat.o(135057);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.f
 * JD-Core Version:    0.6.2
 */