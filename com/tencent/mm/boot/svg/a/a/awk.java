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

public final class awk extends c
{
  private final int height = 52;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 52;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-4534078);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(31.0F, 6.0F);
      ((Path)localObject1).cubicTo(32.539345F, 3.778164F, 34.441322F, 1.889082F, 36.0F, 0.0F);
      ((Path)localObject1).cubicTo(43.293613F, 6.993623F, 47.350491F, 16.770628F, 47.0F, 27.0F);
      ((Path)localObject1).cubicTo(46.814297F, 36.18396F, 42.433674F, 45.40831F, 36.0F, 52.0F);
      ((Path)localObject1).cubicTo(33.692669F, 50.060677F, 31.821043F, 48.131401F, 30.0F, 46.0F);
      ((Path)localObject1).cubicTo(35.007866F, 41.29855F, 38.376797F, 34.676716F, 39.0F, 28.0F);
      ((Path)localObject1).cubicTo(39.520008F, 19.584154F, 36.30283F, 11.455072F, 31.0F, 6.0F);
      ((Path)localObject1).lineTo(31.0F, 6.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(23.0F, 13.0F);
      ((Path)localObject1).cubicTo(24.986967F, 11.330923F, 26.594074F, 9.670524F, 28.0F, 8.0F);
      ((Path)localObject1).cubicTo(33.158859F, 13.376049F, 35.837368F, 21.009834F, 35.0F, 28.0F);
      ((Path)localObject1).cubicTo(34.181564F, 34.009544F, 31.386173F, 39.031242F, 28.0F, 43.0F);
      ((Path)localObject1).cubicTo(26.116812F, 41.299103F, 24.538925F, 39.598206F, 23.0F, 38.0F);
      ((Path)localObject1).cubicTo(29.632965F, 31.407579F, 29.837507F, 19.693665F, 23.0F, 13.0F);
      ((Path)localObject1).lineTo(23.0F, 13.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(7.0F, 15.0F);
      ((Path)localObject3).cubicTo(13.824487F, 12.176701F, 21.437187F, 17.153526F, 22.0F, 24.0F);
      ((Path)localObject3).cubicTo(22.804081F, 30.548067F, 16.498409F, 36.811485F, 10.0F, 36.0F);
      ((Path)localObject3).cubicTo(3.677545F, 35.425156F, -1.111572F, 29.012133F, 0.0F, 23.0F);
      ((Path)localObject3).cubicTo(0.9637117F, 19.158218F, 3.787295F, 15.866932F, 7.0F, 15.0F);
      ((Path)localObject3).lineTo(7.0F, 15.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.awk
 * JD-Core Version:    0.6.2
 */