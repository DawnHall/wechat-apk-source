package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h extends m
{
  public h(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(48666);
    HashMap localHashMap = new HashMap();
    localHashMap.put("verify_code", paramString1);
    localHashMap.put("session_key", paramString2);
    localHashMap.put("passwd", paramString3);
    localHashMap.put("bind_serialno", paramString4);
    localHashMap.put("bank_type", paramString5);
    M(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("banktype", paramString5);
    ba(paramString1);
    AppMethodBeat.o(48666);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48667);
    ab.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    AppMethodBeat.o(48667);
  }

  public final int bgI()
  {
    return 66;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.a.h
 * JD-Core Version:    0.6.2
 */