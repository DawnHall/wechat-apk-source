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

public final class xs extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localPaint2.setColor(-12206054);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 9.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(25.094501F, 1.246916F);
      ((Path)localObject1).cubicTo(32.743237F, 3.020303F, 39.219376F, 8.896839F, 41.072548F, 16.177034F);
      ((Path)localObject1).cubicTo(43.137039F, 22.67836F, 41.587963F, 29.62878F, 38.076664F, 35.088516F);
      ((Path)localObject1).cubicTo(34.412243F, 42.962852F, 28.066027F, 49.068085F, 21.099989F, 54.0F);
      ((Path)localObject1).cubicTo(12.755159F, 48.05386F, 5.05975F, 40.377571F, 1.127431F, 30.111811F);
      ((Path)localObject1).cubicTo(-0.9466681F, 23.652811F, -0.2770675F, 15.399808F, 4.123315F, 9.209645F);
      ((Path)localObject1).cubicTo(9.027383F, 3.179397F, 17.492334F, 0.0671194F, 25.094501F, 1.246916F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(16.216259F, 28.788422F);
      ((Path)localObject1).cubicTo(21.350666F, 32.136604F, 29.266953F, 28.065493F, 28.989613F, 22.434635F);
      ((Path)localObject1).cubicTo(29.309687F, 16.169382F, 22.162594F, 11.960802F, 17.280704F, 15.021884F);
      ((Path)localObject1).cubicTo(11.992141F, 17.438299F, 11.564811F, 25.432486F, 16.216259F, 28.788422F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.xs
 * JD-Core Version:    0.6.2
 */