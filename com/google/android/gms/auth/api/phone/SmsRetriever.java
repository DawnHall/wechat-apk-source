package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.auth_api_phone.zzj;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class SmsRetriever
{
  public static final String EXTRA_SMS_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
  public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
  public static final String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";

  public static SmsRetrieverClient getClient(Activity paramActivity)
  {
    AppMethodBeat.i(80422);
    paramActivity = new zzj(paramActivity);
    AppMethodBeat.o(80422);
    return paramActivity;
  }

  public static SmsRetrieverClient getClient(Context paramContext)
  {
    AppMethodBeat.i(80421);
    paramContext = new zzj(paramContext);
    AppMethodBeat.o(80421);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.phone.SmsRetriever
 * JD-Core Version:    0.6.2
 */