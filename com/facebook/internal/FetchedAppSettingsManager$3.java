package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FetchedAppSettingsManager$3
  implements Runnable
{
  FetchedAppSettingsManager$3(FetchedAppSettingsManager.FetchedAppSettingsCallback paramFetchedAppSettingsCallback, FetchedAppSettings paramFetchedAppSettings)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(72306);
    this.val$callback.onSuccess(this.val$appSettings);
    AppMethodBeat.o(72306);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.3
 * JD-Core Version:    0.6.2
 */