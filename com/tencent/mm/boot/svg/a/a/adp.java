package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class adp extends c
{
  private final int height = 156;
  private final int width = 156;

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
        paramInt = 156;
        continue;
        paramInt = 156;
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
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16139513);
      localPaint.setStrokeWidth(3.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(108.80415F, 97.686272F);
      ((Path)localObject).cubicTo(107.96773F, 97.088669F, 99.069519F, 91.146591F, 97.824875F, 91.09063F);
      ((Path)localObject).cubicTo(94.858475F, 91.066643F, 88.833847F, 95.100983F, 86.845596F, 95.487724F);
      ((Path)localObject).cubicTo(83.995979F, 95.469734F, 77.45433F, 92.316818F, 70.376686F, 85.594254F);
      ((Path)localObject).cubicTo(63.662365F, 78.507927F, 60.513309F, 71.958252F, 60.495342F, 69.105133F);
      ((Path)localObject).cubicTo(60.881615F, 67.114441F, 64.911003F, 61.083424F, 64.887054F, 58.112385F);
      ((Path)localObject).cubicTo(64.831154F, 56.867207F, 58.957245F, 47.924107F, 58.299488F, 47.119637F);
      ((Path)localObject).cubicTo(57.319336F, 45.788513F, 56.338188F, 44.814156F, 55.664463F, 45.030014F);
      ((Path)localObject).cubicTo(54.357929F, 45.241875F, 43.738976F, 49.063354F, 45.124359F, 59.211658F);
      ((Path)localObject).cubicTo(46.801193F, 69.131111F, 57.308357F, 83.118889F, 64.887054F, 91.09063F);
      ((Path)localObject).cubicTo(72.849022F, 98.679619F, 86.820648F, 109.19868F, 96.726944F, 110.87757F);
      ((Path)localObject).cubicTo(106.86381F, 112.26466F, 110.7894F, 101.4348F, 111.0F, 100.12666F);
      ((Path)localObject).cubicTo(111.001F, 99.377159F, 109.64056F, 98.283882F, 108.80415F, 97.686272F);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.adp
 * JD-Core Version:    0.6.2
 */