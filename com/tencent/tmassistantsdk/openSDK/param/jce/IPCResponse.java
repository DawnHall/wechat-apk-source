package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class IPCResponse extends JceStruct
{
  static byte[] cache_body;
  static IPCHead cache_head;
  public byte[] body = null;
  public IPCHead head = null;

  public IPCResponse()
  {
  }

  public IPCResponse(IPCHead paramIPCHead, byte[] paramArrayOfByte)
  {
    this.head = paramIPCHead;
    this.body = paramArrayOfByte;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76001);
    if (cache_head == null)
      cache_head = new IPCHead();
    this.head = ((IPCHead)paramJceInputStream.read(cache_head, 0, true));
    if (cache_body == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      cache_body = arrayOfByte;
      ((byte[])arrayOfByte)[0] = ((byte)0);
    }
    this.body = ((byte[])paramJceInputStream.read(cache_body, 1, true));
    AppMethodBeat.o(76001);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76000);
    paramJceOutputStream.write(this.head, 0);
    paramJceOutputStream.write(this.body, 1);
    AppMethodBeat.o(76000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse
 * JD-Core Version:    0.6.2
 */