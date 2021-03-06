package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;

public final class zzci
  implements DataApi.GetFdForAssetResult
{
  private volatile boolean closed = false;
  private volatile InputStream zzct;
  private volatile ParcelFileDescriptor zzf;
  private final Status zzp;

  public zzci(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.zzp = paramStatus;
    this.zzf = paramParcelFileDescriptor;
  }

  public final ParcelFileDescriptor getFd()
  {
    AppMethodBeat.i(71137);
    if (this.closed)
    {
      localObject = new IllegalStateException("Cannot access the file descriptor after release().");
      AppMethodBeat.o(71137);
      throw ((Throwable)localObject);
    }
    Object localObject = this.zzf;
    AppMethodBeat.o(71137);
    return localObject;
  }

  public final InputStream getInputStream()
  {
    AppMethodBeat.i(71138);
    Object localObject;
    if (this.closed)
    {
      localObject = new IllegalStateException("Cannot access the input stream after release().");
      AppMethodBeat.o(71138);
      throw ((Throwable)localObject);
    }
    if (this.zzf == null)
    {
      localObject = null;
      AppMethodBeat.o(71138);
    }
    while (true)
    {
      return localObject;
      if (this.zzct == null)
        this.zzct = new ParcelFileDescriptor.AutoCloseInputStream(this.zzf);
      localObject = this.zzct;
      AppMethodBeat.o(71138);
    }
  }

  public final Status getStatus()
  {
    return this.zzp;
  }

  public final void release()
  {
    AppMethodBeat.i(71139);
    if (this.zzf == null)
      AppMethodBeat.o(71139);
    while (true)
    {
      return;
      if (this.closed)
      {
        IllegalStateException localIllegalStateException = new IllegalStateException("releasing an already released result.");
        AppMethodBeat.o(71139);
        throw localIllegalStateException;
      }
      try
      {
        if (this.zzct != null)
          this.zzct.close();
        while (true)
        {
          this.closed = true;
          this.zzf = null;
          this.zzct = null;
          AppMethodBeat.o(71139);
          break;
          this.zzf.close();
        }
      }
      catch (IOException localIOException)
      {
        AppMethodBeat.o(71139);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzci
 * JD-Core Version:    0.6.2
 */