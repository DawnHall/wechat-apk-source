package com.google.android.gms.dynamite;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzd
  implements DynamiteModule.VersionPolicy
{
  public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context paramContext, String paramString, DynamiteModule.VersionPolicy.IVersions paramIVersions)
  {
    AppMethodBeat.i(90452);
    DynamiteModule.VersionPolicy.SelectionResult localSelectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
    localSelectionResult.localVersion = paramIVersions.getLocalVersion(paramContext, paramString);
    localSelectionResult.remoteVersion = paramIVersions.getRemoteVersion(paramContext, paramString, true);
    if ((localSelectionResult.localVersion == 0) && (localSelectionResult.remoteVersion == 0))
      localSelectionResult.selection = 0;
    while (true)
    {
      AppMethodBeat.o(90452);
      return localSelectionResult;
      if (localSelectionResult.localVersion >= localSelectionResult.remoteVersion)
        localSelectionResult.selection = -1;
      else
        localSelectionResult.selection = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.zzd
 * JD-Core Version:    0.6.2
 */