package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class any extends c
{
  private final int height = 168;
  private final int width = 168;

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
        paramInt = 168;
        continue;
        paramInt = 168;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-8617594);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 50.0F, 0.0F, 1.0F, 36.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(24.867924F, 54.0F);
      ((Path)localObject1).lineTo(2.0F, 54.0F);
      ((Path)localObject1).cubicTo(1.277121F, 54.0F, 0.5018365F, 53.545902F, -1.065814E-014F, 53.0F);
      ((Path)localObject1).cubicTo(-0.1705736F, 51.974609F, 0.02324753F, 51.067921F, 1.0F, 50.0F);
      ((Path)localObject1).lineTo(43.0F, 1.0F);
      ((Path)localObject1).cubicTo(43.767178F, 0.09632745F, 44.461952F, -0.1307209F, 45.0F, 7.105427E-015F);
      ((Path)localObject1).cubicTo(45.696445F, 0.2812741F, 46.048306F, 0.857165F, 46.0F, 1.0F);
      ((Path)localObject1).lineTo(42.132076F, 42.0F);
      ((Path)localObject1).lineTo(67.0F, 42.0F);
      ((Path)localObject1).cubicTo(67.668083F, 42.0F, 68.477409F, 42.454098F, 69.0F, 43.0F);
      ((Path)localObject1).cubicTo(69.17823F, 44.026894F, 68.976273F, 44.932079F, 68.0F, 46.0F);
      ((Path)localObject1).lineTo(24.0F, 95.0F);
      ((Path)localObject1).cubicTo(23.331083F, 95.903671F, 22.604643F, 96.129219F, 22.0F, 96.0F);
      ((Path)localObject1).cubicTo(21.31604F, 95.717224F, 20.949804F, 95.142838F, 21.0F, 95.0F);
      ((Path)localObject1).lineTo(24.867924F, 54.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.any
 * JD-Core Version:    0.6.2
 */