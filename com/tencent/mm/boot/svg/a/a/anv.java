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

public final class anv extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localPaint.setColor(-13421773);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(96.0F, 96.249916F);
      ((Path)localObject).cubicTo(92.548218F, 96.249916F, 89.75F, 93.451698F, 89.75F, 89.999916F);
      ((Path)localObject).cubicTo(89.75F, 86.548126F, 92.548218F, 83.749916F, 96.0F, 83.749916F);
      ((Path)localObject).cubicTo(99.451782F, 83.749916F, 102.25F, 86.548126F, 102.25F, 89.999916F);
      ((Path)localObject).cubicTo(102.25F, 93.451698F, 99.451782F, 96.249916F, 96.0F, 96.249916F);
      ((Path)localObject).moveTo(126.0F, 63.005955F);
      ((Path)localObject).cubicTo(126.0F, 61.345814F, 124.66269F, 60.0F, 123.00407F, 60.0F);
      ((Path)localObject).lineTo(68.995941F, 60.0F);
      ((Path)localObject).cubicTo(67.341324F, 60.0F, 66.0F, 61.347015F, 66.0F, 63.005955F);
      ((Path)localObject).lineTo(66.0F, 65.80777F);
      ((Path)localObject).cubicTo(66.0F, 76.382408F, 75.167145F, 85.296455F, 87.692574F, 88.081665F);
      ((Path)localObject).cubicTo(87.526283F, 88.752289F, 87.428574F, 89.449669F, 87.428574F, 90.172081F);
      ((Path)localObject).cubicTo(87.428574F, 90.458633F, 87.444F, 90.74173F, 87.471428F, 91.02137F);
      ((Path)localObject).cubicTo(79.202568F, 89.726723F, 71.797714F, 86.585922F, 66.0F, 82.178955F);
      ((Path)localObject).lineTo(66.0F, 132.00877F);
      ((Path)localObject).cubicTo(66.0F, 133.66078F, 67.337311F, 135.0F, 68.995941F, 135.0F);
      ((Path)localObject).lineTo(123.00407F, 135.0F);
      ((Path)localObject).cubicTo(124.65868F, 135.0F, 126.0F, 133.65459F, 126.0F, 132.00877F);
      ((Path)localObject).lineTo(126.0F, 82.178955F);
      ((Path)localObject).cubicTo(120.20229F, 86.585922F, 112.79743F, 89.726723F, 104.52857F, 91.02137F);
      ((Path)localObject).cubicTo(104.556F, 90.74173F, 104.57143F, 90.458633F, 104.57143F, 90.172081F);
      ((Path)localObject).cubicTo(104.57143F, 89.449669F, 104.47372F, 88.752289F, 104.30743F, 88.081665F);
      ((Path)localObject).cubicTo(116.83286F, 85.296455F, 126.0F, 76.382408F, 126.0F, 65.80777F);
      ((Path)localObject).lineTo(126.0F, 63.005955F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.anv
 * JD-Core Version:    0.6.2
 */