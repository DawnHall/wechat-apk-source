package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;

final class r$5
  implements f.a
{
  r$5(r paramr)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37208);
    if (this.rbn.mOX.getVisibility() == 0)
      this.rbn.mOX.setImageBitmap(MMBitmapFactory.decodeFile(paramString));
    AppMethodBeat.o(37208);
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r.5
 * JD-Core Version:    0.6.2
 */