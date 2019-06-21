package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import com.tencent.filter.m.b;
import com.tencent.filter.m.f;
import com.tencent.filter.m.j;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.cache.VideoMemoryManager;
import com.tencent.ttpic.gles.AttributeParam;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import com.tencent.ttpic.util.VideoTemplateParser;
import java.util.List;

public class LightRemovePouchFilter_573 extends VideoFilterBase
{
  private static final String CONTENT = "{\n  \"minAppVersion\": 400,\n  \"shaderType\": 5,\n  \"maxFaceCount\": 10,\n  \"faceOffType\": 0,\n  \"faceOffItemList\": [\n    {\n      \"faceExchangeImage\": \"facemask.jpg\",\n      \"blendAlpha\":1.0,\n      \"featureType\": 0,\n      \"grayScale\": 0,\n      \"blendMode\": 0,\n      \"facePoints\": [\n  156.88185140529998, 528.1364190166,\n  169.5493300902, 595.3714981903,\n  181.24238733779998, 649.9390986791,\n  191.9610231481, 695.7369062322,\n  214.372716206, 738.6114494734,\n  238.7332521385, 776.6138855281,\n  277.71010963049997, 811.6930572709,\n  311.814859936, 843.8489647018,\n  351.7661388653, 868.2095006343,\n  398.53836785569996, 876.97929357,\n  445.3105968461, 866.2606577596999,\n  491.10840439919997, 841.9001218272,\n  528.1364190166, 807.7953715217,\n  558.3434835729, 769.792935467,\n  585.6272838172999, 734.7137637242,\n  605.1157125633, 690.8647990457,\n  618.7576126855, 645.0669914926,\n  630.4506699331, 592.4482338784,\n  633.373934245, 524.2387332674,\n  199.75639464649998, 446.2850182834,\n  239.7076735758, 444.3361754088,\n  280.6333739424, 448.23386115799997,\n  321.559074309, 456.0292326564,\n  362.48477467559997, 458.9524969683,\n  327.4056029328, 433.6175395985,\n  283.55663825429997, 425.8221681001,\n  239.7076735758, 425.8221681001,\n  595.3714981903, 445.3105968461,\n  555.4202192609999, 444.3361754088,\n  515.4689403317, 452.1315469072,\n  484.28745433809996, 457.0036540937,\n  438.489646785, 460.9013398429,\n  464.7990255921, 435.56638247309996,\n  508.64799027059996, 422.89890378819996,\n  559.3179050102, 422.89890378819996,\n  241.6565164504, 506.699147396,\n  260.1705237591, 518.3922046435999,\n  285.5054811289, 522.2898903928,\n  309.8660170614, 520.3410475182,\n  336.1753958685, 511.5712545825,\n  317.6613885598, 493.0572472738,\n  287.4543240035, 483.3130329008,\n  263.093788071, 489.1595615246,\n  291.3520097527, 504.7503045214,\n  291.3520097527, 502.80146164679996,\n  558.3434835729, 501.8270402095,\n  537.8806333896, 516.443361769,\n  511.5712545825, 523.2643118300999,\n  487.21071865, 521.3154689555,\n  460.9013398429, 512.5456760198,\n  481.3641900262, 492.0828258365,\n  508.64799027059996, 484.28745433809996,\n  534.9573690777, 488.1851400873,\n  508.64799027059996, 502.80146164679996,\n  508.64799027059996, 500.8526187722,\n  370.280146174, 512.5456760198,\n  366.3824604248, 600.2436053768,\n  340.0730816177, 649.9390986791,\n  370.280146174, 668.4531059878,\n  400.4872107303, 672.350791737,\n  428.745432412, 666.5042631132,\n  458.9524969683, 647.0158343672,\n  432.6431181612, 601.2180268141,\n  430.6942752866, 513.5200974571,\n  400.4872107303, 636.2971985569,\n  312.7892813733, 719.1230207274,\n  489.1595615246, 717.1741778528,\n  335.2009744312, 743.4835566598999,\n  364.4336175502, 759.0742996567,\n  399.51278929299997, 766.8696711550999,\n  434.5919610358, 758.0998782194,\n  464.7990255921, 741.5347137853,\n  442.38733253419997, 736.6626065987999,\n  401.4616321676, 741.5347137853,\n  352.7405603026, 736.6626065987999,\n  346.8940316788, 713.2764921035999,\n  379.0499391097, 710.3532277917,\n  401.4616321676, 714.2509135409,\n  421.9244823509, 713.2764921035999,\n  454.08038978179997, 713.2764921035999,\n  442.38733253419997, 729.8416565377,\n  400.4872107303, 731.7904994122999,\n  354.6894031772, 727.8928136631,\n  400.4872107303, 512.5456760198,\n  404.3848964795, 460.9013398429,\n  400.4872107303, 692.8136419203,\n  205.60292327029998, 205.60292327029998,\n  398.53836785569996, 275.7612667559,\n  598.2947625022, 197.8075517719,\n  400.4872107303, 356.63824605179997\n      ]\n    }\n  ],\n  \"itemList\": [\n    {\n      \"id\": \"kangxi\",\n      \"frameDuration\": 0,\n      \"frames\": 1,\n      \"height\": 960,\n      \"width\": 720,\n      \"triggerType\": 2,\n      \"playCount\": 0,\n      \"alwaysTriggered\": 1,\n      \"type\": 1,\n      \"position\": [\n        0,\n        0\n      ]\n    }\n  ]\n}\n\n";
  private static final String FOLDER = "assets://realtimeBeauty/video_wuguanliti_zhuang";
  public static final String FRAGMENT_SHADER;
  private static final String TAG;
  public static final String VERTEX_SHADER;
  private String faceImage;
  private int faceImageHeight;
  private int faceImageWidth;
  private float[] faceVertices;
  private boolean isFaceImageReady;
  private FaceItem item;
  private float smoothOpacity;
  private float[] texVertices;
  private int[] texture;

  static
  {
    AppMethodBeat.i(82641);
    TAG = FaceOffFilter.class.getSimpleName();
    VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/EyeLightenAndPounchVertex.dat");
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/LightRemovePouchFragmentShader_573.dat");
    AppMethodBeat.o(82641);
  }

  public LightRemovePouchFilter_573()
  {
    super(VERTEX_SHADER, FRAGMENT_SHADER);
    AppMethodBeat.i(82625);
    this.faceImageWidth = 800;
    this.faceImageHeight = 1067;
    this.faceVertices = new float[1380];
    this.texVertices = new float[1380];
    this.texture = new int[1];
    this.smoothOpacity = 0.0F;
    this.faceImage = "facemask.jpg";
    this.item = createFaceItem();
    this.dataPath = "assets://realtimeBeauty/video_wuguanliti_zhuang";
    initParams();
    AppMethodBeat.o(82625);
  }

  private FaceItem createFaceItem()
  {
    AppMethodBeat.i(82626);
    FaceItem localFaceItem = (FaceItem)VideoTemplateParser.parseVideoMaterial("assets://realtimeBeauty/video_wuguanliti_zhuang", "{\n  \"minAppVersion\": 400,\n  \"shaderType\": 5,\n  \"maxFaceCount\": 10,\n  \"faceOffType\": 0,\n  \"faceOffItemList\": [\n    {\n      \"faceExchangeImage\": \"facemask.jpg\",\n      \"blendAlpha\":1.0,\n      \"featureType\": 0,\n      \"grayScale\": 0,\n      \"blendMode\": 0,\n      \"facePoints\": [\n  156.88185140529998, 528.1364190166,\n  169.5493300902, 595.3714981903,\n  181.24238733779998, 649.9390986791,\n  191.9610231481, 695.7369062322,\n  214.372716206, 738.6114494734,\n  238.7332521385, 776.6138855281,\n  277.71010963049997, 811.6930572709,\n  311.814859936, 843.8489647018,\n  351.7661388653, 868.2095006343,\n  398.53836785569996, 876.97929357,\n  445.3105968461, 866.2606577596999,\n  491.10840439919997, 841.9001218272,\n  528.1364190166, 807.7953715217,\n  558.3434835729, 769.792935467,\n  585.6272838172999, 734.7137637242,\n  605.1157125633, 690.8647990457,\n  618.7576126855, 645.0669914926,\n  630.4506699331, 592.4482338784,\n  633.373934245, 524.2387332674,\n  199.75639464649998, 446.2850182834,\n  239.7076735758, 444.3361754088,\n  280.6333739424, 448.23386115799997,\n  321.559074309, 456.0292326564,\n  362.48477467559997, 458.9524969683,\n  327.4056029328, 433.6175395985,\n  283.55663825429997, 425.8221681001,\n  239.7076735758, 425.8221681001,\n  595.3714981903, 445.3105968461,\n  555.4202192609999, 444.3361754088,\n  515.4689403317, 452.1315469072,\n  484.28745433809996, 457.0036540937,\n  438.489646785, 460.9013398429,\n  464.7990255921, 435.56638247309996,\n  508.64799027059996, 422.89890378819996,\n  559.3179050102, 422.89890378819996,\n  241.6565164504, 506.699147396,\n  260.1705237591, 518.3922046435999,\n  285.5054811289, 522.2898903928,\n  309.8660170614, 520.3410475182,\n  336.1753958685, 511.5712545825,\n  317.6613885598, 493.0572472738,\n  287.4543240035, 483.3130329008,\n  263.093788071, 489.1595615246,\n  291.3520097527, 504.7503045214,\n  291.3520097527, 502.80146164679996,\n  558.3434835729, 501.8270402095,\n  537.8806333896, 516.443361769,\n  511.5712545825, 523.2643118300999,\n  487.21071865, 521.3154689555,\n  460.9013398429, 512.5456760198,\n  481.3641900262, 492.0828258365,\n  508.64799027059996, 484.28745433809996,\n  534.9573690777, 488.1851400873,\n  508.64799027059996, 502.80146164679996,\n  508.64799027059996, 500.8526187722,\n  370.280146174, 512.5456760198,\n  366.3824604248, 600.2436053768,\n  340.0730816177, 649.9390986791,\n  370.280146174, 668.4531059878,\n  400.4872107303, 672.350791737,\n  428.745432412, 666.5042631132,\n  458.9524969683, 647.0158343672,\n  432.6431181612, 601.2180268141,\n  430.6942752866, 513.5200974571,\n  400.4872107303, 636.2971985569,\n  312.7892813733, 719.1230207274,\n  489.1595615246, 717.1741778528,\n  335.2009744312, 743.4835566598999,\n  364.4336175502, 759.0742996567,\n  399.51278929299997, 766.8696711550999,\n  434.5919610358, 758.0998782194,\n  464.7990255921, 741.5347137853,\n  442.38733253419997, 736.6626065987999,\n  401.4616321676, 741.5347137853,\n  352.7405603026, 736.6626065987999,\n  346.8940316788, 713.2764921035999,\n  379.0499391097, 710.3532277917,\n  401.4616321676, 714.2509135409,\n  421.9244823509, 713.2764921035999,\n  454.08038978179997, 713.2764921035999,\n  442.38733253419997, 729.8416565377,\n  400.4872107303, 731.7904994122999,\n  354.6894031772, 727.8928136631,\n  400.4872107303, 512.5456760198,\n  404.3848964795, 460.9013398429,\n  400.4872107303, 692.8136419203,\n  205.60292327029998, 205.60292327029998,\n  398.53836785569996, 275.7612667559,\n  598.2947625022, 197.8075517719,\n  400.4872107303, 356.63824605179997\n      ]\n    }\n  ],\n  \"itemList\": [\n    {\n      \"id\": \"kangxi\",\n      \"frameDuration\": 0,\n      \"frames\": 1,\n      \"height\": 960,\n      \"width\": 720,\n      \"triggerType\": 2,\n      \"playCount\": 0,\n      \"alwaysTriggered\": 1,\n      \"type\": 1,\n      \"position\": [\n        0,\n        0\n      ]\n    }\n  ]\n}\n\n", null).getFaceOffItemList().get(0);
    AppMethodBeat.o(82626);
    return localFaceItem;
  }

  private boolean initFaceImage()
  {
    AppMethodBeat.i(82635);
    if ((!this.isFaceImageReady) && (BitmapUtils.isLegal(VideoMemoryManager.getInstance().getBeautyFaceCacheBitmap(this.faceImage))))
    {
      Bitmap localBitmap = VideoMemoryManager.getInstance().getBeautyFaceCacheBitmap(this.faceImage);
      GlUtil.loadTexture(this.texture[0], localBitmap);
      initFaceTexCoords();
      addParam(new m.n("inputImageTexture2", this.texture[0], 33986));
      this.isFaceImageReady = true;
    }
    boolean bool = this.isFaceImageReady;
    AppMethodBeat.o(82635);
    return bool;
  }

  private void initFaceTexCoords()
  {
    AppMethodBeat.i(82631);
    setTexCords(FaceOffUtil.initMaterialFaceTexCoords(FaceOffUtil.getFullCoords(FaceOffUtil.genPoints(this.item.facePoints), 2.0F), this.faceImageWidth, this.faceImageHeight, this.texVertices));
    AppMethodBeat.o(82631);
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82637);
    super.ApplyGLSLFilter();
    GLES20.glGenTextures(this.texture.length, this.texture, 0);
    AppMethodBeat.o(82637);
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(82638);
    GLES20.glDeleteTextures(this.texture.length, this.texture, 0);
    this.isFaceImageReady = false;
    super.clearGLSLSelf();
    AppMethodBeat.o(82638);
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82630);
    super.initAttribParams();
    initFaceTexCoords();
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLES);
    setCoordNum(690);
    AppMethodBeat.o(82630);
  }

  public void initParams()
  {
    AppMethodBeat.i(82628);
    addParam(new m.n("inputImageTexture2", 0, 33986));
    addParam(new m.f("width", 0.0F));
    addParam(new m.f("height", 0.0F));
    addParam(new m.j("posMatRotate", new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F }));
    addParam(new m.b("canvasSize", this.width, this.height));
    addParam(new m.f("smoothOpacity", this.smoothOpacity));
    AppMethodBeat.o(82628);
  }

  public float[] mat4RotationYXZ(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(82640);
    float[] arrayOfFloat = new float[16];
    float[] tmp14_12 = arrayOfFloat;
    tmp14_12[0] = 1.0F;
    float[] tmp18_14 = tmp14_12;
    tmp18_14[1] = 0.0F;
    float[] tmp22_18 = tmp18_14;
    tmp22_18[2] = 0.0F;
    float[] tmp26_22 = tmp22_18;
    tmp26_22[3] = 0.0F;
    float[] tmp30_26 = tmp26_22;
    tmp30_26[4] = 0.0F;
    float[] tmp34_30 = tmp30_26;
    tmp34_30[5] = 1.0F;
    float[] tmp38_34 = tmp34_30;
    tmp38_34[6] = 0.0F;
    float[] tmp43_38 = tmp38_34;
    tmp43_38[7] = 0.0F;
    float[] tmp48_43 = tmp43_38;
    tmp48_43[8] = 0.0F;
    float[] tmp53_48 = tmp48_43;
    tmp53_48[9] = 0.0F;
    float[] tmp58_53 = tmp53_48;
    tmp58_53[10] = 1.0F;
    float[] tmp63_58 = tmp58_53;
    tmp63_58[11] = 0.0F;
    float[] tmp68_63 = tmp63_58;
    tmp68_63[12] = 0.0F;
    float[] tmp73_68 = tmp68_63;
    tmp73_68[13] = 0.0F;
    float[] tmp78_73 = tmp73_68;
    tmp78_73[14] = 0.0F;
    float[] tmp83_78 = tmp78_73;
    tmp83_78[15] = 1.0F;
    tmp83_78;
    float f1 = (float)Math.cos(paramFloat1);
    float f2 = (float)Math.sin(paramFloat1);
    paramFloat1 = (float)Math.cos(paramFloat2);
    paramFloat2 = (float)Math.sin(paramFloat2);
    float f3 = (float)Math.cos(paramFloat3);
    paramFloat3 = (float)Math.sin(paramFloat3);
    arrayOfFloat[0] = (paramFloat1 * f3 + f2 * paramFloat2 * paramFloat3);
    arrayOfFloat[1] = (f1 * paramFloat3);
    arrayOfFloat[2] = (paramFloat1 * f2 * paramFloat3 - f3 * paramFloat2);
    arrayOfFloat[3] = 0.0F;
    arrayOfFloat[4] = (f3 * f2 * paramFloat2 - paramFloat1 * paramFloat3);
    arrayOfFloat[5] = (f1 * f3);
    arrayOfFloat[6] = (f3 * paramFloat1 * f2 + paramFloat3 * paramFloat2);
    arrayOfFloat[7] = 0.0F;
    arrayOfFloat[8] = (paramFloat2 * f1);
    arrayOfFloat[9] = (-f2);
    arrayOfFloat[10] = (f1 * paramFloat1);
    arrayOfFloat[11] = 0.0F;
    arrayOfFloat[12] = 0.0F;
    arrayOfFloat[13] = 0.0F;
    arrayOfFloat[14] = 0.0F;
    arrayOfFloat[15] = 1.0F;
    AppMethodBeat.o(82640);
    return arrayOfFloat;
  }

  public boolean needRender()
  {
    AppMethodBeat.i(82639);
    updateTextureParams();
    boolean bool;
    if ((this.smoothOpacity > 0.01F) && (this.isFaceImageReady))
    {
      bool = true;
      AppMethodBeat.o(82639);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(82639);
    }
  }

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    AppMethodBeat.i(82633);
    AttributeParam localAttributeParam = getAttribParam("position");
    if ((localAttributeParam == null) || (localAttributeParam.vertices.length / localAttributeParam.perVertexFloat != 690))
      AppMethodBeat.o(82633);
    while (true)
    {
      return bool;
      localAttributeParam = getAttribParam("inputTextureCoordinate");
      if ((localAttributeParam == null) || (localAttributeParam.vertices.length / localAttributeParam.perVertexFloat != 690))
      {
        AppMethodBeat.o(82633);
      }
      else
      {
        bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(82633);
      }
    }
  }

  public void setSmoothOpacity(float paramFloat)
  {
    AppMethodBeat.i(82627);
    this.smoothOpacity = paramFloat;
    addParam(new m.f("smoothOpacity", this.smoothOpacity));
    AppMethodBeat.o(82627);
  }

  public void updateParam(List<PointF> paramList)
  {
    AppMethodBeat.i(82629);
    updatePointParams(VideoMaterialUtil.copyList(paramList));
    updateTextureParams();
    AppMethodBeat.o(82629);
  }

  public void updatePointParams(List<PointF> paramList)
  {
    AppMethodBeat.i(82636);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(82636);
    while (true)
    {
      return;
      setPositions(FaceOffUtil.initFacePositions(FaceOffUtil.getFullCoords(VideoMaterialUtil.copyList(paramList), 2.0F), (int)(this.width * this.mFaceDetScale), (int)(this.height * this.mFaceDetScale), this.faceVertices));
      setCoordNum(690);
      AppMethodBeat.o(82636);
    }
  }

  public void updateTextureParams()
  {
    AppMethodBeat.i(82634);
    initFaceImage();
    AppMethodBeat.o(82634);
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82632);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    addParam(new m.b("canvasSize", paramInt1, paramInt2));
    addParam(new m.f("width", paramInt1));
    addParam(new m.f("height", paramInt2));
    AppMethodBeat.o(82632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.LightRemovePouchFilter_573
 * JD-Core Version:    0.6.2
 */