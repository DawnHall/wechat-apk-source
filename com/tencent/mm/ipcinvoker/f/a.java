package com.tencent.mm.ipcinvoker.f;

import android.os.IBinder.DeathRecipient;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements IBinder.DeathRecipient
{
  private String process;

  public a(String paramString)
  {
    this.process = paramString;
  }

  public final void binderDied()
  {
    AppMethodBeat.i(114109);
    com.tencent.mm.ipcinvoker.h.b.i("IPC.DeathRecipientImpl", "binderDied(%s)", new Object[] { this.process });
    if ((this.process == null) || (this.process.length() == 0))
      AppMethodBeat.o(114109);
    while (true)
    {
      return;
      b.lk(this.process);
      AppMethodBeat.o(114109);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.f.a
 * JD-Core Version:    0.6.2
 */