package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FacebookLiteLoginMethodHandler$1
  implements Parcelable.Creator<FacebookLiteLoginMethodHandler>
{
  public final FacebookLiteLoginMethodHandler createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(96761);
    paramParcel = new FacebookLiteLoginMethodHandler(paramParcel);
    AppMethodBeat.o(96761);
    return paramParcel;
  }

  public final FacebookLiteLoginMethodHandler[] newArray(int paramInt)
  {
    return new FacebookLiteLoginMethodHandler[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.login.FacebookLiteLoginMethodHandler.1
 * JD-Core Version:    0.6.2
 */