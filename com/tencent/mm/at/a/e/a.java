package com.tencent.mm.at.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.LinkedBlockingDeque;

public final class a<E> extends LinkedBlockingDeque<E>
{
  public final boolean offer(E paramE)
  {
    AppMethodBeat.i(116102);
    boolean bool = super.offerFirst(paramE);
    AppMethodBeat.o(116102);
    return bool;
  }

  public final E remove()
  {
    AppMethodBeat.i(116103);
    Object localObject = super.removeFirst();
    AppMethodBeat.o(116103);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.e.a
 * JD-Core Version:    0.6.2
 */