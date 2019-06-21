package com.google.android.gms.internal.auth_api_phone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth-api-phone.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzm extends TaskApiCall<zzi, Void>
{
  private TaskCompletionSource<Void> zzf;

  protected abstract void zza(zze paramzze);

  protected final void zzb(Status paramStatus)
  {
    TaskUtil.setResultOrApiException(paramStatus, this.zzf);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzm
 * JD-Core Version:    0.6.2
 */