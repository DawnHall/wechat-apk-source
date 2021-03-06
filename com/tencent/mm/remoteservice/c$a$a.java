package com.tencent.mm.remoteservice;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a$a
  implements c
{
  private IBinder mRemote;

  c$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final void a(String paramString1, String paramString2, Bundle paramBundle, b paramb)
  {
    AppMethodBeat.i(80223);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.remoteservice.ICommRemoteServer");
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramb != null)
          {
            paramString1 = paramb.asBinder();
            localParcel1.writeStrongBinder(paramString1);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() != 0)
              paramBundle.readFromParcel(localParcel2);
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(80223);
      }
      paramString1 = null;
    }
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.c.a.a
 * JD-Core Version:    0.6.2
 */