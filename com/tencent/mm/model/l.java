package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.be;

public final class l
{
  public static int Yv()
  {
    AppMethodBeat.i(16271);
    if (!g.RK())
    {
      ab.w("MicroMsg.BottleConversationLogic", "get Bottle Total Conversation Unread, but has not set uin");
      AppMethodBeat.o(16271);
      i = 0;
      return i;
    }
    Cursor localCursor = ((j)g.K(j.class)).XR().dsS();
    if ((localCursor != null) && (localCursor.getCount() > 0))
      localCursor.moveToFirst();
    for (int i = localCursor.getInt(0); ; i = 0)
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(16271);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.l
 * JD-Core Version:    0.6.2
 */