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

public final class ga extends c
{
  private final int height = 40;
  private final int width = 44;

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
        paramInt = 44;
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-9074981);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -298.0F, 0.0F, 1.0F, -661.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(322.0F, 663.0F);
      ((Path)localObject1).cubicTo(320.0F, 664.0F, 316.5F, 668.1991F, 317.0F, 672.0F);
      ((Path)localObject1).lineTo(317.0F, 689.0F);
      ((Path)localObject1).cubicTo(316.5F, 691.797F, 313.47751F, 695.22223F, 310.0F, 695.0F);
      ((Path)localObject1).cubicTo(306.02176F, 695.22223F, 303.0F, 691.797F, 303.0F, 689.0F);
      ((Path)localObject1).cubicTo(303.0F, 686.67645F, 305.0F, 683.0F, 307.0F, 683.0F);
      ((Path)localObject1).cubicTo(309.0F, 683.0F, 311.0F, 681.0F, 310.0F, 679.0F);
      ((Path)localObject1).cubicTo(309.0F, 677.0F, 306.0F, 677.87036F, 305.0F, 678.0F);
      ((Path)localObject1).cubicTo(304.0F, 678.12964F, 300.0F, 681.0F, 299.0F, 683.0F);
      ((Path)localObject1).cubicTo(298.0F, 685.0F, 298.0F, 686.84113F, 298.0F, 689.0F);
      ((Path)localObject1).cubicTo(298.0F, 694.97839F, 302.71951F, 701.0F, 310.0F, 701.0F);
      ((Path)localObject1).cubicTo(312.23026F, 701.0F, 315.0F, 700.0F, 317.0F, 699.0F);
      ((Path)localObject1).cubicTo(319.0F, 698.0F, 322.5F, 692.8009F, 322.0F, 689.0F);
      ((Path)localObject1).lineTo(322.0F, 672.0F);
      ((Path)localObject1).cubicTo(322.5F, 669.203F, 325.52176F, 666.77777F, 329.0F, 667.0F);
      ((Path)localObject1).cubicTo(332.97751F, 666.77777F, 337.0F, 669.203F, 337.0F, 672.0F);
      ((Path)localObject1).cubicTo(337.0F, 674.41455F, 335.0F, 677.0F, 332.0F, 678.0F);
      ((Path)localObject1).cubicTo(329.0F, 679.0F, 328.0F, 680.0F, 329.0F, 682.0F);
      ((Path)localObject1).cubicTo(330.0F, 684.0F, 333.0F, 683.0F, 334.0F, 683.0F);
      ((Path)localObject1).cubicTo(335.0F, 683.0F, 339.0F, 680.0F, 340.0F, 678.0F);
      ((Path)localObject1).cubicTo(341.0F, 676.0F, 342.0F, 674.15887F, 342.0F, 672.0F);
      ((Path)localObject1).cubicTo(342.0F, 666.02161F, 336.28049F, 661.0F, 329.0F, 661.0F);
      ((Path)localObject1).cubicTo(326.76974F, 661.0F, 324.0F, 662.0F, 322.0F, 663.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ga
 * JD-Core Version:    0.6.2
 */