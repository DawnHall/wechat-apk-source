package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.f;

public final class a$a
  implements f
{
  public int height;
  public String id;
  public int width;

  public final void e(Parcel paramParcel)
  {
    AppMethodBeat.i(11085);
    paramParcel.writeString(this.id);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    AppMethodBeat.o(11085);
  }

  public final void readFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(11086);
    this.id = paramParcel.readString();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    AppMethodBeat.o(11086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.a.a
 * JD-Core Version:    0.6.2
 */