package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ad extends BaseFilter
{
  public ad()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86479);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/gaoleng_curve.png", 33986));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKG);
    localBaseFilter2.addParam(new m.g("shadowsShift", new float[] { -0.2235294F, 0.03921569F, 0.08627451F }));
    localBaseFilter2.addParam(new m.g("midtonesShift", new float[] { -0.1490196F, 0.0F, 0.08627451F }));
    localBaseFilter2.addParam(new m.g("highlightsShift", new float[] { -0.01960784F, 0.01960784F, 0.0588235F }));
    localBaseFilter2.addParam(new m.i("preserveLuminosity", 1));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bLN);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.0666667F, 0.6F, 0.8745098F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 0.7F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bKE);
    localBaseFilter2.addParam(new m.f("scaleC", -0.07500002F));
    localBaseFilter2.addParam(new m.f("scaleT", 0.0F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bJO);
    localBaseFilter1.addParam(new m.f("contrast", 1.13F));
    localBaseFilter1.addParam(new m.f("saturation", 1.0F));
    localBaseFilter1.addParam(new m.f("brightness", 1.0F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bLF);
    localBaseFilter2.addParam(new m.f("inputH", 1.0F));
    localBaseFilter2.addParam(new m.f("inputS", 1.0F));
    localBaseFilter2.addParam(new m.f("inputV", 0.98F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.ad
 * JD-Core Version:    0.6.2
 */