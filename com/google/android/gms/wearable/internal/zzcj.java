package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.DataClient.GetFdForAssetResponse;
import com.google.android.gms.wearable.DataClient.OnDataChangedListener;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzcj extends DataClient
{
  private final DataApi zzdi;

  public zzcj(Activity paramActivity, GoogleApi.Settings paramSettings)
  {
    super(paramActivity, paramSettings);
    AppMethodBeat.i(71141);
    this.zzdi = new zzbw();
    AppMethodBeat.o(71141);
  }

  public zzcj(Context paramContext, GoogleApi.Settings paramSettings)
  {
    super(paramContext, paramSettings);
    AppMethodBeat.i(71140);
    this.zzdi = new zzbw();
    AppMethodBeat.o(71140);
  }

  private final Task<Void> zza(DataClient.OnDataChangedListener paramOnDataChangedListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    AppMethodBeat.i(71153);
    ListenerHolder localListenerHolder = ListenerHolders.createListenerHolder(paramOnDataChangedListener, getLooper(), "DataListener");
    paramOnDataChangedListener = doRegisterEventListener(new zzcv(paramOnDataChangedListener, paramArrayOfIntentFilter, localListenerHolder, null), new zzcw(paramOnDataChangedListener, localListenerHolder.getListenerKey(), null));
    AppMethodBeat.o(71153);
    return paramOnDataChangedListener;
  }

  public final Task<Void> addListener(DataClient.OnDataChangedListener paramOnDataChangedListener)
  {
    AppMethodBeat.i(71151);
    paramOnDataChangedListener = zza(paramOnDataChangedListener, new IntentFilter[] { zzgj.zzc("com.google.android.gms.wearable.DATA_CHANGED") });
    AppMethodBeat.o(71151);
    return paramOnDataChangedListener;
  }

  public final Task<Void> addListener(DataClient.OnDataChangedListener paramOnDataChangedListener, Uri paramUri, int paramInt)
  {
    AppMethodBeat.i(71152);
    Asserts.checkNotNull(paramUri, "uri must not be null");
    if ((paramInt == 0) || (paramInt == 1));
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkArgument(bool, "invalid filter type");
      paramOnDataChangedListener = zza(paramOnDataChangedListener, new IntentFilter[] { zzgj.zza("com.google.android.gms.wearable.DATA_CHANGED", paramUri, paramInt) });
      AppMethodBeat.o(71152);
      return paramOnDataChangedListener;
    }
  }

  public final Task<Integer> deleteDataItems(Uri paramUri)
  {
    AppMethodBeat.i(71147);
    paramUri = PendingResultUtil.toTask(this.zzdi.deleteDataItems(asGoogleApiClient(), paramUri), zzcp.zzbx);
    AppMethodBeat.o(71147);
    return paramUri;
  }

  public final Task<Integer> deleteDataItems(Uri paramUri, int paramInt)
  {
    AppMethodBeat.i(71148);
    paramUri = PendingResultUtil.toTask(this.zzdi.deleteDataItems(asGoogleApiClient(), paramUri, paramInt), zzcq.zzbx);
    AppMethodBeat.o(71148);
    return paramUri;
  }

  public final Task<DataItem> getDataItem(Uri paramUri)
  {
    AppMethodBeat.i(71143);
    paramUri = PendingResultUtil.toTask(this.zzdi.getDataItem(asGoogleApiClient(), paramUri), zzcl.zzbx);
    AppMethodBeat.o(71143);
    return paramUri;
  }

  public final Task<DataItemBuffer> getDataItems()
  {
    AppMethodBeat.i(71144);
    Task localTask = PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient()), zzcm.zzbx);
    AppMethodBeat.o(71144);
    return localTask;
  }

  public final Task<DataItemBuffer> getDataItems(Uri paramUri)
  {
    AppMethodBeat.i(71145);
    paramUri = PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient(), paramUri), zzcn.zzbx);
    AppMethodBeat.o(71145);
    return paramUri;
  }

  public final Task<DataItemBuffer> getDataItems(Uri paramUri, int paramInt)
  {
    AppMethodBeat.i(71146);
    paramUri = PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient(), paramUri, paramInt), zzco.zzbx);
    AppMethodBeat.o(71146);
    return paramUri;
  }

  public final Task<DataClient.GetFdForAssetResponse> getFdForAsset(Asset paramAsset)
  {
    AppMethodBeat.i(71149);
    paramAsset = PendingResultUtil.toTask(this.zzdi.getFdForAsset(asGoogleApiClient(), paramAsset), zzcr.zzbx);
    AppMethodBeat.o(71149);
    return paramAsset;
  }

  public final Task<DataClient.GetFdForAssetResponse> getFdForAsset(DataItemAsset paramDataItemAsset)
  {
    AppMethodBeat.i(71150);
    paramDataItemAsset = PendingResultUtil.toTask(this.zzdi.getFdForAsset(asGoogleApiClient(), paramDataItemAsset), zzcs.zzbx);
    AppMethodBeat.o(71150);
    return paramDataItemAsset;
  }

  public final Task<DataItem> putDataItem(PutDataRequest paramPutDataRequest)
  {
    AppMethodBeat.i(71142);
    paramPutDataRequest = PendingResultUtil.toTask(this.zzdi.putDataItem(asGoogleApiClient(), paramPutDataRequest), zzck.zzbx);
    AppMethodBeat.o(71142);
    return paramPutDataRequest;
  }

  public final Task<Boolean> removeListener(DataClient.OnDataChangedListener paramOnDataChangedListener)
  {
    AppMethodBeat.i(71154);
    paramOnDataChangedListener = doUnregisterEventListener(ListenerHolders.createListenerHolder(paramOnDataChangedListener, getLooper(), "DataListener").getListenerKey());
    AppMethodBeat.o(71154);
    return paramOnDataChangedListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzcj
 * JD-Core Version:    0.6.2
 */