package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgh
  implements BaseImplementation.ResultHolder<Status>
{
  private final TaskCompletionSource<Void> zzes;

  zzgh(TaskCompletionSource<Void> paramTaskCompletionSource)
  {
    this.zzes = paramTaskCompletionSource;
  }

  public final void setFailedResult(Status paramStatus)
  {
    AppMethodBeat.i(71367);
    this.zzes.setException(new ApiException(paramStatus));
    AppMethodBeat.o(71367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgh
 * JD-Core Version:    0.6.2
 */