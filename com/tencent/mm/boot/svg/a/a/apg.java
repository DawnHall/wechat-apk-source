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

public final class apg extends c
{
  private final int height = 72;
  private final int width = 72;

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
        paramInt = 72;
        continue;
        paramInt = 72;
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
      localPaint2.setColor(-15028967);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.6F, 8.1F);
      ((Path)localObject1).lineTo(3.6F, 39.900002F);
      ((Path)localObject1).lineTo(41.400002F, 39.900002F);
      ((Path)localObject1).lineTo(41.400002F, 8.1F);
      ((Path)localObject1).lineTo(3.6F, 8.1F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(3.0F, 4.5F);
      ((Path)localObject1).lineTo(42.0F, 4.5F);
      ((Path)localObject1).cubicTo(43.656853F, 4.5F, 45.0F, 5.843146F, 45.0F, 7.5F);
      ((Path)localObject1).lineTo(45.0F, 40.5F);
      ((Path)localObject1).cubicTo(45.0F, 42.156853F, 43.656853F, 43.5F, 42.0F, 43.5F);
      ((Path)localObject1).lineTo(3.0F, 43.5F);
      ((Path)localObject1).cubicTo(1.343146F, 43.5F, 0.0F, 42.156853F, 0.0F, 40.5F);
      ((Path)localObject1).lineTo(0.0F, 7.5F);
      ((Path)localObject1).cubicTo(0.0F, 5.843146F, 1.343146F, 4.5F, 3.0F, 4.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(51.599998F, 28.269751F);
      ((Path)localObject1).lineTo(59.400002F, 34.50975F);
      ((Path)localObject1).lineTo(59.400002F, 13.49025F);
      ((Path)localObject1).lineTo(51.599998F, 19.730249F);
      ((Path)localObject1).lineTo(51.599998F, 28.269751F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(48.0F, 18.0F);
      ((Path)localObject1).lineTo(58.125916F, 9.899268F);
      ((Path)localObject1).cubicTo(59.419701F, 8.86424F, 61.307579F, 9.074003F, 62.342606F, 10.367789F);
      ((Path)localObject1).cubicTo(62.768158F, 10.899729F, 63.0F, 11.56066F, 63.0F, 12.241875F);
      ((Path)localObject1).lineTo(63.0F, 35.758125F);
      ((Path)localObject1).cubicTo(63.0F, 37.414978F, 61.656853F, 38.758125F, 60.0F, 38.758125F);
      ((Path)localObject1).cubicTo(59.318787F, 38.758125F, 58.657852F, 38.526283F, 58.125916F, 38.100731F);
      ((Path)localObject1).lineTo(48.0F, 30.0F);
      ((Path)localObject1).lineTo(48.0F, 18.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apg
 * JD-Core Version:    0.6.2
 */