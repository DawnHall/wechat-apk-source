package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemAsset;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzdb extends DataBufferRef
  implements DataItemAsset
{
  public zzdb(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  public final String getDataItemKey()
  {
    AppMethodBeat.i(71189);
    String str = getString("asset_key");
    AppMethodBeat.o(71189);
    return str;
  }

  public final String getId()
  {
    AppMethodBeat.i(71188);
    String str = getString("asset_id");
    AppMethodBeat.o(71188);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzdb
 * JD-Core Version:    0.6.2
 */