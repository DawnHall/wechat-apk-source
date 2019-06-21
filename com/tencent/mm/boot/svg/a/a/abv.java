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

public final class abv extends c
{
  private final int height = 24;
  private final int width = 24;

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
        paramInt = 24;
        continue;
        paramInt = 24;
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
      localPaint2.setColor(-436207616);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(10.0F, 0.0F);
      ((Path)localObject1).cubicTo(4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 10.0F);
      ((Path)localObject1).cubicTo(0.0F, 15.5F, 4.5F, 20.0F, 10.0F, 20.0F);
      ((Path)localObject1).cubicTo(15.5F, 20.0F, 20.0F, 15.5F, 20.0F, 10.0F);
      ((Path)localObject1).cubicTo(20.0F, 4.5F, 15.5F, 0.0F, 10.0F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(18.0F, 6.3F);
      ((Path)localObject1).lineTo(14.2F, 10.0F);
      ((Path)localObject1).cubicTo(14.2F, 10.0F, 14.2F, 10.0F, 14.2F, 10.0F);
      ((Path)localObject1).lineTo(14.2F, 2.3F);
      ((Path)localObject1).cubicTo(15.8F, 3.2F, 17.200001F, 4.6F, 18.0F, 6.3F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(12.1F, 12.1F);
      ((Path)localObject1).cubicTo(11.6F, 12.7F, 10.8F, 13.0F, 10.0F, 13.0F);
      ((Path)localObject1).cubicTo(9.2F, 13.0F, 8.4F, 12.7F, 7.9F, 12.1F);
      ((Path)localObject1).lineTo(7.9F, 12.1F);
      ((Path)localObject1).lineTo(7.9F, 12.1F);
      ((Path)localObject1).cubicTo(7.3F, 11.6F, 7.0F, 10.8F, 7.0F, 10.0F);
      ((Path)localObject1).cubicTo(7.0F, 8.3F, 8.3F, 7.0F, 10.0F, 7.0F);
      ((Path)localObject1).cubicTo(11.7F, 7.0F, 13.0F, 8.3F, 13.0F, 10.0F);
      ((Path)localObject1).cubicTo(13.0F, 10.8F, 12.7F, 11.6F, 12.1F, 12.1F);
      ((Path)localObject1).lineTo(12.1F, 12.1F);
      ((Path)localObject1).lineTo(12.1F, 12.1F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(13.0F, 1.7F);
      ((Path)localObject1).lineTo(13.0F, 7.0F);
      ((Path)localObject1).cubicTo(13.0F, 7.0F, 13.0F, 7.0F, 13.0F, 7.0F);
      ((Path)localObject1).lineTo(13.0F, 7.0F);
      ((Path)localObject1).lineTo(7.5F, 1.6F);
      ((Path)localObject1).cubicTo(8.3F, 1.4F, 9.1F, 1.2F, 10.0F, 1.2F);
      ((Path)localObject1).cubicTo(11.1F, 1.2F, 12.1F, 1.4F, 13.0F, 1.7F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(6.3F, 2.0F);
      ((Path)localObject1).lineTo(10.0F, 5.8F);
      ((Path)localObject1).cubicTo(10.0F, 5.8F, 10.0F, 5.8F, 10.0F, 5.8F);
      ((Path)localObject1).lineTo(2.3F, 5.8F);
      ((Path)localObject1).cubicTo(3.2F, 4.2F, 4.6F, 2.8F, 6.3F, 2.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(1.7F, 7.0F);
      ((Path)localObject1).lineTo(7.0F, 7.0F);
      ((Path)localObject1).cubicTo(7.0F, 7.0F, 7.0F, 7.0F, 7.0F, 7.0F);
      ((Path)localObject1).lineTo(7.0F, 7.0F);
      ((Path)localObject1).lineTo(1.5F, 12.5F);
      ((Path)localObject1).cubicTo(1.3F, 11.7F, 1.1F, 10.9F, 1.1F, 10.0F);
      ((Path)localObject1).cubicTo(1.2F, 8.9F, 1.4F, 7.9F, 1.7F, 7.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(2.0F, 13.7F);
      ((Path)localObject1).lineTo(5.8F, 10.0F);
      ((Path)localObject1).cubicTo(5.8F, 10.0F, 5.8F, 10.0F, 5.8F, 10.0F);
      ((Path)localObject1).lineTo(5.8F, 17.700001F);
      ((Path)localObject1).cubicTo(4.2F, 16.799999F, 2.8F, 15.4F, 2.0F, 13.7F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(7.0F, 18.299999F);
      ((Path)localObject1).lineTo(7.0F, 13.0F);
      ((Path)localObject1).cubicTo(7.0F, 13.0F, 7.0F, 13.0F, 7.0F, 13.0F);
      ((Path)localObject1).lineTo(7.0F, 13.0F);
      ((Path)localObject1).lineTo(12.5F, 18.5F);
      ((Path)localObject1).cubicTo(11.7F, 18.700001F, 10.9F, 18.9F, 10.0F, 18.9F);
      ((Path)localObject1).cubicTo(8.9F, 18.799999F, 7.9F, 18.6F, 7.0F, 18.299999F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(13.7F, 18.0F);
      ((Path)localObject1).lineTo(10.0F, 14.2F);
      ((Path)localObject1).cubicTo(10.0F, 14.2F, 10.0F, 14.2F, 10.0F, 14.2F);
      ((Path)localObject1).lineTo(17.700001F, 14.2F);
      ((Path)localObject1).cubicTo(16.799999F, 15.8F, 15.4F, 17.200001F, 13.7F, 18.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(18.299999F, 13.0F);
      ((Path)localObject1).lineTo(13.0F, 13.0F);
      ((Path)localObject1).cubicTo(13.0F, 13.0F, 13.0F, 13.0F, 13.0F, 13.0F);
      ((Path)localObject1).lineTo(13.0F, 13.0F);
      ((Path)localObject1).lineTo(18.5F, 7.5F);
      ((Path)localObject1).cubicTo(18.700001F, 8.3F, 18.9F, 9.1F, 18.9F, 10.0F);
      ((Path)localObject1).cubicTo(18.799999F, 11.1F, 18.6F, 12.1F, 18.299999F, 13.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.abv
 * JD-Core Version:    0.6.2
 */