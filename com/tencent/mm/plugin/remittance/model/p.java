package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.b.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p extends a
{
  public p(String paramString1, String paramString2, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(44758);
    HashMap localHashMap = new HashMap();
    localHashMap.put("recv_username", paramString1);
    localHashMap.put("qrcodeid", paramString2);
    localHashMap.put("currency", String.valueOf(paramInt1));
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("set_amount", String.valueOf(paramInt2));
    M(localHashMap);
    ab.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "qrcodeId: %s, currency: %s", new Object[] { paramString2, Integer.valueOf(paramInt1) });
    AppMethodBeat.o(44758);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44759);
    ab.d("MicroMsg.NetSceneH5F2fTransferCancelPay", "json: %s", new Object[] { paramJSONObject.toString() });
    ab.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(44759);
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransfercancelpay";
  }

  public final int bgG()
  {
    return 1257;
  }

  public final int getType()
  {
    return 1257;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.p
 * JD-Core Version:    0.6.2
 */