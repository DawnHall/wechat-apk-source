package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class AccountTransferClient$zze<T> extends TaskApiCall<zzx, T>
{
  private TaskCompletionSource<T> zzbh;

  protected final void setResult(T paramT)
  {
    this.zzbh.setResult(paramT);
  }

  protected final void zzd(Status paramStatus)
  {
    AccountTransferClient.zze(this.zzbh, paramStatus);
  }

  protected abstract void zzd(zzac paramzzac);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze
 * JD-Core Version:    0.6.2
 */