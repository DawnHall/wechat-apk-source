package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract interface LifecycleDelegate
{
  public abstract void onCreate(Bundle paramBundle);

  public abstract View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle);

  public abstract void onDestroy();

  public abstract void onDestroyView();

  public abstract void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2);

  public abstract void onLowMemory();

  public abstract void onPause();

  public abstract void onResume();

  public abstract void onSaveInstanceState(Bundle paramBundle);

  public abstract void onStart();

  public abstract void onStop();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.LifecycleDelegate
 * JD-Core Version:    0.6.2
 */