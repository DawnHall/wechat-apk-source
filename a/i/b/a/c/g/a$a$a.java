package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FilterInputStream;
import java.io.InputStream;

final class a$a$a extends FilterInputStream
{
  private int limit;

  a$a$a(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    this.limit = paramInt;
  }

  public final int available()
  {
    AppMethodBeat.i(121407);
    int i = Math.min(super.available(), this.limit);
    AppMethodBeat.o(121407);
    return i;
  }

  public final int read()
  {
    AppMethodBeat.i(121408);
    int i;
    if (this.limit <= 0)
    {
      i = -1;
      AppMethodBeat.o(121408);
    }
    while (true)
    {
      return i;
      i = super.read();
      if (i >= 0)
        this.limit -= 1;
      AppMethodBeat.o(121408);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121409);
    if (this.limit <= 0)
    {
      paramInt1 = -1;
      AppMethodBeat.o(121409);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = super.read(paramArrayOfByte, paramInt1, Math.min(paramInt2, this.limit));
      if (paramInt1 >= 0)
        this.limit -= paramInt1;
      AppMethodBeat.o(121409);
    }
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(121410);
    paramLong = super.skip(Math.min(paramLong, this.limit));
    if (paramLong >= 0L)
      this.limit = ((int)(this.limit - paramLong));
    AppMethodBeat.o(121410);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.a.a.a
 * JD-Core Version:    0.6.2
 */