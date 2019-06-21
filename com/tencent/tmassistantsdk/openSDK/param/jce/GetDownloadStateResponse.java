package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class GetDownloadStateResponse extends JceStruct
{
  static IPCBaseParam cache_requestParam;
  public int errorCode = 0;
  public String errorMsg = "";
  public IPCBaseParam requestParam = null;
  public int state = 0;

  public GetDownloadStateResponse()
  {
  }

  public GetDownloadStateResponse(IPCBaseParam paramIPCBaseParam, int paramInt1, int paramInt2, String paramString)
  {
    this.requestParam = paramIPCBaseParam;
    this.state = paramInt1;
    this.errorCode = paramInt2;
    this.errorMsg = paramString;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(75985);
    if (cache_requestParam == null)
      cache_requestParam = new IPCBaseParam();
    this.requestParam = ((IPCBaseParam)paramJceInputStream.read(cache_requestParam, 0, true));
    this.state = paramJceInputStream.read(this.state, 1, false);
    this.errorCode = paramJceInputStream.read(this.errorCode, 2, false);
    this.errorMsg = paramJceInputStream.readString(3, false);
    AppMethodBeat.o(75985);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(75984);
    paramJceOutputStream.write(this.requestParam, 0);
    paramJceOutputStream.write(this.state, 1);
    paramJceOutputStream.write(this.errorCode, 2);
    if (this.errorMsg != null)
      paramJceOutputStream.write(this.errorMsg, 3);
    AppMethodBeat.o(75984);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadStateResponse
 * JD-Core Version:    0.6.2
 */