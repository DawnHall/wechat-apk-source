package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class ApkDownUrl extends JceStruct
{
  static ArrayList<String> cache_urlList;
  public byte type = (byte)0;
  public ArrayList<String> urlList = null;

  public ApkDownUrl()
  {
  }

  public ApkDownUrl(byte paramByte, ArrayList<String> paramArrayList)
  {
    this.type = ((byte)paramByte);
    this.urlList = paramArrayList;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(76029);
    this.type = paramJceInputStream.read(this.type, 0, true);
    if (cache_urlList == null)
    {
      cache_urlList = new ArrayList();
      cache_urlList.add("");
    }
    this.urlList = ((ArrayList)paramJceInputStream.read(cache_urlList, 1, true));
    AppMethodBeat.o(76029);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(76028);
    paramJceOutputStream.write(this.type, 0);
    paramJceOutputStream.write(this.urlList, 1);
    AppMethodBeat.o(76028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.jce.ApkDownUrl
 * JD-Core Version:    0.6.2
 */