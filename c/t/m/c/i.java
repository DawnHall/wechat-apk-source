package c.t.m.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class i
{
  public static String a = "6.4.9";
  private static i c = null;
  private Context b;
  private List<a> d;

  private i(Context paramContext)
  {
    AppMethodBeat.i(136363);
    this.d = new ArrayList();
    this.b = paramContext;
    AppMethodBeat.o(136363);
  }

  public static i a(Context paramContext)
  {
    AppMethodBeat.i(136364);
    if (c == null);
    try
    {
      if (c == null)
      {
        i locali = new c/t/m/c/i;
        locali.<init>(paramContext);
        c = locali;
      }
      paramContext = c;
      AppMethodBeat.o(136364);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(136364);
    }
    throw paramContext;
  }

  private void b()
  {
    AppMethodBeat.i(136366);
    File localFile = new File(this.b.getFilesDir(), "TencentLocation/comp");
    if (!localFile.exists())
      localFile.mkdirs();
    localFile = new File(this.b.getFilesDir(), "TencentLocation/odex");
    if (!localFile.exists())
      localFile.mkdirs();
    l.a(this.b);
    AppMethodBeat.o(136366);
  }

  public boolean a()
  {
    boolean bool = false;
    AppMethodBeat.i(136365);
    b();
    String str = a;
    Object localObject = q.b(this.b, "__Tencent_Cover_SDK_Version__", "");
    e.a(this.b).a("DCV", (String)localObject + "_" + str);
    if (!str.equals(localObject))
    {
      System.currentTimeMillis();
      if (!l.c(this.b))
      {
        AppMethodBeat.o(136365);
        return bool;
      }
      q.a(this.b, "__Tencent_Cover_SDK_Version__", str);
    }
    localObject = q.b(this.b, "__SP_Tencent_Loc_COMP_INFO__", "");
    e.a(this.b).a("DLC", (String)localObject);
    this.d = q.b((String)localObject);
    if (this.d.size() == 0)
      e.a(this.b).a("DLC", "localComp parse error");
    localObject = q.c(this.b);
    if ((localObject == null) || (((List)localObject).size() == 0) || (this.d.size() == 0))
    {
      e.a(this.b).a("DLC", "localComp file error");
      i = 0;
    }
    int j;
    while (true)
      if (i == 0)
      {
        e.a(this.b).a("DCR", "goback");
        System.currentTimeMillis();
        if (!l.b(this.b))
        {
          e.a(this.b).a("DCR", "copy from asset");
          if (!l.c(this.b))
          {
            e.a(this.b).a("DCR", "copy from asset failed");
            AppMethodBeat.o(136365);
            break;
            System.currentTimeMillis();
            Iterator localIterator1 = this.d.iterator();
            j = 1;
            label308: i = j;
            if (!localIterator1.hasNext())
              continue;
            a locala = (a)localIterator1.next();
            Iterator localIterator2 = ((List)localObject).iterator();
            String[] arrayOfString;
            do
            {
              if (!localIterator2.hasNext())
                break;
              arrayOfString = ((String)localIterator2.next()).split(",");
            }
            while ((arrayOfString.length != 2) || (!locala.c.equals(arrayOfString[0])) || (!String.valueOf(locala.d).equals(arrayOfString[1])));
          }
        }
      }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        j = 0;
      while (true)
      {
        break label308;
        q.a(this.b, "__Tencent_Cover_SDK_Version__", str);
        AppMethodBeat.o(136365);
        bool = true;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     c.t.m.c.i
 * JD-Core Version:    0.6.2
 */