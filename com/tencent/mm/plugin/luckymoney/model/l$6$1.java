package com.tencent.mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.luckymoney.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

final class l$6$1
  implements Runnable
{
  l$6$1(l.6 param6, int paramInt, Bitmap paramBitmap, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42307);
    int i;
    if (this.nWE > 0)
    {
      i = ((Integer)this.nXz.lvs.getTag(2131820638)).intValue();
      if (i == this.nWE)
      {
        this.nXz.lvs.setImageBitmap(d.a(this.val$bitmap, false, a.fromDPToPix(ah.getContext(), 8)));
        if (this.nXz.nXy == null)
          break label123;
        this.nXz.nXy.iH(true);
        AppMethodBeat.o(42307);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss subtype: %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(this.nWE) });
      label123: AppMethodBeat.o(42307);
      continue;
      String str = (String)this.nXz.lvs.getTag(2131820639);
      if ((!bo.isNullOrNil(this.val$url)) && (this.val$url.equals(str)))
      {
        this.nXz.lvs.setImageBitmap(d.a(this.val$bitmap, false, a.fromDPToPix(ah.getContext(), 8)));
        if (this.nXz.nXy != null)
        {
          this.nXz.nXy.iH(true);
          AppMethodBeat.o(42307);
        }
      }
      else
      {
        ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", new Object[] { str, this.val$url });
        AppMethodBeat.o(42307);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.l.6.1
 * JD-Core Version:    0.6.2
 */