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

public final class asb extends c
{
  private final int height = 79;
  private final int width = 78;

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
        paramInt = 78;
        continue;
        paramInt = 79;
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
      localPaint2.setColor(-11184811);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -98.0F, 0.0F, 1.0F, -362.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 98.0F, 0.0F, 1.0F, 362.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(39.0F, 78.490562F);
      ((Path)localObject1).cubicTo(60.539104F, 78.490562F, 78.0F, 60.919853F, 78.0F, 39.245281F);
      ((Path)localObject1).cubicTo(78.0F, 17.570711F, 60.539104F, 0.0F, 39.0F, 0.0F);
      ((Path)localObject1).cubicTo(17.460896F, 0.0F, 0.0F, 17.570711F, 0.0F, 39.245281F);
      ((Path)localObject1).cubicTo(0.0F, 60.919853F, 17.460896F, 78.490562F, 39.0F, 78.490562F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(39.0F, 49.811321F);
      ((Path)localObject1).cubicTo(44.798988F, 49.811321F, 49.5F, 45.080746F, 49.5F, 39.245281F);
      ((Path)localObject1).cubicTo(49.5F, 33.409821F, 44.798988F, 28.679245F, 39.0F, 28.679245F);
      ((Path)localObject1).cubicTo(33.201012F, 28.679245F, 28.5F, 33.409821F, 28.5F, 39.245281F);
      ((Path)localObject1).cubicTo(28.5F, 45.080746F, 33.201012F, 49.811321F, 39.0F, 49.811321F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(5.541176F, 25.559748F);
      ((Path)localObject1).lineTo(39.423531F, 25.559748F);
      ((Path)localObject1).lineTo(21.635294F, 7.280799F);
      ((Path)localObject1).cubicTo(14.510319F, 11.176246F, 8.756289F, 17.502306F, 5.541176F, 25.559748F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(38.623528F, 3.018868F);
      ((Path)localObject1).cubicTo(42.618313F, 3.018868F, 46.231693F, 3.578225F, 49.400002F, 4.72364F);
      ((Path)localObject1).lineTo(49.400002F, 30.295227F);
      ((Path)localObject1).lineTo(25.070589F, 5.576026F);
      ((Path)localObject1).cubicTo(29.332592F, 3.969698F, 33.992222F, 3.018868F, 38.623528F, 3.018868F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(3.0F, 39.671474F);
      ((Path)localObject1).cubicTo(3.0F, 44.320057F, 3.949455F, 49.015682F, 5.55F, 53.309654F);
      ((Path)localObject1).lineTo(30.200001F, 28.779875F);
      ((Path)localObject1).lineTo(4.7F, 28.779875F);
      ((Path)localObject1).cubicTo(3.554737F, 32.009815F, 3.0F, 35.639431F, 3.0F, 39.671474F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(25.4F, 72.914543F);
      ((Path)localObject1).lineTo(25.4F, 38.819092F);
      ((Path)localObject1).lineTo(7.235294F, 56.7192F);
      ((Path)localObject1).cubicTo(11.105359F, 63.901081F, 17.385756F, 69.684547F, 25.4F, 72.914543F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(39.423531F, 75.471695F);
      ((Path)localObject1).cubicTo(44.037518F, 75.471695F, 48.706669F, 74.515022F, 52.976471F, 72.914543F);
      ((Path)localObject1).lineTo(28.6F, 48.195339F);
      ((Path)localObject1).lineTo(28.6F, 73.766922F);
      ((Path)localObject1).cubicTo(31.807348F, 74.91449F, 35.411324F, 75.471695F, 39.423531F, 75.471695F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(72.458824F, 52.830189F);
      ((Path)localObject1).lineTo(38.576469F, 52.830189F);
      ((Path)localObject1).lineTo(56.364704F, 71.20977F);
      ((Path)localObject1).cubicTo(63.501339F, 67.317879F, 69.24691F, 61.003838F, 72.458824F, 52.830189F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(75.0F, 39.671474F);
      ((Path)localObject1).cubicTo(75.0F, 35.01675F, 74.047348F, 30.324898F, 72.449997F, 26.033297F);
      ((Path)localObject1).lineTo(47.799999F, 49.811321F);
      ((Path)localObject1).lineTo(73.300003F, 49.811321F);
      ((Path)localObject1).cubicTo(74.441315F, 47.329823F, 75.0F, 43.696667F, 75.0F, 39.671474F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(52.599998F, 6.381058F);
      ((Path)localObject1).lineTo(52.599998F, 40.476509F);
      ((Path)localObject1).lineTo(70.764709F, 22.576397F);
      ((Path)localObject1).cubicTo(66.894958F, 15.407206F, 60.612411F, 9.61857F, 52.599998F, 6.381058F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.asb
 * JD-Core Version:    0.6.2
 */