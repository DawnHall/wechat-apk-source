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

public final class ye extends c
{
  private final int height = 102;
  private final int width = 112;

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
        paramInt = 112;
        continue;
        paramInt = 102;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setStrokeWidth(1.0F);
      localCanvas.save();
      Paint localPaint2 = c.a((Paint)localObject2, paramArrayOfObject);
      localPaint2.setColor(-1203649);
      arrayOfFloat = c.a(arrayOfFloat, 0.8987941F, -0.4383712F, 28.1632F, 0.4383712F, 0.8987941F, -19.495651F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(29.793938F, 16.856665F);
      ((Path)localObject2).lineTo(98.796371F, 41.881905F);
      ((Path)localObject2).cubicTo(100.52859F, 42.510136F, 101.42174F, 44.418655F, 100.79126F, 46.144703F);
      ((Path)localObject2).lineTo(87.092262F, 83.648125F);
      ((Path)localObject2).cubicTo(86.461784F, 85.374176F, 84.546432F, 86.26413F, 82.814201F, 85.635902F);
      ((Path)localObject2).lineTo(13.811771F, 60.610661F);
      ((Path)localObject2).cubicTo(12.079545F, 59.982433F, 11.186401F, 58.073914F, 11.81688F, 56.347866F);
      ((Path)localObject2).lineTo(25.515879F, 18.84444F);
      ((Path)localObject2).cubicTo(26.146358F, 17.118393F, 28.06171F, 16.228436F, 29.793938F, 16.856665F);
      ((Path)localObject2).close();
      localCanvas.saveLayerAlpha(null, 108, 4);
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1203649);
      localPaint1.setStrokeWidth(2.036736F);
      localPaint1.setStrokeCap(Paint.Cap.ROUND);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      arrayOfFloat = c.a(arrayOfFloat, 0.9975641F, 0.06975647F, -3.171511F, -0.06975647F, 0.9975641F, 4.476245F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(67.294525F, 19.508471F);
      ((Path)localObject1).cubicTo(72.629021F, 16.715134F, 78.330856F, 15.109462F, 84.400024F, 14.691455F);
      ((Path)localObject1).cubicTo(93.764915F, 14.630166F, 101.19274F, 17.516296F, 104.61384F, 23.42067F);
      ((Path)localObject1).cubicTo(111.76379F, 35.760567F, 98.705086F, 56.611069F, 75.446419F, 69.991562F);
      ((Path)localObject1).cubicTo(52.187748F, 83.372063F, 27.536694F, 84.21563F, 20.386744F, 71.875732F);
      ((Path)localObject1).cubicTo(19.534513F, 70.404892F, 18.969391F, 68.813141F, 18.674427F, 67.127533F);
      ((Path)localObject1).cubicTo(18.217703F, 63.512241F, 18.431046F, 60.472187F, 19.314455F, 58.00737F);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ye
 * JD-Core Version:    0.6.2
 */