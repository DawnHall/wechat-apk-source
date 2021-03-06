package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

public class zzi extends zzk
{
  private final SparseArray<zza> zzed;

  private zzi(LifecycleFragment paramLifecycleFragment)
  {
    super(paramLifecycleFragment);
    AppMethodBeat.i(60926);
    this.zzed = new SparseArray();
    this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    AppMethodBeat.o(60926);
  }

  public static zzi zza(LifecycleActivity paramLifecycleActivity)
  {
    AppMethodBeat.i(60925);
    LifecycleFragment localLifecycleFragment = getFragment(paramLifecycleActivity);
    paramLifecycleActivity = (zzi)localLifecycleFragment.getCallbackOrNull("AutoManageHelper", zzi.class);
    if (paramLifecycleActivity != null)
      AppMethodBeat.o(60925);
    while (true)
    {
      return paramLifecycleActivity;
      paramLifecycleActivity = new zzi(localLifecycleFragment);
      AppMethodBeat.o(60925);
    }
  }

  private final zza zzd(int paramInt)
  {
    AppMethodBeat.i(60934);
    zza localzza;
    if (this.zzed.size() <= paramInt)
    {
      localzza = null;
      AppMethodBeat.o(60934);
    }
    while (true)
    {
      return localzza;
      localzza = (zza)this.zzed.get(this.zzed.keyAt(paramInt));
      AppMethodBeat.o(60934);
    }
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    AppMethodBeat.i(60931);
    for (int i = 0; i < this.zzed.size(); i++)
    {
      zza localzza = zzd(i);
      if (localzza != null)
      {
        paramPrintWriter.append(paramString).append("GoogleApiClient #").print(localzza.zzee);
        paramPrintWriter.println(":");
        localzza.zzef.dump(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    AppMethodBeat.o(60931);
  }

  public final void onStart()
  {
    AppMethodBeat.i(60929);
    super.onStart();
    boolean bool = this.mStarted;
    Object localObject = String.valueOf(this.zzed);
    new StringBuilder(String.valueOf(localObject).length() + 14).append("onStart ").append(bool).append(" ").append((String)localObject);
    if (this.zzer.get() == null)
      for (int i = 0; i < this.zzed.size(); i++)
      {
        localObject = zzd(i);
        if (localObject != null)
          ((zza)localObject).zzef.connect();
      }
    AppMethodBeat.o(60929);
  }

  public void onStop()
  {
    AppMethodBeat.i(60930);
    super.onStop();
    for (int i = 0; i < this.zzed.size(); i++)
    {
      zza localzza = zzd(i);
      if (localzza != null)
        localzza.zzef.disconnect();
    }
    AppMethodBeat.o(60930);
  }

  public final void zza(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    AppMethodBeat.i(60927);
    Preconditions.checkNotNull(paramGoogleApiClient, "GoogleApiClient instance cannot be null");
    if (this.zzed.indexOfKey(paramInt) < 0);
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool, 54 + "Already managing a GoogleApiClient with id " + paramInt);
      zzl localzzl = (zzl)this.zzer.get();
      bool = this.mStarted;
      String str = String.valueOf(localzzl);
      new StringBuilder(String.valueOf(str).length() + 49).append("starting AutoManage for client ").append(paramInt).append(" ").append(bool).append(" ").append(str);
      paramOnConnectionFailedListener = new zza(paramInt, paramGoogleApiClient, paramOnConnectionFailedListener);
      this.zzed.put(paramInt, paramOnConnectionFailedListener);
      if ((this.mStarted) && (localzzl == null))
      {
        paramOnConnectionFailedListener = String.valueOf(paramGoogleApiClient);
        new StringBuilder(String.valueOf(paramOnConnectionFailedListener).length() + 11).append("connecting ").append(paramOnConnectionFailedListener);
        paramGoogleApiClient.connect();
      }
      AppMethodBeat.o(60927);
      return;
    }
  }

  protected final void zza(ConnectionResult paramConnectionResult, int paramInt)
  {
    AppMethodBeat.i(60932);
    if (paramInt < 0)
    {
      Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
      AppMethodBeat.o(60932);
    }
    while (true)
    {
      return;
      Object localObject = (zza)this.zzed.get(paramInt);
      if (localObject != null)
      {
        zzc(paramInt);
        localObject = ((zza)localObject).zzeg;
        if (localObject != null)
          ((GoogleApiClient.OnConnectionFailedListener)localObject).onConnectionFailed(paramConnectionResult);
      }
      AppMethodBeat.o(60932);
    }
  }

  public final void zzc(int paramInt)
  {
    AppMethodBeat.i(60928);
    zza localzza = (zza)this.zzed.get(paramInt);
    this.zzed.remove(paramInt);
    if (localzza != null)
    {
      localzza.zzef.unregisterConnectionFailedListener(localzza);
      localzza.zzef.disconnect();
    }
    AppMethodBeat.o(60928);
  }

  protected final void zzr()
  {
    AppMethodBeat.i(60933);
    for (int i = 0; i < this.zzed.size(); i++)
    {
      zza localzza = zzd(i);
      if (localzza != null)
        localzza.zzef.connect();
    }
    AppMethodBeat.o(60933);
  }

  final class zza
    implements GoogleApiClient.OnConnectionFailedListener
  {
    public final int zzee;
    public final GoogleApiClient zzef;
    public final GoogleApiClient.OnConnectionFailedListener zzeg;

    public zza(int paramGoogleApiClient, GoogleApiClient paramOnConnectionFailedListener, GoogleApiClient.OnConnectionFailedListener arg4)
    {
      AppMethodBeat.i(60923);
      this.zzee = paramGoogleApiClient;
      this.zzef = paramOnConnectionFailedListener;
      Object localObject;
      this.zzeg = localObject;
      paramOnConnectionFailedListener.registerConnectionFailedListener(this);
      AppMethodBeat.o(60923);
    }

    public final void onConnectionFailed(ConnectionResult paramConnectionResult)
    {
      AppMethodBeat.i(60924);
      String str = String.valueOf(paramConnectionResult);
      new StringBuilder(String.valueOf(str).length() + 27).append("beginFailureResolution for ").append(str);
      zzi.this.zzb(paramConnectionResult, this.zzee);
      AppMethodBeat.o(60924);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzi
 * JD-Core Version:    0.6.2
 */