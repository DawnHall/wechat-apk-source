package com.google.android.gms.internal.firebase_messaging;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzj
{
  private final ConcurrentHashMap<zzk, List<Throwable>> zzh;
  private final ReferenceQueue<Throwable> zzi;

  zzj()
  {
    AppMethodBeat.i(108681);
    this.zzh = new ConcurrentHashMap(16, 0.75F, 10);
    this.zzi = new ReferenceQueue();
    AppMethodBeat.o(108681);
  }

  public final List<Throwable> zza(Throwable paramThrowable, boolean paramBoolean)
  {
    AppMethodBeat.i(108682);
    for (Object localObject = this.zzi.poll(); localObject != null; localObject = this.zzi.poll())
      this.zzh.remove(localObject);
    localObject = new zzk(paramThrowable, null);
    localObject = (List)this.zzh.get(localObject);
    if (localObject != null)
    {
      AppMethodBeat.o(108682);
      paramThrowable = (Throwable)localObject;
    }
    while (true)
    {
      return paramThrowable;
      localObject = new Vector(2);
      paramThrowable = (List)this.zzh.putIfAbsent(new zzk(paramThrowable, this.zzi), localObject);
      if (paramThrowable == null)
      {
        AppMethodBeat.o(108682);
        paramThrowable = (Throwable)localObject;
      }
      else
      {
        AppMethodBeat.o(108682);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.firebase_messaging.zzj
 * JD-Core Version:    0.6.2
 */