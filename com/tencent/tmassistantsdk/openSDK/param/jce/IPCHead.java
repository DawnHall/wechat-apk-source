package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class IPCHead extends JceStruct
{
  public int cmdId = 0;
  public String hostPackageName = "";
  public String hostVersionCode = "";
  public int requestId = 0;

  public IPCHead()
  {
  }

  public IPCHead(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    this.requestId = paramInt1;
    this.cmdId = paramInt2;
    this.hostPackageName = paramString1;
    this.hostVersionCode = paramString2;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(75995);
    this.requestId = paramJceInputStream.read(this.requestId, 0, true);
    this.cmdId = paramJceInputStream.read(this.cmdId, 1, true);
    this.hostPackageName = paramJceInputStream.readString(2, true);
    this.hostVersionCode = paramJceInputStream.readString(3, true);
    AppMethodBeat.o(75995);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(75994);
    paramJceOutputStream.write(this.requestId, 0);
    paramJceOutputStream.write(this.cmdId, 1);
    paramJceOutputStream.write(this.hostPackageName, 2);
    paramJceOutputStream.write(this.hostVersionCode, 3);
    AppMethodBeat.o(75994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead
 * JD-Core Version:    0.6.2
 */