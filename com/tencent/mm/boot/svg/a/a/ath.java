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

public final class ath extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 7.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(1.0F, 22.0F);
      ((Path)localObject1).cubicTo(-2.873494F, 12.371129F, 4.898239F, 1.104972F, 15.0F, 0.0F);
      ((Path)localObject1).cubicTo(23.440092F, -1.154257F, 32.254742F, 5.24356F, 34.0F, 14.0F);
      ((Path)localObject1).cubicTo(34.841976F, 18.579012F, 32.585667F, 23.21743F, 30.0F, 27.0F);
      ((Path)localObject1).cubicTo(26.478588F, 33.613884F, 21.885744F, 39.461887F, 17.0F, 45.0F);
      ((Path)localObject1).cubicTo(10.874953F, 37.892426F, 4.747819F, 30.494947F, 1.0F, 22.0F);
      ((Path)localObject1).lineTo(1.0F, 22.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(13.0F, 7.0F);
      ((Path)localObject1).cubicTo(6.517211F, 9.024447F, 4.703988F, 19.022913F, 10.0F, 24.0F);
      ((Path)localObject1).cubicTo(15.73359F, 28.731422F, 25.811501F, 25.191965F, 27.0F, 18.0F);
      ((Path)localObject1).cubicTo(28.446182F, 10.514218F, 20.211548F, 3.715262F, 13.0F, 7.0F);
      ((Path)localObject1).lineTo(13.0F, 7.0F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ath
 * JD-Core Version:    0.6.2
 */