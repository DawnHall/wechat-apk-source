package a.i.b.a.c.b.a;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.f.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class g$a$a
  implements g
{
  public final boolean isEmpty()
  {
    return true;
  }

  public final Iterator<c> iterator()
  {
    AppMethodBeat.i(119330);
    Iterator localIterator = ((List)v.AUP).iterator();
    AppMethodBeat.o(119330);
    return localIterator;
  }

  public final boolean j(b paramb)
  {
    AppMethodBeat.i(119331);
    j.p(paramb, "fqName");
    boolean bool = g.b.b(this, paramb);
    AppMethodBeat.o(119331);
    return bool;
  }

  public final String toString()
  {
    return "EMPTY";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.g.a.a
 * JD-Core Version:    0.6.2
 */