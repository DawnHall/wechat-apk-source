package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.model.FaceImageLayer;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.util.FaceOffUtil;
import java.io.File;

public class FaceAverageBackgroundFilter extends VideoFilterBase
{
  private static final String FRAGMENT_SHADER = " precision mediump float;\n varying lowp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main(void) {\n         gl_FragColor = texture2D(inputImageTexture2, textureCoordinate);\n }";
  private static final String VERTEX_SHADER = " attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n varying vec2 textureCoordinate;\n \n void main(void) {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n }";
  private FaceImageLayer mFaceLayer;
  private FaceItem mItem;
  private Bitmap materialBitmap;
  private int materialImageHeight;
  private int materialImageWidth;

  public FaceAverageBackgroundFilter(String paramString, FaceImageLayer paramFaceImageLayer)
  {
    super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n varying vec2 textureCoordinate;\n \n void main(void) {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n }", " precision mediump float;\n varying lowp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main(void) {\n         gl_FragColor = texture2D(inputImageTexture2, textureCoordinate);\n }");
    AppMethodBeat.i(82307);
    this.mItem = null;
    this.mFaceLayer = null;
    this.materialImageWidth = 0;
    this.materialImageHeight = 0;
    this.materialBitmap = null;
    this.dataPath = paramString;
    this.mFaceLayer = paramFaceImageLayer;
    initParams();
    AppMethodBeat.o(82307);
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82309);
    super.initAttribParams();
    float f1 = this.materialImageHeight / this.height;
    if (this.materialImageHeight / this.materialImageWidth > this.height / this.width)
      f1 = this.materialImageWidth / this.width;
    float f2 = this.materialImageWidth / f1;
    float f3 = this.materialImageHeight / f1;
    float f4 = (f2 - this.width) / 2.0F / f2;
    float f5 = (f3 - this.height) / 2.0F / f3;
    float f6 = (f2 - this.width) / 2.0F / f2;
    float f7 = (f3 - this.height) / 2.0F / f3;
    f1 = (f2 - this.width) / 2.0F / f2;
    float f8 = (f3 - this.height) / 2.0F / f3;
    addAttribParam("inputTextureCoordinate", new float[] { f6, f7, f4, 1.0F - f5, 1.0F - (f2 - this.width) / 2.0F / f2, 1.0F - (f3 - this.height) / 2.0F / f3, 1.0F - f1, f8 });
    AppMethodBeat.o(82309);
  }

  public void initParams()
  {
    AppMethodBeat.i(82308);
    if ((this.materialBitmap == null) && (this.mFaceLayer != null))
      this.materialBitmap = FaceOffUtil.getFaceBitmap(this.dataPath + File.separator + this.mFaceLayer.imagePath);
    if (this.materialBitmap != null)
    {
      this.materialImageWidth = this.materialBitmap.getWidth();
      this.materialImageHeight = this.materialBitmap.getHeight();
    }
    addParam(new m.k("inputImageTexture2", this.materialBitmap, 33986, true));
    AppMethodBeat.o(82308);
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82310);
    float f1 = this.materialImageHeight / this.height;
    if (this.materialImageHeight / this.materialImageWidth > this.height / this.width)
      f1 = this.materialImageWidth / this.width;
    float f2 = this.materialImageWidth / f1;
    float f3 = this.materialImageHeight / f1;
    float f4 = (f2 - this.width) / 2.0F / f2;
    float f5 = (f3 - this.height) / 2.0F / f3;
    f1 = (f2 - this.width) / 2.0F / f2;
    float f6 = (f3 - this.height) / 2.0F / f3;
    float f7 = (f2 - this.width) / 2.0F / f2;
    float f8 = (f3 - this.height) / 2.0F / f3;
    addAttribParam("inputTextureCoordinate", new float[] { f1, f6, f4, 1.0F - f5, 1.0F - (f2 - this.width) / 2.0F / f2, 1.0F - (f3 - this.height) / 2.0F / f3, 1.0F - f7, f8 });
    AppMethodBeat.o(82310);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FaceAverageBackgroundFilter
 * JD-Core Version:    0.6.2
 */