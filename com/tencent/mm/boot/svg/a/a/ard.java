package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ard extends c
{
  private final int height = 120;
  private final int width = 120;

  public final int a(int paramInt, Object[] paramArrayOfObject)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      paramInt = 0;
      while (true)
      {
        return paramInt;
        paramInt = 120;
        continue;
        paramInt = 120;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(57.740002F, 0.0F);
      ((Path)localObject).lineTo(61.880001F, 0.0F);
      ((Path)localObject).cubicTo(76.5F, 0.47F, 90.870003F, 6.44F, 101.42F, 16.6F);
      ((Path)localObject).cubicTo(112.63F, 27.200001F, 119.36F, 42.25F, 120.0F, 57.650002F);
      ((Path)localObject).lineTo(120.0F, 62.029999F);
      ((Path)localObject).cubicTo(119.47F, 77.559998F, 112.7F, 92.75F, 101.39F, 103.42F);
      ((Path)localObject).cubicTo(90.949997F, 113.49F, 76.75F, 119.41F, 62.279999F, 120.0F);
      ((Path)localObject).lineTo(58.099998F, 120.0F);
      ((Path)localObject).cubicTo(42.07F, 119.5F, 26.379999F, 112.32F, 15.65F, 100.39F);
      ((Path)localObject).cubicTo(6.15F, 90.080002F, 0.61F, 76.339996F, 0.0F, 62.360001F);
      ((Path)localObject).lineTo(0.0F, 57.990002F);
      ((Path)localObject).cubicTo(0.53F, 42.259998F, 7.48F, 26.860001F, 19.049999F, 16.16F);
      ((Path)localObject).cubicTo(29.450001F, 6.34F, 43.459999F, 0.59F, 57.740002F, 0.0F);
      ((Path)localObject).lineTo(57.740002F, 0.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.529999F, 4.81F);
      ((Path)localObject).cubicTo(34.939999F, 7.39F, 20.709999F, 17.0F, 12.43F, 30.459999F);
      ((Path)localObject).cubicTo(4.17F, 43.580002F, 1.85F, 60.209999F, 6.07F, 75.110001F);
      ((Path)localObject).cubicTo(9.83F, 88.739998F, 19.02F, 100.74F, 31.15F, 108.0F);
      ((Path)localObject).cubicTo(44.419998F, 116.08F, 61.130001F, 118.16F, 76.0F, 113.67F);
      ((Path)localObject).cubicTo(89.730003F, 109.64F, 101.71F, 100.06F, 108.73F, 87.599998F);
      ((Path)localObject).cubicTo(115.52F, 75.739998F, 117.64F, 61.349998F, 114.7F, 48.02F);
      ((Path)localObject).cubicTo(111.63F, 33.639999F, 102.57F, 20.700001F, 90.160004F, 12.83F);
      ((Path)localObject).cubicTo(78.57F, 5.32F, 64.129997F, 2.44F, 50.529999F, 4.81F);
      ((Path)localObject).lineTo(50.529999F, 4.81F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint2, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(42.0F, 32.009998F);
      ((Path)localObject).cubicTo(57.32F, 41.34F, 72.660004F, 50.639999F, 87.970001F, 60.0F);
      ((Path)localObject).cubicTo(72.669998F, 69.370003F, 57.32F, 78.660004F, 42.009998F, 88.0F);
      ((Path)localObject).cubicTo(42.0F, 69.330002F, 42.0F, 50.669998F, 42.0F, 32.009998F);
      ((Path)localObject).lineTo(42.0F, 32.009998F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ard
 * JD-Core Version:    0.6.2
 */