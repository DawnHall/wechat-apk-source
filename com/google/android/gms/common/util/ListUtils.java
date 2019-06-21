package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ListUtils
{
  public static <T> ArrayList<T> copyAndRemoveElementFromListIfPresent(List<T> paramList, T paramT)
  {
    AppMethodBeat.i(90247);
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramList.get(j);
      if ((paramT == null) || (!paramT.equals(localObject)))
        localArrayList.add(localObject);
    }
    AppMethodBeat.o(90247);
    return localArrayList;
  }

  public static <T> ArrayList<T> copyAndRemoveElementsFromListIfPresent(List<T> paramList, Collection<T> paramCollection)
  {
    AppMethodBeat.i(90248);
    Preconditions.checkNotNull(paramCollection);
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = paramList.next();
      if (!paramCollection.contains(localObject))
        localArrayList.add(localObject);
    }
    AppMethodBeat.o(90248);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.ListUtils
 * JD-Core Version:    0.6.2
 */