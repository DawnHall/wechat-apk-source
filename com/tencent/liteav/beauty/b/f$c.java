package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.matrix.trace.core.AppMethodBeat;

class f$c extends r
{
  int r;
  int s;
  float t = 1.5F;

  public f$c()
  {
    super(null, null);
  }

  void a(float paramFloat)
  {
    AppMethodBeat.i(67048);
    this.t = paramFloat;
    a(this.r, this.t / this.e);
    a(this.s, this.t / this.f);
    AppMethodBeat.o(67048);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67049);
    super.a(paramInt1, paramInt2);
    a(this.t);
    AppMethodBeat.o(67049);
  }

  public boolean a()
  {
    AppMethodBeat.i(67046);
    NativeLoad.getInstance();
    this.a = NativeLoad.nativeLoadGLProgram(2);
    if ((this.a != 0) && (b()));
    for (this.g = true; ; this.g = false)
    {
      c();
      boolean bool = this.g;
      AppMethodBeat.o(67046);
      return bool;
    }
  }

  public boolean b()
  {
    AppMethodBeat.i(67047);
    boolean bool;
    if (super.b())
    {
      this.r = GLES20.glGetUniformLocation(this.a, "texelWidthOffset");
      this.s = GLES20.glGetUniformLocation(this.a, "texelHeightOffset");
      bool = true;
      AppMethodBeat.o(67047);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67047);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.f.c
 * JD-Core Version:    0.6.2
 */