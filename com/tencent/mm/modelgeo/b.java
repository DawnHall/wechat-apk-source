package com.tencent.mm.modelgeo;

import android.os.Bundle;

public abstract interface b
{
  public abstract void a(a parama);

  public abstract void b(a parama);

  public abstract void c(a parama);

  public static abstract interface a
  {
    public abstract boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3);
  }

  public static abstract interface b extends b.a
  {
    public abstract boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, Bundle paramBundle);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.b
 * JD-Core Version:    0.6.2
 */