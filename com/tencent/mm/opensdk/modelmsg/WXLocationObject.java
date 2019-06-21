package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WXLocationObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXLocationObject";
  public double lat;
  public double lng;

  public WXLocationObject()
  {
    this(0.0D, 0.0D);
  }

  public WXLocationObject(double paramDouble1, double paramDouble2)
  {
    this.lat = paramDouble1;
    this.lng = paramDouble2;
  }

  public boolean checkArgs()
  {
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128338);
    paramBundle.putDouble("_wxlocationobject_lat", this.lat);
    paramBundle.putDouble("_wxlocationobject_lng", this.lng);
    AppMethodBeat.o(128338);
  }

  public int type()
  {
    return 30;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128339);
    this.lat = paramBundle.getDouble("_wxlocationobject_lat");
    this.lng = paramBundle.getDouble("_wxlocationobject_lng");
    AppMethodBeat.o(128339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXLocationObject
 * JD-Core Version:    0.6.2
 */