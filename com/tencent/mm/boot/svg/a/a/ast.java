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

public final class ast extends c
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-12799249);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 11.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(27.389999F, 1.59F);
      ((Path)localObject2).cubicTo(34.099998F, -0.34F, 42.029999F, 2.41F, 45.549999F, 8.57F);
      ((Path)localObject2).cubicTo(50.689999F, 17.75F, 47.799999F, 30.26F, 40.07F, 37.119999F);
      ((Path)localObject2).cubicTo(38.369999F, 38.32F, 38.73F, 41.259998F, 40.630001F, 42.07F);
      ((Path)localObject2).cubicTo(48.119999F, 45.880001F, 55.799999F, 50.27F, 60.700001F, 57.32F);
      ((Path)localObject2).cubicTo(63.439999F, 60.98F, 63.18F, 65.75F, 62.919998F, 70.07F);
      ((Path)localObject2).cubicTo(62.880001F, 71.980003F, 60.860001F, 73.199997F, 59.09F, 72.980003F);
      ((Path)localObject2).cubicTo(41.02F, 73.010002F, 22.93F, 73.010002F, 4.86F, 72.980003F);
      ((Path)localObject2).cubicTo(3.09F, 73.199997F, 1.11F, 71.940002F, 1.08F, 70.050003F);
      ((Path)localObject2).cubicTo(0.85F, 65.980003F, 0.57F, 61.52F, 2.96F, 57.98F);
      ((Path)localObject2).cubicTo(7.67F, 50.59F, 15.53F, 46.130001F, 23.040001F, 42.09F);
      ((Path)localObject2).cubicTo(25.09F, 41.02F, 25.02F, 38.060001F, 23.18F, 36.810001F);
      ((Path)localObject2).cubicTo(16.969999F, 30.9F, 14.24F, 21.58F, 16.209999F, 13.24F);
      ((Path)localObject2).cubicTo(17.51F, 7.74F, 21.84F, 2.97F, 27.389999F, 1.59F);
      ((Path)localObject2).lineTo(27.389999F, 1.59F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(57.389999F, 12.35F);
      ((Path)localObject1).cubicTo(61.779999F, 5.69F, 72.629997F, 5.2F, 77.629997F, 11.4F);
      ((Path)localObject1).cubicTo(82.949997F, 18.02F, 81.57F, 28.16F, 76.57F, 34.549999F);
      ((Path)localObject1).cubicTo(75.230003F, 36.150002F, 72.169998F, 38.299999F, 74.419998F, 40.470001F);
      ((Path)localObject1).cubicTo(80.639999F, 43.860001F, 87.25F, 47.439999F, 91.239998F, 53.540001F);
      ((Path)localObject1).cubicTo(93.550003F, 56.869999F, 93.110001F, 61.130001F, 92.879997F, 64.959999F);
      ((Path)localObject1).cubicTo(92.769997F, 66.269997F, 91.379997F, 67.110001F, 90.150002F, 66.980003F);
      ((Path)localObject1).cubicTo(82.440002F, 67.050003F, 74.730003F, 66.970001F, 67.019997F, 67.0F);
      ((Path)localObject1).cubicTo(66.739998F, 57.77F, 60.709999F, 49.779999F, 52.66F, 45.669998F);
      ((Path)localObject1).cubicTo(55.439999F, 43.689999F, 58.580002F, 42.299999F, 61.360001F, 40.34F);
      ((Path)localObject1).cubicTo(62.610001F, 39.119999F, 61.919998F, 37.310001F, 60.740002F, 36.34F);
      ((Path)localObject1).cubicTo(54.709999F, 30.25F, 52.540001F, 19.75F, 57.389999F, 12.35F);
      ((Path)localObject1).lineTo(57.389999F, 12.35F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ast
 * JD-Core Version:    0.6.2
 */