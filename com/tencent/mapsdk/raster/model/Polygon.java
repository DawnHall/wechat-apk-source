package com.tencent.mapsdk.raster.model;

import java.util.List;

public abstract interface Polygon extends IOverlay
{
  public abstract boolean contains(LatLng paramLatLng);

  public abstract boolean equals(Object paramObject);

  public abstract int getFillColor();

  public abstract String getId();

  public abstract int getLevel();

  public abstract List<LatLng> getPoints();

  public abstract int getStrokeColor();

  public abstract float getStrokeWidth();

  public abstract float getZIndex();

  public abstract int hashCode();

  public abstract boolean isVisible();

  public abstract void remove();

  public abstract void setFillColor(int paramInt);

  public abstract void setLevel(int paramInt);

  public abstract void setPoints(List<LatLng> paramList);

  public abstract void setStrokeColor(int paramInt);

  public abstract void setStrokeWidth(float paramFloat);

  public abstract void setVisible(boolean paramBoolean);

  public abstract void setZIndex(float paramFloat);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.Polygon
 * JD-Core Version:    0.6.2
 */