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

public final class nk extends c
{
  private final int height = 115;
  private final int width = 115;

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
        paramInt = 115;
        continue;
        paramInt = 115;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -122.0F, 0.0F, 1.0F, -1170.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 122.0F, 0.0F, 1.0F, 1170.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(57.391304F, 3.0F);
      ((Path)localObject2).cubicTo(87.430794F, 3.0F, 111.78261F, 27.351814F, 111.78261F, 57.391304F);
      ((Path)localObject2).cubicTo(111.78261F, 87.430794F, 87.430794F, 111.78261F, 57.391304F, 111.78261F);
      ((Path)localObject2).cubicTo(27.351814F, 111.78261F, 3.0F, 87.430794F, 3.0F, 57.391304F);
      ((Path)localObject2).cubicTo(3.0F, 27.351814F, 27.351814F, 3.0F, 57.391304F, 3.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-5066062);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(76.751808F, 59.590881F);
      ((Path)localObject1).lineTo(50.769341F, 76.808472F);
      ((Path)localObject1).cubicTo(49.651501F, 77.549225F, 48.144814F, 77.24353F, 47.404064F, 76.125694F);
      ((Path)localObject1).cubicTo(47.140537F, 75.728012F, 47.0F, 75.261513F, 47.0F, 74.784447F);
      ((Path)localObject1).lineTo(47.0F, 40.349258F);
      ((Path)localObject1).cubicTo(47.0F, 39.008259F, 48.087093F, 37.921165F, 49.428093F, 37.921165F);
      ((Path)localObject1).cubicTo(49.905163F, 37.921165F, 50.371662F, 38.061703F, 50.769341F, 38.32523F);
      ((Path)localObject1).lineTo(76.751808F, 55.542824F);
      ((Path)localObject1).cubicTo(77.869652F, 56.283573F, 78.175339F, 57.79026F, 77.434593F, 58.9081F);
      ((Path)localObject1).cubicTo(77.255005F, 59.179108F, 77.02282F, 59.411293F, 76.751808F, 59.590881F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nk
 * JD-Core Version:    0.6.2
 */