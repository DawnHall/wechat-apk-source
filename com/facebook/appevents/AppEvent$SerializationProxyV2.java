package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

class AppEvent$SerializationProxyV2
  implements Serializable
{
  private static final long serialVersionUID = 20160803001L;
  private final String checksum;
  private final boolean isImplicit;
  private final String jsonString;

  private AppEvent$SerializationProxyV2(String paramString1, boolean paramBoolean, String paramString2)
  {
    this.jsonString = paramString1;
    this.isImplicit = paramBoolean;
    this.checksum = paramString2;
  }

  private Object readResolve()
  {
    AppMethodBeat.i(71866);
    AppEvent localAppEvent = new AppEvent(this.jsonString, this.isImplicit, this.checksum, null);
    AppMethodBeat.o(71866);
    return localAppEvent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEvent.SerializationProxyV2
 * JD-Core Version:    0.6.2
 */