package com.google.android.gms.security;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public class ProviderInstaller
{
  public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
  private static final Object sLock;
  private static final GoogleApiAvailabilityLight zzacw;
  private static Method zzacx;

  static
  {
    AppMethodBeat.i(90505);
    zzacw = GoogleApiAvailabilityLight.getInstance();
    sLock = new Object();
    zzacx = null;
    AppMethodBeat.o(90505);
  }

  public static void installIfNeeded(Context paramContext)
  {
    AppMethodBeat.i(90503);
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    zzacw.verifyGooglePlayServicesIsAvailable(paramContext, 11925000);
    try
    {
      paramContext = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
      if (paramContext == null)
      {
        Log.isLoggable("ProviderInstaller", 6);
        paramContext = new GooglePlayServicesNotAvailableException(8);
        AppMethodBeat.o(90503);
        throw paramContext;
      }
    }
    catch (Resources.NotFoundException paramContext)
    {
      Log.isLoggable("ProviderInstaller", 6);
      paramContext = new GooglePlayServicesNotAvailableException(8);
      AppMethodBeat.o(90503);
      throw paramContext;
    }
    while (true)
    {
      Throwable localThrowable;
      synchronized (sLock)
      {
        try
        {
          if (zzacx == null)
            zzacx = paramContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[] { Context.class });
          zzacx.invoke(null, new Object[] { paramContext });
          AppMethodBeat.o(90503);
          return;
        }
        catch (Exception paramContext)
        {
          localThrowable = paramContext.getCause();
          if (!Log.isLoggable("ProviderInstaller", 6))
            continue;
        }
        if (localThrowable == null)
        {
          paramContext = paramContext.getMessage();
          paramContext = String.valueOf(paramContext);
          if (paramContext.length() == 0)
            break label222;
          "Failed to install provider: ".concat(paramContext);
          paramContext = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
          paramContext.<init>(8);
          AppMethodBeat.o(90503);
          throw paramContext;
        }
      }
      paramContext = localThrowable.getMessage();
      continue;
      label222: new String("Failed to install provider: ");
    }
  }

  public static void installIfNeededAsync(Context paramContext, ProviderInstaller.ProviderInstallListener paramProviderInstallListener)
  {
    AppMethodBeat.i(90504);
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    Preconditions.checkNotNull(paramProviderInstallListener, "Listener must not be null");
    Preconditions.checkMainThread("Must be called on the UI thread");
    new zza(paramContext, paramProviderInstallListener).execute(new Void[0]);
    AppMethodBeat.o(90504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.security.ProviderInstaller
 * JD-Core Version:    0.6.2
 */