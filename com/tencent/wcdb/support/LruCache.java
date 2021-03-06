package com.tencent.wcdb.support;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LruCache<K, V>
{
  private int createCount;
  private int evictionCount;
  private int hitCount;
  private final LinkedHashMap<K, V> map;
  private int maxSize;
  private int missCount;
  private int putCount;
  private int size;

  public LruCache(int paramInt)
  {
    AppMethodBeat.i(12725);
    if (paramInt <= 0)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("maxSize <= 0");
      AppMethodBeat.o(12725);
      throw localIllegalArgumentException;
    }
    this.maxSize = paramInt;
    this.map = new LinkedHashMap(0, 0.75F, true);
    AppMethodBeat.o(12725);
  }

  private int safeSizeOf(K paramK, V paramV)
  {
    AppMethodBeat.i(12731);
    int i = sizeOf(paramK, paramV);
    if (i < 0)
    {
      paramK = new IllegalStateException("Negative size: " + paramK + "=" + paramV);
      AppMethodBeat.o(12731);
      throw paramK;
    }
    AppMethodBeat.o(12731);
    return i;
  }

  protected V create(K paramK)
  {
    return null;
  }

  public final int createCount()
  {
    try
    {
      int i = this.createCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected void entryRemoved(boolean paramBoolean, K paramK, V paramV1, V paramV2)
  {
  }

  public final void evictAll()
  {
    AppMethodBeat.i(12732);
    trimToSize(-1);
    AppMethodBeat.o(12732);
  }

  public final int evictionCount()
  {
    try
    {
      int i = this.evictionCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final V get(K paramK)
  {
    AppMethodBeat.i(12727);
    if (paramK == null)
    {
      paramK = new NullPointerException("key == null");
      AppMethodBeat.o(12727);
      throw paramK;
    }
    while (true)
    {
      Object localObject1;
      try
      {
        localObject1 = this.map.get(paramK);
        if (localObject1 != null)
        {
          this.hitCount += 1;
          AppMethodBeat.o(12727);
          paramK = localObject1;
          return paramK;
        }
        this.missCount += 1;
        localObject1 = create(paramK);
        if (localObject1 == null)
        {
          paramK = null;
          AppMethodBeat.o(12727);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(12727);
      }
      try
      {
        this.createCount += 1;
        Object localObject2 = this.map.put(paramK, localObject1);
        if (localObject2 != null)
          this.map.put(paramK, localObject2);
        while (true)
        {
          if (localObject2 == null)
            break label199;
          entryRemoved(false, paramK, localObject1, localObject2);
          AppMethodBeat.o(12727);
          paramK = localObject2;
          break;
          this.size += safeSizeOf(paramK, localObject1);
        }
      }
      finally
      {
        AppMethodBeat.o(12727);
      }
      label199: trimToSize(this.maxSize);
      AppMethodBeat.o(12727);
      paramK = localObject1;
    }
  }

  public final int hitCount()
  {
    try
    {
      int i = this.hitCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int maxSize()
  {
    try
    {
      int i = this.maxSize;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int missCount()
  {
    try
    {
      int i = this.missCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final V put(K paramK, V paramV)
  {
    AppMethodBeat.i(12728);
    if ((paramK == null) || (paramV == null))
    {
      paramK = new NullPointerException("key == null || value == null");
      AppMethodBeat.o(12728);
      throw paramK;
    }
    try
    {
      this.putCount += 1;
      this.size += safeSizeOf(paramK, paramV);
      Object localObject = this.map.put(paramK, paramV);
      if (localObject != null)
        this.size -= safeSizeOf(paramK, localObject);
      if (localObject != null)
        entryRemoved(false, paramK, localObject, paramV);
      trimToSize(this.maxSize);
      AppMethodBeat.o(12728);
      return localObject;
    }
    finally
    {
      AppMethodBeat.o(12728);
    }
    throw paramK;
  }

  public final int putCount()
  {
    try
    {
      int i = this.putCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final V remove(K paramK)
  {
    AppMethodBeat.i(12730);
    if (paramK == null)
    {
      paramK = new NullPointerException("key == null");
      AppMethodBeat.o(12730);
      throw paramK;
    }
    try
    {
      Object localObject = this.map.remove(paramK);
      if (localObject != null)
        this.size -= safeSizeOf(paramK, localObject);
      if (localObject != null)
        entryRemoved(false, paramK, localObject, null);
      AppMethodBeat.o(12730);
      return localObject;
    }
    finally
    {
      AppMethodBeat.o(12730);
    }
    throw paramK;
  }

  public void resize(int paramInt)
  {
    AppMethodBeat.i(12726);
    if (paramInt <= 0)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("maxSize <= 0");
      AppMethodBeat.o(12726);
      throw localIllegalArgumentException;
    }
    try
    {
      this.maxSize = paramInt;
      trimToSize(paramInt);
      AppMethodBeat.o(12726);
      return;
    }
    finally
    {
      AppMethodBeat.o(12726);
    }
  }

  public final int size()
  {
    try
    {
      int i = this.size;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected int sizeOf(K paramK, V paramV)
  {
    return 1;
  }

  public final Map<K, V> snapshot()
  {
    try
    {
      AppMethodBeat.i(12733);
      LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
      localLinkedHashMap.<init>(this.map);
      AppMethodBeat.o(12733);
      return localLinkedHashMap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  @SuppressLint({"DefaultLocale"})
  public final String toString()
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(12734);
      int j = this.hitCount + this.missCount;
      if (j != 0)
        i = this.hitCount * 100 / j;
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i) });
      AppMethodBeat.o(12734);
      return str;
    }
    finally
    {
    }
  }

  public void trimToSize(int paramInt)
  {
    AppMethodBeat.i(12729);
    Object localObject3;
    try
    {
      if ((this.size < 0) || ((this.map.isEmpty()) && (this.size != 0)))
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localIllegalStateException.<init>(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        AppMethodBeat.o(12729);
        throw localIllegalStateException;
      }
    }
    finally
    {
      AppMethodBeat.o(12729);
    }
    if ((this.size <= paramInt) || (this.map.isEmpty()))
    {
      AppMethodBeat.o(12729);
      label112: return;
    }
    if (this.map.entrySet().iterator().hasNext());
    for (Object localObject2 = (Map.Entry)this.map.entrySet().iterator().next(); ; localObject2 = null)
    {
      if (localObject2 == null)
      {
        AppMethodBeat.o(12729);
        break label112;
      }
      localObject3 = ((Map.Entry)localObject2).getKey();
      localObject2 = ((Map.Entry)localObject2).getValue();
      this.map.remove(localObject3);
      this.size -= safeSizeOf(localObject3, localObject2);
      this.evictionCount += 1;
      entryRemoved(true, localObject3, localObject2, null);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.support.LruCache
 * JD-Core Version:    0.6.2
 */