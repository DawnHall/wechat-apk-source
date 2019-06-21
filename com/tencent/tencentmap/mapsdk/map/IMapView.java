package com.tencent.tencentmap.mapsdk.map;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public abstract interface IMapView
{
  public abstract void addView(View paramView, MapView.LayoutParams paramLayoutParams);

  public abstract boolean dispatchTouchEvent(MotionEvent paramMotionEvent);

  public abstract TencentMap getMap();

  @Deprecated
  public abstract MapController getMapController();

  public abstract View getMapView();

  public abstract Projection getProjection();

  public abstract UiSettings getUiSettings();

  public abstract void onCreate(Bundle paramBundle);

  public abstract void onDestroy();

  public abstract void onDestroyView();

  public abstract void onLowMemory();

  public abstract void onPause();

  public abstract void onRestart();

  public abstract void onResume();

  public abstract void onSaveInstanceState(Bundle paramBundle);

  public abstract void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract void onStart();

  public abstract void onStop();

  public abstract boolean onTouchEvent(MotionEvent paramMotionEvent);

  public abstract void updateViewLayout(View paramView, ViewGroup.LayoutParams paramLayoutParams);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.map.IMapView
 * JD-Core Version:    0.6.2
 */