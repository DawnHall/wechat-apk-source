package com.facebook.appevents.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class AppEventsLoggerUtility$1 extends HashMap<AppEventsLoggerUtility.GraphAPIActivityType, String>
{
  AppEventsLoggerUtility$1()
  {
    AppMethodBeat.i(72165);
    put(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
    put(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
    AppMethodBeat.o(72165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.AppEventsLoggerUtility.1
 * JD-Core Version:    0.6.2
 */