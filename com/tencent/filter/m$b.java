package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class m$b extends m
{
  float x;
  float y;

  public m$b(String paramString, float paramFloat1, float paramFloat2)
  {
    super(paramString);
    this.x = paramFloat1;
    this.y = paramFloat2;
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86390);
    if (this.handle < 0)
      AppMethodBeat.o(86390);
    while (true)
    {
      return;
      GLES20.glUniform2f(this.handle, this.x, this.y);
      g.checkGlError("Float2fParam setParams");
      AppMethodBeat.o(86390);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(86391);
    String str = this.name + "=" + this.x + ", " + this.y;
    AppMethodBeat.o(86391);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.b
 * JD-Core Version:    0.6.2
 */