package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class FieldMappingDictionaryEntryCreator
  implements Parcelable.Creator<FieldMappingDictionary.Entry>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public FieldMappingDictionary.Entry createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61578);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(k))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, k);
        break;
      case 1:
        j = SafeParcelReader.readInt(paramParcel, k);
        break;
      case 2:
        str = SafeParcelReader.createString(paramParcel, k);
        break;
      case 3:
        localArrayList = SafeParcelReader.createTypedList(paramParcel, k, FieldMappingDictionary.FieldMapPair.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new FieldMappingDictionary.Entry(j, str, localArrayList);
    AppMethodBeat.o(61578);
    return paramParcel;
  }

  public FieldMappingDictionary.Entry[] newArray(int paramInt)
  {
    return new FieldMappingDictionary.Entry[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FieldMappingDictionaryEntryCreator
 * JD-Core Version:    0.6.2
 */