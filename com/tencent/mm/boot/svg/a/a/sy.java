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

public final class sy extends c
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-436207616);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(30.0F, 60.0F);
      ((Path)localObject2).cubicTo(13.431458F, 60.0F, 0.0F, 46.568542F, 0.0F, 30.0F);
      ((Path)localObject2).cubicTo(0.0F, 13.431458F, 13.431458F, 0.0F, 30.0F, 0.0F);
      ((Path)localObject2).cubicTo(46.568542F, 0.0F, 60.0F, 13.431458F, 60.0F, 30.0F);
      ((Path)localObject2).cubicTo(60.0F, 46.568542F, 46.568542F, 60.0F, 30.0F, 60.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(30.0F, 56.400002F);
      ((Path)localObject2).cubicTo(44.580318F, 56.400002F, 56.400002F, 44.580318F, 56.400002F, 30.0F);
      ((Path)localObject2).cubicTo(56.400002F, 15.419683F, 44.580318F, 3.6F, 30.0F, 3.6F);
      ((Path)localObject2).cubicTo(15.419683F, 3.6F, 3.6F, 15.419683F, 3.6F, 30.0F);
      ((Path)localObject2).cubicTo(3.6F, 44.580318F, 15.419683F, 56.400002F, 30.0F, 56.400002F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(12.0F, 31.5F);
      ((Path)localObject2).lineTo(48.0F, 31.5F);
      ((Path)localObject2).cubicTo(48.0F, 41.441124F, 39.941124F, 49.5F, 30.0F, 49.5F);
      ((Path)localObject2).cubicTo(20.058874F, 49.5F, 12.0F, 41.441124F, 12.0F, 31.5F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(30.0F, 45.900002F);
      ((Path)localObject2).cubicTo(36.709824F, 45.900002F, 42.347782F, 41.310818F, 43.946339F, 35.099998F);
      ((Path)localObject2).lineTo(16.053663F, 35.099998F);
      ((Path)localObject2).cubicTo(17.652218F, 41.310818F, 23.290178F, 45.900002F, 30.0F, 45.900002F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(19.5F, 25.5F);
      ((Path)localObject2).cubicTo(17.014719F, 25.5F, 15.0F, 23.485281F, 15.0F, 21.0F);
      ((Path)localObject2).cubicTo(15.0F, 18.514719F, 17.014719F, 16.5F, 19.5F, 16.5F);
      ((Path)localObject2).cubicTo(21.985281F, 16.5F, 24.0F, 18.514719F, 24.0F, 21.0F);
      ((Path)localObject2).cubicTo(24.0F, 23.485281F, 21.985281F, 25.5F, 19.5F, 25.5F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(40.5F, 25.5F);
      ((Path)localObject2).cubicTo(38.014717F, 25.5F, 36.0F, 23.485281F, 36.0F, 21.0F);
      ((Path)localObject2).cubicTo(36.0F, 18.514719F, 38.014717F, 16.5F, 40.5F, 16.5F);
      ((Path)localObject2).cubicTo(42.985283F, 16.5F, 45.0F, 18.514719F, 45.0F, 21.0F);
      ((Path)localObject2).cubicTo(45.0F, 23.485281F, 42.985283F, 25.5F, 40.5F, 25.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.sy
 * JD-Core Version:    0.6.2
 */