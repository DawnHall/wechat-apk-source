package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareVideo$Builder extends ShareMedia.Builder<ShareVideo, Builder>
{
  private Uri localUrl;

  public final ShareVideo build()
  {
    AppMethodBeat.i(97600);
    ShareVideo localShareVideo = new ShareVideo(this, null);
    AppMethodBeat.o(97600);
    return localShareVideo;
  }

  final Builder readFrom(Parcel paramParcel)
  {
    AppMethodBeat.i(97602);
    paramParcel = readFrom((ShareVideo)paramParcel.readParcelable(ShareVideo.class.getClassLoader()));
    AppMethodBeat.o(97602);
    return paramParcel;
  }

  public final Builder readFrom(ShareVideo paramShareVideo)
  {
    AppMethodBeat.i(97601);
    if (paramShareVideo == null)
    {
      AppMethodBeat.o(97601);
      paramShareVideo = this;
    }
    while (true)
    {
      return paramShareVideo;
      paramShareVideo = ((Builder)super.readFrom(paramShareVideo)).setLocalUrl(paramShareVideo.getLocalUrl());
      AppMethodBeat.o(97601);
    }
  }

  public final Builder setLocalUrl(Uri paramUri)
  {
    this.localUrl = paramUri;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareVideo.Builder
 * JD-Core Version:    0.6.2
 */