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

public final class baz extends c
{
  private final int height = 162;
  private final int width = 162;

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
        paramInt = 162;
        continue;
        paramInt = 162;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(147.0F, 87.995506F);
      ((Path)localObject2).lineTo(147.0F, 24.004F);
      ((Path)localObject2).cubicTo(147.0F, 21.796232F, 145.20979F, 20.0F, 143.00148F, 20.0F);
      ((Path)localObject2).lineTo(17.998524F, 20.0F);
      ((Path)localObject2).cubicTo(15.791985F, 20.0F, 14.0F, 21.792652F, 14.0F, 24.004F);
      ((Path)localObject2).lineTo(14.0F, 87.995506F);
      ((Path)localObject2).lineTo(14.0F, 137.00499F);
      ((Path)localObject2).cubicTo(14.0F, 140.30859F, 16.683992F, 143.0F, 19.994865F, 143.0F);
      ((Path)localObject2).lineTo(141.00514F, 143.0F);
      ((Path)localObject2).cubicTo(144.31322F, 143.0F, 147.0F, 140.31593F, 147.0F, 137.00499F);
      ((Path)localObject2).lineTo(147.0F, 87.995506F);
      ((Path)localObject2).close();
      Paint localPaint3 = c.k(paramArrayOfObject);
      localPaint3.setFlags(385);
      localPaint3.setStyle(Paint.Style.FILL);
      Paint localPaint4 = c.k(paramArrayOfObject);
      localPaint4.setFlags(385);
      localPaint4.setStyle(Paint.Style.STROKE);
      localPaint3.setColor(-16777216);
      localPaint4.setStrokeWidth(1.0F);
      localPaint4.setStrokeCap(Paint.Cap.BUTT);
      localPaint4.setStrokeJoin(Paint.Join.MITER);
      localPaint4.setStrokeMiter(4.0F);
      localPaint4.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 147.0F, 0.0F, 14.0F, 0.0F, 143.0F, 20.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient(localPaint2, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -1023919, -1684420 }, new float[] { 0.0F, 1.0F }, (Matrix)localObject1, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4045769);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(38.0F, 41.0F);
      ((Path)localObject2).cubicTo(41.313709F, 41.0F, 44.0F, 43.686291F, 44.0F, 47.0F);
      ((Path)localObject2).cubicTo(44.0F, 50.313709F, 41.313709F, 53.0F, 38.0F, 53.0F);
      ((Path)localObject2).cubicTo(34.686291F, 53.0F, 32.0F, 50.313709F, 32.0F, 47.0F);
      ((Path)localObject2).cubicTo(32.0F, 43.686291F, 34.686291F, 41.0F, 38.0F, 41.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-4045769);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(123.0F, 41.0F);
      ((Path)localObject2).cubicTo(126.31371F, 41.0F, 129.0F, 43.686291F, 129.0F, 47.0F);
      ((Path)localObject2).cubicTo(129.0F, 50.313709F, 126.31371F, 53.0F, 123.0F, 53.0F);
      ((Path)localObject2).cubicTo(119.68629F, 53.0F, 117.0F, 50.313709F, 117.0F, 47.0F);
      ((Path)localObject2).cubicTo(117.0F, 43.686291F, 119.68629F, 41.0F, 123.0F, 41.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(125.02567F, 52.646748F);
      ((Path)localObject1).cubicTo(121.89993F, 74.697769F, 103.00941F, 91.653488F, 80.172646F, 91.653488F);
      ((Path)localObject1).cubicTo(57.116982F, 91.653488F, 38.083572F, 74.371155F, 35.234097F, 52.011253F);
      ((Path)localObject1).lineTo(35.327061F, 52.011253F);
      ((Path)localObject1).lineTo(35.327061F, 52.011253F);
      ((Path)localObject1).cubicTo(35.298355F, 51.859913F, 35.283337F, 51.703709F, 35.283337F, 51.543983F);
      ((Path)localObject1).cubicTo(35.283337F, 50.172024F, 36.391602F, 49.059834F, 37.758717F, 49.059834F);
      ((Path)localObject1).cubicTo(39.125832F, 49.059834F, 40.234097F, 50.172024F, 40.234097F, 51.543983F);
      ((Path)localObject1).cubicTo(40.234097F, 51.703709F, 40.219074F, 51.859913F, 40.190372F, 52.011253F);
      ((Path)localObject1).lineTo(40.265175F, 52.011253F);
      ((Path)localObject1).cubicTo(43.423683F, 71.291389F, 60.106743F, 86.0F, 80.213058F, 86.0F);
      ((Path)localObject1).cubicTo(100.31937F, 86.0F, 117.00243F, 71.291389F, 120.16093F, 52.011253F);
      ((Path)localObject1).lineTo(120.33231F, 52.011253F);
      ((Path)localObject1).cubicTo(120.30019F, 51.850533F, 120.28333F, 51.684277F, 120.28333F, 51.514065F);
      ((Path)localObject1).cubicTo(120.28333F, 50.125587F, 121.40495F, 49.0F, 122.78853F, 49.0F);
      ((Path)localObject1).cubicTo(124.1721F, 49.0F, 125.29372F, 50.125587F, 125.29372F, 51.514065F);
      ((Path)localObject1).cubicTo(125.29372F, 51.921535F, 125.19713F, 52.306362F, 125.02567F, 52.646748F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(125.02567F, 48.646748F);
      ((Path)localObject1).cubicTo(121.89993F, 70.697769F, 103.00941F, 87.653488F, 80.172646F, 87.653488F);
      ((Path)localObject1).cubicTo(57.116982F, 87.653488F, 38.083572F, 70.371155F, 35.234097F, 48.011253F);
      ((Path)localObject1).lineTo(35.327061F, 48.011253F);
      ((Path)localObject1).lineTo(35.327061F, 48.011253F);
      ((Path)localObject1).cubicTo(35.298355F, 47.859913F, 35.283337F, 47.703709F, 35.283337F, 47.543983F);
      ((Path)localObject1).cubicTo(35.283337F, 46.172024F, 36.391602F, 45.059834F, 37.758717F, 45.059834F);
      ((Path)localObject1).cubicTo(39.125832F, 45.059834F, 40.234097F, 46.172024F, 40.234097F, 47.543983F);
      ((Path)localObject1).cubicTo(40.234097F, 47.703709F, 40.219074F, 47.859913F, 40.190372F, 48.011253F);
      ((Path)localObject1).lineTo(40.265175F, 48.011253F);
      ((Path)localObject1).cubicTo(43.423683F, 67.291389F, 60.106743F, 82.0F, 80.213058F, 82.0F);
      ((Path)localObject1).cubicTo(100.31937F, 82.0F, 117.00243F, 67.291389F, 120.16093F, 48.011253F);
      ((Path)localObject1).lineTo(120.33231F, 48.011253F);
      ((Path)localObject1).cubicTo(120.30019F, 47.850533F, 120.28333F, 47.684277F, 120.28333F, 47.514065F);
      ((Path)localObject1).cubicTo(120.28333F, 46.125587F, 121.40495F, 45.0F, 122.78853F, 45.0F);
      ((Path)localObject1).cubicTo(124.1721F, 45.0F, 125.29372F, 46.125587F, 125.29372F, 47.514065F);
      ((Path)localObject1).cubicTo(125.29372F, 47.921535F, 125.19713F, 48.306362F, 125.02567F, 48.646748F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.baz
 * JD-Core Version:    0.6.2
 */