package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzwo extends ContentObserver
{
  zzwo(Handler paramHandler)
  {
    super(null);
  }

  public final void onChange(boolean paramBoolean)
  {
    AppMethodBeat.i(69752);
    zzwn.zzrs().set(true);
    AppMethodBeat.o(69752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzwo
 * JD-Core Version:    0.6.2
 */