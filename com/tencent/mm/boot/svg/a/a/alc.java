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

public final class alc extends c
{
  private final int height = 90;
  private final int width = 90;

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
        paramInt = 90;
        continue;
        paramInt = 90;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.k(paramArrayOfObject);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      localObject4 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -166.0F, 0.0F, 1.0F, -265.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 166.0F, 0.0F, 1.0F, 265.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(838860800);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(45.0F, 0.0F);
      ((Path)localObject1).cubicTo(69.852814F, 0.0F, 90.0F, 20.147184F, 90.0F, 45.0F);
      ((Path)localObject1).cubicTo(90.0F, 69.852814F, 69.852814F, 90.0F, 45.0F, 90.0F);
      ((Path)localObject1).cubicTo(20.147184F, 90.0F, 0.0F, 69.852814F, 0.0F, 45.0F);
      ((Path)localObject1).cubicTo(0.0F, 20.147184F, 20.147184F, 0.0F, 45.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject4, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject4 = c.l(paramArrayOfObject);
      ((Path)localObject4).moveTo(45.0F, 3.0F);
      ((Path)localObject4).cubicTo(68.195961F, 3.0F, 87.0F, 21.804039F, 87.0F, 45.0F);
      ((Path)localObject4).cubicTo(87.0F, 68.195961F, 68.195961F, 87.0F, 45.0F, 87.0F);
      ((Path)localObject4).cubicTo(21.804039F, 87.0F, 3.0F, 68.195961F, 3.0F, 45.0F);
      ((Path)localObject4).cubicTo(3.0F, 21.804039F, 21.804039F, 3.0F, 45.0F, 3.0F);
      ((Path)localObject4).close();
      localCanvas.drawPath((Path)localObject4, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject4 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject4).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(57.0F, 42.0F);
      ((Path)localObject3).lineTo(63.439339F, 35.560661F);
      ((Path)localObject3).cubicTo(64.025124F, 34.974873F, 64.974876F, 34.974873F, 65.560661F, 35.560661F);
      ((Path)localObject3).cubicTo(65.841965F, 35.841965F, 66.0F, 36.223495F, 66.0F, 36.621319F);
      ((Path)localObject3).lineTo(66.0F, 53.378681F);
      ((Path)localObject3).cubicTo(66.0F, 54.207108F, 65.32843F, 54.878681F, 64.5F, 54.878681F);
      ((Path)localObject3).cubicTo(64.102173F, 54.878681F, 63.720646F, 54.720646F, 63.439339F, 54.439339F);
      ((Path)localObject3).lineTo(57.0F, 48.0F);
      ((Path)localObject3).lineTo(57.0F, 42.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(26.208F, 33.0F);
      ((Path)localObject3).lineTo(51.792F, 33.0F);
      ((Path)localObject3).cubicTo(53.011444F, 33.0F, 54.0F, 33.988556F, 54.0F, 35.208F);
      ((Path)localObject3).lineTo(54.0F, 54.792F);
      ((Path)localObject3).cubicTo(54.0F, 56.011444F, 53.011444F, 57.0F, 51.792F, 57.0F);
      ((Path)localObject3).lineTo(26.208F, 57.0F);
      ((Path)localObject3).cubicTo(24.988556F, 57.0F, 24.0F, 56.011444F, 24.0F, 54.792F);
      ((Path)localObject3).lineTo(24.0F, 35.208F);
      ((Path)localObject3).cubicTo(24.0F, 33.988556F, 24.988556F, 33.0F, 26.208F, 33.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alc
 * JD-Core Version:    0.6.2
 */