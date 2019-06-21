package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

abstract class zzem
{
  private static volatile Handler handler;
  private final zzhi zzafj;
  private final Runnable zzyd;
  private volatile long zzye;

  zzem(zzhi paramzzhi)
  {
    Preconditions.checkNotNull(paramzzhi);
    this.zzafj = paramzzhi;
    this.zzyd = new zzen(this, paramzzhi);
  }

  private final Handler getHandler()
  {
    Handler localHandler;
    if (handler != null)
      localHandler = handler;
    while (true)
    {
      return localHandler;
      try
      {
        if (handler == null)
        {
          localHandler = new android/os/Handler;
          localHandler.<init>(this.zzafj.getContext().getMainLooper());
          handler = localHandler;
        }
        localHandler = handler;
      }
      finally
      {
      }
    }
  }

  final void cancel()
  {
    this.zzye = 0L;
    getHandler().removeCallbacks(this.zzyd);
  }

  public abstract void run();

  public final boolean zzef()
  {
    if (this.zzye != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void zzh(long paramLong)
  {
    cancel();
    if (paramLong >= 0L)
    {
      this.zzye = this.zzafj.zzbt().currentTimeMillis();
      if (!getHandler().postDelayed(this.zzyd, paramLong))
        this.zzafj.zzge().zzim().zzg("Failed to schedule delayed post. time", Long.valueOf(paramLong));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzem
 * JD-Core Version:    0.6.2
 */