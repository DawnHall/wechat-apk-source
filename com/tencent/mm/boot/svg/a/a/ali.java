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

public final class ali extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
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
      localPaint.setColor(-12864012);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(61.0F, 28.0F);
      ((Path)localObject).cubicTo(69.756187F, 24.513273F, 80.440559F, 25.540365F, 88.0F, 31.0F);
      ((Path)localObject).cubicTo(99.490517F, 38.124748F, 105.52734F, 51.995487F, 104.0F, 65.0F);
      ((Path)localObject).cubicTo(110.17489F, 71.849289F, 114.19276F, 81.232735F, 114.0F, 91.0F);
      ((Path)localObject).cubicTo(113.86294F, 93.936775F, 113.43317F, 97.586441F, 111.0F, 100.0F);
      ((Path)localObject).cubicTo(107.31639F, 98.0252F, 105.30745F, 95.013725F, 103.0F, 92.0F);
      ((Path)localObject).cubicTo(102.95869F, 95.352768F, 101.62939F, 98.334328F, 100.0F, 101.0F);
      ((Path)localObject).cubicTo(103.06863F, 102.62219F, 106.66673F, 105.61372F, 106.0F, 110.0F);
      ((Path)localObject).cubicTo(105.54733F, 114.26923F, 101.06969F, 116.8918F, 97.0F, 118.0F);
      ((Path)localObject).cubicTo(89.645706F, 120.11269F, 80.430565F, 118.98587F, 75.0F, 113.0F);
      ((Path)localObject).cubicTo(73.864029F, 112.59396F, 72.294853F, 112.59396F, 71.0F, 113.0F);
      ((Path)localObject).cubicTo(65.968185F, 118.73658F, 57.232792F, 119.93319F, 50.0F, 118.0F);
      ((Path)localObject).cubicTo(45.678883F, 117.26076F, 40.611553F, 114.58832F, 40.0F, 110.0F);
      ((Path)localObject).cubicTo(39.50214F, 106.13226F, 42.310658F, 103.45982F, 45.0F, 102.0F);
      ((Path)localObject).cubicTo(42.580517F, 98.952576F, 41.071312F, 95.651917F, 41.0F, 92.0F);
      ((Path)localObject).cubicTo(38.672577F, 95.003754F, 36.67363F, 98.055115F, 33.0F, 100.0F);
      ((Path)localObject).cubicTo(30.556854F, 97.556526F, 30.127081F, 93.916832F, 30.0F, 91.0F);
      ((Path)localObject).cubicTo(29.807249F, 81.222763F, 33.815136F, 71.849289F, 40.0F, 65.0F);
      ((Path)localObject).cubicTo(37.763058F, 50.021076F, 46.538429F, 33.687305F, 61.0F, 28.0F);
      ((Path)localObject).lineTo(61.0F, 28.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ali
 * JD-Core Version:    0.6.2
 */