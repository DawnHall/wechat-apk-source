package com.tencent.map.lib.element;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.di;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
{
  int A;
  private int B;
  ArrayList<GeoPoint> a;
  ArrayList<GeoPoint> b;
  int[] c;
  int[] d;
  int[] e;
  int[] f;
  float g;
  boolean h;
  boolean i;
  float j;
  String k;
  boolean l;
  float m;
  boolean n;
  int o;
  boolean p;
  List<GeoPoint> q;
  int r;
  boolean s;
  Rect t;
  int u;
  String v;
  float w;
  int x;
  int y;
  List<Integer> z;

  public e()
  {
    AppMethodBeat.i(97876);
    this.j = 9.0F;
    this.k = "";
    this.l = true;
    this.m = 1.0F;
    this.n = true;
    this.o = 0;
    this.p = false;
    this.r = 0;
    this.s = false;
    this.t = new Rect();
    this.u = 0;
    this.v = "";
    this.w = -1.0F;
    this.x = -1;
    this.y = -15248742;
    this.z = null;
    this.B = di.c;
    this.A = -7829368;
    AppMethodBeat.o(97876);
  }

  public int a()
  {
    return this.o;
  }

  public e a(int paramInt)
  {
    this.A = paramInt;
    return this;
  }

  public e a(int paramInt, List<GeoPoint> paramList)
  {
    AppMethodBeat.i(97881);
    if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3))
    {
      paramList = new IllegalArgumentException("bezier曲线阶数为1，2，3");
      AppMethodBeat.o(97881);
      throw paramList;
    }
    if ((paramInt == 1) && (paramList != null) && ((paramList == null) || (paramList.size() != 0)))
    {
      paramList = new IllegalArgumentException("bezier曲线控制点数目错误");
      AppMethodBeat.o(97881);
      throw paramList;
    }
    if ((paramInt == 2) && ((paramList == null) || ((paramList != null) && (paramList.size() != 1))))
    {
      paramList = new IllegalArgumentException("bezier曲线控制点数目错误");
      AppMethodBeat.o(97881);
      throw paramList;
    }
    if ((paramInt == 3) && ((paramList == null) || ((paramList != null) && (paramList.size() != 2))))
    {
      paramList = new IllegalArgumentException("bezier曲线控制点数目错误");
      AppMethodBeat.o(97881);
      throw paramList;
    }
    this.r = paramInt;
    this.q = paramList;
    AppMethodBeat.o(97881);
    return this;
  }

  public e a(String paramString)
  {
    this.k = paramString;
    return this;
  }

  public e a(List<GeoPoint> paramList)
  {
    AppMethodBeat.i(97877);
    if ((paramList == null) || (paramList.size() < 2))
    {
      paramList = new IllegalArgumentException("参数points不能小于2!");
      AppMethodBeat.o(97877);
      throw paramList;
    }
    this.b = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      GeoPoint localGeoPoint = (GeoPoint)localIterator.next();
      if (localGeoPoint != null)
        this.b.add(localGeoPoint);
    }
    if (this.b.size() < 2)
    {
      paramList = new IllegalArgumentException("参数points存在null值");
      AppMethodBeat.o(97877);
      throw paramList;
    }
    this.a = new ArrayList(paramList.size());
    this.a.addAll(this.b);
    AppMethodBeat.o(97877);
    return this;
  }

  public e a(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(97878);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      paramArrayOfInt = new IllegalArgumentException("参数startIndexes不能为空!");
      AppMethodBeat.o(97878);
      throw paramArrayOfInt;
    }
    this.c = paramArrayOfInt;
    AppMethodBeat.o(97878);
    return this;
  }

  public e a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i1 = 0;
    AppMethodBeat.i(97880);
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length <= 0) || (paramArrayOfInt2 == null) || (paramArrayOfInt2.length <= 0))
    {
      paramArrayOfInt1 = new IllegalArgumentException("参数colors 、borderColors为空，或者两者长度不同");
      AppMethodBeat.o(97880);
      throw paramArrayOfInt1;
    }
    if (!this.h)
    {
      this.d = paramArrayOfInt1;
      AppMethodBeat.o(97880);
    }
    while (true)
    {
      return this;
      int[] arrayOfInt = paramArrayOfInt2;
      if (paramArrayOfInt2.length < paramArrayOfInt1.length)
      {
        arrayOfInt = new int[paramArrayOfInt1.length];
        i2 = 0;
        if (i2 < paramArrayOfInt1.length)
        {
          if (i2 < paramArrayOfInt2.length)
            arrayOfInt[i2] = paramArrayOfInt2[i2];
          while (true)
          {
            i2++;
            break;
            arrayOfInt[i2] = paramArrayOfInt2[(paramArrayOfInt2.length - 1)];
          }
        }
      }
      ArrayList localArrayList = new ArrayList();
      this.d = new int[paramArrayOfInt1.length];
      for (int i2 = 0; i2 < paramArrayOfInt1.length; i2++)
      {
        paramArrayOfInt2 = new e.a(this, paramArrayOfInt1[i2], arrayOfInt[i2]);
        if (!localArrayList.contains(paramArrayOfInt2))
          localArrayList.add(paramArrayOfInt2);
        this.d[i2] = localArrayList.indexOf(paramArrayOfInt2);
      }
      int i3 = localArrayList.size();
      this.e = new int[i3];
      this.f = new int[i3];
      for (i2 = i1; i2 < i3; i2++)
      {
        this.e[i2] = ((e.a)localArrayList.get(i2)).b;
        this.f[i2] = ((e.a)localArrayList.get(i2)).a;
      }
      AppMethodBeat.o(97880);
    }
  }

  @Deprecated
  public void a(float paramFloat)
  {
    this.m = paramFloat;
  }

  @Deprecated
  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public float b()
  {
    return this.w;
  }

  public e b(float paramFloat)
  {
    this.j = paramFloat;
    return this;
  }

  public e b(int paramInt)
  {
    this.o = paramInt;
    return this;
  }

  public e b(String paramString)
  {
    this.v = paramString;
    return this;
  }

  public e b(List<Integer> paramList)
  {
    AppMethodBeat.i(97882);
    if ((paramList != null) && (paramList.size() % 2 != 0))
      paramList.add(paramList.get(paramList.size() - 1));
    this.z = paramList;
    AppMethodBeat.o(97882);
    return this;
  }

  public e b(boolean paramBoolean)
  {
    this.h = paramBoolean;
    return this;
  }

  public e b(int[] paramArrayOfInt)
  {
    int i1 = 0;
    AppMethodBeat.i(97879);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      paramArrayOfInt = new IllegalArgumentException("参数colors不能为空!");
      AppMethodBeat.o(97879);
      throw paramArrayOfInt;
    }
    if (!this.h)
    {
      this.d = paramArrayOfInt;
      AppMethodBeat.o(97879);
    }
    while (true)
    {
      return this;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(Integer.valueOf(this.A));
      for (int i2 = 0; i2 < paramArrayOfInt.length; i2++)
      {
        if (!localArrayList.contains(Integer.valueOf(paramArrayOfInt[i2])))
          localArrayList.add(Integer.valueOf(paramArrayOfInt[i2]));
        paramArrayOfInt[i2] = localArrayList.indexOf(Integer.valueOf(paramArrayOfInt[i2]));
      }
      this.d = paramArrayOfInt;
      int i3 = localArrayList.size();
      this.e = new int[i3];
      for (i2 = i1; i2 < i3; i2++)
        this.e[i2] = ((Integer)localArrayList.get(i2)).intValue();
      AppMethodBeat.o(97879);
    }
  }

  public int c()
  {
    return this.B;
  }

  public e c(float paramFloat)
  {
    this.g = paramFloat;
    return this;
  }

  public e c(int paramInt)
  {
    this.u = paramInt;
    return this;
  }

  public e c(boolean paramBoolean)
  {
    this.i = paramBoolean;
    return this;
  }

  public e d(float paramFloat)
  {
    this.w = paramFloat;
    return this;
  }

  public e d(boolean paramBoolean)
  {
    this.n = paramBoolean;
    return this;
  }

  public void d(int paramInt)
  {
    this.B = paramInt;
  }

  public e e(boolean paramBoolean)
  {
    this.p = paramBoolean;
    return this;
  }

  public e f(boolean paramBoolean)
  {
    this.s = paramBoolean;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.element.e
 * JD-Core Version:    0.6.2
 */