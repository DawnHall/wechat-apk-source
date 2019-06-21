package com.tencent.mapsdk.raster.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class IndoorInfo
{
  private String buildingId;
  private String floorName;

  public IndoorInfo(String paramString1, String paramString2)
  {
    this.buildingId = paramString1;
    this.floorName = paramString2;
  }

  public String getBuildingId()
  {
    return this.buildingId;
  }

  public String getFloorName()
  {
    return this.floorName;
  }

  public String toString()
  {
    AppMethodBeat.i(101187);
    String str = this.buildingId + "_" + this.floorName;
    AppMethodBeat.o(101187);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.IndoorInfo
 * JD-Core Version:    0.6.2
 */