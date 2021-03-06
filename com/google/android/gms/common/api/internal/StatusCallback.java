package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

@KeepForSdk
public class StatusCallback extends IStatusCallback.Stub
{

  @KeepForSdk
  private final BaseImplementation.ResultHolder<Status> mResultHolder;

  @KeepForSdk
  public StatusCallback(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.mResultHolder = paramResultHolder;
  }

  @KeepForSdk
  public void onResult(Status paramStatus)
  {
    AppMethodBeat.i(60662);
    this.mResultHolder.setResult(paramStatus);
    AppMethodBeat.o(60662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.StatusCallback
 * JD-Core Version:    0.6.2
 */