package a.a;

import a.f.b.j;
import a.l;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"mapOf", "", "K", "V", "pair", "Lkotlin/Pair;", "sortedMapOf", "Ljava/util/SortedMap;", "", "pairs", "", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "getOrPut", "Ljava/util/concurrent/ConcurrentMap;", "key", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toProperties", "Ljava/util/Properties;", "", "toSingletonMap", "toSingletonMapOrSelf", "toSortedMap", "comparator", "Ljava/util/Comparator;", "kotlin-stdlib"}, dWr=1)
public class af extends ae
{
  public static final <K, V> Map<K, V> a(o<? extends K, ? extends V> paramo)
  {
    AppMethodBeat.i(56206);
    j.p(paramo, "pair");
    paramo = Collections.singletonMap(paramo.first, paramo.second);
    j.o(paramo, "java.util.Collections.si…(pair.first, pair.second)");
    AppMethodBeat.o(56206);
    return paramo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.a.af
 * JD-Core Version:    0.6.2
 */