package com.tencent.mm.plugin.facedetect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FaceProNative$FaceResult
  implements Parcelable
{
  public static final Parcelable.Creator<FaceResult> CREATOR;
  public byte[] data;
  public int result;
  public byte[] sidedata;

  static
  {
    AppMethodBeat.i(36);
    CREATOR = new FaceProNative.FaceResult.1();
    AppMethodBeat.o(36);
  }

  public FaceProNative$FaceResult()
  {
  }

  protected FaceProNative$FaceResult(Parcel paramParcel)
  {
    AppMethodBeat.i(33);
    this.result = paramParcel.readInt();
    this.data = paramParcel.createByteArray();
    this.sidedata = paramParcel.createByteArray();
    AppMethodBeat.o(33);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    int i = 0;
    AppMethodBeat.i(35);
    Object localObject = new StringBuilder("FaceResult{result=").append(this.result).append(", sidedataLen=");
    if (this.sidedata == null)
    {
      j = 0;
      localObject = ((StringBuilder)localObject).append(j).append(", dataLen=");
      if (this.data != null)
        break label88;
    }
    label88: for (int j = i; ; j = this.data.length)
    {
      localObject = j + '}';
      AppMethodBeat.o(35);
      return localObject;
      j = this.sidedata.length;
      break;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(34);
    paramParcel.writeInt(this.result);
    paramParcel.writeByteArray(this.data);
    paramParcel.writeByteArray(this.sidedata);
    AppMethodBeat.o(34);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult
 * JD-Core Version:    0.6.2
 */