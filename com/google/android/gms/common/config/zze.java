package com.google.android.gms.common.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zze extends GservicesValue<Float>
{
  zze(String paramString, Float paramFloat)
  {
    super(paramString, paramFloat);
  }

  private static Float zza(Context paramContext, String paramString, Float paramFloat)
  {
    AppMethodBeat.i(89548);
    paramContext = paramContext.getSharedPreferences("gservices-direboot-cache", 0).getString(paramString, null);
    if (paramContext != null);
    while (true)
    {
      try
      {
        float f = Float.parseFloat(paramContext);
        paramFloat = Float.valueOf(f);
        AppMethodBeat.o(89548);
        return paramFloat;
      }
      catch (NumberFormatException paramContext)
      {
      }
      AppMethodBeat.o(89548);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.config.zze
 * JD-Core Version:    0.6.2
 */