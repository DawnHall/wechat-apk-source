package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzch<R extends Result> extends TransformedResult<R>
  implements ResultCallback<R>
{
  private final Object zzfa;
  private final WeakReference<GoogleApiClient> zzfc;
  private ResultTransform<? super R, ? extends Result> zzmd;
  private zzch<? extends Result> zzme;
  private volatile ResultCallbacks<? super R> zzmf;
  private PendingResult<R> zzmg;
  private Status zzmh;
  private final zzcj zzmi;
  private boolean zzmj;

  public zzch(WeakReference<GoogleApiClient> paramWeakReference)
  {
    AppMethodBeat.i(60877);
    this.zzmd = null;
    this.zzme = null;
    this.zzmf = null;
    this.zzmg = null;
    this.zzfa = new Object();
    this.zzmh = null;
    this.zzmj = false;
    Preconditions.checkNotNull(paramWeakReference, "GoogleApiClient reference must not be null");
    this.zzfc = paramWeakReference;
    paramWeakReference = (GoogleApiClient)this.zzfc.get();
    if (paramWeakReference != null);
    for (paramWeakReference = paramWeakReference.getLooper(); ; paramWeakReference = Looper.getMainLooper())
    {
      this.zzmi = new zzcj(this, paramWeakReference);
      AppMethodBeat.o(60877);
      return;
    }
  }

  private static void zzb(Result paramResult)
  {
    AppMethodBeat.i(60886);
    if ((paramResult instanceof Releasable));
    while (true)
    {
      try
      {
        ((Releasable)paramResult).release();
        AppMethodBeat.o(60886);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        paramResult = String.valueOf(paramResult);
        new StringBuilder(String.valueOf(paramResult).length() + 18).append("Unable to release ").append(paramResult);
      }
      AppMethodBeat.o(60886);
    }
  }

  @GuardedBy("mSyncToken")
  private final void zzcb()
  {
    AppMethodBeat.i(60882);
    if ((this.zzmd == null) && (this.zzmf == null))
      AppMethodBeat.o(60882);
    while (true)
    {
      return;
      GoogleApiClient localGoogleApiClient = (GoogleApiClient)this.zzfc.get();
      if ((!this.zzmj) && (this.zzmd != null) && (localGoogleApiClient != null))
      {
        localGoogleApiClient.zza(this);
        this.zzmj = true;
      }
      if (this.zzmh != null)
      {
        zze(this.zzmh);
        AppMethodBeat.o(60882);
      }
      else
      {
        if (this.zzmg != null)
          this.zzmg.setResultCallback(this);
        AppMethodBeat.o(60882);
      }
    }
  }

  @GuardedBy("mSyncToken")
  private final boolean zzcd()
  {
    AppMethodBeat.i(60885);
    GoogleApiClient localGoogleApiClient = (GoogleApiClient)this.zzfc.get();
    boolean bool;
    if ((this.zzmf != null) && (localGoogleApiClient != null))
    {
      bool = true;
      AppMethodBeat.o(60885);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60885);
    }
  }

  private final void zzd(Status paramStatus)
  {
    AppMethodBeat.i(60883);
    synchronized (this.zzfa)
    {
      this.zzmh = paramStatus;
      zze(this.zzmh);
      AppMethodBeat.o(60883);
      return;
    }
  }

  private final void zze(Status paramStatus)
  {
    AppMethodBeat.i(60884);
    synchronized (this.zzfa)
    {
      if (this.zzmd != null)
      {
        paramStatus = this.zzmd.onFailure(paramStatus);
        Preconditions.checkNotNull(paramStatus, "onFailure must not return null");
        this.zzme.zzd(paramStatus);
      }
      while (!zzcd())
      {
        AppMethodBeat.o(60884);
        return;
      }
      this.zzmf.onFailure(paramStatus);
    }
  }

  public final void andFinally(ResultCallbacks<? super R> paramResultCallbacks)
  {
    boolean bool1 = true;
    AppMethodBeat.i(60879);
    synchronized (this.zzfa)
    {
      if (this.zzmf == null);
      for (boolean bool2 = true; ; bool2 = false)
      {
        Preconditions.checkState(bool2, "Cannot call andFinally() twice.");
        if (this.zzmd != null)
          break;
        bool2 = bool1;
        Preconditions.checkState(bool2, "Cannot call then() and andFinally() on the same TransformedResult.");
        this.zzmf = paramResultCallbacks;
        zzcb();
        AppMethodBeat.o(60879);
        return;
      }
      bool2 = false;
    }
  }

  public final void onResult(R paramR)
  {
    AppMethodBeat.i(60880);
    while (true)
    {
      synchronized (this.zzfa)
      {
        if (paramR.getStatus().isSuccess())
        {
          if (this.zzmd != null)
          {
            ExecutorService localExecutorService = zzbw.zzbe();
            zzci localzzci = new com/google/android/gms/common/api/internal/zzci;
            localzzci.<init>(this, paramR);
            localExecutorService.submit(localzzci);
            AppMethodBeat.o(60880);
            return;
          }
          if (!zzcd())
            continue;
          this.zzmf.onSuccess(paramR);
        }
      }
      zzd(paramR.getStatus());
      zzb(paramR);
    }
  }

  public final <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    boolean bool1 = true;
    AppMethodBeat.i(60878);
    synchronized (this.zzfa)
    {
      if (this.zzmd == null);
      for (boolean bool2 = true; ; bool2 = false)
      {
        Preconditions.checkState(bool2, "Cannot call then() twice.");
        if (this.zzmf != null)
          break;
        bool2 = bool1;
        Preconditions.checkState(bool2, "Cannot call then() and andFinally() on the same TransformedResult.");
        this.zzmd = paramResultTransform;
        paramResultTransform = new com/google/android/gms/common/api/internal/zzch;
        paramResultTransform.<init>(this.zzfc);
        this.zzme = paramResultTransform;
        zzcb();
        AppMethodBeat.o(60878);
        return paramResultTransform;
      }
      bool2 = false;
    }
  }

  public final void zza(PendingResult<?> paramPendingResult)
  {
    AppMethodBeat.i(60881);
    synchronized (this.zzfa)
    {
      this.zzmg = paramPendingResult;
      zzcb();
      AppMethodBeat.o(60881);
      return;
    }
  }

  final void zzcc()
  {
    this.zzmf = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzch
 * JD-Core Version:    0.6.2
 */