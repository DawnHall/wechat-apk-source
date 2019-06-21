package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.g;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ShakaMotionBlurFilter extends BaseFilter
{
  private static String FRAGMENT_SHADER = "precision highp float;\n \n uniform sampler2D inputImageTexture;\n \n varying vec2 textureCoordinate;\n varying vec2 oneStepBackTextureCoordinate;\n varying vec2 twoStepsBackTextureCoordinate;\n varying vec2 threeStepsBackTextureCoordinate;\n varying vec2 fourStepsBackTextureCoordinate;\n varying vec2 oneStepForwardTextureCoordinate;\n varying vec2 twoStepsForwardTextureCoordinate;\n varying vec2 threeStepsForwardTextureCoordinate;\n varying vec2 fourStepsForwardTextureCoordinate;\n \n void main()\n {\n     lowp vec4 fragmentColor = texture2D(inputImageTexture, textureCoordinate) * 0.18;\n     fragmentColor += texture2D(inputImageTexture, oneStepBackTextureCoordinate) * 0.15;\n     fragmentColor += texture2D(inputImageTexture, twoStepsBackTextureCoordinate) *  0.12;\n     fragmentColor += texture2D(inputImageTexture, threeStepsBackTextureCoordinate) * 0.09;\n     fragmentColor += texture2D(inputImageTexture, fourStepsBackTextureCoordinate) * 0.05;\n     fragmentColor += texture2D(inputImageTexture, oneStepForwardTextureCoordinate) * 0.15;\n     fragmentColor += texture2D(inputImageTexture, twoStepsForwardTextureCoordinate) *  0.12;\n     fragmentColor += texture2D(inputImageTexture, threeStepsForwardTextureCoordinate) * 0.09;\n     fragmentColor += texture2D(inputImageTexture, fourStepsForwardTextureCoordinate) * 0.05;\n\n     gl_FragColor = fragmentColor;\n }";
  private static String VERTEXT_SHADER = "attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform vec2 directionalTexelStep;\n \n varying vec2 textureCoordinate;\n varying vec2 oneStepBackTextureCoordinate;\n varying vec2 twoStepsBackTextureCoordinate;\n varying vec2 threeStepsBackTextureCoordinate;\n varying vec2 fourStepsBackTextureCoordinate;\n varying vec2 oneStepForwardTextureCoordinate;\n varying vec2 twoStepsForwardTextureCoordinate;\n varying vec2 threeStepsForwardTextureCoordinate;\n varying vec2 fourStepsForwardTextureCoordinate;\n \n void main()\n {\n     gl_Position = position;\n     \n     textureCoordinate = inputTextureCoordinate.xy;\n     oneStepBackTextureCoordinate = inputTextureCoordinate.xy - directionalTexelStep;\n     twoStepsBackTextureCoordinate = inputTextureCoordinate.xy - 2.0 * directionalTexelStep;\n     threeStepsBackTextureCoordinate = inputTextureCoordinate.xy - 3.0 * directionalTexelStep;\n     fourStepsBackTextureCoordinate = inputTextureCoordinate.xy - 4.0 * directionalTexelStep;\n     oneStepForwardTextureCoordinate = inputTextureCoordinate.xy + directionalTexelStep;\n     twoStepsForwardTextureCoordinate = inputTextureCoordinate.xy + 2.0 * directionalTexelStep;\n     threeStepsForwardTextureCoordinate = inputTextureCoordinate.xy + 3.0 * directionalTexelStep;\n     fourStepsForwardTextureCoordinate = inputTextureCoordinate.xy + 4.0 * directionalTexelStep;\n }";
  private BaseFilter blurFilter2;
  private float mBlurAngle;
  private float mBlurSize;
  private float mHeight;
  private BaseFilter mScaleFilter;
  private float mWidth;

  public ShakaMotionBlurFilter()
  {
    super(VERTEXT_SHADER, FRAGMENT_SHADER);
    AppMethodBeat.i(82840);
    this.blurFilter2 = new BaseFilter(VERTEXT_SHADER, FRAGMENT_SHADER);
    this.mScaleFilter = new BaseFilter(GLSLRender.bJB);
    this.blurFilter2.scaleFact = 0.25F;
    this.scaleFact = 0.25F;
    this.mBlurSize = 0.0F;
    this.mBlurAngle = 0.0F;
    setNextFilter(this.blurFilter2, null);
    this.blurFilter2.setNextFilter(this.mScaleFilter, null);
    AppMethodBeat.o(82840);
  }

  private void recalculateTexelOffsets()
  {
    AppMethodBeat.i(82841);
    float[] arrayOfFloat = new float[2];
    float f = this.mHeight / this.mWidth;
    if (this.mBlurSize <= 2.0F)
    {
      arrayOfFloat[0] = ((float)(this.mBlurSize * Math.cos(this.mBlurAngle * 3.141592653589793D / 180.0D) * f / this.mWidth));
      arrayOfFloat[1] = ((float)(this.mBlurSize * Math.sin(this.mBlurAngle * 3.141592653589793D / 180.0D) / this.mWidth));
      addParam(new m.g("directionalTexelStep", arrayOfFloat));
      arrayOfFloat[0] = 0.0F;
      arrayOfFloat[1] = 0.0F;
      this.blurFilter2.addParam(new m.g("directionalTexelStep", arrayOfFloat));
      AppMethodBeat.o(82841);
    }
    while (true)
    {
      return;
      arrayOfFloat[0] = ((float)(2.0D * Math.cos(this.mBlurAngle * 3.141592653589793D / 180.0D) * f / this.mWidth));
      arrayOfFloat[1] = ((float)(2.0D * Math.sin(this.mBlurAngle * 3.141592653589793D / 180.0D) / this.mWidth));
      addParam(new m.g("directionalTexelStep", arrayOfFloat));
      arrayOfFloat[0] = ((float)((this.mBlurSize - 2.0F) * Math.cos(this.mBlurAngle * 3.141592653589793D / 180.0D) * f / this.mWidth));
      arrayOfFloat[1] = ((float)((this.mBlurSize - 2.0F) * Math.sin(this.mBlurAngle * 3.141592653589793D / 180.0D) / this.mWidth));
      this.blurFilter2.addParam(new m.g("directionalTexelStep", arrayOfFloat));
      AppMethodBeat.o(82841);
    }
  }

  public void updateParams(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82842);
    this.mBlurSize = paramFloat1;
    this.mBlurAngle = paramFloat2;
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    recalculateTexelOffsets();
    AppMethodBeat.o(82842);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.ShakaMotionBlurFilter
 * JD-Core Version:    0.6.2
 */