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

public final class asx extends c
{
  private final int height = 198;
  private final int width = 198;

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
        paramInt = 198;
        continue;
        paramInt = 198;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-3355444);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      arrayOfFloat = c.a(arrayOfFloat, 0.7071068F, 0.7071068F, -41.007141F, -0.7071068F, 0.7071068F, 99.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(168.0F, 99.0F);
      ((Path)localObject).lineTo(168.0F, 165.0F);
      ((Path)localObject).cubicTo(168.0F, 166.65686F, 166.65686F, 168.0F, 165.0F, 168.0F);
      ((Path)localObject).lineTo(99.0F, 168.0F);
      ((Path)localObject).cubicTo(60.892353F, 168.0F, 30.0F, 137.10765F, 30.0F, 99.0F);
      ((Path)localObject).cubicTo(30.0F, 60.892353F, 60.892353F, 30.0F, 99.0F, 30.0F);
      ((Path)localObject).cubicTo(137.10765F, 30.0F, 168.0F, 60.892353F, 168.0F, 99.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.asx
 * JD-Core Version:    0.6.2
 */