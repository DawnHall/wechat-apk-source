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

public final class dk extends c
{
  private final int height = 279;
  private final int width = 279;

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
        paramInt = 279;
        continue;
        paramInt = 279;
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
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, -144.0F, 0.0F, 1.0F, -69.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 144.0F, 0.0F, 1.0F, 69.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-3552823);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(279.0F, 141.12691F);
      ((Path)localObject2).cubicTo(279.0F, 62.751225F, 216.54533F, 0.6072761F, 137.77777F, 0.6072761F);
      ((Path)localObject2).cubicTo(62.454666F, 0.6072761F, 0.0F, 62.751225F, 0.0F, 141.12691F);
      ((Path)localObject2).cubicTo(0.0F, 216.07527F, 62.454666F, 278.21921F, 137.77777F, 278.21921F);
      ((Path)localObject2).cubicTo(216.54533F, 278.21921F, 279.0F, 216.07527F, 279.0F, 141.12691F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(131.70822F, 71.371101F);
      ((Path)localObject1).cubicTo(128.45819F, 71.371101F, 125.94605F, 74.004509F, 126.09674F, 77.243149F);
      ((Path)localObject1).lineTo(130.2428F, 166.35248F);
      ((Path)localObject1).cubicTo(130.31987F, 168.00896F, 131.72324F, 169.35179F, 133.37312F, 169.35179F);
      ((Path)localObject1).lineTo(145.62688F, 169.35179F);
      ((Path)localObject1).cubicTo(147.27864F, 169.35179F, 148.68036F, 168.004F, 148.7572F, 166.35248F);
      ((Path)localObject1).lineTo(152.90326F, 77.243149F);
      ((Path)localObject1).cubicTo(153.05415F, 74.000107F, 150.54134F, 71.371101F, 147.29178F, 71.371101F);
      ((Path)localObject1).lineTo(131.70822F, 71.371101F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(139.5F, 212.89876F);
      ((Path)localObject1).cubicTo(147.0533F, 212.89876F, 153.17647F, 206.80606F, 153.17647F, 199.29033F);
      ((Path)localObject1).cubicTo(153.17647F, 191.7746F, 147.0533F, 185.6819F, 139.5F, 185.6819F);
      ((Path)localObject1).cubicTo(131.9467F, 185.6819F, 125.82353F, 191.7746F, 125.82353F, 199.29033F);
      ((Path)localObject1).cubicTo(125.82353F, 206.80606F, 131.9467F, 212.89876F, 139.5F, 212.89876F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.dk
 * JD-Core Version:    0.6.2
 */