package com.tencent.tencentmap.mapsdk.map;

import com.tencent.mapsdk.raster.model.LatLng;

@Deprecated
public abstract interface MapController
{
  @Deprecated
  public abstract void animateTo(LatLng paramLatLng);

  @Deprecated
  public abstract void animateTo(LatLng paramLatLng, long paramLong, CancelableCallback paramCancelableCallback);

  @Deprecated
  public abstract void animateTo(LatLng paramLatLng, Runnable paramRunnable);

  @Deprecated
  public abstract void setCenter(LatLng paramLatLng);

  @Deprecated
  public abstract void setZoom(int paramInt);

  public abstract void zoomToSpan(double paramDouble1, double paramDouble2);

  public abstract void zoomToSpan(LatLng paramLatLng1, LatLng paramLatLng2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.map.MapController
 * JD-Core Version:    0.6.2
 */