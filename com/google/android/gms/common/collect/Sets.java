package com.google.android.gms.common.collect;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets
{
  public static <E> Set<E> difference(Set<? extends E> paramSet1, Set<? extends E> paramSet2)
  {
    AppMethodBeat.i(89519);
    Preconditions.checkNotNull(paramSet1);
    Preconditions.checkNotNull(paramSet2);
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramSet1.iterator();
    while (localIterator.hasNext())
    {
      paramSet1 = localIterator.next();
      if (!paramSet2.contains(paramSet1))
        localHashSet.add(paramSet1);
    }
    AppMethodBeat.o(89519);
    return localHashSet;
  }

  public static <E> Set<E> union(Iterable<Set<E>> paramIterable)
  {
    AppMethodBeat.i(89518);
    Preconditions.checkNotNull(paramIterable);
    HashSet localHashSet = new HashSet();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
      localHashSet.addAll((Set)paramIterable.next());
    AppMethodBeat.o(89518);
    return localHashSet;
  }

  public static <E> Set<E> union(Set<? extends E> paramSet1, Set<? extends E> paramSet2)
  {
    AppMethodBeat.i(89517);
    Preconditions.checkNotNull(paramSet1);
    Preconditions.checkNotNull(paramSet2);
    paramSet1 = new HashSet(paramSet1);
    paramSet1.addAll(paramSet2);
    AppMethodBeat.o(89517);
    return paramSet1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.collect.Sets
 * JD-Core Version:    0.6.2
 */