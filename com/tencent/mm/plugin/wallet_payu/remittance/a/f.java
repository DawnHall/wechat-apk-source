package com.tencent.mm.plugin.wallet_payu.remittance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f extends a
{
  public f(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(48535);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("total_fee", String.valueOf(paramInt1));
    localHashMap.put("fee_type", paramString2);
    localHashMap.put("receiver_name", paramString3);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    M(localHashMap);
    AppMethodBeat.o(48535);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48536);
    ab.d("MicroMsg.NetScenePayURemitttanceRetry", "errCode " + paramInt + " errMsg: " + paramString);
    AppMethodBeat.o(48536);
  }

  public final int cOX()
  {
    return 26;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.a.f
 * JD-Core Version:    0.6.2
 */