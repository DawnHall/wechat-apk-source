package com.tencent.ttpic.filter;

import android.graphics.PointF;
import java.util.List;

class VideoFilterList$FaceData
{
  public float mFaceAngle;
  public List<PointF> mFacePoints;
  public float mPhoneAngle;
  public long mTimeStamp;

  private VideoFilterList$FaceData(VideoFilterList paramVideoFilterList)
  {
  }

  public void init(List<PointF> paramList, float paramFloat1, float paramFloat2, long paramLong)
  {
    this.mFacePoints = paramList;
    this.mFaceAngle = paramFloat1;
    this.mPhoneAngle = paramFloat2;
    this.mTimeStamp = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.VideoFilterList.FaceData
 * JD-Core Version:    0.6.2
 */