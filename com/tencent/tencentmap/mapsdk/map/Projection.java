package com.tencent.tencentmap.mapsdk.map;

import android.graphics.Point;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.VisibleRegion;

public abstract interface Projection
{
  public abstract double distanceBetween(LatLng paramLatLng1, LatLng paramLatLng2);

  public abstract LatLng fromScreenLocation(Point paramPoint);

  public abstract double getLatitudeSpan();

  public abstract double getLongitudeSpan();

  public abstract float getScalePerPixel();

  public abstract VisibleRegion getVisibleRegion();

  public abstract float metersToEquatorPixels(float paramFloat);

  public abstract float metersToPixels(double paramDouble1, double paramDouble2);

  @Deprecated
  public abstract Point toPixels(GeoPoint paramGeoPoint, Point paramPoint);

  public abstract Point toScreenLocation(LatLng paramLatLng);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.map.Projection
 * JD-Core Version:    0.6.2
 */