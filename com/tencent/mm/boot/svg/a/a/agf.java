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

public final class agf extends c
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 14.048469F);
      ((Path)localObject).lineTo(36.0F, 22.694517F);
      ((Path)localObject).cubicTo(26.540211F, 27.188381F, 20.0F, 36.830418F, 20.0F, 48.0F);
      ((Path)localObject).cubicTo(20.0F, 63.463974F, 32.536026F, 76.0F, 48.0F, 76.0F);
      ((Path)localObject).cubicTo(63.463974F, 76.0F, 76.0F, 63.463974F, 76.0F, 48.0F);
      ((Path)localObject).cubicTo(76.0F, 36.830418F, 69.459793F, 27.188381F, 60.0F, 22.694525F);
      ((Path)localObject).lineTo(60.0F, 14.048469F);
      ((Path)localObject).cubicTo(73.982307F, 18.990505F, 84.0F, 32.325375F, 84.0F, 48.0F);
      ((Path)localObject).cubicTo(84.0F, 67.882248F, 67.882248F, 84.0F, 48.0F, 84.0F);
      ((Path)localObject).cubicTo(28.117748F, 84.0F, 12.0F, 67.882248F, 12.0F, 48.0F);
      ((Path)localObject).cubicTo(12.0F, 32.325375F, 22.017691F, 18.990505F, 36.0F, 14.048469F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(44.0F, 6.0F);
      ((Path)localObject).lineTo(52.0F, 6.0F);
      ((Path)localObject).lineTo(52.0F, 48.0F);
      ((Path)localObject).lineTo(44.0F, 48.0F);
      ((Path)localObject).lineTo(44.0F, 6.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.agf
 * JD-Core Version:    0.6.2
 */