package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class QueryDownloadTaskResponse extends JceStruct
{
  public long allTaskTotalLength = 0L;
  public long allTaskTotalProgress = 0L;
  public long receivedLen = 0L;
  public String savePath = "";
  public int state = 0;
  public long totalLen = 0L;
  public String url = "";

  public QueryDownloadTaskResponse()
  {
  }

  public QueryDownloadTaskResponse(String paramString1, String paramString2, int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    this.url = paramString1;
    this.savePath = paramString2;
    this.state = paramInt;
    this.receivedLen = paramLong1;
    this.totalLen = paramLong2;
    this.allTaskTotalProgress = paramLong3;
    this.allTaskTotalLength = paramLong4;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76007);
    this.url = paramJceInputStream.readString(0, true);
    this.savePath = paramJceInputStream.readString(1, false);
    this.state = paramJceInputStream.read(this.state, 2, false);
    this.receivedLen = paramJceInputStream.read(this.receivedLen, 3, false);
    this.totalLen = paramJceInputStream.read(this.totalLen, 4, false);
    this.allTaskTotalProgress = paramJceInputStream.read(this.allTaskTotalProgress, 5, false);
    this.allTaskTotalLength = paramJceInputStream.read(this.allTaskTotalLength, 6, false);
    AppMethodBeat.o(76007);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76006);
    paramJceOutputStream.write(this.url, 0);
    if (this.savePath != null)
      paramJceOutputStream.write(this.savePath, 1);
    paramJceOutputStream.write(this.state, 2);
    paramJceOutputStream.write(this.receivedLen, 3);
    paramJceOutputStream.write(this.totalLen, 4);
    paramJceOutputStream.write(this.allTaskTotalProgress, 5);
    paramJceOutputStream.write(this.allTaskTotalLength, 6);
    AppMethodBeat.o(76006);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskResponse
 * JD-Core Version:    0.6.2
 */