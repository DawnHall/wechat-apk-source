package com.tencent.mm.opensdk.modelpay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;

public class JumpToOfflinePay$Req extends BaseReq
{
  private static final String TAG = "MicroMsg.SDK.JumpToOfflinePay.Req";

  public boolean checkArgs()
  {
    return true;
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128149);
    super.fromBundle(paramBundle);
    AppMethodBeat.o(128149);
  }

  public int getType()
  {
    return 24;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128148);
    super.toBundle(paramBundle);
    AppMethodBeat.o(128148);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelpay.JumpToOfflinePay.Req
 * JD-Core Version:    0.6.2
 */