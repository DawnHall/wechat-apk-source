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

public final class ym extends c
{
  private final int height = 40;
  private final int width = 46;

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
        paramInt = 46;
        continue;
        paramInt = 40;
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
      localPaint2.setColor(-16896);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -149.0F, 0.0F, 1.0F, -661.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(151.0733F, 700.02264F);
      ((Path)localObject1).lineTo(151.0733F, 700.02264F);
      ((Path)localObject1).cubicTo(150.70924F, 700.02264F, 150.3521F, 699.92328F, 150.04036F, 699.73529F);
      ((Path)localObject1).cubicTo(149.09451F, 699.16479F, 148.79021F, 697.93555F, 149.36069F, 696.98975F);
      ((Path)localObject1).lineTo(149.36069F, 696.98975F);
      ((Path)localObject1).lineTo(170.08609F, 662.6272F);
      ((Path)localObject1).cubicTo(170.25401F, 662.34875F, 170.48732F, 662.11548F, 170.76575F, 661.94751F);
      ((Path)localObject1).cubicTo(171.71159F, 661.37701F, 172.94083F, 661.68134F, 173.51131F, 662.6272F);
      ((Path)localObject1).lineTo(173.51131F, 662.6272F);
      ((Path)localObject1).lineTo(194.23669F, 696.98975F);
      ((Path)localObject1).cubicTo(194.42471F, 697.30145F, 194.52408F, 697.65863F, 194.52408F, 698.02264F);
      ((Path)localObject1).cubicTo(194.52408F, 699.12726F, 193.62866F, 700.02264F, 192.52408F, 700.02264F);
      ((Path)localObject1).lineTo(151.0733F, 700.02264F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(169.61902F, 675.9917F);
      ((Path)localObject1).lineTo(170.28661F, 687.96881F);
      ((Path)localObject1).lineTo(173.31001F, 687.96881F);
      ((Path)localObject1).lineTo(173.9776F, 675.9917F);
      ((Path)localObject1).cubicTo(174.0237F, 675.16455F, 173.39055F, 674.45667F, 172.5634F, 674.41052F);
      ((Path)localObject1).cubicTo(172.5356F, 674.409F, 172.50777F, 674.4082F, 172.47992F, 674.4082F);
      ((Path)localObject1).lineTo(171.1167F, 674.4082F);
      ((Path)localObject1).cubicTo(170.28827F, 674.4082F, 169.6167F, 675.07977F, 169.6167F, 675.9082F);
      ((Path)localObject1).cubicTo(169.6167F, 675.93604F, 169.61748F, 675.96387F, 169.61902F, 675.9917F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(171.79831F, 695.50244F);
      ((Path)localObject1).cubicTo(173.05064F, 695.50244F, 174.06586F, 694.4906F, 174.06586F, 693.24237F);
      ((Path)localObject1).cubicTo(174.06586F, 691.99414F, 173.05064F, 690.98224F, 171.79831F, 690.98224F);
      ((Path)localObject1).cubicTo(170.54597F, 690.98224F, 169.53076F, 691.99414F, 169.53076F, 693.24237F);
      ((Path)localObject1).cubicTo(169.53076F, 694.4906F, 170.54597F, 695.50244F, 171.79831F, 695.50244F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ym
 * JD-Core Version:    0.6.2
 */