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

public final class wh extends c
{
  private final int height = 54;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 54;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-2171170);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1.049754F, 4.943092F);
      ((Path)localObject2).cubicTo(0.7401684F, 3.184852F, 1.898618F, 1.017021F, 3.875971F, 1.106931F);
      ((Path)localObject2).cubicTo(19.594931F, 0.9670714F, 35.333862F, 1.076961F, 51.052822F, 1.056981F);
      ((Path)localObject2).cubicTo(52.840431F, 0.717321F, 54.937622F, 1.926112F, 54.897675F, 3.884152F);
      ((Path)localObject2).cubicTo(55.057461F, 14.303724F, 54.937622F, 24.743277F, 54.957596F, 35.162849F);
      ((Path)localObject2).cubicTo(55.247208F, 36.921089F, 54.028839F, 39.088917F, 52.051487F, 38.959049F);
      ((Path)localObject2).cubicTo(42.384426F, 39.088917F, 32.707378F, 38.96904F, 23.030333F, 39.008999F);
      ((Path)localObject2).cubicTo(18.686148F, 41.99601F, 14.361935F, 45.002998F, 10.027737F, 48.0F);
      ((Path)localObject2).lineTo(10.027737F, 39.008999F);
      ((Path)localObject2).cubicTo(7.151587F, 38.599407F, 2.797415F, 40.327679F, 1.199554F, 37.04097F);
      ((Path)localObject2).cubicTo(0.8400347F, 26.351665F, 1.129647F, 15.632394F, 1.049754F, 4.943092F);
      ((Path)localObject2).lineTo(1.049754F, 4.943092F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(7.0F, 7.0F);
      ((Path)localObject2).lineTo(7.0F, 32.991615F);
      ((Path)localObject2).lineTo(15.0F, 32.991615F);
      ((Path)localObject2).cubicTo(15.0F, 34.661076F, 15.0F, 36.33054F, 15.01F, 38.0F);
      ((Path)localObject2).cubicTo(17.34F, 36.320541F, 19.68F, 34.651081F, 22.030001F, 32.981617F);
      ((Path)localObject2).cubicTo(31.02F, 33.001614F, 40.009998F, 32.991615F, 49.0F, 32.991615F);
      ((Path)localObject2).lineTo(49.0F, 7.0F);
      ((Path)localObject2).lineTo(7.0F, 7.0F);
      ((Path)localObject2).lineTo(7.0F, 7.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.wh
 * JD-Core Version:    0.6.2
 */