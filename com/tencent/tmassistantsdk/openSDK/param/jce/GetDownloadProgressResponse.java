package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class GetDownloadProgressResponse extends JceStruct
{
  static IPCBaseParam cache_requestParam;
  public long allTaskTotalLength = 0L;
  public long allTaskTotalProgress = 0L;
  public long receivedLen = 0L;
  public IPCBaseParam requestParam = null;
  public long totalLen = 0L;

  public GetDownloadProgressResponse()
  {
  }

  public GetDownloadProgressResponse(IPCBaseParam paramIPCBaseParam, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    this.requestParam = paramIPCBaseParam;
    this.receivedLen = paramLong1;
    this.totalLen = paramLong2;
    this.allTaskTotalProgress = paramLong3;
    this.allTaskTotalLength = paramLong4;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(75983);
    if (cache_requestParam == null)
      cache_requestParam = new IPCBaseParam();
    this.requestParam = ((IPCBaseParam)paramJceInputStream.read(cache_requestParam, 0, true));
    this.receivedLen = paramJceInputStream.read(this.receivedLen, 1, false);
    this.totalLen = paramJceInputStream.read(this.totalLen, 2, false);
    this.allTaskTotalProgress = paramJceInputStream.read(this.allTaskTotalProgress, 3, false);
    this.allTaskTotalLength = paramJceInputStream.read(this.allTaskTotalLength, 4, false);
    AppMethodBeat.o(75983);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(75982);
    paramJceOutputStream.write(this.requestParam, 0);
    paramJceOutputStream.write(this.receivedLen, 1);
    paramJceOutputStream.write(this.totalLen, 2);
    paramJceOutputStream.write(this.allTaskTotalProgress, 3);
    paramJceOutputStream.write(this.allTaskTotalLength, 4);
    AppMethodBeat.o(75982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadProgressResponse
 * JD-Core Version:    0.6.2
 */