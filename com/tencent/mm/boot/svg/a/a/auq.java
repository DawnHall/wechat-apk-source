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

public final class auq extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localPaint1.setColor(-2105120);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(4.24F, 9.3F);
      ((Path)localObject2).cubicTo(8.92F, 2.94F, 17.389999F, -0.19F, 25.1F, 1.41F);
      ((Path)localObject2).cubicTo(32.66F, 2.78F, 39.150002F, 8.72F, 41.169998F, 16.139999F);
      ((Path)localObject2).cubicTo(43.040001F, 22.59F, 41.490002F, 29.57F, 38.389999F, 35.380001F);
      ((Path)localObject2).cubicTo(34.299999F, 42.959999F, 27.969999F, 49.099998F, 21.0F, 54.040001F);
      ((Path)localObject2).cubicTo(12.64F, 48.07F, 4.94F, 40.330002F, 1.47F, 30.459999F);
      ((Path)localObject2).cubicTo(-1.06F, 23.52F, -0.39F, 15.22F, 4.24F, 9.3F);
      ((Path)localObject2).lineTo(4.24F, 9.3F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(17.121176F, 14.014381F);
      ((Path)localObject2).cubicTo(11.980267F, 16.542173F, 11.574966F, 24.573509F, 16.44923F, 27.602592F);
      ((Path)localObject2).cubicTo(21.355494F, 31.324953F, 29.258841F, 27.197294F, 28.949532F, 21.032469F);
      ((Path)localObject2).cubicTo(29.258841F, 15.198284F, 22.102098F, 10.963966F, 17.121176F, 14.014381F);
      ((Path)localObject2).lineTo(17.121176F, 14.014381F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.auq
 * JD-Core Version:    0.6.2
 */