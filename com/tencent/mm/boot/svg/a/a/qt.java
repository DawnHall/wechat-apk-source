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

public final class qt extends c
{
  private final int height = 108;
  private final int width = 108;

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
        paramInt = 108;
        continue;
        paramInt = 108;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-12206054);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.lineTo(108.0F, 108.0F);
      localPath.lineTo(0.0F, 108.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(47.0F, 61.0F);
      ((Path)localObject).cubicTo(53.445965F, 67.115555F, 59.404129F, 69.983971F, 62.0F, 70.0F);
      ((Path)localObject).cubicTo(63.810833F, 69.648026F, 69.297798F, 65.978241F, 72.0F, 66.0F);
      ((Path)localObject).cubicTo(73.133011F, 66.05056F, 81.268166F, 71.401299F, 82.0F, 72.0F);
      ((Path)localObject).cubicTo(83.237686F, 72.638557F, 84.15078F, 73.361198F, 84.0F, 74.0F);
      ((Path)localObject).cubicTo(83.807396F, 75.190063F, 80.232086F, 85.262489F, 71.0F, 84.0F);
      ((Path)localObject).cubicTo(61.976585F, 82.472893F, 49.251225F, 72.903206F, 42.0F, 66.0F);
      ((Path)localObject).lineTo(47.0F, 61.0F);
      ((Path)localObject).lineTo(47.0F, 61.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(47.0F, 61.0F);
      ((Path)localObject).cubicTo(40.884441F, 54.554035F, 38.016029F, 48.595871F, 38.0F, 46.0F);
      ((Path)localObject).cubicTo(38.351978F, 44.189167F, 42.021763F, 38.702202F, 42.0F, 36.0F);
      ((Path)localObject).cubicTo(41.94944F, 34.866989F, 36.598705F, 26.731834F, 36.0F, 26.0F);
      ((Path)localObject).cubicTo(35.361439F, 24.762312F, 34.638798F, 23.84922F, 34.0F, 24.0F);
      ((Path)localObject).cubicTo(32.80994F, 24.192604F, 22.737509F, 27.767912F, 24.0F, 37.0F);
      ((Path)localObject).cubicTo(25.527109F, 46.023415F, 35.096794F, 58.748775F, 42.0F, 66.0F);
      ((Path)localObject).lineTo(47.0F, 61.0F);
      ((Path)localObject).lineTo(47.0F, 61.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qt
 * JD-Core Version:    0.6.2
 */