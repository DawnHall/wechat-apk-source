package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IGmsCallbacks extends IInterface
{
  public abstract void onAccountValidationComplete(int paramInt, Bundle paramBundle);

  public abstract void onPostInitComplete(int paramInt, IBinder paramIBinder, Bundle paramBundle);

  public abstract void onPostInitCompleteWithConnectionInfo(int paramInt, IBinder paramIBinder, ConnectionInfo paramConnectionInfo);

  public static abstract class Stub extends zzb
    implements IGmsCallbacks
  {
    public Stub()
    {
      super();
    }

    public static IGmsCallbacks asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
        if ((localIInterface instanceof IGmsCallbacks))
          paramIBinder = (IGmsCallbacks)localIInterface;
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
        onPostInitComplete(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR));
      case 2:
      case 3:
      }
      while (true)
      {
        paramParcel2.writeNoException();
        bool = true;
        break;
        onAccountValidationComplete(paramParcel1.readInt(), (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR));
        continue;
        onPostInitCompleteWithConnectionInfo(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (ConnectionInfo)zzc.zza(paramParcel1, ConnectionInfo.CREATOR));
      }
    }

    public static class Proxy extends zza
      implements IGmsCallbacks
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
      }

      public void onAccountValidationComplete(int paramInt, Bundle paramBundle)
      {
        AppMethodBeat.i(89671);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        localParcel.writeInt(paramInt);
        zzc.zza(localParcel, paramBundle);
        transactAndReadExceptionReturnVoid(2, localParcel);
        AppMethodBeat.o(89671);
      }

      public void onPostInitComplete(int paramInt, IBinder paramIBinder, Bundle paramBundle)
      {
        AppMethodBeat.i(89670);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        localParcel.writeInt(paramInt);
        localParcel.writeStrongBinder(paramIBinder);
        zzc.zza(localParcel, paramBundle);
        transactAndReadExceptionReturnVoid(1, localParcel);
        AppMethodBeat.o(89670);
      }

      public void onPostInitCompleteWithConnectionInfo(int paramInt, IBinder paramIBinder, ConnectionInfo paramConnectionInfo)
      {
        AppMethodBeat.i(89672);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        localParcel.writeInt(paramInt);
        localParcel.writeStrongBinder(paramIBinder);
        zzc.zza(localParcel, paramConnectionInfo);
        transactAndReadExceptionReturnVoid(3, localParcel);
        AppMethodBeat.o(89672);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.IGmsCallbacks
 * JD-Core Version:    0.6.2
 */