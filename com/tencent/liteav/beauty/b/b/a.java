package com.tencent.liteav.beauty.b.b;

import com.tencent.liteav.beauty.b.p;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a extends com.tencent.liteav.beauty.b.b
{
  private b r = null;
  private p s = null;
  private String t = "TXCBeauty3Filter";
  private float u = 0.0F;
  private float v = 0.0F;
  private float w = 0.0F;
  private float x = 0.0F;

  private boolean c(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(67018);
    if (this.r == null)
    {
      this.r = new b();
      this.r.a(true);
      if (!this.r.a())
        AppMethodBeat.o(67018);
    }
    while (true)
    {
      return bool;
      this.r.a(paramInt1, paramInt2);
      if (this.s == null)
      {
        this.s = new p();
        this.s.a(true);
        if (!this.s.a())
          AppMethodBeat.o(67018);
      }
      else
      {
        this.s.a(paramInt1, paramInt2);
        AppMethodBeat.o(67018);
        bool = true;
      }
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67017);
    if ((this.e == paramInt1) && (this.f == paramInt2))
      AppMethodBeat.o(67017);
    while (true)
    {
      return;
      this.e = paramInt1;
      this.f = paramInt2;
      c(paramInt1, paramInt2);
      AppMethodBeat.o(67017);
    }
  }

  public int b(int paramInt)
  {
    AppMethodBeat.i(67019);
    int i;
    if ((this.u <= 0.0F) && (this.v <= 0.0F))
    {
      i = paramInt;
      if (this.w <= 0.0F);
    }
    else
    {
      i = this.r.b(paramInt);
    }
    paramInt = i;
    if (this.x > 0.0F)
      paramInt = this.s.b(i);
    AppMethodBeat.o(67019);
    return paramInt;
  }

  public boolean b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67016);
    boolean bool = c(paramInt1, paramInt2);
    AppMethodBeat.o(67016);
    return bool;
  }

  public void c(int paramInt)
  {
    AppMethodBeat.i(67020);
    this.u = (paramInt / 10.0F);
    if (this.r != null)
      this.r.a(this.u);
    AppMethodBeat.o(67020);
  }

  public void d(int paramInt)
  {
    AppMethodBeat.i(67021);
    this.v = (paramInt / 10.0F);
    if (this.r != null)
      this.r.b(this.v);
    AppMethodBeat.o(67021);
  }

  public void e()
  {
    AppMethodBeat.i(67025);
    super.e();
    q();
    AppMethodBeat.o(67025);
  }

  public void e(int paramInt)
  {
    AppMethodBeat.i(67022);
    this.w = (paramInt / 10.0F);
    if (this.r != null)
      this.r.c(this.w);
    AppMethodBeat.o(67022);
  }

  public void f(int paramInt)
  {
    AppMethodBeat.i(67023);
    this.x = (paramInt / 20.0F);
    if (this.s != null)
      this.s.a(this.x);
    AppMethodBeat.o(67023);
  }

  void q()
  {
    AppMethodBeat.i(67024);
    if (this.r != null)
    {
      this.r.e();
      this.r = null;
    }
    if (this.s != null)
    {
      this.s.e();
      this.s = null;
    }
    AppMethodBeat.o(67024);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.b.a
 * JD-Core Version:    0.6.2
 */