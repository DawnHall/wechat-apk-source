package com.google.android.gms.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;

final class zza
  implements OnDelegateCreatedListener<T>
{
  zza(DeferredLifecycleHelper paramDeferredLifecycleHelper)
  {
  }

  public final void onDelegateCreated(T paramT)
  {
    AppMethodBeat.i(61635);
    DeferredLifecycleHelper.zza(this.zzabg, paramT);
    paramT = DeferredLifecycleHelper.zza(this.zzabg).iterator();
    while (paramT.hasNext())
      ((DeferredLifecycleHelper.zza)paramT.next()).zza(DeferredLifecycleHelper.zzb(this.zzabg));
    DeferredLifecycleHelper.zza(this.zzabg).clear();
    DeferredLifecycleHelper.zza(this.zzabg, null);
    AppMethodBeat.o(61635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.zza
 * JD-Core Version:    0.6.2
 */