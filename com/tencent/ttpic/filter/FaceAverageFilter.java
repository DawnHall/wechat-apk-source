package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.filter.m.k;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.FaceImageLayer;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.FaceDetectUtil;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.FaceOffUtil.FEATURE_TYPE;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FaceAverageFilter extends VideoFilterBase
{
  private static final String FRAGMENT_SHADER = " precision mediump float;\n varying lowp vec2 textureCoordinate;\n varying lowp vec2 textureCoordinate2;\n varying lowp vec2 textureCoordinate3;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform sampler2D inputImageTexture3;\n uniform sampler2D inputImageTexture4;\n \n uniform int drawTypeFragment;\n uniform float alphaBlend;\n \n void main(void) {\n     \n     vec4 modelColor = texture2D(inputImageTexture4, textureCoordinate);\n     vec4 userColor  = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 grayColor  = texture2D(inputImageTexture3, textureCoordinate3);\n     \n     \n     float xAlpha = alphaBlend + (1.0 - alphaBlend) * grayColor.r;\n     vec3 resultColor = userColor.rgb * (1.0 - xAlpha) + modelColor.rgb * xAlpha;\n     gl_FragColor = vec4(resultColor, 1.0);\n     \n }";
  private static final String VERTEX_SHADER = " attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n varying vec2 textureCoordinate;\n \n attribute vec4 inputTextureCoordinate2;\n varying vec2 textureCoordinate2;\n \n attribute vec4 inputTextureCoordinate3;\n varying vec2 textureCoordinate3;\n \n uniform int drawTypeVertex;\n \n void main(void) {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     textureCoordinate2 = inputTextureCoordinate2.xy;\n     textureCoordinate3 = inputTextureCoordinate3.xy;\n }";
  private float[] faceVertices;
  private float[] grayVertices;
  private FaceImageLayer mFaceLayer;
  private FaceItem mItem;
  private Bitmap maskBitmap;
  private Bitmap materialBitmap;
  private float[] positions;
  private float[] texVertices;
  private int userTex;

  public FaceAverageFilter(String paramString, FaceImageLayer paramFaceImageLayer)
  {
    super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n varying vec2 textureCoordinate;\n \n attribute vec4 inputTextureCoordinate2;\n varying vec2 textureCoordinate2;\n \n attribute vec4 inputTextureCoordinate3;\n varying vec2 textureCoordinate3;\n \n uniform int drawTypeVertex;\n \n void main(void) {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     textureCoordinate2 = inputTextureCoordinate2.xy;\n     textureCoordinate3 = inputTextureCoordinate3.xy;\n }", " precision mediump float;\n varying lowp vec2 textureCoordinate;\n varying lowp vec2 textureCoordinate2;\n varying lowp vec2 textureCoordinate3;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform sampler2D inputImageTexture3;\n uniform sampler2D inputImageTexture4;\n \n uniform int drawTypeFragment;\n uniform float alphaBlend;\n \n void main(void) {\n     \n     vec4 modelColor = texture2D(inputImageTexture4, textureCoordinate);\n     vec4 userColor  = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 grayColor  = texture2D(inputImageTexture3, textureCoordinate3);\n     \n     \n     float xAlpha = alphaBlend + (1.0 - alphaBlend) * grayColor.r;\n     vec3 resultColor = userColor.rgb * (1.0 - xAlpha) + modelColor.rgb * xAlpha;\n     gl_FragColor = vec4(resultColor, 1.0);\n     \n }");
    AppMethodBeat.i(82311);
    this.mItem = null;
    this.mFaceLayer = null;
    this.materialBitmap = null;
    this.maskBitmap = null;
    this.userTex = 0;
    this.positions = new float[1104];
    this.faceVertices = new float[1104];
    this.texVertices = new float[1104];
    this.grayVertices = new float[1104];
    this.dataPath = paramString;
    this.mFaceLayer = paramFaceImageLayer;
    this.materialBitmap = FaceOffUtil.getFaceBitmap(paramString + File.separator + this.mFaceLayer.imagePath);
    if (this.mFaceLayer.faceMaskImagePath != null);
    for (this.maskBitmap = FaceOffUtil.getFaceBitmap(paramString + File.separator + this.mFaceLayer.faceMaskImagePath); ; this.maskBitmap = FaceOffUtil.getGrayBitmap(this.mFaceLayer.featureType))
    {
      initParams();
      AppMethodBeat.o(82311);
      return;
    }
  }

  private List<PointF> getVertexCoords(List<PointF> paramList1, List<PointF> paramList2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(82315);
    paramList1 = VideoMaterialUtil.copyList(paramList1);
    paramList2 = VideoMaterialUtil.copyList(paramList2);
    PointF localPointF1 = new PointF(((PointF)paramList2.get(64)).x, ((PointF)paramList2.get(64)).y);
    Object localObject = new PointF(((PointF)paramList1.get(64)).x, ((PointF)paramList1.get(64)).y);
    float f1 = (float)-Math.atan((((PointF)paramList1.get(35)).y - ((PointF)paramList1.get(45)).y) / (((PointF)paramList1.get(35)).x - ((PointF)paramList1.get(45)).x));
    f1 = paramArrayOfFloat[2] - f1;
    for (paramInt3 = 0; paramInt3 < paramList1.size(); paramInt3++)
      if ((paramInt3 <= 98) || (paramInt3 >= 107))
      {
        f2 = ((PointF)paramList2.get(paramInt3)).x - localPointF1.x;
        f3 = ((PointF)paramList2.get(paramInt3)).y - localPointF1.y;
        double d1 = f2;
        double d2 = Math.cos(f1);
        double d3 = f3;
        double d4 = Math.sin(f1);
        double d5 = f2;
        double d6 = Math.sin(f1);
        double d7 = f3;
        double d8 = Math.cos(f1);
        ((PointF)paramList2.get(paramInt3)).x = ((float)(d1 * d2 - d3 * d4) + localPointF1.x);
        ((PointF)paramList2.get(paramInt3)).y = ((float)(d5 * d6 + d7 * d8) + localPointF1.y);
      }
    float f2 = localPointF1.x;
    float f3 = ((PointF)localObject).x;
    f1 = localPointF1.y;
    float f4 = ((PointF)localObject).y;
    for (paramInt3 = 0; paramInt3 < paramList1.size(); paramInt3++)
    {
      ((PointF)paramList2.get(paramInt3)).x -= f2 - f3;
      ((PointF)paramList2.get(paramInt3)).y -= f1 - f4;
    }
    PointF localPointF2 = new PointF(((PointF)paramList2.get(43)).x, ((PointF)paramList2.get(43)).y);
    PointF localPointF3 = new PointF(((PointF)paramList2.get(53)).x, ((PointF)paramList2.get(53)).y);
    new PointF(((PointF)paramList2.get(99)).x, ((PointF)paramList2.get(99)).y);
    new PointF(((PointF)paramList2.get(101)).x, ((PointF)paramList2.get(101)).y);
    new PointF(((PointF)paramList2.get(105)).x, ((PointF)paramList2.get(105)).y);
    PointF localPointF4 = new PointF(((PointF)paramList1.get(43)).x, ((PointF)paramList1.get(43)).y);
    localPointF1 = new PointF(((PointF)paramList1.get(53)).x, ((PointF)paramList1.get(53)).y);
    new PointF(((PointF)paramList1.get(99)).x, ((PointF)paramList1.get(99)).y);
    new PointF(((PointF)paramList1.get(101)).x, ((PointF)paramList1.get(101)).y);
    new PointF(((PointF)paramList1.get(105)).x, ((PointF)paramList1.get(105)).y);
    f3 = AlgoUtils.getDistance(localPointF4, localPointF1) / AlgoUtils.getDistance(localPointF2, localPointF3);
    float f5 = AlgoUtils.getDistance(localPointF4, localPointF1) / AlgoUtils.getDistance(localPointF2, localPointF3);
    for (paramInt3 = 0; paramInt3 < paramList1.size(); paramInt3++)
      if ((paramInt3 < 99) || (paramInt3 > 106))
      {
        f4 = ((PointF)paramList2.get(paramInt3)).x;
        f1 = ((PointF)localObject).x;
        f2 = ((PointF)paramList2.get(paramInt3)).y;
        float f6 = ((PointF)localObject).y;
        ((PointF)paramList2.get(paramInt3)).x += (f4 - f1) * (f3 - 1.0F);
        ((PointF)paramList2.get(paramInt3)).y += (f5 - 1.0F) * (f2 - f6);
      }
    for (paramInt3 = 99; paramInt3 < 107; paramInt3++)
    {
      ((PointF)paramList2.get(paramInt3)).x = ((PointF)paramList1.get(paramInt3)).x;
      ((PointF)paramList2.get(paramInt3)).y = ((PointF)paramList1.get(paramInt3)).y;
    }
    localObject = new ArrayList();
    for (paramInt3 = 0; paramInt3 < paramList2.size(); paramInt3++)
      ((List)localObject).add(new PointF(((PointF)paramList2.get(paramInt3)).x, ((PointF)paramList2.get(paramInt3)).y));
    paramFloat *= smootherstep(0.9F, 1.0F, (float)(Math.abs(Math.cos(paramArrayOfFloat[0])) + Math.abs(Math.cos(paramArrayOfFloat[1])) + Math.abs(Math.cos(paramArrayOfFloat[2]))) / 3.0F);
    for (paramInt3 = 0; paramInt3 < paramList1.size(); paramInt3++)
      if ((paramInt3 < 99) || (paramInt3 > 106))
      {
        paramArrayOfFloat = (PointF)((List)localObject).get(paramInt3);
        f1 = ((PointF)paramList2.get(paramInt3)).x;
        paramArrayOfFloat.x = (((PointF)paramList1.get(paramInt3)).x * paramFloat + (1.0F - paramFloat) * f1);
        paramArrayOfFloat = (PointF)((List)localObject).get(paramInt3);
        f1 = ((PointF)paramList2.get(paramInt3)).y;
        paramArrayOfFloat.y = (((PointF)paramList1.get(paramInt3)).y * paramFloat + (1.0F - paramFloat) * f1);
      }
    paramFloat = paramInt2 / this.height;
    if (this.width / this.height > paramInt1 / paramInt2)
      paramFloat = paramInt1 / this.width;
    f1 = paramInt1 / paramFloat;
    f3 = paramInt2 / paramFloat;
    paramList1 = new PointF((this.width - f1) / 2.0F, (this.height - f3) / 2.0F);
    paramFloat = f1 / paramInt1;
    f1 = f3 / paramInt2;
    for (paramInt1 = 0; paramInt1 < ((List)localObject).size(); paramInt1++)
    {
      ((PointF)((List)localObject).get(paramInt1)).x = (((PointF)((List)localObject).get(paramInt1)).x * paramFloat + paramList1.x);
      ((PointF)((List)localObject).get(paramInt1)).y = (((PointF)((List)localObject).get(paramInt1)).y * f1 + paramList1.y);
    }
    AppMethodBeat.o(82315);
    return localObject;
  }

  float clampf(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(82316);
    paramFloat1 = Math.max(paramFloat2, Math.min(paramFloat3, paramFloat1));
    AppMethodBeat.o(82316);
    return paramFloat1;
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82314);
    super.initAttribParams();
    List localList = FaceOffUtil.genPointsDouble(this.mFaceLayer.imageFacePoint);
    FaceDetectUtil.facePointf83to90(localList);
    localList = FaceOffUtil.getFullCoords(localList, 3.0F);
    if (this.materialBitmap != null)
    {
      addAttribParam("inputTextureCoordinate", FaceOffUtil.initMaterialFaceTexCoordsFaceAverage(localList, this.materialBitmap.getWidth(), this.materialBitmap.getHeight(), this.texVertices));
      if (this.mFaceLayer.faceMaskImagePath != null)
        break label181;
    }
    label181: for (localList = FaceOffUtil.getGrayCoords(FaceOffUtil.FEATURE_TYPE.CRAZY_FACE); ; localList = FaceOffUtil.genPointsDouble(this.mFaceLayer.faceMaskFacePoint))
    {
      FaceDetectUtil.facePointf83to90(localList);
      localList = FaceOffUtil.getFullCoords(localList, 3.0F);
      if (this.maskBitmap != null)
        addAttribParam("inputTextureCoordinate3", FaceOffUtil.initMaterialFaceTexCoordsFaceAverage(localList, this.maskBitmap.getWidth(), this.maskBitmap.getHeight(), this.grayVertices));
      addAttribParam("inputTextureCoordinate2", this.faceVertices);
      setDrawMode(GlUtil.DRAW_MODE.TRIANGLES);
      setCoordNum(552);
      AppMethodBeat.o(82314);
      return;
      addAttribParam("inputTextureCoordinate", FaceOffUtil.initMaterialFaceTexCoordsFaceAverage(localList, -1, -1, this.texVertices));
      break;
    }
  }

  public void initParams()
  {
    AppMethodBeat.i(82312);
    addParam(new m.n("inputImageTexture2", this.userTex, 33986));
    addParam(new m.k("inputImageTexture3", this.maskBitmap, 33987, true));
    addParam(new m.k("inputImageTexture4", this.materialBitmap, 33988, true));
    addParam(new m.f("alphaBlend", (float)this.mFaceLayer.blendAlpha));
    addParam(new m.i("drawTypeFragment", 1));
    addParam(new m.i("drawTypeVertex", 1));
    AppMethodBeat.o(82312);
  }

  public void setUserTexture(int paramInt)
  {
    this.userTex = paramInt;
  }

  float smootherstep(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(82317);
    paramFloat1 = clampf((paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1), 0.0F, 1.0F);
    AppMethodBeat.o(82317);
    return (paramFloat1 * (6.0F * paramFloat1 - 15.0F) + 10.0F) * (paramFloat1 * paramFloat1 * paramFloat1);
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82313);
    if ((paramPTDetectInfo.facePoints == null) || (paramPTDetectInfo.facePoints.size() == 0))
      AppMethodBeat.o(82313);
    while (true)
    {
      return;
      addParam(new m.n("inputImageTexture2", this.userTex, 33986));
      List localList1 = FaceOffUtil.genPointsDouble(this.mFaceLayer.imageFacePoint);
      FaceDetectUtil.facePointf83to90(localList1);
      localList1 = FaceOffUtil.getFullCoords(localList1, 3.0F);
      List localList2 = FaceOffUtil.getFullCoords(VideoMaterialUtil.copyList(paramPTDetectInfo.facePoints), 3.0F);
      addAttribParam("inputTextureCoordinate2", FaceOffUtil.initMaterialFaceTexCoordsFaceAverage(localList2, (int)(this.width * this.mFaceDetScale), (int)(this.height * this.mFaceDetScale), this.faceVertices));
      if (this.materialBitmap != null)
        addAttribParam("position", FaceOffUtil.initFacePositionsFaceAverage(getVertexCoords(localList1, localList2, this.materialBitmap.getWidth(), this.materialBitmap.getHeight(), this.width, this.height, (float)this.mFaceLayer.distortionAlpha, paramPTDetectInfo.faceAngles), this.width, this.height, this.positions));
      AppMethodBeat.o(82313);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FaceAverageFilter
 * JD-Core Version:    0.6.2
 */