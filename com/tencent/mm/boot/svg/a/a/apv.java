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

public final class apv extends c
{
  private final int height = 210;
  private final int width = 210;

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
        paramInt = 210;
        continue;
        paramInt = 210;
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
      localPaint1.setColor(-15724528);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 153, 4);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(86.260002F, 1.24F);
      ((Path)localObject1).cubicTo(108.45F, -1.53F, 131.55F, 3.55F, 150.45F, 15.53F);
      ((Path)localObject1).cubicTo(169.74001F, 27.58F, 184.60001F, 46.549999F, 191.61F, 68.199997F);
      ((Path)localObject1).cubicTo(198.67999F, 89.68F, 198.0F, 113.61F, 189.69F, 134.64999F);
      ((Path)localObject1).cubicTo(181.53F, 155.58F, 165.92999F, 173.48F, 146.33F, 184.42999F);
      ((Path)localObject1).cubicTo(126.15F, 195.89F, 101.83F, 199.69F, 79.099998F, 195.13F);
      ((Path)localObject1).cubicTo(56.880001F, 190.83F, 36.380001F, 178.42999F, 22.129999F, 160.87F);
      ((Path)localObject1).cubicTo(8.8F, 144.64F, 0.92F, 124.01F, 0.11F, 103.02F);
      ((Path)localObject1).cubicTo(-1.0F, 79.989998F, 6.41F, 56.689999F, 20.620001F, 38.529999F);
      ((Path)localObject1).cubicTo(36.389999F, 18.040001F, 60.560001F, 4.25F, 86.260002F, 1.24F);
      ((Path)localObject1).lineTo(86.260002F, 1.24F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apv
 * JD-Core Version:    0.6.2
 */