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

public final class adr extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-3026479);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 24.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.0F, 5.270896F);
      ((Path)localObject1).cubicTo(2.420274F, 3.840549F, 3.840549F, 2.420274F, 5.270896F, 1.0F);
      ((Path)localObject1).cubicTo(11.687312F, 7.396271F, 18.083584F, 13.812688F, 24.5F, 20.21903F);
      ((Path)localObject1).cubicTo(30.916416F, 13.822761F, 37.312687F, 7.396271F, 43.729103F, 1.0F);
      ((Path)localObject1).cubicTo(45.159451F, 2.420274F, 46.579727F, 3.840549F, 48.0F, 5.270896F);
      ((Path)localObject1).cubicTo(41.603729F, 11.687312F, 35.177238F, 18.083584F, 28.78097F, 24.5F);
      ((Path)localObject1).cubicTo(35.177238F, 30.916416F, 41.603729F, 37.312687F, 48.0F, 43.739178F);
      ((Path)localObject1).cubicTo(46.579727F, 45.159451F, 45.159451F, 46.579727F, 43.739178F, 48.0F);
      ((Path)localObject1).cubicTo(37.312687F, 41.603729F, 30.916416F, 35.177238F, 24.5F, 28.78097F);
      ((Path)localObject1).cubicTo(18.083584F, 35.177238F, 11.687312F, 41.603729F, 5.270896F, 48.0F);
      ((Path)localObject1).cubicTo(3.840549F, 46.579727F, 2.420274F, 45.159451F, 1.0F, 43.739178F);
      ((Path)localObject1).cubicTo(7.396271F, 37.312687F, 13.822761F, 30.916416F, 20.21903F, 24.5F);
      ((Path)localObject1).cubicTo(13.822761F, 18.083584F, 7.396271F, 11.687312F, 1.0F, 5.270896F);
      ((Path)localObject1).lineTo(1.0F, 5.270896F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.adr
 * JD-Core Version:    0.6.2
 */