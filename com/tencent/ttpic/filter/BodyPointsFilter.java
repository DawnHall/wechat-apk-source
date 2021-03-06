package com.tencent.ttpic.filter;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import java.util.List;

public class BodyPointsFilter extends VideoFilterBase
{
  private static final int BODY_POINTS_COUNT = 59;
  public static final String FRAGMENT_SHADER = " precision highp float;\n void main()\n {\n     gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);\n }\n";
  public static final String VERTEX_SHADER = "attribute vec4 position;\n\nvoid main() {\n    gl_Position = position;\n}";
  float[] lineVertex;
  private boolean mNoPoints;
  float[] pointsVertex;

  public BodyPointsFilter()
  {
    super("attribute vec4 position;\n\nvoid main() {\n    gl_Position = position;\n}", " precision highp float;\n void main()\n {\n     gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);\n }\n");
    AppMethodBeat.i(82051);
    this.lineVertex = new float['ì'];
    this.pointsVertex = new float[118];
    this.mNoPoints = true;
    AppMethodBeat.o(82051);
  }

  private void normalizePoints(List<PointF> paramList, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(82057);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(82057);
    while (true)
    {
      return;
      for (int j = 0; j < paramList.size() - 1; j++)
      {
        this.lineVertex[(j * 4 + 0)] = (((PointF)paramList.get(j)).x * 2.0F / paramInt1 - 1.0F);
        this.lineVertex[(j * 4 + 1)] = (((PointF)paramList.get(j)).y * 2.0F / paramInt2 - 1.0F);
        this.lineVertex[(j * 4 + 2)] = (((PointF)paramList.get(j + 1)).x * 2.0F / paramInt1 - 1.0F);
        this.lineVertex[(j * 4 + 3)] = (((PointF)paramList.get(j + 1)).y * 2.0F / paramInt2 - 1.0F);
      }
      j = paramList.size() - 1;
      this.lineVertex[(j * 4 + 0)] = (((PointF)paramList.get(j)).x * 2.0F / paramInt1 - 1.0F);
      this.lineVertex[(j * 4 + 1)] = (((PointF)paramList.get(j)).y * 2.0F / paramInt2 - 1.0F);
      this.lineVertex[(j * 4 + 2)] = (((PointF)paramList.get(0)).x * 2.0F / paramInt1 - 1.0F);
      this.lineVertex[(j * 4 + 3)] = (((PointF)paramList.get(0)).y * 2.0F / paramInt2 - 1.0F);
      for (j = i; j < paramList.size(); j++)
      {
        this.pointsVertex[(j * 2)] = (((PointF)paramList.get(j)).x * 2.0F / paramInt1 - 1.0F);
        this.pointsVertex[(j * 2 + 1)] = (((PointF)paramList.get(j)).y * 2.0F / paramInt2 - 1.0F);
      }
      AppMethodBeat.o(82057);
    }
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82053);
    super.ApplyGLSLFilter();
    AppMethodBeat.o(82053);
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(82054);
    super.clearGLSLSelf();
    AppMethodBeat.o(82054);
  }

  public void initAttribParams()
  {
    AppMethodBeat.i(82052);
    setPositions(GlUtil.ORIGIN_POSITION_COORDS);
    AppMethodBeat.o(82052);
  }

  public void initParams()
  {
  }

  public void render(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(82056);
    if (!this.mNoPoints)
    {
      GLES20.glLineWidth(4.0F);
      setDrawMode(GlUtil.DRAW_MODE.LINES);
      setCoordNum(118);
      setPositions(this.lineVertex);
      GlUtil.setBlendMode(true);
      OnDrawFrameGLSL();
      renderTexture(paramInt1, paramInt2, paramInt3);
      GlUtil.setBlendMode(false);
      GLES20.glLineWidth(8.0F);
      setDrawMode(GlUtil.DRAW_MODE.POINTS);
      setCoordNum(59);
      setPositions(this.pointsVertex);
      GlUtil.setBlendMode(true);
      OnDrawFrameGLSL();
      renderTexture(paramInt1, paramInt2, paramInt3);
      GlUtil.setBlendMode(false);
    }
    AppMethodBeat.o(82056);
  }

  public void updatePoints(List<PointF> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82055);
    if ((paramList == null) || (paramList.size() != 59))
    {
      this.mNoPoints = true;
      AppMethodBeat.o(82055);
    }
    while (true)
    {
      return;
      this.mNoPoints = false;
      normalizePoints(paramList, paramInt1, paramInt2);
      AppMethodBeat.o(82055);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.BodyPointsFilter
 * JD-Core Version:    0.6.2
 */