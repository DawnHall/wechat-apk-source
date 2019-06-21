package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class n extends g
{
  private static float[] C = { 0.1826F, 0.6142F, 0.062F, -0.1006F, -0.3386F, 0.4392F, 0.4392F, -0.3989F, -0.0403F };
  private static float[] D = { 0.256816F, 0.504154F, 0.0979137F, -0.148246F, -0.29102F, 0.439266F, 0.439271F, -0.367833F, -0.071438F };
  private static float[] E = { 0.0625F, 0.5F, 0.5F };
  private String A = "RGBA2I420Filter";
  private int B = 1;
  private int r = -1;
  private int s = -1;
  private int t = -1;
  private int u = -1;
  private int v = -1;
  private int w = -1;
  private int x = -1;
  private int y = -1;
  private int z = -1;

  public n(int paramInt)
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    this.B = paramInt;
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67005);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      TXCLog.e(this.A, "width or height is error!");
      AppMethodBeat.o(67005);
    }
    while (true)
    {
      return;
      super.a(paramInt1, paramInt2);
      TXCLog.i(this.A, "RGBA2I420Filter width " + paramInt1 + " height " + paramInt2);
      a(this.r, paramInt1);
      a(this.s, paramInt2);
      AppMethodBeat.o(67005);
    }
  }

  public boolean a()
  {
    AppMethodBeat.i(67003);
    if (1 == this.B)
    {
      NativeLoad.getInstance();
      this.a = NativeLoad.nativeLoadGLProgram(8);
      TXCLog.i(this.A, "RGB-->I420 init!");
      if ((this.a == 0) || (!b()))
        break label180;
    }
    label133: label180: for (this.g = true; ; this.g = false)
    {
      c();
      boolean bool = this.g;
      AppMethodBeat.o(67003);
      while (true)
      {
        return bool;
        if (3 == this.B)
        {
          TXCLog.i(this.A, "RGB-->NV21 init!");
          NativeLoad.getInstance();
          this.a = NativeLoad.nativeLoadGLProgram(11);
          break;
        }
        if (2 != this.B)
          break label133;
        TXCLog.i(this.A, "RGBA Format init!");
        bool = super.a();
        AppMethodBeat.o(67003);
      }
      TXCLog.i(this.A, "don't support format " + this.B + " use default I420");
      NativeLoad.getInstance();
      this.a = NativeLoad.nativeLoadGLProgram(8);
      break;
    }
  }

  public boolean b()
  {
    AppMethodBeat.i(67004);
    super.b();
    this.r = GLES20.glGetUniformLocation(this.a, "width");
    this.s = GLES20.glGetUniformLocation(this.a, "height");
    AppMethodBeat.o(67004);
    return true;
  }

  public void c()
  {
    AppMethodBeat.i(67006);
    super.c();
    AppMethodBeat.o(67006);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.n
 * JD-Core Version:    0.6.2
 */