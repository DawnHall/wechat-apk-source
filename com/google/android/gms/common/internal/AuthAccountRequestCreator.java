package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AuthAccountRequestCreator
  implements Parcelable.Creator<AuthAccountRequest>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public AuthAccountRequest createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61306);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    Account localAccount = null;
    Integer localInteger1 = null;
    Integer localInteger2 = null;
    Scope[] arrayOfScope = null;
    IBinder localIBinder = null;
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
        localIBinder = SafeParcelReader.readIBinder(paramParcel, k);
        break;
      case 3:
        arrayOfScope = (Scope[])SafeParcelReader.createTypedArray(paramParcel, k, Scope.CREATOR);
        break;
      case 4:
        localInteger2 = SafeParcelReader.readIntegerObject(paramParcel, k);
        break;
      case 5:
        localInteger1 = SafeParcelReader.readIntegerObject(paramParcel, k);
        break;
      case 6:
        localAccount = (Account)SafeParcelReader.createParcelable(paramParcel, k, Account.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new AuthAccountRequest(j, localIBinder, arrayOfScope, localInteger2, localInteger1, localAccount);
    AppMethodBeat.o(61306);
    return paramParcel;
  }

  public AuthAccountRequest[] newArray(int paramInt)
  {
    return new AuthAccountRequest[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.AuthAccountRequestCreator
 * JD-Core Version:    0.6.2
 */