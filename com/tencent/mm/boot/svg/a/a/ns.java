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

public final class ns extends c
{
  private final int height = 56;
  private final int width = 10;

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
        paramInt = 10;
        continue;
        paramInt = 56;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-3684404);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -273.0F, 0.0F, 1.0F, -165.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(278.0F, 175.0F);
      ((Path)localObject2).cubicTo(280.76141F, 175.0F, 283.0F, 172.76143F, 283.0F, 170.0F);
      ((Path)localObject2).cubicTo(283.0F, 167.23857F, 280.76141F, 165.0F, 278.0F, 165.0F);
      ((Path)localObject2).cubicTo(275.23859F, 165.0F, 273.0F, 167.23857F, 273.0F, 170.0F);
      ((Path)localObject2).cubicTo(273.0F, 172.76143F, 275.23859F, 175.0F, 278.0F, 175.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(278.0F, 198.0F);
      ((Path)localObject2).cubicTo(280.76141F, 198.0F, 283.0F, 195.76143F, 283.0F, 193.0F);
      ((Path)localObject2).cubicTo(283.0F, 190.23857F, 280.76141F, 188.0F, 278.0F, 188.0F);
      ((Path)localObject2).cubicTo(275.23859F, 188.0F, 273.0F, 190.23857F, 273.0F, 193.0F);
      ((Path)localObject2).cubicTo(273.0F, 195.76143F, 275.23859F, 198.0F, 278.0F, 198.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(278.0F, 221.0F);
      ((Path)localObject2).cubicTo(280.76141F, 221.0F, 283.0F, 218.76143F, 283.0F, 216.0F);
      ((Path)localObject2).cubicTo(283.0F, 213.23857F, 280.76141F, 211.0F, 278.0F, 211.0F);
      ((Path)localObject2).cubicTo(275.23859F, 211.0F, 273.0F, 213.23857F, 273.0F, 216.0F);
      ((Path)localObject2).cubicTo(273.0F, 218.76143F, 275.23859F, 221.0F, 278.0F, 221.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ns
 * JD-Core Version:    0.6.2
 */