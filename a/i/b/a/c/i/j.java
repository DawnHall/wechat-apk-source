package a.i.b.a.c.i;

import a.f.a.m;
import a.i.b.a.c.b.a;
import a.i.b.a.c.b.ag;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.z;
import a.i.b.a.c.b.v;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.a.c;
import a.i.b.a.c.l.a.c.a;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collection<La.i.b.a.c.b.b;>;
import java.util.Collection<TH;>;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;

public class j
{
  private static final List<e> BEl;
  public static final j BEm;
  private final c.a BEn;

  static
  {
    AppMethodBeat.i(122036);
    if (!j.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      BEl = a.a.j.m(ServiceLoader.load(e.class, e.class.getClassLoader()));
      BEm = new j(new j.1());
      AppMethodBeat.o(122036);
      return;
    }
  }

  private j(c.a parama)
  {
    this.BEn = parama;
  }

  private static a.i.b.a.c.b.w a(Collection<a.i.b.a.c.b.b> paramCollection, a.i.b.a.c.b.e parame)
  {
    boolean bool = true;
    AppMethodBeat.i(122030);
    Object localObject = paramCollection.iterator();
    int i = 0;
    int j = 0;
    a.i.b.a.c.b.b localb;
    while (((Iterator)localObject).hasNext())
    {
      localb = (a.i.b.a.c.b.b)((Iterator)localObject).next();
      switch (j.9.BEw[localb.dYd().ordinal()])
      {
      default:
        break;
      case 1:
        label84: paramCollection = a.i.b.a.c.b.w.BeB;
        AppMethodBeat.o(122030);
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      return paramCollection;
      paramCollection = new IllegalStateException("Member cannot have SEALED modality: ".concat(String.valueOf(localb)));
      AppMethodBeat.o(122030);
      throw paramCollection;
      j = 1;
      break;
      i = 1;
      break label84;
      if ((parame.dYk()) && (parame.dYd() != a.i.b.a.c.b.w.BeE) && (parame.dYd() != a.i.b.a.c.b.w.BeC));
      while (true)
      {
        if ((j == 0) || (i != 0))
          break label195;
        paramCollection = a.i.b.a.c.b.w.BeD;
        AppMethodBeat.o(122030);
        break;
        bool = false;
      }
      label195: if ((j == 0) && (i != 0))
      {
        if (bool)
        {
          paramCollection = parame.dYd();
          AppMethodBeat.o(122030);
        }
        else
        {
          paramCollection = a.i.b.a.c.b.w.BeE;
          AppMethodBeat.o(122030);
        }
      }
      else
      {
        localObject = new HashSet();
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext())
          ((Set)localObject).addAll(w((a.i.b.a.c.b.b)paramCollection.next()));
        paramCollection = a(o((Set)localObject), bool, parame.dYd());
        AppMethodBeat.o(122030);
      }
    }
  }

  private static a.i.b.a.c.b.w a(Collection<a.i.b.a.c.b.b> paramCollection, boolean paramBoolean, a.i.b.a.c.b.w paramw)
  {
    AppMethodBeat.i(122031);
    Object localObject = a.i.b.a.c.b.w.BeE;
    Iterator localIterator = paramCollection.iterator();
    paramCollection = (Collection<a.i.b.a.c.b.b>)localObject;
    if (localIterator.hasNext())
    {
      localObject = (a.i.b.a.c.b.b)localIterator.next();
      if ((paramBoolean) && (((a.i.b.a.c.b.b)localObject).dYd() == a.i.b.a.c.b.w.BeE))
      {
        localObject = paramw;
        label58: if (((a.i.b.a.c.b.w)localObject).compareTo(paramCollection) >= 0)
          break label88;
      }
    }
    while (true)
    {
      paramCollection = (Collection<a.i.b.a.c.b.b>)localObject;
      break;
      localObject = ((a.i.b.a.c.b.b)localObject).dYd();
      break label58;
      AppMethodBeat.o(122031);
      return paramCollection;
      label88: localObject = paramCollection;
    }
  }

  public static j a(c.a parama)
  {
    AppMethodBeat.i(122007);
    parama = new j(parama);
    AppMethodBeat.o(122007);
    return parama;
  }

  public static <H> H a(Collection<H> paramCollection, a.f.a.b<H, a> paramb)
  {
    AppMethodBeat.i(122028);
    if ((!$assertionsDisabled) && (paramCollection.isEmpty()))
    {
      paramCollection = new AssertionError("Should have at least one overridable descriptor");
      AppMethodBeat.o(122028);
      throw paramCollection;
    }
    if (paramCollection.size() == 1)
    {
      paramCollection = a.a.j.e(paramCollection);
      AppMethodBeat.o(122028);
      return paramCollection;
    }
    ArrayList localArrayList = new ArrayList(2);
    List localList = a.a.j.c(paramCollection, paramb);
    Object localObject = a.a.j.e(paramCollection);
    a locala1 = (a)paramb.am(localObject);
    Iterator localIterator = paramCollection.iterator();
    paramCollection = (Collection<H>)localObject;
    label104: if (localIterator.hasNext())
    {
      localObject = localIterator.next();
      a locala2 = (a)paramb.am(localObject);
      if (a(locala2, localList))
        localArrayList.add(localObject);
      if ((!f(locala2, locala1)) || (f(locala1, locala2)))
        break label297;
      paramCollection = (Collection<H>)localObject;
    }
    label297: 
    while (true)
    {
      break label104;
      if (localArrayList.isEmpty())
      {
        AppMethodBeat.o(122028);
        break;
      }
      if (localArrayList.size() == 1)
      {
        paramCollection = a.a.j.e(localArrayList);
        AppMethodBeat.o(122028);
        break;
      }
      localObject = localArrayList.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        paramCollection = ((Iterator)localObject).next();
      }
      while (a.i.b.a.c.l.t.ai(((a)paramb.am(paramCollection)).dYT()));
      while (true)
      {
        if (paramCollection != null)
        {
          AppMethodBeat.o(122028);
          break;
        }
        paramCollection = a.a.j.e(localArrayList);
        AppMethodBeat.o(122028);
        break;
        paramCollection = null;
      }
    }
  }

  private static Collection<a.i.b.a.c.b.b> a(a.i.b.a.c.b.b paramb, Collection<? extends a.i.b.a.c.b.b> paramCollection, a.i.b.a.c.b.e parame, i parami)
  {
    AppMethodBeat.i(122022);
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    a.i.b.a.c.n.i locali = a.i.b.a.c.n.i.ekD();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      a.i.b.a.c.b.b localb = (a.i.b.a.c.b.b)localIterator.next();
      paramCollection = BEm.b(localb, paramb, parame).BEy;
      if ((!ay.b(localb.dYf())) && (ay.a(localb, paramb)));
      for (int i = 1; ; i = 0)
        switch (j.9.BEv[paramCollection.ordinal()])
        {
        default:
          break;
        case 1:
          if (i != 0)
            locali.add(localb);
          localArrayList.add(localb);
          break;
        case 2:
        }
      if (i != 0)
        parami.b(localb, paramb);
      localArrayList.add(localb);
    }
    parami.a(paramb, locali);
    AppMethodBeat.o(122022);
    return localArrayList;
  }

  private static Collection<a.i.b.a.c.b.b> a(a.i.b.a.c.b.e parame, Collection<a.i.b.a.c.b.b> paramCollection)
  {
    AppMethodBeat.i(122032);
    parame = a.a.j.b(paramCollection, new j.6(parame));
    AppMethodBeat.o(122032);
    return parame;
  }

  public static <H> Collection<H> a(H paramH, Collection<H> paramCollection, a.f.a.b<H, a> paramb, a.f.a.b<H, a.y> paramb1)
  {
    AppMethodBeat.i(122033);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramH);
    a locala = (a)paramb.am(paramH);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Object localObject1 = paramCollection.next();
      Object localObject2 = (a)paramb.am(localObject1);
      if (paramH == localObject1)
      {
        paramCollection.remove();
      }
      else
      {
        localObject2 = g(locala, (a)localObject2);
        if (localObject2 == j.a.a.BEA)
        {
          localArrayList.add(localObject1);
          paramCollection.remove();
        }
        else if (localObject2 == j.a.a.BEC)
        {
          paramb1.am(localObject1);
          paramCollection.remove();
        }
      }
    }
    AppMethodBeat.o(122033);
    return localArrayList;
  }

  public static void a(a.i.b.a.c.b.b paramb, a.f.a.b<a.i.b.a.c.b.b, a.y> paramb1)
  {
    AppMethodBeat.i(122035);
    Object localObject1 = paramb.dYX().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (a.i.b.a.c.b.b)((Iterator)localObject1).next();
      if (((a.i.b.a.c.b.b)localObject2).dYf() == ay.Bfc)
        a((a.i.b.a.c.b.b)localObject2, paramb1);
    }
    if (paramb.dYf() != ay.Bfc)
    {
      AppMethodBeat.o(122035);
      return;
    }
    Object localObject3 = paramb.dYX();
    label98: label104: label124: Object localObject4;
    if (((Collection)localObject3).isEmpty())
    {
      localObject2 = ay.Bfh;
      if (localObject2 == null)
      {
        localObject1 = null;
        if (localObject1 != null)
          break label460;
        if (paramb1 != null)
          paramb1.am(paramb);
        localObject2 = ay.Bfa;
        if (!(paramb instanceof z))
          break label479;
        ((z)paramb).BhQ = ((az)localObject2);
        localObject2 = ((ah)paramb).dZK().iterator();
        while (true)
        {
          if (!((Iterator)localObject2).hasNext())
            break label470;
          localObject3 = (ag)((Iterator)localObject2).next();
          if (localObject1 != null)
            break;
          paramb = null;
          label180: a((a.i.b.a.c.b.b)localObject3, paramb);
        }
      }
    }
    else
    {
      localObject4 = ((Collection)localObject3).iterator();
      localObject1 = null;
      label200: 
      while (((Iterator)localObject4).hasNext())
      {
        Object localObject5 = (a.i.b.a.c.b.b)((Iterator)localObject4).next();
        localObject2 = ((a.i.b.a.c.b.b)localObject5).dYf();
        if ((!$assertionsDisabled) && (localObject2 == ay.Bfc))
        {
          paramb = new AssertionError("Visibility should have been computed for ".concat(String.valueOf(localObject5)));
          AppMethodBeat.o(122035);
          throw paramb;
        }
        if (localObject1 == null)
        {
          localObject1 = localObject2;
        }
        else
        {
          localObject5 = ay.b((az)localObject2, (az)localObject1);
          if (localObject5 == null)
          {
            localObject1 = null;
          }
          else
          {
            if (((Integer)localObject5).intValue() <= 0)
              break label569;
            localObject1 = localObject2;
          }
        }
      }
    }
    label569: 
    while (true)
    {
      break label200;
      if (localObject1 == null)
      {
        localObject2 = null;
        break label98;
      }
      localObject2 = ((Collection)localObject3).iterator();
      while (true)
        if (((Iterator)localObject2).hasNext())
        {
          localObject4 = ay.b((az)localObject1, ((a.i.b.a.c.b.b)((Iterator)localObject2).next()).dYf());
          if ((localObject4 == null) || (((Integer)localObject4).intValue() < 0))
          {
            localObject2 = null;
            break;
          }
        }
      localObject2 = localObject1;
      break label98;
      if (paramb.dYZ() == b.a.Bek)
      {
        localObject3 = ((Collection)localObject3).iterator();
        do
        {
          localObject1 = localObject2;
          if (!((Iterator)localObject3).hasNext())
            break;
          localObject1 = (a.i.b.a.c.b.b)((Iterator)localObject3).next();
        }
        while ((((a.i.b.a.c.b.b)localObject1).dYd() == a.i.b.a.c.b.w.BeE) || (((a.i.b.a.c.b.b)localObject1).dYf().equals(localObject2)));
        localObject1 = null;
        break label104;
      }
      localObject1 = ((az)localObject2).eag();
      break label104;
      label460: localObject2 = localObject1;
      break label124;
      paramb = paramb1;
      break label180;
      label470: AppMethodBeat.o(122035);
      break;
      label479: if ((paramb instanceof a.i.b.a.c.b.c.p))
      {
        ((a.i.b.a.c.b.c.p)paramb).BhQ = ((az)localObject2);
        AppMethodBeat.o(122035);
        break;
      }
      if ((!$assertionsDisabled) && (!(paramb instanceof a.i.b.a.c.b.c.y)))
      {
        paramb = new AssertionError();
        AppMethodBeat.o(122035);
        throw paramb;
      }
      paramb = (a.i.b.a.c.b.c.y)paramb;
      paramb.BhQ = ((az)localObject2);
      if (localObject2 != paramb.BhL.dYf())
        paramb.isDefault = false;
      AppMethodBeat.o(122035);
      break;
    }
  }

  private static void a(a.i.b.a.c.b.b paramb, Set<a.i.b.a.c.b.b> paramSet)
  {
    AppMethodBeat.i(122011);
    if (paramb.dYZ().dZa())
    {
      paramSet.add(paramb);
      AppMethodBeat.o(122011);
    }
    while (true)
    {
      return;
      if (paramb.dYX().isEmpty())
      {
        paramb = new IllegalStateException("No overridden descriptors found for (fake override) ".concat(String.valueOf(paramb)));
        AppMethodBeat.o(122011);
        throw paramb;
      }
      paramb = paramb.dYX().iterator();
      while (paramb.hasNext())
        a((a.i.b.a.c.b.b)paramb.next(), paramSet);
      AppMethodBeat.o(122011);
    }
  }

  private static void a(a.i.b.a.c.b.e parame, Collection<a.i.b.a.c.b.b> paramCollection, i parami)
  {
    AppMethodBeat.i(122023);
    Object localObject;
    int i;
    if (paramCollection.size() >= 2)
    {
      j.4 local4 = new j.4(((a.i.b.a.c.b.b)paramCollection.iterator().next()).dXW());
      a.f.b.j.p(paramCollection, "receiver$0");
      a.f.b.j.p(local4, "predicate");
      if (!((Collection)paramCollection).isEmpty())
      {
        localObject = paramCollection.iterator();
        while (((Iterator)localObject).hasNext())
          if (!((Boolean)local4.am(((Iterator)localObject).next())).booleanValue())
            i = 0;
      }
    }
    while (i != 0)
    {
      paramCollection = paramCollection.iterator();
      while (true)
        if (paramCollection.hasNext())
        {
          a(Collections.singleton((a.i.b.a.c.b.b)paramCollection.next()), parame, parami);
          continue;
          i = 1;
          break;
        }
      AppMethodBeat.o(122023);
    }
    while (true)
    {
      return;
      paramCollection = new LinkedList(paramCollection);
      while (!paramCollection.isEmpty())
      {
        localObject = l.n(paramCollection);
        a(a(localObject, paramCollection, new j.7(), new j.8(parami, (a.i.b.a.c.b.b)localObject)), parame, parami);
      }
      AppMethodBeat.o(122023);
    }
  }

  private static void a(Collection<a.i.b.a.c.b.b> paramCollection, a.i.b.a.c.b.e parame, i parami)
  {
    AppMethodBeat.i(122029);
    Object localObject = a(parame, paramCollection);
    boolean bool = ((Collection)localObject).isEmpty();
    a.i.b.a.c.b.w localw;
    if (bool)
    {
      localw = a(paramCollection, parame);
      if (!bool)
        break label134;
    }
    label134: for (localObject = ay.Bfd; ; localObject = ay.Bfc)
    {
      parame = ((a.i.b.a.c.b.b)a(paramCollection, new j.5())).a(parame, localw, (az)localObject, b.a.Bek);
      parami.a(parame, paramCollection);
      if (($assertionsDisabled) || (!parame.dYX().isEmpty()))
        break label141;
      paramCollection = new AssertionError("Overridden descriptors should be set for " + b.a.Bek);
      AppMethodBeat.o(122029);
      throw paramCollection;
      paramCollection = (Collection<a.i.b.a.c.b.b>)localObject;
      break;
    }
    label141: parami.g(parame);
    AppMethodBeat.o(122029);
  }

  public static void a(Collection<? extends a.i.b.a.c.b.b> paramCollection1, Collection<? extends a.i.b.a.c.b.b> paramCollection2, a.i.b.a.c.b.e parame, i parami)
  {
    AppMethodBeat.i(122021);
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(paramCollection1);
    paramCollection2 = paramCollection2.iterator();
    while (paramCollection2.hasNext())
      localLinkedHashSet.removeAll(a((a.i.b.a.c.b.b)paramCollection2.next(), paramCollection1, parame, parami));
    a(parame, localLinkedHashSet, parami);
    AppMethodBeat.o(122021);
  }

  private static boolean a(a parama1, a.i.b.a.c.l.w paramw1, a parama2, a.i.b.a.c.l.w paramw2)
  {
    AppMethodBeat.i(122027);
    boolean bool = BEm.u(parama1.dYS(), parama2.dYS()).c(paramw1, paramw2);
    AppMethodBeat.o(122027);
    return bool;
  }

  private static boolean a(a parama, Collection<a> paramCollection)
  {
    AppMethodBeat.i(122026);
    paramCollection = paramCollection.iterator();
    boolean bool;
    while (paramCollection.hasNext())
      if (!f(parama, (a)paramCollection.next()))
      {
        bool = false;
        AppMethodBeat.o(122026);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(122026);
    }
  }

  private static boolean a(ar paramar1, ar paramar2, c paramc)
  {
    AppMethodBeat.i(122019);
    Object localObject = paramar1.dWP();
    paramar1 = new ArrayList(paramar2.dWP());
    boolean bool;
    if (((List)localObject).size() != paramar1.size())
    {
      AppMethodBeat.o(122019);
      bool = false;
    }
    while (true)
    {
      return bool;
      localObject = ((List)localObject).iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          a.i.b.a.c.l.w localw = (a.i.b.a.c.l.w)((Iterator)localObject).next();
          paramar2 = paramar1.listIterator();
          while (true)
            if (paramar2.hasNext())
              if (a(localw, (a.i.b.a.c.l.w)paramar2.next(), paramc))
              {
                paramar2.remove();
                break;
              }
          AppMethodBeat.o(122019);
          bool = false;
          break;
        }
      bool = true;
      AppMethodBeat.o(122019);
    }
  }

  private static boolean a(a.i.b.a.c.b.p paramp1, a.i.b.a.c.b.p paramp2)
  {
    AppMethodBeat.i(122025);
    paramp1 = ay.b(paramp1.dYf(), paramp2.dYf());
    boolean bool;
    if ((paramp1 == null) || (paramp1.intValue() >= 0))
    {
      bool = true;
      AppMethodBeat.o(122025);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122025);
    }
  }

  private static boolean a(a.i.b.a.c.l.w paramw1, a.i.b.a.c.l.w paramw2, c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(122018);
    int i;
    if ((a.i.b.a.c.l.y.an(paramw1)) && (a.i.b.a.c.l.y.an(paramw2)))
    {
      i = 1;
      if ((i == 0) && (!paramc.d(paramw1, paramw2)))
        break label57;
      AppMethodBeat.o(122018);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label57: AppMethodBeat.o(122018);
    }
  }

  private j.a b(a parama1, a parama2, a.i.b.a.c.b.e parame)
  {
    AppMethodBeat.i(122012);
    parama1 = a(parama1, parama2, parame, false);
    AppMethodBeat.o(122012);
    return parama1;
  }

  private static <D extends a> boolean c(D paramD1, D paramD2)
  {
    AppMethodBeat.i(122009);
    boolean bool;
    if ((!paramD1.equals(paramD2)) && (b.BDK.d(paramD1.dYU(), paramD2.dYU())))
    {
      AppMethodBeat.o(122009);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramD2 = paramD2.dYU();
      paramD1 = d.d(paramD1).iterator();
      while (true)
        if (paramD1.hasNext())
        {
          a locala = (a)paramD1.next();
          if (b.BDK.d(paramD2, locala))
          {
            AppMethodBeat.o(122009);
            bool = true;
            break;
          }
        }
      bool = false;
      AppMethodBeat.o(122009);
    }
  }

  private static j.a d(a parama1, a parama2)
  {
    AppMethodBeat.i(122015);
    if ((((parama1 instanceof a.i.b.a.c.b.t)) && (!(parama2 instanceof a.i.b.a.c.b.t))) || (((parama1 instanceof ah)) && (!(parama2 instanceof ah))))
    {
      parama1 = j.a.awg("Member kind mismatch");
      AppMethodBeat.o(122015);
    }
    while (true)
    {
      return parama1;
      if ((!(parama1 instanceof a.i.b.a.c.b.t)) && (!(parama1 instanceof ah)))
      {
        parama1 = new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: ".concat(String.valueOf(parama1)));
        AppMethodBeat.o(122015);
        throw parama1;
      }
      if (!parama1.dZg().equals(parama2.dZg()))
      {
        parama1 = j.a.awg("Name mismatch");
        AppMethodBeat.o(122015);
      }
      else
      {
        parama1 = e(parama1, parama2);
        if (parama1 != null)
        {
          AppMethodBeat.o(122015);
        }
        else
        {
          parama1 = null;
          AppMethodBeat.o(122015);
        }
      }
    }
  }

  private static j.a e(a parama1, a parama2)
  {
    int i = 1;
    AppMethodBeat.i(122017);
    int j;
    if (parama1.dYQ() == null)
    {
      j = 1;
      if (parama2.dYQ() != null)
        break label53;
      label28: if (j == i)
        break label58;
      parama1 = j.a.awg("Receiver presence mismatch");
      AppMethodBeat.o(122017);
    }
    while (true)
    {
      return parama1;
      j = 0;
      break;
      label53: i = 0;
      break label28;
      label58: if (parama1.dYV().size() != parama2.dYV().size())
      {
        parama1 = j.a.awg("Value parameter number mismatch");
        AppMethodBeat.o(122017);
      }
      else
      {
        parama1 = null;
        AppMethodBeat.o(122017);
      }
    }
  }

  private static List<a.i.b.a.c.l.w> e(a parama)
  {
    AppMethodBeat.i(122020);
    ak localak = parama.dYQ();
    ArrayList localArrayList = new ArrayList();
    if (localak != null)
      localArrayList.add(localak.dZS());
    parama = parama.dYV().iterator();
    while (parama.hasNext())
      localArrayList.add(((au)parama.next()).dZS());
    AppMethodBeat.o(122020);
    return localArrayList;
  }

  public static boolean f(a parama1, a parama2)
  {
    AppMethodBeat.i(122024);
    a.i.b.a.c.l.w localw1 = parama1.dYT();
    a.i.b.a.c.l.w localw2 = parama2.dYT();
    if ((!$assertionsDisabled) && (localw1 == null))
    {
      parama1 = new AssertionError("Return type of " + parama1 + " is null");
      AppMethodBeat.o(122024);
      throw parama1;
    }
    if ((!$assertionsDisabled) && (localw2 == null))
    {
      parama1 = new AssertionError("Return type of " + parama2 + " is null");
      AppMethodBeat.o(122024);
      throw parama1;
    }
    boolean bool;
    if (!a(parama1, parama2))
    {
      AppMethodBeat.o(122024);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((parama1 instanceof a.i.b.a.c.b.t))
      {
        if ((!$assertionsDisabled) && (!(parama2 instanceof a.i.b.a.c.b.t)))
        {
          parama1 = new AssertionError("b is " + parama2.getClass());
          AppMethodBeat.o(122024);
          throw parama1;
        }
        bool = a(parama1, localw1, parama2, localw2);
        AppMethodBeat.o(122024);
      }
      else
      {
        if (!(parama1 instanceof ah))
          break;
        if ((!$assertionsDisabled) && (!(parama2 instanceof ah)))
        {
          parama1 = new AssertionError("b is " + parama2.getClass());
          AppMethodBeat.o(122024);
          throw parama1;
        }
        ah localah1 = (ah)parama1;
        ah localah2 = (ah)parama2;
        aj localaj1 = localah1.dZJ();
        aj localaj2 = localah2.dZJ();
        if ((localaj1 == null) || (localaj2 == null));
        for (bool = true; ; bool = a(localaj1, localaj2))
        {
          if (bool)
            break label340;
          AppMethodBeat.o(122024);
          bool = false;
          break;
        }
        label340: if ((localah1.dZZ()) && (localah2.dZZ()))
        {
          bool = BEm.u(parama1.dYS(), parama2.dYS()).d(localw1, localw2);
          AppMethodBeat.o(122024);
        }
        else if (((localah1.dZZ()) || (!localah2.dZZ())) && (a(parama1, localw1, parama2, localw2)))
        {
          AppMethodBeat.o(122024);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(122024);
          bool = false;
        }
      }
    }
    parama1 = new IllegalArgumentException("Unexpected callable: " + parama1.getClass());
    AppMethodBeat.o(122024);
    throw parama1;
  }

  public static j.a.a g(a parama1, a parama2)
  {
    AppMethodBeat.i(122034);
    j.a.a locala = BEm.b(parama2, parama1, null).BEy;
    parama1 = BEm.b(parama1, parama2, null).BEy;
    if ((locala == j.a.a.BEA) && (parama1 == j.a.a.BEA))
    {
      parama1 = j.a.a.BEA;
      AppMethodBeat.o(122034);
    }
    while (true)
    {
      return parama1;
      if ((locala == j.a.a.BEC) || (parama1 == j.a.a.BEC))
      {
        parama1 = j.a.a.BEC;
        AppMethodBeat.o(122034);
      }
      else
      {
        parama1 = j.a.a.BEB;
        AppMethodBeat.o(122034);
      }
    }
  }

  private static <D extends a> Set<D> o(Set<D> paramSet)
  {
    AppMethodBeat.i(122008);
    j.2 local2 = new j.2();
    if (paramSet.size() <= 1)
      AppMethodBeat.o(122008);
    while (true)
    {
      return paramSet;
      LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      Iterator localIterator1 = paramSet.iterator();
      while (localIterator1.hasNext())
      {
        Object localObject1 = localIterator1.next();
        Iterator localIterator2 = localLinkedHashSet.iterator();
        while (true)
        {
          if (!localIterator2.hasNext())
            break label155;
          Object localObject2 = (o)local2.m(localObject1, localIterator2.next());
          a locala = (a)((o)localObject2).first;
          localObject2 = (a)((o)localObject2).second;
          if (c(locala, (a)localObject2))
            localIterator2.remove();
          else
            if (c((a)localObject2, locala))
              break;
        }
        label155: localLinkedHashSet.add(localObject1);
      }
      if ((!$assertionsDisabled) && (localLinkedHashSet.isEmpty()))
      {
        paramSet = new AssertionError("All candidates filtered out from ".concat(String.valueOf(paramSet)));
        AppMethodBeat.o(122008);
        throw paramSet;
      }
      AppMethodBeat.o(122008);
      paramSet = localLinkedHashSet;
    }
  }

  private c u(List<ar> paramList1, List<ar> paramList2)
  {
    AppMethodBeat.i(122016);
    if ((!$assertionsDisabled) && (paramList1.size() != paramList2.size()))
    {
      paramList1 = new AssertionError("Should be the same number of type parameters: " + paramList1 + " vs " + paramList2);
      AppMethodBeat.o(122016);
      throw paramList1;
    }
    if (paramList1.isEmpty())
    {
      paramList1 = a.i.b.a.c.l.a.d.b(this.BEn);
      AppMethodBeat.o(122016);
    }
    while (true)
    {
      return paramList1;
      HashMap localHashMap = new HashMap();
      for (int i = 0; i < paramList1.size(); i++)
        localHashMap.put(((ar)paramList1.get(i)).dXY(), ((ar)paramList2.get(i)).dXY());
      paramList1 = a.i.b.a.c.l.a.d.b(new j.3(this, localHashMap));
      AppMethodBeat.o(122016);
    }
  }

  private static Set<a.i.b.a.c.b.b> w(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(122010);
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    a(paramb, localLinkedHashSet);
    AppMethodBeat.o(122010);
    return localLinkedHashSet;
  }

  public final j.a a(a parama1, a parama2, a.i.b.a.c.b.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(122013);
    Object localObject1 = a(parama1, parama2, paramBoolean);
    if (((j.a)localObject1).BEy == j.a.a.BEA);
    Object localObject2;
    Object localObject3;
    for (int i = 1; ; i = 0)
    {
      localObject2 = BEl.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (e)((Iterator)localObject2).next();
        if ((((e)localObject3).eaX() != e.a.BDZ) && ((i == 0) || (((e)localObject3).eaX() != e.a.BEa)))
        {
          localObject3 = ((e)localObject3).a(parama1, parama2, parame);
          switch (j.9.BEu[localObject3.ordinal()])
          {
          default:
            break;
          case 1:
            i = 1;
          case 2:
          case 3:
          }
        }
      }
    }
    parama1 = j.a.awh("External condition failed");
    AppMethodBeat.o(122013);
    while (true)
    {
      return parama1;
      parama1 = j.a.awg("External condition");
      AppMethodBeat.o(122013);
      continue;
      if (i == 0)
      {
        AppMethodBeat.o(122013);
        parama1 = (a)localObject1;
      }
      else
      {
        localObject1 = BEl.iterator();
        while (true)
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (e)((Iterator)localObject1).next();
            if (((e)localObject2).eaX() == e.a.BDZ)
            {
              localObject3 = ((e)localObject2).a(parama1, parama2, parame);
              switch (j.9.BEu[localObject3.ordinal()])
              {
              default:
                break;
              case 1:
                parama1 = new IllegalStateException("Contract violation in " + localObject2.getClass().getName() + " condition. It's not supposed to end with success");
                AppMethodBeat.o(122013);
                throw parama1;
              case 2:
                parama1 = j.a.awh("External condition failed");
                AppMethodBeat.o(122013);
                break;
              case 3:
                parama1 = j.a.awg("External condition");
                AppMethodBeat.o(122013);
                break;
              }
            }
          }
        parama1 = j.a.ejs();
        AppMethodBeat.o(122013);
      }
    }
  }

  public final j.a a(a parama1, a parama2, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(122014);
    Object localObject = d(parama1, parama2);
    if (localObject != null)
    {
      AppMethodBeat.o(122014);
      parama1 = (a)localObject;
    }
    while (true)
    {
      return parama1;
      List localList1 = e(parama1);
      List localList2 = e(parama2);
      List localList3 = parama1.dYS();
      List localList4 = parama2.dYS();
      if (localList3.size() != localList4.size())
      {
        while (true)
        {
          if (j >= localList1.size())
            break label149;
          if (!c.BKs.d((a.i.b.a.c.l.w)localList1.get(j), (a.i.b.a.c.l.w)localList2.get(j)))
          {
            parama1 = j.a.awg("Type parameter number mismatch");
            AppMethodBeat.o(122014);
            break;
          }
          j++;
        }
        label149: parama1 = j.a.awh("Type parameter number mismatch");
        AppMethodBeat.o(122014);
      }
      else
      {
        localObject = u(localList3, localList4);
        for (j = 0; ; j++)
        {
          if (j >= localList3.size())
            break label244;
          if (!a((ar)localList3.get(j), (ar)localList4.get(j), (c)localObject))
          {
            parama1 = j.a.awg("Type parameter bounds mismatch");
            AppMethodBeat.o(122014);
            break;
          }
        }
        label244: for (j = 0; ; j++)
        {
          if (j >= localList1.size())
            break label313;
          if (!a((a.i.b.a.c.l.w)localList1.get(j), (a.i.b.a.c.l.w)localList2.get(j), (c)localObject))
          {
            parama1 = j.a.awg("Value parameter type mismatch");
            AppMethodBeat.o(122014);
            break;
          }
        }
        label313: if (((parama1 instanceof a.i.b.a.c.b.t)) && ((parama2 instanceof a.i.b.a.c.b.t)) && (((a.i.b.a.c.b.t)parama1).dZv() != ((a.i.b.a.c.b.t)parama2).dZv()))
        {
          parama1 = j.a.awh("Incompatible suspendability");
          AppMethodBeat.o(122014);
        }
        else if (paramBoolean)
        {
          parama1 = parama1.dYT();
          parama2 = parama2.dYT();
          if ((parama1 != null) && (parama2 != null))
          {
            j = i;
            if (a.i.b.a.c.l.y.an(parama2))
            {
              j = i;
              if (a.i.b.a.c.l.y.an(parama1))
                j = 1;
            }
            if ((j == 0) && (!((c)localObject).c(parama2, parama1)))
            {
              parama1 = j.a.awh("Return type mismatch");
              AppMethodBeat.o(122014);
            }
          }
        }
        else
        {
          parama1 = j.a.ejs();
          AppMethodBeat.o(122014);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.j
 * JD-Core Version:    0.6.2
 */