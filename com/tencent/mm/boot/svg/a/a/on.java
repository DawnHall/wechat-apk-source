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

public final class on extends c
{
  private final int height = 120;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 120;
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
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      arrayOfFloat = c.a(arrayOfFloat, -0.7071068F, -0.7071068F, 131.87399F, 0.7071068F, -0.7071068F, 32.168152F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(85.835419F, 16.085417F);
      ((Path)localObject).cubicTo(86.106865F, 16.356863F, 86.274757F, 16.731863F, 86.274757F, 17.146076F);
      ((Path)localObject).lineTo(86.274757F, 69.64608F);
      ((Path)localObject).cubicTo(86.274757F, 70.474503F, 85.60318F, 71.14608F, 84.774757F, 71.14608F);
      ((Path)localObject).lineTo(81.774757F, 71.14608F);
      ((Path)localObject).cubicTo(80.946327F, 71.14608F, 80.274757F, 70.474503F, 80.274757F, 69.64608F);
      ((Path)localObject).lineTo(80.274757F, 21.646076F);
      ((Path)localObject).lineTo(33.774757F, 21.646076F);
      ((Path)localObject).cubicTo(32.946331F, 21.646076F, 32.274757F, 20.974504F, 32.274757F, 20.146076F);
      ((Path)localObject).lineTo(32.274757F, 17.146076F);
      ((Path)localObject).cubicTo(32.274757F, 16.31765F, 32.946331F, 15.646077F, 33.774757F, 15.646077F);
      ((Path)localObject).lineTo(84.774757F, 15.646077F);
      ((Path)localObject).cubicTo(85.188972F, 15.646077F, 85.563972F, 15.81397F, 85.835419F, 16.085417F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.on
 * JD-Core Version:    0.6.2
 */