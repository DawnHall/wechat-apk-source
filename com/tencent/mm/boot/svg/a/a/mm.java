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

public final class mm extends c
{
  private final int height = 42;
  private final int width = 42;

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
        paramInt = 42;
        continue;
        paramInt = 42;
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
      localCanvas.saveLayerAlpha(null, 102, 4);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1491.0F, 0.0F, 1.0F, -387.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(1492.7629F, 389.76321F);
      ((Path)localObject2).cubicTo(1492.5024F, 389.20749F, 1492.6007F, 388.52631F, 1493.0635F, 388.06348F);
      ((Path)localObject2).cubicTo(1493.6508F, 387.47614F, 1494.6017F, 387.4747F, 1495.1901F, 388.06311F);
      ((Path)localObject2).lineTo(1501.127F, 394.0F);
      ((Path)localObject2).lineTo(1523.9926F, 394.0F);
      ((Path)localObject2).cubicTo(1525.6536F, 394.0F, 1527.0F, 395.34311F, 1527.0F, 397.00793F);
      ((Path)localObject2).lineTo(1527.0F, 416.99207F);
      ((Path)localObject2).cubicTo(1527.0F, 417.79025F, 1526.6876F, 418.51584F, 1526.1813F, 419.05432F);
      ((Path)localObject2).lineTo(1530.6071F, 423.48016F);
      ((Path)localObject2).cubicTo(1531.1942F, 424.06729F, 1531.1981F, 425.01532F, 1530.6067F, 425.60675F);
      ((Path)localObject2).cubicTo(1530.147F, 426.06656F, 1529.4644F, 426.16727F, 1528.9072F, 425.90701F);
      ((Path)localObject2).cubicTo(1528.8348F, 425.75256F, 1528.7347F, 425.60782F, 1528.6071F, 425.48016F);
      ((Path)localObject2).lineTo(1493.1901F, 390.06311F);
      ((Path)localObject2).cubicTo(1493.0623F, 389.93536F, 1492.9175F, 389.83539F, 1492.7629F, 389.76321F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(1493.0339F, 394.16092F);
      ((Path)localObject2).cubicTo(1491.8503F, 394.56543F, 1491.0F, 395.68729F, 1491.0F, 397.00793F);
      ((Path)localObject2).lineTo(1491.0F, 416.99207F);
      ((Path)localObject2).cubicTo(1491.0F, 418.65689F, 1492.3418F, 420.0F, 1493.9968F, 420.0F);
      ((Path)localObject2).lineTo(1500.0F, 420.0F);
      ((Path)localObject2).lineTo(1500.0F, 426.88751F);
      ((Path)localObject2).cubicTo(1500.0F, 428.08762F, 1500.6836F, 428.36902F, 1501.5267F, 427.52051F);
      ((Path)localObject2).lineTo(1509.0F, 420.0F);
      ((Path)localObject2).lineTo(1518.873F, 420.0F);
      ((Path)localObject2).lineTo(1493.0339F, 394.16092F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.mm
 * JD-Core Version:    0.6.2
 */