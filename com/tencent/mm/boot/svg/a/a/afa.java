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

public final class afa extends c
{
  private final int height = 34;
  private final int width = 34;

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
        paramInt = 34;
        continue;
        paramInt = 34;
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
      localObject2 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 76, 4);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -171.0F, 0.0F, 1.0F, -553.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 171.0F, 0.0F, 1.0F, 553.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 6.8F, 0.0F, 1.0F, 9.35F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(2.016F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1.062637F, 9.508F);
      ((Path)localObject2).cubicTo(1.564623F, 14.110367F, 5.464044F, 17.691999F, 10.2F, 17.691999F);
      ((Path)localObject2).cubicTo(14.935956F, 17.691999F, 18.835377F, 14.110367F, 19.337364F, 9.508F);
      ((Path)localObject2).lineTo(1.062637F, 9.508F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(4.25F, 5.1F);
      ((Path)localObject1).cubicTo(2.841674F, 5.1F, 1.7F, 3.958326F, 1.7F, 2.55F);
      ((Path)localObject1).cubicTo(1.7F, 1.141674F, 2.841674F, 0.0F, 4.25F, 0.0F);
      ((Path)localObject1).cubicTo(5.658326F, 0.0F, 6.8F, 1.141674F, 6.8F, 2.55F);
      ((Path)localObject1).cubicTo(6.8F, 3.958326F, 5.658326F, 5.1F, 4.25F, 5.1F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(16.15F, 5.1F);
      ((Path)localObject1).cubicTo(14.741673F, 5.1F, 13.6F, 3.958326F, 13.6F, 2.55F);
      ((Path)localObject1).cubicTo(13.6F, 1.141674F, 14.741673F, 0.0F, 16.15F, 0.0F);
      ((Path)localObject1).cubicTo(17.558327F, 0.0F, 18.700001F, 1.141674F, 18.700001F, 2.55F);
      ((Path)localObject1).cubicTo(18.700001F, 3.958326F, 17.558327F, 5.1F, 16.15F, 5.1F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(17.0F, 34.0F);
      ((Path)localObject1).cubicTo(7.611159F, 34.0F, 0.0F, 26.388842F, 0.0F, 17.0F);
      ((Path)localObject1).cubicTo(0.0F, 7.611159F, 7.611159F, 0.0F, 17.0F, 0.0F);
      ((Path)localObject1).cubicTo(26.388842F, 0.0F, 34.0F, 7.611159F, 34.0F, 17.0F);
      ((Path)localObject1).cubicTo(34.0F, 26.388842F, 26.388842F, 34.0F, 17.0F, 34.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(17.0F, 32.299999F);
      ((Path)localObject1).cubicTo(25.449957F, 32.299999F, 32.299999F, 25.449957F, 32.299999F, 17.0F);
      ((Path)localObject1).cubicTo(32.299999F, 8.550043F, 25.449957F, 1.7F, 17.0F, 1.7F);
      ((Path)localObject1).cubicTo(8.550043F, 1.7F, 1.7F, 8.550043F, 1.7F, 17.0F);
      ((Path)localObject1).cubicTo(1.7F, 25.449957F, 8.550043F, 32.299999F, 17.0F, 32.299999F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.afa
 * JD-Core Version:    0.6.2
 */