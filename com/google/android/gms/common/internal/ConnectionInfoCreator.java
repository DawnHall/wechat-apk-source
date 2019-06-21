package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ConnectionInfoCreator
  implements Parcelable.Creator<ConnectionInfo>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ConnectionInfo createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89587);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    Feature[] arrayOfFeature = null;
    Bundle localBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(j))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, j);
        break;
      case 1:
        localBundle = SafeParcelReader.createBundle(paramParcel, j);
        break;
      case 2:
        arrayOfFeature = (Feature[])SafeParcelReader.createTypedArray(paramParcel, j, Feature.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ConnectionInfo(localBundle, arrayOfFeature);
    AppMethodBeat.o(89587);
    return paramParcel;
  }

  public ConnectionInfo[] newArray(int paramInt)
  {
    return new ConnectionInfo[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ConnectionInfoCreator
 * JD-Core Version:    0.6.2
 */