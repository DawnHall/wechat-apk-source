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

public final class ask extends c
{
  private final int height = 128;
  private final int width = 128;

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
        paramInt = 128;
        continue;
        paramInt = 128;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-5658199);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(8.006973F, 18.0F);
      ((Path)localObject1).cubicTo(3.584844F, 18.0F, 0.0F, 21.589066F, 0.0F, 26.007586F);
      ((Path)localObject1).lineTo(0.0F, 85.992416F);
      ((Path)localObject1).cubicTo(0.0F, 90.414879F, 3.590753F, 94.0F, 8.006973F, 94.0F);
      ((Path)localObject1).lineTo(119.99303F, 94.0F);
      ((Path)localObject1).cubicTo(124.41515F, 94.0F, 128.0F, 90.410934F, 128.0F, 85.992416F);
      ((Path)localObject1).lineTo(128.0F, 26.007586F);
      ((Path)localObject1).cubicTo(128.0F, 21.585119F, 124.40925F, 18.0F, 119.99303F, 18.0F);
      ((Path)localObject1).lineTo(8.006973F, 18.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(51.428135F, 0.0F);
      ((Path)localObject1).lineTo(64.0F, 0.0F);
      ((Path)localObject1).lineTo(64.0F, 18.0F);
      ((Path)localObject1).lineTo(26.375288F, 18.0F);
      ((Path)localObject1).cubicTo(36.352718F, 18.0F, 41.712528F, 0.0F, 51.428135F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(76.569702F, 0.0F);
      ((Path)localObject1).lineTo(64.0F, 0.0F);
      ((Path)localObject1).lineTo(64.0F, 18.0F);
      ((Path)localObject1).lineTo(101.62471F, 18.0F);
      ((Path)localObject1).cubicTo(91.647285F, 18.0F, 86.287468F, 0.0F, 76.569702F, 0.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(93.0F, 53.0F);
      ((Path)localObject1).cubicTo(93.0F, 69.016922F, 80.016922F, 82.0F, 64.0F, 82.0F);
      ((Path)localObject1).cubicTo(47.983078F, 82.0F, 35.0F, 69.016922F, 35.0F, 53.0F);
      ((Path)localObject1).cubicTo(35.0F, 36.983078F, 47.983078F, 24.0F, 64.0F, 24.0F);
      ((Path)localObject1).cubicTo(80.016922F, 24.0F, 93.0F, 36.983078F, 93.0F, 53.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(84.0F, 53.0F);
      ((Path)localObject1).cubicTo(84.0F, 64.045998F, 75.045998F, 73.0F, 64.0F, 73.0F);
      ((Path)localObject1).cubicTo(52.953999F, 73.0F, 44.0F, 64.045998F, 44.0F, 53.0F);
      ((Path)localObject1).cubicTo(44.0F, 41.953999F, 52.953999F, 33.0F, 64.0F, 33.0F);
      ((Path)localObject1).cubicTo(75.045998F, 33.0F, 84.0F, 41.953999F, 84.0F, 53.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(6.454546F, 6.431509F);
      ((Path)localObject1).lineTo(24.454546F, 6.431509F);
      ((Path)localObject1).lineTo(24.454546F, 12.431508F);
      ((Path)localObject1).lineTo(6.454546F, 12.431508F);
      ((Path)localObject1).lineTo(6.454546F, 6.431509F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ask
 * JD-Core Version:    0.6.2
 */