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

public final class anb extends c
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
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(78.0F, 23.0F);
      ((Path)localObject).lineTo(18.0F, 23.0F);
      ((Path)localObject).cubicTo(16.344F, 23.0F, 15.0F, 24.343F, 15.0F, 26.0F);
      ((Path)localObject).lineTo(15.0F, 70.0F);
      ((Path)localObject).cubicTo(15.0F, 71.656998F, 16.344F, 73.0F, 18.0F, 73.0F);
      ((Path)localObject).lineTo(78.0F, 73.0F);
      ((Path)localObject).cubicTo(79.655998F, 73.0F, 81.0F, 71.656998F, 81.0F, 70.0F);
      ((Path)localObject).lineTo(81.0F, 26.0F);
      ((Path)localObject).cubicTo(81.0F, 24.343F, 79.655998F, 23.0F, 78.0F, 23.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(76.0F, 59.0F);
      ((Path)localObject).cubicTo(73.152F, 54.088184F, 68.083F, 47.354908F, 63.743999F, 47.354908F);
      ((Path)localObject).cubicTo(62.005001F, 47.354908F, 58.827999F, 49.3773F, 55.662998F, 52.129082F);
      ((Path)localObject).cubicTo(56.991001F, 55.097874F, 58.811001F, 58.14101F, 58.799999F, 58.14101F);
      ((Path)localObject).cubicTo(57.888F, 58.14101F, 55.199001F, 53.835007F, 55.199001F, 53.835007F);
      ((Path)localObject).cubicTo(55.026001F, 53.559731F, 54.844002F, 53.290478F, 54.659F, 53.026253F);
      ((Path)localObject).cubicTo(54.605F, 53.075481F, 54.551998F, 53.123703F, 54.498001F, 53.172932F);
      ((Path)localObject).cubicTo(51.521F, 49.358212F, 45.061001F, 40.199669F, 39.359001F, 40.199669F);
      ((Path)localObject).cubicTo(35.015999F, 40.199669F, 24.034F, 50.065498F, 20.0F, 57.164474F);
      ((Path)localObject).lineTo(20.0F, 28.0F);
      ((Path)localObject).lineTo(76.0F, 28.0F);
      ((Path)localObject).lineTo(76.0F, 59.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.anb
 * JD-Core Version:    0.6.2
 */