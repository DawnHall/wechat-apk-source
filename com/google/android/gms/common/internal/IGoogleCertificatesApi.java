package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IGoogleCertificatesApi extends IInterface
{
  public abstract IObjectWrapper getGoogleCertificates();

  public abstract IObjectWrapper getGoogleReleaseCertificates();

  public abstract boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery paramGoogleCertificatesQuery, IObjectWrapper paramIObjectWrapper);

  public abstract boolean isGoogleReleaseSigned(String paramString, IObjectWrapper paramIObjectWrapper);

  public abstract boolean isGoogleSigned(String paramString, IObjectWrapper paramIObjectWrapper);

  public static abstract class Stub extends zzb
    implements IGoogleCertificatesApi
  {
    public Stub()
    {
      super();
    }

    public static IGoogleCertificatesApi asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if ((localIInterface instanceof IGoogleCertificatesApi))
          paramIBinder = (IGoogleCertificatesApi)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool;
      switch (paramInt1)
      {
      default:
        bool = false;
        return bool;
      case 1:
        paramParcel1 = getGoogleCertificates();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
      case 2:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel1 = getGoogleReleaseCertificates();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
        continue;
        bool = isGoogleReleaseSigned(paramParcel1.readString(), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isGoogleSigned(paramParcel1.readString(), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
        continue;
        bool = isGoogleOrPlatformSigned((GoogleCertificatesQuery)zzc.zza(paramParcel1, GoogleCertificatesQuery.CREATOR), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, bool);
      }
    }

    public static class Proxy extends zza
      implements IGoogleCertificatesApi
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      }

      public IObjectWrapper getGoogleCertificates()
      {
        AppMethodBeat.i(89674);
        Parcel localParcel = transactAndReadException(1, obtainAndWriteInterfaceToken());
        IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
        localParcel.recycle();
        AppMethodBeat.o(89674);
        return localIObjectWrapper;
      }

      public IObjectWrapper getGoogleReleaseCertificates()
      {
        AppMethodBeat.i(89675);
        Parcel localParcel = transactAndReadException(2, obtainAndWriteInterfaceToken());
        IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
        localParcel.recycle();
        AppMethodBeat.o(89675);
        return localIObjectWrapper;
      }

      public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery paramGoogleCertificatesQuery, IObjectWrapper paramIObjectWrapper)
      {
        AppMethodBeat.i(89678);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramGoogleCertificatesQuery);
        zzc.zza(localParcel, paramIObjectWrapper);
        paramGoogleCertificatesQuery = transactAndReadException(5, localParcel);
        boolean bool = zzc.zza(paramGoogleCertificatesQuery);
        paramGoogleCertificatesQuery.recycle();
        AppMethodBeat.o(89678);
        return bool;
      }

      public boolean isGoogleReleaseSigned(String paramString, IObjectWrapper paramIObjectWrapper)
      {
        AppMethodBeat.i(89676);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        localParcel.writeString(paramString);
        zzc.zza(localParcel, paramIObjectWrapper);
        paramString = transactAndReadException(3, localParcel);
        boolean bool = zzc.zza(paramString);
        paramString.recycle();
        AppMethodBeat.o(89676);
        return bool;
      }

      public boolean isGoogleSigned(String paramString, IObjectWrapper paramIObjectWrapper)
      {
        AppMethodBeat.i(89677);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        localParcel.writeString(paramString);
        zzc.zza(localParcel, paramIObjectWrapper);
        paramString = transactAndReadException(4, localParcel);
        boolean bool = zzc.zza(paramString);
        paramString.recycle();
        AppMethodBeat.o(89677);
        return bool;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.IGoogleCertificatesApi
 * JD-Core Version:    0.6.2
 */