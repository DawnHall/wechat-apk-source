package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
public abstract interface Channel extends Parcelable
{
  public abstract PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);

  public abstract PendingResult<Status> close(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Status> close(GoogleApiClient paramGoogleApiClient, int paramInt);

  public abstract PendingResult<Channel.GetInputStreamResult> getInputStream(GoogleApiClient paramGoogleApiClient);

  public abstract String getNodeId();

  public abstract PendingResult<Channel.GetOutputStreamResult> getOutputStream(GoogleApiClient paramGoogleApiClient);

  public abstract String getPath();

  public abstract PendingResult<Status> receiveFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, boolean paramBoolean);

  public abstract PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);

  public abstract PendingResult<Status> sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri);

  public abstract PendingResult<Status> sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, long paramLong1, long paramLong2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Channel
 * JD-Core Version:    0.6.2
 */