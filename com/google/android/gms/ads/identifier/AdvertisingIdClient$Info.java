package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.tencent.matrix.trace.core.AppMethodBeat;

@KeepForSdkWithMembers
public final class AdvertisingIdClient$Info
{
  private final String zzq;
  private final boolean zzr;

  public AdvertisingIdClient$Info(String paramString, boolean paramBoolean)
  {
    this.zzq = paramString;
    this.zzr = paramBoolean;
  }

  public final String getId()
  {
    return this.zzq;
  }

  public final boolean isLimitAdTrackingEnabled()
  {
    return this.zzr;
  }

  public final String toString()
  {
    AppMethodBeat.i(115322);
    String str = this.zzq;
    boolean bool = this.zzr;
    str = String.valueOf(str).length() + 7 + "{" + str + "}" + bool;
    AppMethodBeat.o(115322);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient.Info
 * JD-Core Version:    0.6.2
 */