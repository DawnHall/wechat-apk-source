package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class zzac
  implements OnCompleteListener<TResult>
{
  zzac(zzaa paramzzaa, TaskCompletionSource paramTaskCompletionSource)
  {
  }

  public final void onComplete(Task<TResult> paramTask)
  {
    AppMethodBeat.i(60684);
    zzaa.zzb(this.zzgz).remove(this.zzha);
    AppMethodBeat.o(60684);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzac
 * JD-Core Version:    0.6.2
 */