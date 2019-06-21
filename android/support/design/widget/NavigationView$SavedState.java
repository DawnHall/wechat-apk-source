package android.support.design.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

public class NavigationView$SavedState extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new NavigationView.SavedState.1();
  public Bundle ra;

  public NavigationView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    this.ra = paramParcel.readBundle(paramClassLoader);
  }

  public NavigationView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeBundle(this.ra);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.design.widget.NavigationView.SavedState
 * JD-Core Version:    0.6.2
 */