package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class m$h extends m
{
  int[] value;

  public m$h(String paramString)
  {
    super(paramString);
    AppMethodBeat.i(86404);
    this.value = new int[0];
    AppMethodBeat.o(86404);
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86405);
    if (this.handle < 0)
      AppMethodBeat.o(86405);
    while (true)
    {
      return;
      GLES20.glUniform1iv(this.handle, this.value.length, this.value, 0);
      g.checkGlError("FloatParam setParams");
      AppMethodBeat.o(86405);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(86406);
    String str = this.name + "=" + this.value;
    AppMethodBeat.o(86406);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.h
 * JD-Core Version:    0.6.2
 */