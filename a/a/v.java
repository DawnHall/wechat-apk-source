package a.a;

import a.f.b.a.a;
import a.f.b.f;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "readResolve", "subList", "fromIndex", "toIndex", "toString", "", "kotlin-stdlib"})
public final class v
  implements a, Serializable, List, RandomAccess
{
  public static final v AUP;

  static
  {
    AppMethodBeat.i(56046);
    AUP = new v();
    AppMethodBeat.o(56046);
  }

  private final Object readResolve()
  {
    return AUP;
  }

  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    AppMethodBeat.i(56047);
    paramCollection = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56047);
    throw paramCollection;
  }

  public final boolean addAll(Collection paramCollection)
  {
    AppMethodBeat.i(56048);
    paramCollection = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56048);
    throw paramCollection;
  }

  public final void clear()
  {
    AppMethodBeat.i(56049);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56049);
    throw localUnsupportedOperationException;
  }

  public final boolean contains(Object paramObject)
  {
    AppMethodBeat.i(56039);
    if (!(paramObject instanceof Void))
      AppMethodBeat.o(56039);
    while (true)
    {
      return false;
      j.p((Void)paramObject, "element");
      AppMethodBeat.o(56039);
    }
  }

  public final boolean containsAll(Collection paramCollection)
  {
    AppMethodBeat.i(56040);
    j.p(paramCollection, "elements");
    boolean bool = paramCollection.isEmpty();
    AppMethodBeat.o(56040);
    return bool;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56038);
    boolean bool;
    if (((paramObject instanceof List)) && (((List)paramObject).isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(56038);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56038);
    }
  }

  public final int hashCode()
  {
    return 1;
  }

  public final int indexOf(Object paramObject)
  {
    AppMethodBeat.i(56042);
    if (!(paramObject instanceof Void))
      AppMethodBeat.o(56042);
    while (true)
    {
      return -1;
      j.p((Void)paramObject, "element");
      AppMethodBeat.o(56042);
    }
  }

  public final boolean isEmpty()
  {
    return true;
  }

  public final Iterator iterator()
  {
    return (Iterator)u.AUO;
  }

  public final int lastIndexOf(Object paramObject)
  {
    AppMethodBeat.i(56043);
    if (!(paramObject instanceof Void))
      AppMethodBeat.o(56043);
    while (true)
    {
      return -1;
      j.p((Void)paramObject, "element");
      AppMethodBeat.o(56043);
    }
  }

  public final ListIterator listIterator()
  {
    return (ListIterator)u.AUO;
  }

  public final ListIterator listIterator(int paramInt)
  {
    AppMethodBeat.i(56044);
    if (paramInt != 0)
    {
      localObject = (Throwable)new IndexOutOfBoundsException("Index: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(56044);
      throw ((Throwable)localObject);
    }
    Object localObject = (ListIterator)u.AUO;
    AppMethodBeat.o(56044);
    return localObject;
  }

  public final boolean remove(Object paramObject)
  {
    AppMethodBeat.i(56050);
    paramObject = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56050);
    throw paramObject;
  }

  public final boolean removeAll(Collection paramCollection)
  {
    AppMethodBeat.i(56051);
    paramCollection = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56051);
    throw paramCollection;
  }

  public final boolean retainAll(Collection paramCollection)
  {
    AppMethodBeat.i(56052);
    paramCollection = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56052);
    throw paramCollection;
  }

  public final List subList(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(56045);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localObject = (List)this;
      AppMethodBeat.o(56045);
      return localObject;
    }
    Object localObject = (Throwable)new IndexOutOfBoundsException("fromIndex: " + paramInt1 + ", toIndex: " + paramInt2);
    AppMethodBeat.o(56045);
    throw ((Throwable)localObject);
  }

  public final Object[] toArray()
  {
    AppMethodBeat.i(56057);
    Object[] arrayOfObject = f.j(this);
    AppMethodBeat.o(56057);
    return arrayOfObject;
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    AppMethodBeat.i(56058);
    paramArrayOfT = f.a(this, paramArrayOfT);
    AppMethodBeat.o(56058);
    return paramArrayOfT;
  }

  public final String toString()
  {
    return "[]";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.a.v
 * JD-Core Version:    0.6.2
 */