package com.tencent.ttpic.model;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.VideoFilterFactory.POSITION_TYPE;
import com.tencent.ttpic.util.VideoFilterUtil.RATIO_MODE;
import java.util.ArrayList;
import java.util.List;

public class FastStaticSticker extends FastSticker
{
  private boolean initialized;
  private VideoFilterUtil.RATIO_MODE ratioMode;
  private List<PointF> relativePivotsPts_16_9;
  private List<PointF> relativePivotsPts_1_1;
  private List<PointF> relativePivotsPts_4_3;
  private List<PointF> relativePosPts_16_9;
  private List<PointF> relativePosPts_1_1;
  private List<PointF> relativePosPts_4_3;

  public FastStaticSticker(StickerItem paramStickerItem, String paramString)
  {
    super(paramStickerItem, paramString);
    AppMethodBeat.i(83491);
    this.initialized = false;
    initRelativeParams();
    this.renderParam.texScale = 1.0F;
    AppMethodBeat.o(83491);
  }

  private void initRelativeParams()
  {
    AppMethodBeat.i(83497);
    this.relativePivotsPts_4_3 = new ArrayList();
    this.relativePivotsPts_4_3.add(new PointF(360.0F, 480.0F));
    this.relativePivotsPts_4_3.add(new PointF(0.0F, 0.0F));
    this.relativePivotsPts_4_3.add(new PointF(360.0F, 0.0F));
    this.relativePivotsPts_4_3.add(new PointF(720.0F, 0.0F));
    this.relativePivotsPts_4_3.add(new PointF(0.0F, 480.0F));
    this.relativePivotsPts_4_3.add(new PointF(720.0F, 480.0F));
    this.relativePivotsPts_4_3.add(new PointF(0.0F, 960.0F));
    this.relativePivotsPts_4_3.add(new PointF(360.0F, 960.0F));
    this.relativePivotsPts_4_3.add(new PointF(720.0F, 960.0F));
    this.relativePivotsPts_16_9 = new ArrayList();
    this.relativePivotsPts_16_9.add(new PointF(360.0F, 480.0F));
    this.relativePivotsPts_16_9.add(new PointF(90.0F, 0.0F));
    this.relativePivotsPts_16_9.add(new PointF(360.0F, 0.0F));
    this.relativePivotsPts_16_9.add(new PointF(630.0F, 0.0F));
    this.relativePivotsPts_16_9.add(new PointF(90.0F, 480.0F));
    this.relativePivotsPts_16_9.add(new PointF(630.0F, 480.0F));
    this.relativePivotsPts_16_9.add(new PointF(90.0F, 960.0F));
    this.relativePivotsPts_16_9.add(new PointF(360.0F, 960.0F));
    this.relativePivotsPts_16_9.add(new PointF(630.0F, 960.0F));
    this.relativePivotsPts_1_1 = new ArrayList();
    this.relativePivotsPts_1_1.add(new PointF(360.0F, 480.0F));
    this.relativePivotsPts_1_1.add(new PointF(0.0F, 120.0F));
    this.relativePivotsPts_1_1.add(new PointF(360.0F, 120.0F));
    this.relativePivotsPts_1_1.add(new PointF(720.0F, 120.0F));
    this.relativePivotsPts_1_1.add(new PointF(0.0F, 480.0F));
    this.relativePivotsPts_1_1.add(new PointF(720.0F, 480.0F));
    this.relativePivotsPts_1_1.add(new PointF(0.0F, 840.0F));
    this.relativePivotsPts_1_1.add(new PointF(360.0F, 840.0F));
    this.relativePivotsPts_1_1.add(new PointF(720.0F, 840.0F));
    this.relativePosPts_4_3 = new ArrayList();
    this.relativePosPts_4_3.add(new PointF(0.5F, 0.5F));
    this.relativePosPts_4_3.add(new PointF(0.0F, 0.0F));
    this.relativePosPts_4_3.add(new PointF(0.5F, 0.0F));
    this.relativePosPts_4_3.add(new PointF(1.0F, 0.0F));
    this.relativePosPts_4_3.add(new PointF(0.0F, 0.5F));
    this.relativePosPts_4_3.add(new PointF(1.0F, 0.5F));
    this.relativePosPts_4_3.add(new PointF(0.0F, 1.0F));
    this.relativePosPts_4_3.add(new PointF(0.5F, 1.0F));
    this.relativePosPts_4_3.add(new PointF(1.0F, 1.0F));
    this.relativePosPts_16_9 = new ArrayList();
    this.relativePosPts_16_9.add(new PointF(0.5F, 0.5F));
    this.relativePosPts_16_9.add(new PointF(0.125F, 0.0F));
    this.relativePosPts_16_9.add(new PointF(0.5F, 0.0F));
    this.relativePosPts_16_9.add(new PointF(0.875F, 0.0F));
    this.relativePosPts_16_9.add(new PointF(0.125F, 0.5F));
    this.relativePosPts_16_9.add(new PointF(0.875F, 0.5F));
    this.relativePosPts_16_9.add(new PointF(0.125F, 1.0F));
    this.relativePosPts_16_9.add(new PointF(0.5F, 1.0F));
    this.relativePosPts_16_9.add(new PointF(0.875F, 1.0F));
    this.relativePosPts_1_1 = new ArrayList();
    this.relativePosPts_1_1.add(new PointF(0.5F, 0.5F));
    this.relativePosPts_1_1.add(new PointF(0.0F, 0.125F));
    this.relativePosPts_1_1.add(new PointF(0.5F, 0.125F));
    this.relativePosPts_1_1.add(new PointF(1.0F, 0.125F));
    this.relativePosPts_1_1.add(new PointF(0.0F, 0.5F));
    this.relativePosPts_1_1.add(new PointF(1.0F, 0.5F));
    this.relativePosPts_1_1.add(new PointF(0.0F, 0.875F));
    this.relativePosPts_1_1.add(new PointF(0.5F, 0.875F));
    this.relativePosPts_1_1.add(new PointF(1.0F, 0.875F));
    AppMethodBeat.o(83497);
  }

  public void clearTextureParam()
  {
    AppMethodBeat.i(83495);
    super.clearTextureParam();
    this.initialized = false;
    AppMethodBeat.o(83495);
  }

  public void initPositionAdjusted()
  {
    AppMethodBeat.i(83496);
    if ((this.item == null) || (this.item.position == null) || (this.item.position.length < 2))
    {
      this.renderParam.position = GlUtil.EMPTY_POSITIONS_TRIANGLES;
      AppMethodBeat.o(83496);
    }
    while (true)
    {
      return;
      int i = this.item.width;
      int j = this.item.height;
      int k = j;
      int m = i;
      label103: List localList;
      label119: double[] arrayOfDouble;
      if (this.item.type == VideoFilterFactory.POSITION_TYPE.RELATIVE.type)
      {
        if (this.ratioMode != VideoFilterUtil.RATIO_MODE.RATIO_MODE_4_3)
          break label569;
        localObject = this.relativePivotsPts_4_3;
        if (this.ratioMode != VideoFilterUtil.RATIO_MODE.RATIO_MODE_4_3)
          break label597;
        localList = this.relativePosPts_4_3;
        f1 = AlgoUtils.getDistance((PointF)((List)localObject).get(this.item.scalePivots[0]), (PointF)((List)localObject).get(this.item.scalePivots[1])) / this.item.scaleFactor;
        i = (int)(i * f1);
        j = (int)(j * f1);
        arrayOfDouble = new double[2];
        localObject = arrayOfDouble;
        if (this.item.alignFacePoints != null)
        {
          localObject = arrayOfDouble;
          if (this.item.alignFacePoints.length > 0)
          {
            if (this.item.alignFacePoints.length != 1)
              break label625;
            localObject = arrayOfDouble;
            if (this.item.alignFacePoints[0] < localList.size())
              localObject = new double[] { ((PointF)localList.get(this.item.alignFacePoints[0])).x, ((PointF)localList.get(this.item.alignFacePoints[0])).y };
          }
        }
      }
      while (true)
      {
        k = j;
        m = i;
        if (this.item.anchorPoint != null)
        {
          k = j;
          m = i;
          if (this.item.anchorPoint.length >= 2)
          {
            this.item.position[0] = (localObject[0] - this.item.anchorPoint[0] * f1 / 720.0F);
            this.item.position[1] = (localObject[1] - this.item.anchorPoint[1] * f1 / 960.0F);
            m = i;
            k = j;
          }
        }
        if (this.width / this.height < 0.75D)
          break label899;
        d1 = this.width / 720.0D;
        i = (int)(this.width / 0.75D);
        int n = (int)(i * this.item.position[1]);
        j = (int)(this.width * this.item.position[0]);
        i = n - (i - this.height) / 2;
        if (this.item.scaleDirection != 0)
          break label809;
        localObject = this.renderParam;
        f2 = j;
        f1 = (float)(i + k * d1);
        d2 = j;
        ((RenderParam)localObject).position = AlgoUtils.calPositionsTriangles(f2, f1, (float)(d1 * m + d2), i, this.width, this.height);
        AppMethodBeat.o(83496);
        break;
        label569: if (this.ratioMode == VideoFilterUtil.RATIO_MODE.RATIO_MODE_16_9)
        {
          localObject = this.relativePivotsPts_16_9;
          break label103;
        }
        localObject = this.relativePivotsPts_1_1;
        break label103;
        label597: if (this.ratioMode == VideoFilterUtil.RATIO_MODE.RATIO_MODE_16_9)
        {
          localList = this.relativePosPts_16_9;
          break label119;
        }
        localList = this.relativePosPts_1_1;
        break label119;
        label625: localObject = arrayOfDouble;
        if (this.item.alignFacePoints.length == 2)
        {
          localObject = arrayOfDouble;
          if (this.item.alignFacePoints[0] < localList.size())
          {
            localObject = arrayOfDouble;
            if (this.item.alignFacePoints[1] < localList.size())
            {
              f2 = ((PointF)localList.get(this.item.alignFacePoints[0])).x;
              d1 = (((PointF)localList.get(this.item.alignFacePoints[1])).x + f2) / 2.0F;
              f2 = ((PointF)localList.get(this.item.alignFacePoints[0])).y;
              localObject = new double[] { d1, (((PointF)localList.get(this.item.alignFacePoints[1])).y + f2) / 2.0F };
            }
          }
        }
      }
      label809: float f1 = j;
      float f2 = (float)(i + k * d1);
      double d2 = j;
      Object localObject = AlgoUtils.calPositionsTriangles(f1, f2, (float)(d1 * m + d2), i, this.width, this.height);
      this.renderParam.position = AlgoUtils.adjustPositionTriangles((float[])localObject, (float)this.triggerCtrlItem.getAudioScaleFactor(), this.item.anchorPointAudio, this.item.scaleDirection);
      AppMethodBeat.o(83496);
      continue;
      label899: double d1 = this.height / 960.0D;
      i = (int)(this.height * 0.75D);
      j = (int)(this.height * this.item.position[1]);
      i = (int)(i * this.item.position[0]) - (i - this.width) / 2;
      if (this.item.scaleDirection == 0)
      {
        localObject = this.renderParam;
        f2 = i;
        f1 = (float)(j + k * d1);
        d2 = i;
        ((RenderParam)localObject).position = AlgoUtils.calPositionsTriangles(f2, f1, (float)(d1 * m + d2), j, this.width, this.height);
        AppMethodBeat.o(83496);
      }
      else
      {
        f2 = i;
        f1 = (float)(j + k * d1);
        d2 = i;
        localObject = AlgoUtils.calPositionsTriangles(f2, f1, (float)(d1 * m + d2), j, this.width, this.height);
        this.renderParam.position = AlgoUtils.adjustPositionTriangles((float[])localObject, (float)this.triggerCtrlItem.getAudioScaleFactor(), this.item.anchorPointAudio, this.item.scaleDirection);
        AppMethodBeat.o(83496);
      }
    }
  }

  public void setRatioMode(VideoFilterUtil.RATIO_MODE paramRATIO_MODE)
  {
    this.ratioMode = paramRATIO_MODE;
  }

  public void updatePositions(List<PointF> paramList)
  {
    AppMethodBeat.i(83494);
    if (this.initialized)
      AppMethodBeat.o(83494);
    while (true)
    {
      return;
      initPositionAdjusted();
      AppMethodBeat.o(83494);
    }
  }

  protected void updatePositions(List<PointF> paramList, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(83493);
    if (this.initialized)
      AppMethodBeat.o(83493);
    while (true)
    {
      return;
      initPositionAdjusted();
      AppMethodBeat.o(83493);
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(83492);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    initPositionAdjusted();
    AppMethodBeat.o(83492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.FastStaticSticker
 * JD-Core Version:    0.6.2
 */