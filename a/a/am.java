package a.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, dWr=1)
public class am extends al
{
  public static final <T> Set<T> a(Set<? extends T> paramSet, Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56165);
    a.f.b.j.p(paramSet, "receiver$0");
    a.f.b.j.p(paramIterable, "elements");
    a.f.b.j.p(paramIterable, "receiver$0");
    Object localObject;
    if ((paramIterable instanceof Collection))
    {
      localObject = Integer.valueOf(((Collection)paramIterable).size());
      if (localObject == null)
        break label109;
    }
    label109: for (int i = ((Number)localObject).intValue() + paramSet.size(); ; i = paramSet.size() * 2)
    {
      localObject = new LinkedHashSet(ad.SI(i));
      ((LinkedHashSet)localObject).addAll((Collection)paramSet);
      j.a((Collection)localObject, paramIterable);
      paramSet = (Set)localObject;
      AppMethodBeat.o(56165);
      return paramSet;
      localObject = null;
      break;
    }
  }

  public static final <T> Set<T> b(Set<? extends T> paramSet, T paramT)
  {
    AppMethodBeat.i(56164);
    a.f.b.j.p(paramSet, "receiver$0");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(ad.SI(paramSet.size() + 1));
    localLinkedHashSet.addAll((Collection)paramSet);
    localLinkedHashSet.add(paramT);
    paramSet = (Set)localLinkedHashSet;
    AppMethodBeat.o(56164);
    return paramSet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.a.am
 * JD-Core Version:    0.6.2
 */