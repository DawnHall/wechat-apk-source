package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

class PersistedEvents$SerializationProxyV1
  implements Serializable
{
  private static final long serialVersionUID = 20160629001L;
  private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

  private PersistedEvents$SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> paramHashMap)
  {
    this.proxyEvents = paramHashMap;
  }

  private Object readResolve()
  {
    AppMethodBeat.i(72010);
    PersistedEvents localPersistedEvents = new PersistedEvents(this.proxyEvents);
    AppMethodBeat.o(72010);
    return localPersistedEvents;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.PersistedEvents.SerializationProxyV1
 * JD-Core Version:    0.6.2
 */