package com.tencent.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.StringTokenizer;

public final class b
{
  private static volatile a Axj;

  static
  {
    AppMethodBeat.i(63719);
    try
    {
      Class.forName("android.util.Log");
      a locala = new com/tencent/e/a/a;
      locala.<init>();
      Axj = locala;
      AppMethodBeat.o(63719);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        a local1 = new a()
        {
          public final boolean isLoggable(String paramAnonymousString, int paramAnonymousInt)
          {
            return true;
          }

          public final void println(int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
          {
            AppMethodBeat.i(63720);
            System.out.println("[" + paramAnonymousString1 + "] " + paramAnonymousString2);
            AppMethodBeat.o(63720);
          }
        };
    }
  }

  public static void a(a parama)
  {
    Axj = parama;
  }

  private static void b(int paramInt, String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63707);
    a locala = Axj;
    if ((locala == null) || (!locala.isLoggable(paramString1, paramInt)))
      AppMethodBeat.o(63707);
    while (true)
    {
      return;
      locala.println(paramInt, paramString1, String.format(paramString2, paramArrayOfObject));
      AppMethodBeat.o(63707);
    }
  }

  private static void b(int paramInt, String paramString, Throwable paramThrowable)
  {
    AppMethodBeat.i(63706);
    a locala = Axj;
    if ((locala == null) || (!locala.isLoggable(paramString, paramInt)))
      AppMethodBeat.o(63706);
    while (true)
    {
      return;
      StringWriter localStringWriter = new StringWriter(512);
      paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
      paramThrowable = new StringTokenizer(localStringWriter.toString(), "\n");
      while (paramThrowable.hasMoreTokens())
        locala.println(paramInt, paramString, paramThrowable.nextToken());
      AppMethodBeat.o(63706);
    }
  }

  public static void b(String paramString1, Throwable paramThrowable, String paramString2)
  {
    AppMethodBeat.i(63709);
    if (!paramString2.isEmpty())
      println(6, paramString1, paramString2);
    b(6, paramString1, paramThrowable);
    AppMethodBeat.o(63709);
  }

  public static void b(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63711);
    b(6, paramString1, paramString2, paramArrayOfObject);
    b(6, paramString1, paramThrowable);
    AppMethodBeat.o(63711);
  }

  public static void c(String paramString1, Throwable paramThrowable, String paramString2)
  {
    AppMethodBeat.i(63713);
    if (!paramString2.isEmpty())
      println(5, paramString1, paramString2);
    b(5, paramString1, paramThrowable);
    AppMethodBeat.o(63713);
  }

  public static void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63717);
    println(3, paramString1, paramString2);
    AppMethodBeat.o(63717);
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63718);
    b(3, paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(63718);
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63708);
    println(6, paramString1, paramString2);
    AppMethodBeat.o(63708);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63710);
    b(6, paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(63710);
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63715);
    println(4, paramString1, paramString2);
    AppMethodBeat.o(63715);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63716);
    b(4, paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(63716);
  }

  private static void println(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(63705);
    a locala = Axj;
    if (locala == null)
      AppMethodBeat.o(63705);
    while (true)
    {
      return;
      locala.println(paramInt, paramString1, paramString2);
      AppMethodBeat.o(63705);
    }
  }

  public static void w(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63712);
    println(5, paramString1, paramString2);
    AppMethodBeat.o(63712);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63714);
    b(5, paramString1, paramString2, paramArrayOfObject);
    AppMethodBeat.o(63714);
  }

  public static abstract interface a
  {
    public abstract boolean isLoggable(String paramString, int paramInt);

    public abstract void println(int paramInt, String paramString1, String paramString2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.e.a.b
 * JD-Core Version:    0.6.2
 */