package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.b.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

class b$2
  implements Runnable
{
  b$2(b paramb, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte, long paramLong)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67438);
    if ((b.b(this.f) == null) || (b.b(this.f).n() != this.a) || (b.b(this.f).o() != this.b))
    {
      if (b.b(this.f) != null)
      {
        b.b(this.f).d();
        b.a(this.f, null);
      }
      b.a(this.f, new k(this.c));
      if (!b.b(this.f).a())
      {
        b.a(this.f).b();
        b.a(this.f, null);
        b.a(this.f, null);
        AppMethodBeat.o(67438);
      }
    }
    while (true)
    {
      return;
      b.b(this.f).a(true);
      b.b(this.f).a(this.a, this.b);
      b.b(this.f).a(this.d);
      GLES20.glViewport(0, 0, this.a, this.b);
      int i = b.b(this.f).q();
      GLES20.glFlush();
      b localb = this.f;
      localb.a(i, b.c(localb).width, b.c(this.f).height, this.e);
      AppMethodBeat.o(67438);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.b.2
 * JD-Core Version:    0.6.2
 */