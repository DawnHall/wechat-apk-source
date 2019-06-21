package com.tencent.mm.opensdk.modelbase;

import android.os.Bundle;
import com.tencent.mm.opensdk.utils.a;

public abstract class BaseReq
{
  public String openId;
  public String transaction;

  public abstract boolean checkArgs();

  public void fromBundle(Bundle paramBundle)
  {
    this.transaction = a.b(paramBundle, "_wxapi_basereq_transaction");
    this.openId = a.b(paramBundle, "_wxapi_basereq_openid");
  }

  public abstract int getType();

  public void toBundle(Bundle paramBundle)
  {
    paramBundle.putInt("_wxapi_command_type", getType());
    paramBundle.putString("_wxapi_basereq_transaction", this.transaction);
    paramBundle.putString("_wxapi_basereq_openid", this.openId);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbase.BaseReq
 * JD-Core Version:    0.6.2
 */