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

public final class afw extends c
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
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(110.0F, 70.0F);
      ((Path)localObject).lineTo(110.0F, 71.0F);
      ((Path)localObject).cubicTo(110.0F, 71.342468F, 109.96557F, 71.676888F, 109.89998F, 72.0F);
      ((Path)localObject).lineTo(110.0F, 72.0F);
      ((Path)localObject).lineTo(110.0F, 95.0F);
      ((Path)localObject).cubicTo(110.0F, 97.761421F, 107.76142F, 100.0F, 105.0F, 100.0F);
      ((Path)localObject).lineTo(15.0F, 100.0F);
      ((Path)localObject).cubicTo(12.238576F, 100.0F, 10.0F, 97.761421F, 10.0F, 95.0F);
      ((Path)localObject).lineTo(10.0F, 25.0F);
      ((Path)localObject).cubicTo(10.0F, 22.238577F, 12.238576F, 20.0F, 15.0F, 20.0F);
      ((Path)localObject).lineTo(105.0F, 20.0F);
      ((Path)localObject).cubicTo(107.76142F, 20.0F, 110.0F, 22.238577F, 110.0F, 25.0F);
      ((Path)localObject).lineTo(110.0F, 48.0F);
      ((Path)localObject).lineTo(109.89998F, 48.0F);
      ((Path)localObject).cubicTo(109.96557F, 48.323109F, 110.0F, 48.657536F, 110.0F, 49.0F);
      ((Path)localObject).lineTo(110.0F, 50.0F);
      ((Path)localObject).lineTo(110.0F, 70.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(104.0F, 70.0F);
      ((Path)localObject).lineTo(104.0F, 50.0F);
      ((Path)localObject).lineTo(75.0F, 50.0F);
      ((Path)localObject).cubicTo(69.47715F, 50.0F, 65.0F, 54.477154F, 65.0F, 60.0F);
      ((Path)localObject).cubicTo(65.0F, 65.52285F, 69.47715F, 70.0F, 75.0F, 70.0F);
      ((Path)localObject).lineTo(104.0F, 70.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(104.0F, 44.0F);
      ((Path)localObject).lineTo(104.0F, 26.0F);
      ((Path)localObject).lineTo(16.0F, 26.0F);
      ((Path)localObject).lineTo(16.0F, 94.0F);
      ((Path)localObject).lineTo(104.0F, 94.0F);
      ((Path)localObject).lineTo(104.0F, 76.0F);
      ((Path)localObject).lineTo(75.0F, 76.0F);
      ((Path)localObject).cubicTo(66.163445F, 76.0F, 59.0F, 68.836555F, 59.0F, 60.0F);
      ((Path)localObject).cubicTo(59.0F, 51.163445F, 66.163445F, 44.0F, 75.0F, 44.0F);
      ((Path)localObject).lineTo(104.0F, 44.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(75.0F, 65.0F);
      ((Path)localObject).cubicTo(72.238579F, 65.0F, 70.0F, 62.761425F, 70.0F, 60.0F);
      ((Path)localObject).cubicTo(70.0F, 57.238575F, 72.238579F, 55.0F, 75.0F, 55.0F);
      ((Path)localObject).cubicTo(77.761421F, 55.0F, 80.0F, 57.238575F, 80.0F, 60.0F);
      ((Path)localObject).cubicTo(80.0F, 62.761425F, 77.761421F, 65.0F, 75.0F, 65.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afw
 * JD-Core Version:    0.6.2
 */