package com.tencent.qqmusic.mediaplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AudioInformation$1
  implements Parcelable.Creator<AudioInformation>
{
  public final AudioInformation createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(105571);
    paramParcel = new AudioInformation(paramParcel);
    AppMethodBeat.o(105571);
    return paramParcel;
  }

  public final AudioInformation[] newArray(int paramInt)
  {
    return new AudioInformation[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.AudioInformation.1
 * JD-Core Version:    0.6.2
 */