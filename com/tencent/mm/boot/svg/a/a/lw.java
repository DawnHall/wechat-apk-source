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

public final class lw extends c
{
  private final int height = 64;
  private final int width = 64;

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
        paramInt = 64;
        continue;
        paramInt = 64;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 12, 4);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(64.0F, 38.090908F);
      ((Path)localObject).lineTo(64.0F, 52.545456F);
      ((Path)localObject).cubicTo(64.0F, 54.202309F, 62.656853F, 55.545456F, 61.0F, 55.545456F);
      ((Path)localObject).lineTo(3.0F, 55.545456F);
      ((Path)localObject).cubicTo(1.343146F, 55.545456F, 2.029061E-016F, 54.202309F, 0.0F, 52.545456F);
      ((Path)localObject).lineTo(0.0F, 38.090908F);
      ((Path)localObject).cubicTo(3.213293F, 38.090908F, 5.818182F, 35.486019F, 5.818182F, 32.272728F);
      ((Path)localObject).cubicTo(5.818182F, 29.059435F, 3.213293F, 26.454546F, 4.979066E-016F, 26.454546F);
      ((Path)localObject).lineTo(0.0F, 12.0F);
      ((Path)localObject).cubicTo(-2.029061E-016F, 10.343145F, 1.343146F, 9.0F, 3.0F, 9.0F);
      ((Path)localObject).lineTo(61.0F, 9.0F);
      ((Path)localObject).cubicTo(62.656853F, 9.0F, 64.0F, 10.343145F, 64.0F, 12.0F);
      ((Path)localObject).lineTo(64.0F, 26.454546F);
      ((Path)localObject).cubicTo(60.786705F, 26.454546F, 58.18182F, 29.059435F, 58.18182F, 32.272728F);
      ((Path)localObject).cubicTo(58.18182F, 35.486019F, 60.786705F, 38.090908F, 64.0F, 38.090908F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(15.045454F, 20.636364F);
      ((Path)localObject).cubicTo(14.769312F, 20.636364F, 14.545454F, 20.860222F, 14.545454F, 21.136364F);
      ((Path)localObject).lineTo(14.545454F, 25.954546F);
      ((Path)localObject).cubicTo(14.545454F, 26.230688F, 14.769312F, 26.454546F, 15.045454F, 26.454546F);
      ((Path)localObject).lineTo(40.227272F, 26.454546F);
      ((Path)localObject).cubicTo(40.503414F, 26.454546F, 40.727272F, 26.230688F, 40.727272F, 25.954546F);
      ((Path)localObject).lineTo(40.727272F, 21.136364F);
      ((Path)localObject).cubicTo(40.727272F, 20.860222F, 40.503414F, 20.636364F, 40.227272F, 20.636364F);
      ((Path)localObject).lineTo(15.045454F, 20.636364F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(15.045454F, 32.272728F);
      ((Path)localObject).cubicTo(14.769312F, 32.272728F, 14.545454F, 32.496586F, 14.545454F, 32.772728F);
      ((Path)localObject).lineTo(14.545454F, 37.590908F);
      ((Path)localObject).cubicTo(14.545454F, 37.86705F, 14.769312F, 38.090908F, 15.045454F, 38.090908F);
      ((Path)localObject).lineTo(31.5F, 38.090908F);
      ((Path)localObject).cubicTo(31.776142F, 38.090908F, 32.0F, 37.86705F, 32.0F, 37.590908F);
      ((Path)localObject).lineTo(32.0F, 32.772728F);
      ((Path)localObject).cubicTo(32.0F, 32.496586F, 31.776142F, 32.272728F, 31.5F, 32.272728F);
      ((Path)localObject).lineTo(15.045454F, 32.272728F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.lw
 * JD-Core Version:    0.6.2
 */