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

public final class bl extends c
{
  private final int height = 45;
  private final int width = 45;

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
        paramInt = 45;
        continue;
        paramInt = 45;
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
      localPaint1.setColor(-11184811);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 5.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(14.634262F, 3.436984F);
      ((Path)localObject2).cubicTo(15.279194F, 1.86752F, 16.155897F, -0.3917077F, 18.312389F, 0.05813853F);
      ((Path)localObject2).cubicTo(20.186722F, 0.08812828F, 20.589804F, 2.157421F, 21.315353F, 3.44698F);
      ((Path)localObject2).cubicTo(24.096621F, 4.796519F, 26.817427F, 6.625894F, 28.077061F, 9.564889F);
      ((Path)localObject2).cubicTo(31.130409F, 15.372904F, 29.185537F, 22.17058F, 31.251333F, 28.218513F);
      ((Path)localObject2).cubicTo(32.138115F, 30.637686F, 33.831062F, 32.656998F, 35.0F, 34.936218F);
      ((Path)localObject2).cubicTo(23.673386F, 35.026188F, 12.336693F, 35.01619F, 1.0F, 34.936218F);
      ((Path)localObject2).cubicTo(2.148785F, 32.646999F, 3.861885F, 30.657679F, 4.748666F, 28.22851F);
      ((Path)localObject2).cubicTo(6.814464F, 22.190573F, 4.859514F, 15.372904F, 7.92294F, 9.564889F);
      ((Path)localObject2).cubicTo(9.182572F, 6.655883F, 11.873148F, 4.806516F, 14.634262F, 3.436984F);
      ((Path)localObject2).lineTo(14.634262F, 3.436984F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.bl
 * JD-Core Version:    0.6.2
 */