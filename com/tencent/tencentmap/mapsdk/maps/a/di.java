package com.tencent.tencentmap.mapsdk.maps.a;

import java.io.Serializable;
import java.util.Map;

public final class di
  implements Serializable
{
  private long a;
  private String b;
  private Map<String, String> c;
  private String d;
  private String e;

  public final String a()
  {
    return this.e;
  }

  public final void a(long paramLong)
  {
    this.a = paramLong;
  }

  public final void a(String paramString)
  {
    this.e = paramString;
  }

  public final void a(Map<String, String> paramMap)
  {
    try
    {
      this.c = paramMap;
      return;
    }
    finally
    {
      paramMap = finally;
    }
    throw paramMap;
  }

  public final String b()
  {
    return this.d;
  }

  public final void b(String paramString)
  {
    this.d = paramString;
  }

  public final long c()
  {
    return this.a;
  }

  public final void c(String paramString)
  {
    try
    {
      this.b = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final String d()
  {
    try
    {
      String str = this.b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Map<String, String> e()
  {
    try
    {
      Map localMap = this.c;
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.di
 * JD-Core Version:    0.6.2
 */