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

public final class amc extends c
{
  private final int height = 165;
  private final int width = 165;

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
        paramInt = 165;
        continue;
        paramInt = 165;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-4671304);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(165.0F, 83.518517F);
      ((Path)localObject).cubicTo(165.0F, 36.935555F, 128.06444F, 0.0F, 81.481483F, 0.0F);
      ((Path)localObject).cubicTo(36.935555F, 0.0F, 0.0F, 36.935555F, 0.0F, 83.518517F);
      ((Path)localObject).cubicTo(0.0F, 128.06444F, 36.935555F, 165.0F, 81.481483F, 165.0F);
      ((Path)localObject).cubicTo(128.06444F, 165.0F, 165.0F, 128.06444F, 165.0F, 83.518517F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(156.0F, 83.40741F);
      ((Path)localObject).cubicTo(156.0F, 41.906223F, 123.09378F, 9.0F, 81.59259F, 9.0F);
      ((Path)localObject).cubicTo(41.906223F, 9.0F, 9.0F, 41.906223F, 9.0F, 83.40741F);
      ((Path)localObject).cubicTo(9.0F, 123.09378F, 41.906223F, 156.0F, 81.59259F, 156.0F);
      ((Path)localObject).cubicTo(123.09378F, 156.0F, 156.0F, 123.09378F, 156.0F, 83.40741F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(81.067818F, 123.30645F);
      ((Path)localObject).cubicTo(79.409142F, 123.30645F, 78.031212F, 121.96418F, 77.990181F, 120.31069F);
      ((Path)localObject).lineTo(76.660355F, 66.715271F);
      ((Path)localObject).cubicTo(76.619301F, 65.06076F, 77.919846F, 63.719513F, 79.586006F, 63.719513F);
      ((Path)localObject).lineTo(85.413994F, 63.719513F);
      ((Path)localObject).cubicTo(87.070839F, 63.719513F, 88.380676F, 65.061783F, 88.339645F, 66.715271F);
      ((Path)localObject).lineTo(87.009819F, 120.31069F);
      ((Path)localObject).cubicTo(86.968765F, 121.9652F, 85.588173F, 123.30645F, 83.932182F, 123.30645F);
      ((Path)localObject).lineTo(81.067818F, 123.30645F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(82.5F, 41.693546F);
      ((Path)localObject).cubicTo(86.419441F, 41.693546F, 89.596771F, 44.87088F, 89.596771F, 48.790321F);
      ((Path)localObject).cubicTo(89.596771F, 52.709763F, 86.419441F, 55.887096F, 82.5F, 55.887096F);
      ((Path)localObject).cubicTo(78.580559F, 55.887096F, 75.403229F, 52.709763F, 75.403229F, 48.790321F);
      ((Path)localObject).cubicTo(75.403229F, 44.87088F, 78.580559F, 41.693546F, 82.5F, 41.693546F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.amc
 * JD-Core Version:    0.6.2
 */