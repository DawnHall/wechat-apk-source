package com.tencent.ttpic;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Map;

public class PTFaceAttr$PTFace
{
  private Map<PTFaceAttr.PTExpression, Boolean> mExpressionRet;
  private float[] mFaceAngle;
  private List<PointF> mFacePoints;
  private List<PointF> mIrisPoints;

  public PTFaceAttr$PTFace()
  {
    AppMethodBeat.i(81568);
    this.mFaceAngle = new float[3];
    AppMethodBeat.o(81568);
  }

  public float[] getFaceAngle()
  {
    return this.mFaceAngle;
  }

  public List<PointF> getFacePoints()
  {
    return this.mFacePoints;
  }

  public List<PointF> getIrisPoints()
  {
    return this.mIrisPoints;
  }

  public void setFaceAngle(float[] paramArrayOfFloat)
  {
    this.mFaceAngle = paramArrayOfFloat;
  }

  public void setFacePoints(List<PointF> paramList)
  {
    this.mFacePoints = paramList;
  }

  public void setIrisPoints(List<PointF> paramList)
  {
    this.mIrisPoints = paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTFaceAttr.PTFace
 * JD-Core Version:    0.6.2
 */