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

public final class ny extends c
{
  private final int height = 21;
  private final int width = 28;

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
        paramInt = 28;
        continue;
        paramInt = 21;
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
      localPaint.setColor(-15679443);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(9.74392F, 16.810169F);
      ((Path)localObject).cubicTo(15.221745F, 11.227118F, 20.549356F, 5.491526F, 26.107296F, 0.0F);
      ((Path)localObject).cubicTo(26.587982F, 0.4881356F, 27.529327F, 1.474576F, 28.0F, 1.972881F);
      ((Path)localObject).cubicTo(22.341917F, 8.60339F, 15.872675F, 14.481356F, 10.084406F, 21.0F);
      ((Path)localObject).cubicTo(6.679542F, 18.254238F, 3.304721F, 15.477966F, 0.0F, 12.620339F);
      ((Path)localObject).lineTo(0.0F, 10.901695F);
      ((Path)localObject).cubicTo(0.4105866F, 10.698305F, 1.241774F, 10.301695F, 1.662375F, 10.098305F);
      ((Path)localObject).cubicTo(4.346209F, 12.345762F, 7.030043F, 14.60339F, 9.74392F, 16.810169F);
      ((Path)localObject).lineTo(9.74392F, 16.810169F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ny
 * JD-Core Version:    0.6.2
 */