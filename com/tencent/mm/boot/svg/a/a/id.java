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

public final class id extends c
{
  private final int height = 40;
  private final int width = 40;

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
        paramInt = 40;
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
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      localPaint2.setStrokeWidth(1.0F);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.333333F, 0.0F, 1.0F, 3.333333F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-15616);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(16.666666F, 33.333332F);
      ((Path)localObject2).cubicTo(7.461921F, 33.333332F, 0.0F, 25.871412F, 0.0F, 16.666666F);
      ((Path)localObject2).cubicTo(0.0F, 7.461921F, 7.461921F, 0.0F, 16.666666F, 0.0F);
      ((Path)localObject2).cubicTo(25.871412F, 0.0F, 33.333332F, 7.461921F, 33.333332F, 16.666666F);
      ((Path)localObject2).cubicTo(33.333332F, 25.871412F, 25.871412F, 33.333332F, 16.666666F, 33.333332F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(17.333323F, 15.333354F);
      ((Path)localObject2).lineTo(20.0F, 10.0F);
      ((Path)localObject2).lineTo(22.5F, 10.0F);
      ((Path)localObject2).lineTo(19.833323F, 15.333354F);
      ((Path)localObject2).lineTo(22.5F, 15.333354F);
      ((Path)localObject2).lineTo(22.5F, 17.333353F);
      ((Path)localObject2).lineTo(17.666708F, 17.333353F);
      ((Path)localObject2).lineTo(17.666708F, 19.166666F);
      ((Path)localObject2).lineTo(22.5F, 19.166666F);
      ((Path)localObject2).lineTo(22.5F, 21.166666F);
      ((Path)localObject2).lineTo(17.666708F, 21.166666F);
      ((Path)localObject2).lineTo(17.666708F, 24.166666F);
      ((Path)localObject2).lineTo(15.666707F, 24.166666F);
      ((Path)localObject2).lineTo(15.666707F, 21.166666F);
      ((Path)localObject2).lineTo(10.833333F, 21.166666F);
      ((Path)localObject2).lineTo(10.833333F, 19.166666F);
      ((Path)localObject2).lineTo(15.666707F, 19.166666F);
      ((Path)localObject2).lineTo(15.666707F, 17.333353F);
      ((Path)localObject2).lineTo(10.833333F, 17.333353F);
      ((Path)localObject2).lineTo(10.833333F, 15.333354F);
      ((Path)localObject2).lineTo(13.50001F, 15.333354F);
      ((Path)localObject2).lineTo(10.833333F, 10.0F);
      ((Path)localObject2).lineTo(13.333333F, 10.0F);
      ((Path)localObject2).lineTo(16.00001F, 15.333354F);
      ((Path)localObject2).lineTo(17.333323F, 15.333354F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.0F, 0.0F);
      ((Path)localObject1).lineTo(40.0F, 0.0F);
      ((Path)localObject1).lineTo(40.0F, 40.0F);
      ((Path)localObject1).lineTo(0.0F, 40.0F);
      ((Path)localObject1).lineTo(0.0F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath((Path)localObject1, c.a(localPaint1, paramArrayOfObject));
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.id
 * JD-Core Version:    0.6.2
 */