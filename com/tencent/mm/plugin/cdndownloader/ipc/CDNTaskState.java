package com.tencent.mm.plugin.cdndownloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CDNTaskState
  implements Parcelable
{
  public static final Parcelable.Creator<CDNTaskState> CREATOR;
  public int completeSize = 0;
  public int fileTotalSize = 0;
  public int taskState = -100;

  static
  {
    AppMethodBeat.i(931);
    CREATOR = new CDNTaskState.1();
    AppMethodBeat.o(931);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(930);
    paramParcel.writeInt(this.taskState);
    paramParcel.writeInt(this.completeSize);
    paramParcel.writeInt(this.fileTotalSize);
    AppMethodBeat.o(930);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState
 * JD-Core Version:    0.6.2
 */