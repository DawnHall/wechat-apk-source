package com.tencent.ttpic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoModule$DeviceType
{
  static
  {
    AppMethodBeat.i(81641);
    HIGH = new DeviceType("HIGH", 0);
    MIDDLE = new DeviceType("MIDDLE", 1);
    LOW = new DeviceType("LOW", 2);
    VERY_LOW = new DeviceType("VERY_LOW", 3);
    $VALUES = new DeviceType[] { HIGH, MIDDLE, LOW, VERY_LOW };
    AppMethodBeat.o(81641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.VideoModule.DeviceType
 * JD-Core Version:    0.6.2
 */