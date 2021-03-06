package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;

public class ShowMessageFromWX$Req extends BaseReq
{
  public String country;
  public String lang;
  public WXMediaMessage message;

  public ShowMessageFromWX$Req()
  {
  }

  public ShowMessageFromWX$Req(Bundle paramBundle)
  {
    AppMethodBeat.i(128273);
    fromBundle(paramBundle);
    AppMethodBeat.o(128273);
  }

  public boolean checkArgs()
  {
    AppMethodBeat.i(128276);
    boolean bool;
    if (this.message == null)
    {
      bool = false;
      AppMethodBeat.o(128276);
    }
    while (true)
    {
      return bool;
      bool = this.message.checkArgs();
      AppMethodBeat.o(128276);
    }
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128275);
    super.fromBundle(paramBundle);
    this.lang = paramBundle.getString("_wxapi_showmessage_req_lang");
    this.country = paramBundle.getString("_wxapi_showmessage_req_country");
    this.message = WXMediaMessage.Builder.fromBundle(paramBundle);
    AppMethodBeat.o(128275);
  }

  public int getType()
  {
    return 4;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128274);
    Bundle localBundle = WXMediaMessage.Builder.toBundle(this.message);
    super.toBundle(localBundle);
    paramBundle.putString("_wxapi_showmessage_req_lang", this.lang);
    paramBundle.putString("_wxapi_showmessage_req_country", this.country);
    paramBundle.putAll(localBundle);
    AppMethodBeat.o(128274);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req
 * JD-Core Version:    0.6.2
 */