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

public final class sq extends c
{
  private final int height = 405;
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
        paramInt = 405;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint1.setColor(-1);
      localPaint2.setColor(838860800);
      localPaint2.setStrokeWidth(1.5F);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 192.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(191.25F, 381.0F);
      ((Path)localObject).lineTo(191.25F, 48.0F);
      ((Path)localObject).cubicTo(191.25F, 21.904545F, 170.09546F, 0.75F, 144.0F, 0.75F);
      ((Path)localObject).lineTo(48.0F, 0.75F);
      ((Path)localObject).cubicTo(21.904545F, 0.75F, 0.75F, 21.904545F, 0.75F, 48.0F);
      ((Path)localObject).lineTo(0.75F, 180.0F);
      ((Path)localObject).cubicTo(0.75F, 194.87228F, 7.752174F, 208.87663F, 19.65F, 217.8F);
      ((Path)localObject).lineTo(53.25F, 243.0F);
      ((Path)localObject).cubicTo(65.525536F, 252.20665F, 72.75F, 266.65558F, 72.75F, 282.0F);
      ((Path)localObject).lineTo(72.75F, 381.0F);
      ((Path)localObject).cubicTo(72.75F, 393.84061F, 83.159378F, 404.25F, 96.0F, 404.25F);
      ((Path)localObject).lineTo(168.0F, 404.25F);
      ((Path)localObject).cubicTo(180.84062F, 404.25F, 191.25F, 393.84061F, 191.25F, 381.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.sq
 * JD-Core Version:    0.6.2
 */