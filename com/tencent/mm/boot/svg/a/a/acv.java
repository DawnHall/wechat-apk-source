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

public final class acv extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
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
      localPaint.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(31.757359F, 49.757359F);
      ((Path)localObject).cubicTo(32.843147F, 48.671574F, 34.343147F, 48.0F, 36.0F, 48.0F);
      ((Path)localObject).cubicTo(37.656853F, 48.0F, 39.156853F, 48.671574F, 40.242641F, 49.757359F);
      ((Path)localObject).lineTo(36.0F, 54.0F);
      ((Path)localObject).lineTo(31.757359F, 49.757359F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(44.061016F, 45.938984F);
      ((Path)localObject).cubicTo(41.998024F, 43.875988F, 39.148022F, 42.599998F, 36.0F, 42.599998F);
      ((Path)localObject).cubicTo(32.851978F, 42.599998F, 30.001976F, 43.875988F, 27.938982F, 45.938984F);
      ((Path)localObject).lineTo(25.393398F, 43.393398F);
      ((Path)localObject).cubicTo(28.107864F, 40.678932F, 31.857864F, 39.0F, 36.0F, 39.0F);
      ((Path)localObject).cubicTo(40.142136F, 39.0F, 43.892136F, 40.678932F, 46.606602F, 43.393398F);
      ((Path)localObject).lineTo(44.061016F, 45.938984F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.42498F, 39.57502F);
      ((Path)localObject).cubicTo(46.733303F, 35.883347F, 41.633305F, 33.599998F, 36.0F, 33.599998F);
      ((Path)localObject).cubicTo(30.366695F, 33.599998F, 25.266695F, 35.883347F, 21.575022F, 39.57502F);
      ((Path)localObject).lineTo(19.029438F, 37.029438F);
      ((Path)localObject).cubicTo(23.372583F, 32.686291F, 29.372583F, 30.0F, 36.0F, 30.0F);
      ((Path)localObject).cubicTo(42.627419F, 30.0F, 48.627419F, 32.686291F, 52.970562F, 37.029438F);
      ((Path)localObject).lineTo(50.42498F, 39.57502F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(56.78894F, 33.21106F);
      ((Path)localObject).cubicTo(51.468586F, 27.890707F, 44.118587F, 24.6F, 36.0F, 24.6F);
      ((Path)localObject).cubicTo(27.881414F, 24.6F, 20.531414F, 27.890707F, 15.211061F, 33.21106F);
      ((Path)localObject).lineTo(12.665476F, 30.665476F);
      ((Path)localObject).cubicTo(18.637302F, 24.693651F, 26.887302F, 21.0F, 36.0F, 21.0F);
      ((Path)localObject).cubicTo(45.112698F, 21.0F, 53.362698F, 24.693651F, 59.334522F, 30.665476F);
      ((Path)localObject).lineTo(56.78894F, 33.21106F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.acv
 * JD-Core Version:    0.6.2
 */