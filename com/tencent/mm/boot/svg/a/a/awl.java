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

public final class awl extends c
{
  private final int height = 80;
  private final int width = 80;

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
        paramInt = 80;
        continue;
        paramInt = 80;
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
      localObject2 = c.a((float[])localObject2, 1.333333F, 0.0F, 0.0F, 0.0F, 1.333333F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-6626030);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(36.830002F, 10.18F);
      ((Path)localObject1).cubicTo(38.709999F, 8.29F, 40.59F, 6.41F, 42.48F, 4.54F);
      ((Path)localObject1).cubicTo(53.619999F, 15.45F, 56.310001F, 33.799999F, 48.529999F, 47.349998F);
      ((Path)localObject1).cubicTo(46.75F, 50.689999F, 44.299999F, 53.599998F, 41.66F, 56.279999F);
      ((Path)localObject1).cubicTo(39.84F, 54.34F, 38.0F, 52.419998F, 36.189999F, 50.48F);
      ((Path)localObject1).cubicTo(41.150002F, 45.639999F, 44.459999F, 39.07F, 44.900002F, 32.110001F);
      ((Path)localObject1).cubicTo(45.619999F, 24.059999F, 42.439999F, 15.94F, 36.830002F, 10.18F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject2).setColor(-6626030);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(29.09F, 17.92F);
      ((Path)localObject1).cubicTo(30.73F, 16.27F, 32.369999F, 14.63F, 34.02F, 12.99F);
      ((Path)localObject1).cubicTo(39.099998F, 18.26F, 41.84F, 25.780001F, 40.779999F, 33.09F);
      ((Path)localObject1).cubicTo(40.189999F, 38.610001F, 37.330002F, 43.619999F, 33.490002F, 47.540001F);
      ((Path)localObject1).cubicTo(31.879999F, 45.860001F, 30.27F, 44.18F, 28.68F, 42.48F);
      ((Path)localObject1).cubicTo(35.5F, 36.099998F, 35.709999F, 24.52F, 29.09F, 17.92F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-6626030);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(13.42F, 19.610001F);
      ((Path)localObject1).cubicTo(19.82F, 17.139999F, 27.450001F, 22.120001F, 27.940001F, 28.9F);
      ((Path)localObject1).cubicTo(28.83F, 35.529999F, 22.57F, 41.799999F, 15.94F, 40.950001F);
      ((Path)localObject1).cubicTo(9.72F, 40.5F, 4.88F, 34.080002F, 6.19F, 27.959999F);
      ((Path)localObject1).cubicTo(6.92F, 24.17F, 9.75F, 20.85F, 13.42F, 19.610001F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awl
 * JD-Core Version:    0.6.2
 */