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

public final class abo extends c
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-16777216);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(30.0F, 60.0F);
      ((Path)localObject1).cubicTo(13.431458F, 60.0F, 0.0F, 46.568542F, 0.0F, 30.0F);
      ((Path)localObject1).cubicTo(0.0F, 13.431458F, 13.431458F, 0.0F, 30.0F, 0.0F);
      ((Path)localObject1).cubicTo(46.568542F, 0.0F, 60.0F, 13.431458F, 60.0F, 30.0F);
      ((Path)localObject1).cubicTo(60.0F, 46.568542F, 46.568542F, 60.0F, 30.0F, 60.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(30.0F, 56.400002F);
      ((Path)localObject1).cubicTo(44.580318F, 56.400002F, 56.400002F, 44.580318F, 56.400002F, 30.0F);
      ((Path)localObject1).cubicTo(56.400002F, 15.419683F, 44.580318F, 3.6F, 30.0F, 3.6F);
      ((Path)localObject1).cubicTo(15.419683F, 3.6F, 3.6F, 15.419683F, 3.6F, 30.0F);
      ((Path)localObject1).cubicTo(3.6F, 44.580318F, 15.419683F, 56.400002F, 30.0F, 56.400002F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.5F, 18.0F);
      ((Path)localObject1).lineTo(19.5F, 18.0F);
      ((Path)localObject1).lineTo(19.5F, 24.0F);
      ((Path)localObject1).lineTo(13.5F, 24.0F);
      ((Path)localObject1).lineTo(13.5F, 18.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(22.5F, 18.0F);
      ((Path)localObject1).lineTo(28.5F, 18.0F);
      ((Path)localObject1).lineTo(28.5F, 24.0F);
      ((Path)localObject1).lineTo(22.5F, 24.0F);
      ((Path)localObject1).lineTo(22.5F, 18.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(31.5F, 18.0F);
      ((Path)localObject1).lineTo(37.5F, 18.0F);
      ((Path)localObject1).lineTo(37.5F, 24.0F);
      ((Path)localObject1).lineTo(31.5F, 24.0F);
      ((Path)localObject1).lineTo(31.5F, 18.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(40.5F, 18.0F);
      ((Path)localObject1).lineTo(46.5F, 18.0F);
      ((Path)localObject1).lineTo(46.5F, 24.0F);
      ((Path)localObject1).lineTo(40.5F, 24.0F);
      ((Path)localObject1).lineTo(40.5F, 18.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(13.5F, 27.0F);
      ((Path)localObject1).lineTo(19.5F, 27.0F);
      ((Path)localObject1).lineTo(19.5F, 33.0F);
      ((Path)localObject1).lineTo(13.5F, 33.0F);
      ((Path)localObject1).lineTo(13.5F, 27.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(22.5F, 27.0F);
      ((Path)localObject1).lineTo(28.5F, 27.0F);
      ((Path)localObject1).lineTo(28.5F, 33.0F);
      ((Path)localObject1).lineTo(22.5F, 33.0F);
      ((Path)localObject1).lineTo(22.5F, 27.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(21.0F, 39.0F);
      ((Path)localObject1).lineTo(39.0F, 39.0F);
      ((Path)localObject1).lineTo(39.0F, 45.0F);
      ((Path)localObject1).lineTo(21.0F, 45.0F);
      ((Path)localObject1).lineTo(21.0F, 39.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(31.5F, 27.0F);
      ((Path)localObject1).lineTo(37.5F, 27.0F);
      ((Path)localObject1).lineTo(37.5F, 33.0F);
      ((Path)localObject1).lineTo(31.5F, 33.0F);
      ((Path)localObject1).lineTo(31.5F, 27.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(40.5F, 27.0F);
      ((Path)localObject1).lineTo(46.5F, 27.0F);
      ((Path)localObject1).lineTo(46.5F, 33.0F);
      ((Path)localObject1).lineTo(40.5F, 33.0F);
      ((Path)localObject1).lineTo(40.5F, 27.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.abo
 * JD-Core Version:    0.6.2
 */