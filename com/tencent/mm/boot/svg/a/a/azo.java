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

public final class azo extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(46.0F, 73.0F);
      ((Path)localObject).lineTo(46.0F, 69.997391F);
      ((Path)localObject).cubicTo(46.0F, 69.963478F, 46.000851F, 69.929756F, 46.002525F, 69.896255F);
      ((Path)localObject).cubicTo(36.447983F, 68.898026F, 29.0F, 60.818798F, 29.0F, 51.0F);
      ((Path)localObject).cubicTo(29.0F, 49.895432F, 29.89543F, 49.0F, 31.0F, 49.0F);
      ((Path)localObject).cubicTo(32.104568F, 49.0F, 33.0F, 49.895432F, 33.0F, 51.0F);
      ((Path)localObject).cubicTo(33.0F, 59.284271F, 39.715729F, 66.0F, 48.0F, 66.0F);
      ((Path)localObject).cubicTo(56.284271F, 66.0F, 63.0F, 59.284271F, 63.0F, 51.0F);
      ((Path)localObject).cubicTo(63.0F, 49.895432F, 63.895432F, 49.0F, 65.0F, 49.0F);
      ((Path)localObject).cubicTo(66.104568F, 49.0F, 67.0F, 49.895432F, 67.0F, 51.0F);
      ((Path)localObject).cubicTo(67.0F, 60.818787F, 59.552032F, 68.89801F, 49.997501F, 69.896255F);
      ((Path)localObject).lineTo(49.997501F, 69.896255F);
      ((Path)localObject).cubicTo(49.999161F, 69.929756F, 50.0F, 69.963478F, 50.0F, 69.997391F);
      ((Path)localObject).lineTo(50.0F, 73.0F);
      ((Path)localObject).lineTo(57.008846F, 73.0F);
      ((Path)localObject).cubicTo(58.110325F, 73.0F, 59.0F, 73.895432F, 59.0F, 75.0F);
      ((Path)localObject).cubicTo(59.0F, 76.112274F, 58.108528F, 77.0F, 57.008846F, 77.0F);
      ((Path)localObject).lineTo(38.991154F, 77.0F);
      ((Path)localObject).cubicTo(37.889675F, 77.0F, 37.0F, 76.104568F, 37.0F, 75.0F);
      ((Path)localObject).cubicTo(37.0F, 73.887726F, 37.891472F, 73.0F, 38.991154F, 73.0F);
      ((Path)localObject).lineTo(46.0F, 73.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 20.0F);
      ((Path)localObject).cubicTo(41.92487F, 20.0F, 37.0F, 24.920769F, 37.0F, 31.007566F);
      ((Path)localObject).lineTo(37.0F, 50.992435F);
      ((Path)localObject).cubicTo(37.0F, 57.071747F, 41.923531F, 62.0F, 48.0F, 62.0F);
      ((Path)localObject).cubicTo(54.07513F, 62.0F, 59.0F, 57.079231F, 59.0F, 50.992435F);
      ((Path)localObject).lineTo(59.0F, 31.007566F);
      ((Path)localObject).cubicTo(59.0F, 24.928255F, 54.076469F, 20.0F, 48.0F, 20.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azo
 * JD-Core Version:    0.6.2
 */