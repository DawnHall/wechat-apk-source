package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzex extends zzn<Status>
{
  private ListenerHolder<MessageApi.MessageListener> zzax;
  private IntentFilter[] zzba;
  private MessageApi.MessageListener zzeg;

  private zzex(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, ListenerHolder<MessageApi.MessageListener> paramListenerHolder, IntentFilter[] paramArrayOfIntentFilter)
  {
    super(paramGoogleApiClient);
    AppMethodBeat.i(71295);
    this.zzeg = ((MessageApi.MessageListener)Preconditions.checkNotNull(paramMessageListener));
    this.zzax = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
    this.zzba = ((IntentFilter[])Preconditions.checkNotNull(paramArrayOfIntentFilter));
    AppMethodBeat.o(71295);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzex
 * JD-Core Version:    0.6.2
 */