package com.tencent.mm.modelmulti;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class l$1 extends BroadcastReceiver
{
  l$1(l paraml, l.a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(78414);
    if (paramIntent == null)
    {
      paramIntent = "";
      ab.i("MicroMsg.ScreenState", "ScreenReceiver action [%s] ", new Object[] { paramIntent });
      if (!"android.intent.action.SCREEN_OFF".equals(paramIntent))
        break label98;
    }
    label98: for (this.fIZ.fIW = Boolean.FALSE; ; this.fIZ.fIW = Boolean.TRUE)
    {
      if (this.fIX != null)
        this.fIX.cO(this.fIZ.fIW.booleanValue());
      if (this.fIY)
        paramContext.unregisterReceiver(this);
      AppMethodBeat.o(78414);
      return;
      paramIntent = paramIntent.getAction();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.l.1
 * JD-Core Version:    0.6.2
 */