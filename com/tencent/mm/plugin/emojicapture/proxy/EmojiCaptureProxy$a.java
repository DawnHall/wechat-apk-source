package com.tencent.mm.plugin.emojicapture.proxy;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureProxy$Companion;", "", "()V", "TAG", "", "instance", "Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureProxy;", "getInstance", "()Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureProxy;", "setInstance", "(Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureProxy;)V", "needCreate", "", "requestCount", "", "requestConnect", "", "tryRelease", "plugin-emojicapture_release"})
public final class EmojiCaptureProxy$a
{
  private static void a(EmojiCaptureProxy paramEmojiCaptureProxy)
  {
    AppMethodBeat.i(2803);
    j.p(paramEmojiCaptureProxy, "<set-?>");
    EmojiCaptureProxy.access$setInstance$cp(paramEmojiCaptureProxy);
    AppMethodBeat.o(2803);
  }

  public static void bnL()
  {
    AppMethodBeat.i(2804);
    EmojiCaptureProxy.access$setRequestCount$cp(EmojiCaptureProxy.access$getRequestCount$cp() + 1);
    if (EmojiCaptureProxy.access$getNeedCreate$cp())
    {
      EmojiCaptureProxy.access$setNeedCreate$cp(false);
      a(new EmojiCaptureProxy(new d(ah.getContext())));
    }
    AppMethodBeat.o(2804);
  }

  public static void bnM()
  {
    AppMethodBeat.i(2805);
    EmojiCaptureProxy.access$setRequestCount$cp(EmojiCaptureProxy.access$getRequestCount$cp() - 1);
    if (EmojiCaptureProxy.access$getRequestCount$cp() <= 0)
    {
      EmojiCaptureProxy.access$setNeedCreate$cp(true);
      d locald = EmojiCaptureProxy.access$getInstance$cp().getServerProxy();
      if (locald != null)
      {
        locald.release();
        AppMethodBeat.o(2805);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2805);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy.a
 * JD-Core Version:    0.6.2
 */