package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class aed extends c
{
  private final int height = 96;
  private final int width = 96;

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
        paramInt = 96;
        continue;
        paramInt = 96;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-13026753);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(47.998299F, 37.616859F);
      ((Path)localObject).cubicTo(47.742889F, 37.617249F, 47.488041F, 37.71553F, 47.293037F, 37.910534F);
      ((Path)localObject).lineTo(32.005772F, 53.1978F);
      ((Path)localObject).cubicTo(31.617527F, 53.586048F, 31.615919F, 54.22187F, 32.007095F, 54.613045F);
      ((Path)localObject).lineTo(34.765827F, 57.371777F);
      ((Path)localObject).cubicTo(35.160282F, 57.766232F, 35.790627F, 57.763542F, 36.181068F, 57.373096F);
      ((Path)localObject).lineTo(48.0F, 45.554169F);
      ((Path)localObject).lineTo(59.818932F, 57.373096F);
      ((Path)localObject).cubicTo(60.207176F, 57.761345F, 60.842999F, 57.762951F, 61.234173F, 57.371777F);
      ((Path)localObject).lineTo(63.992905F, 54.613045F);
      ((Path)localObject).cubicTo(64.38736F, 54.218586F, 64.384674F, 53.588245F, 63.994228F, 53.1978F);
      ((Path)localObject).lineTo(48.706963F, 37.910534F);
      ((Path)localObject).cubicTo(48.513058F, 37.716629F, 48.257397F, 37.619167F, 48.001301F, 37.618912F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(17.0F, 20.996428F);
      ((Path)localObject).cubicTo(17.0F, 18.789261F, 18.788675F, 17.0F, 20.996428F, 17.0F);
      ((Path)localObject).lineTo(75.003571F, 17.0F);
      ((Path)localObject).cubicTo(77.210739F, 17.0F, 79.0F, 18.788675F, 79.0F, 20.996428F);
      ((Path)localObject).lineTo(79.0F, 75.003571F);
      ((Path)localObject).cubicTo(79.0F, 77.210739F, 77.211327F, 79.0F, 75.003571F, 79.0F);
      ((Path)localObject).lineTo(20.996428F, 79.0F);
      ((Path)localObject).cubicTo(18.789261F, 79.0F, 17.0F, 77.211327F, 17.0F, 75.003571F);
      ((Path)localObject).lineTo(17.0F, 20.996428F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aed
 * JD-Core Version:    0.6.2
 */