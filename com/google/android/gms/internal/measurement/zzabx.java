package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class zzabx extends IOException
{
  zzabx(int paramInt1, int paramInt2)
  {
    super(108 + "CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
    AppMethodBeat.i(3480);
    AppMethodBeat.o(3480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabx
 * JD-Core Version:    0.6.2
 */