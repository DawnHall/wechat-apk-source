package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzabb
  implements Iterator<Object>
{
  public final boolean hasNext()
  {
    return false;
  }

  public final Object next()
  {
    AppMethodBeat.i(3390);
    NoSuchElementException localNoSuchElementException = new NoSuchElementException();
    AppMethodBeat.o(3390);
    throw localNoSuchElementException;
  }

  public final void remove()
  {
    AppMethodBeat.i(3391);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(3391);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabb
 * JD-Core Version:    0.6.2
 */