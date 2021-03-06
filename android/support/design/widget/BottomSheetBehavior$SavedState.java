package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

public class BottomSheetBehavior$SavedState extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new BottomSheetBehavior.SavedState.1();
  final int state;

  public BottomSheetBehavior$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    this.state = paramParcel.readInt();
  }

  public BottomSheetBehavior$SavedState(Parcelable paramParcelable, int paramInt)
  {
    super(paramParcelable);
    this.state = paramInt;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.state);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomSheetBehavior.SavedState
 * JD-Core Version:    0.6.2
 */