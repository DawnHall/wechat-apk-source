package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.SignInResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzca
  implements Runnable
{
  zzca(zzby paramzzby, SignInResponse paramSignInResponse)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60874);
    zzby.zza(this.zzlx, this.zzid);
    AppMethodBeat.o(60874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzca
 * JD-Core Version:    0.6.2
 */