package com.google.android.gms.dynamite;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzb
  implements DynamiteModule.VersionPolicy
{
  public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context paramContext, String paramString, DynamiteModule.VersionPolicy.IVersions paramIVersions)
  {
    AppMethodBeat.i(90450);
    DynamiteModule.VersionPolicy.SelectionResult localSelectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
    localSelectionResult.remoteVersion = paramIVersions.getRemoteVersion(paramContext, paramString, true);
    if (localSelectionResult.remoteVersion != 0)
      localSelectionResult.selection = 1;
    while (true)
    {
      AppMethodBeat.o(90450);
      return localSelectionResult;
      localSelectionResult.localVersion = paramIVersions.getLocalVersion(paramContext, paramString);
      if (localSelectionResult.localVersion != 0)
        localSelectionResult.selection = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.zzb
 * JD-Core Version:    0.6.2
 */