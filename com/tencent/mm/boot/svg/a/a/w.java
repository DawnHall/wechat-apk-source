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

public final class w extends c
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
      localCanvas.saveLayerAlpha(null, 76, 4);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-13421773);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -9.0F, 0.0F, 1.0F, -3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 0.8660254F, -0.5F, 35.393532F, 0.5F, 0.8660254F, 1.043269F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(29.976608F, 53.990891F);
      ((Path)localObject1).lineTo(28.02372F, 58.706367F);
      ((Path)localObject1).lineTo(26.070831F, 53.990891F);
      ((Path)localObject1).lineTo(26.051668F, 53.990891F);
      ((Path)localObject1).lineTo(26.051668F, 47.683502F);
      ((Path)localObject1).cubicTo(17.177538F, 46.702515F, 10.275263F, 39.178997F, 10.275263F, 30.043367F);
      ((Path)localObject1).lineTo(10.275263F, 23.18063F);
      ((Path)localObject1).lineTo(14.219365F, 23.18063F);
      ((Path)localObject1).lineTo(14.219365F, 29.885603F);
      ((Path)localObject1).cubicTo(14.219365F, 37.509537F, 20.399784F, 43.689957F, 28.02372F, 43.689957F);
      ((Path)localObject1).cubicTo(35.647655F, 43.689957F, 41.828075F, 37.509537F, 41.828075F, 29.885603F);
      ((Path)localObject1).lineTo(41.828075F, 23.18063F);
      ((Path)localObject1).lineTo(45.772175F, 23.18063F);
      ((Path)localObject1).lineTo(45.772175F, 30.043367F);
      ((Path)localObject1).cubicTo(45.772175F, 39.178997F, 38.8699F, 46.702515F, 29.99577F, 47.683502F);
      ((Path)localObject1).lineTo(29.99577F, 53.990891F);
      ((Path)localObject1).lineTo(29.976608F, 53.990891F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(28.02372F, 2.671303F);
      ((Path)localObject1).cubicTo(33.469387F, 2.671303F, 37.883972F, 7.085889F, 37.883972F, 12.531556F);
      ((Path)localObject1).lineTo(37.883972F, 29.727839F);
      ((Path)localObject1).cubicTo(37.883972F, 35.173508F, 33.469387F, 39.588093F, 28.02372F, 39.588093F);
      ((Path)localObject1).cubicTo(22.578053F, 39.588093F, 18.163465F, 35.173508F, 18.163465F, 29.727839F);
      ((Path)localObject1).lineTo(18.163465F, 12.531556F);
      ((Path)localObject1).cubicTo(18.163465F, 7.085889F, 22.578053F, 2.671303F, 28.02372F, 2.671303F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.w
 * JD-Core Version:    0.6.2
 */