package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.FaceImageLayer;
import java.util.List;

public class FaceSkinBalanceFilter extends BaseFilter
{
  private static final String FRAGMENT_SHADER = " precision mediump float;\n varying lowp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n \n uniform vec3 diffRGB;\n uniform vec3 userRGB;\n uniform int shouldBalance;\n\n \n void main()\n {\n     vec4 color = texture2D(inputImageTexture, textureCoordinate);\n     if (shouldBalance == 1) {\n         float ry;\n         float ri;\n         float rq;\n         if (color.r <= userRGB.r) {\n             ry = color.r + diffRGB.r * (color.r / userRGB.r);\n         } else {\n             ry = color.r + diffRGB.r * ((1.0 - color.r) / (1.0 - userRGB.r));\n         }\n         if (color.g <= userRGB.g) {\n             ri = color.g + diffRGB.g * (color.g / userRGB.g);\n         } else {\n             ri = color.g + diffRGB.g * ((1.0 - color.g) / (1.0 - userRGB.g));\n         }\n         if (color.b <= userRGB.b) {\n             rq = color.b + diffRGB.b * (color.b / userRGB.b);\n         } else {\n             rq = color.b + diffRGB.b * ((1.0 - color.b) / (1.0 - userRGB.b));\n         }\n         vec3 refineRGB = vec3(ry, ri, rq);\n         gl_FragColor = vec4(clamp(refineRGB, 0.0, 1.0), 1.0);\n     }\n     else {\n         gl_FragColor = color;\n     }\n }";
  private static int count = 0;
  private static int total = 0;
  private byte[] data;
  private float modelU;
  private float modelU2;
  private float modelV;
  private float modelV2;
  private float modelY;
  private float modelY2;
  private int shouldBalance;

  public FaceSkinBalanceFilter(FaceImageLayer paramFaceImageLayer)
  {
    super(" precision mediump float;\n varying lowp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n \n uniform vec3 diffRGB;\n uniform vec3 userRGB;\n uniform int shouldBalance;\n\n \n void main()\n {\n     vec4 color = texture2D(inputImageTexture, textureCoordinate);\n     if (shouldBalance == 1) {\n         float ry;\n         float ri;\n         float rq;\n         if (color.r <= userRGB.r) {\n             ry = color.r + diffRGB.r * (color.r / userRGB.r);\n         } else {\n             ry = color.r + diffRGB.r * ((1.0 - color.r) / (1.0 - userRGB.r));\n         }\n         if (color.g <= userRGB.g) {\n             ri = color.g + diffRGB.g * (color.g / userRGB.g);\n         } else {\n             ri = color.g + diffRGB.g * ((1.0 - color.g) / (1.0 - userRGB.g));\n         }\n         if (color.b <= userRGB.b) {\n             rq = color.b + diffRGB.b * (color.b / userRGB.b);\n         } else {\n             rq = color.b + diffRGB.b * ((1.0 - color.b) / (1.0 - userRGB.b));\n         }\n         vec3 refineRGB = vec3(ry, ri, rq);\n         gl_FragColor = vec4(clamp(refineRGB, 0.0, 1.0), 1.0);\n     }\n     else {\n         gl_FragColor = color;\n     }\n }");
    AppMethodBeat.i(82443);
    this.modelY = -1.0F;
    this.modelU = -1.0F;
    this.modelV = -1.0F;
    this.modelY2 = -1.0F;
    this.modelU2 = -1.0F;
    this.modelV2 = -1.0F;
    this.shouldBalance = 1;
    this.data = null;
    setModelColor(paramFaceImageLayer.imageFaceColor);
    initParam();
    AppMethodBeat.o(82443);
  }

  private void initParam()
  {
    AppMethodBeat.i(82445);
    addParam(new m.i("shouldBalance", this.shouldBalance));
    addParam(new m.g("diffRGB", new float[] { 0.0F, 0.0F, 0.0F }));
    addParam(new m.g("userRGB", new float[] { this.modelY, this.modelU, this.modelV }));
    AppMethodBeat.o(82445);
  }

  private boolean isSkinColor(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = false;
    boolean bool2;
    if ((paramInt1 <= 80) && (paramInt2 <= 80) && (paramInt3 <= 80))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((paramInt1 < 230) && (paramInt2 < 230) && (paramInt3 < 230))
      {
        bool2 = bool1;
        if (paramInt3 < paramInt2)
        {
          bool2 = bool1;
          if (paramInt2 >= paramInt1);
        }
      }
      else
      {
        bool2 = bool1;
        if (paramInt1 + paramInt2 <= 400)
        {
          float f1 = paramInt1 / 255.0F;
          float f2 = paramInt2 / 255.0F;
          float f3 = paramInt3 / 255.0F;
          float f4 = 128.0F - 81.084999F * f1 + 112.0F * f2 - 30.915001F * f3;
          f3 = f1 * 112.0F + 128.0F - f2 * 93.786003F - 18.214001F * f3;
          bool2 = bool1;
          if (f4 >= 85.0F)
          {
            bool2 = bool1;
            if (f4 <= 135.0F)
            {
              bool2 = bool1;
              if (f3 >= 260.0F - f4)
              {
                bool2 = bool1;
                if (f3 <= 280.0F - f4)
                  bool2 = true;
              }
            }
          }
        }
      }
    }
  }

  public void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(82446);
    if ((total == 0) || (this.data == null))
    {
      AppMethodBeat.o(82446);
      return;
    }
    total = 0;
    int i = this.data.length / 4;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    paramInt2 = 0;
    paramInt1 = 0;
    float f1;
    float f2;
    float f3;
    while (paramInt1 < i)
    {
      int j = this.data[(paramInt1 * 4)] & 0xFF;
      int k = this.data[(paramInt1 * 4 + 1)] & 0xFF;
      paramInt3 = this.data[(paramInt1 * 4 + 2)] & 0xFF;
      boolean bool = isSkinColor(j, k, paramInt3);
      f1 = j / 255.0F;
      f2 = k / 255.0F;
      f3 = paramInt3 / 255.0F;
      double d7 = d3;
      double d8 = d2;
      d9 = d1;
      paramInt3 = paramInt2;
      if (bool)
      {
        d9 = d1 + f1;
        d8 = d2 + f2;
        d7 = d3 + f3;
        paramInt3 = paramInt2 + 1;
      }
      d4 += f1;
      d5 += f2;
      d6 += f3;
      paramInt1++;
      d3 = d7;
      d2 = d8;
      d1 = d9;
      paramInt2 = paramInt3;
    }
    d4 /= i;
    d5 /= i;
    double d9 = d6 / i;
    label275: float f4;
    float f5;
    float f6;
    if (paramInt2 == 0)
    {
      d2 = d9;
      d6 = d5;
      d3 = d4;
      f4 = this.modelY;
      f5 = this.modelU;
      f6 = this.modelV;
      f2 = (float)d4;
      f3 = (float)d5;
      f1 = (float)d9;
      if (d3 <= 0.0D)
        break label544;
      f2 = (float)d3;
      f3 = (float)d6;
      f1 = (float)d2;
      f4 = this.modelY2;
      f5 = this.modelU2;
      f6 = this.modelV2;
    }
    label544: 
    while (true)
    {
      float f7 = f6;
      float f8 = f5;
      float f9 = f4;
      if (f4 <= 0.0F)
      {
        f7 = f6;
        f8 = f5;
        f9 = f4;
        if (f5 <= 0.0F)
        {
          f7 = f6;
          f8 = f5;
          f9 = f4;
          if (f6 <= 0.0F)
          {
            f7 = f1;
            f8 = f3;
            f9 = f2;
          }
        }
      }
      addParam(new m.g("diffRGB", new float[] { f9 - f2, f8 - f3, f7 - f1 }));
      addParam(new m.g("userRGB", new float[] { f2, f3, f1 }));
      addParam(new m.i("shouldBalance", this.shouldBalance));
      AppMethodBeat.o(82446);
      break;
      d1 /= paramInt2;
      d6 = d2 / paramInt2;
      d2 = d3 / paramInt2;
      d3 = d1;
      break label275;
    }
  }

  public void setImageData(byte[] paramArrayOfByte)
  {
    if (count < 10)
      count += 1;
    while (true)
    {
      return;
      if (paramArrayOfByte != null)
      {
        count = 0;
        this.data = paramArrayOfByte;
        total = 1;
      }
    }
  }

  public void setModelColor(List<Double> paramList)
  {
    AppMethodBeat.i(82444);
    if ((paramList == null) || (paramList.size() < 6))
    {
      this.shouldBalance = 0;
      AppMethodBeat.o(82444);
    }
    while (true)
    {
      return;
      this.modelY = ((Double)paramList.get(0)).floatValue();
      this.modelU = ((Double)paramList.get(1)).floatValue();
      this.modelV = ((Double)paramList.get(2)).floatValue();
      this.modelY2 = ((Double)paramList.get(3)).floatValue();
      this.modelU2 = ((Double)paramList.get(4)).floatValue();
      this.modelV2 = ((Double)paramList.get(5)).floatValue();
      AppMethodBeat.o(82444);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FaceSkinBalanceFilter
 * JD-Core Version:    0.6.2
 */