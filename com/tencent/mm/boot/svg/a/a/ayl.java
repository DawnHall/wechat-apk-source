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

public final class ayl extends c
{
  private final int height = 131;
  private final int width = 131;

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
        paramInt = 131;
        continue;
        paramInt = 131;
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
      c.a((Paint)localObject4, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-1);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 34.0F, 0.0F, 1.0F, 28.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject4 = c.a((float[])localObject4, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 45.694771F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(34.395531F, 7.959449F);
      ((Path)localObject1).lineTo(34.395531F, 45.435207F);
      ((Path)localObject1).lineTo(29.60442F, 45.435207F);
      ((Path)localObject1).lineTo(29.60442F, 7.90054F);
      ((Path)localObject1).lineTo(21.149052F, 16.355909F);
      ((Path)localObject1).lineTo(17.761225F, 12.968081F);
      ((Path)localObject1).lineTo(31.334641F, -0.605336F);
      ((Path)localObject1).cubicTo(31.769945F, -1.04064F, 32.475712F, -1.04064F, 32.911018F, -0.605336F);
      ((Path)localObject1).lineTo(35.510658F, 1.994303F);
      ((Path)localObject1).lineTo(35.417305F, 2.087653F);
      ((Path)localObject1).lineTo(46.145424F, 12.815773F);
      ((Path)localObject1).lineTo(42.698639F, 16.262558F);
      ((Path)localObject1).lineTo(34.395531F, 7.959449F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(59.149632F, 19.84413F);
      ((Path)localObject3).lineTo(47.970371F, 19.84413F);
      ((Path)localObject3).lineTo(47.970371F, 14.96964F);
      ((Path)localObject3).lineTo(59.952312F, 14.96964F);
      ((Path)localObject3).cubicTo(62.147545F, 14.96964F, 63.940742F, 16.78067F, 63.940742F, 19.014688F);
      ((Path)localObject3).lineTo(63.940742F, 71.855721F);
      ((Path)localObject3).cubicTo(63.940742F, 74.077225F, 62.16069F, 75.900772F, 59.964882F, 75.900772F);
      ((Path)localObject3).lineTo(4.035117F, 75.900772F);
      ((Path)localObject3).cubicTo(1.851615F, 75.900772F, 0.05925926F, 74.089745F, 0.05925926F, 71.855721F);
      ((Path)localObject3).lineTo(0.05925926F, 19.014688F);
      ((Path)localObject3).cubicTo(0.05925926F, 16.793188F, 1.844939F, 14.96964F, 4.047686F, 14.96964F);
      ((Path)localObject3).lineTo(16.029629F, 14.96964F);
      ((Path)localObject3).lineTo(16.029629F, 19.84413F);
      ((Path)localObject3).lineTo(4.85037F, 19.84413F);
      ((Path)localObject3).lineTo(4.85037F, 71.026283F);
      ((Path)localObject3).lineTo(59.149632F, 71.026283F);
      ((Path)localObject3).lineTo(59.149632F, 19.84413F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ayl
 * JD-Core Version:    0.6.2
 */