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

public final class zh extends c
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(36.0F, 60.0F);
      ((Path)localObject).cubicTo(52.568542F, 60.0F, 66.0F, 48.58326F, 66.0F, 34.5F);
      ((Path)localObject).cubicTo(66.0F, 20.416739F, 52.568542F, 9.0F, 36.0F, 9.0F);
      ((Path)localObject).cubicTo(19.431458F, 9.0F, 6.0F, 20.416739F, 6.0F, 34.5F);
      ((Path)localObject).cubicTo(6.0F, 42.109215F, 9.920994F, 48.939999F, 16.139269F, 53.612202F);
      ((Path)localObject).lineTo(15.232977F, 61.40884F);
      ((Path)localObject).cubicTo(15.137323F, 62.231728F, 15.726863F, 62.976353F, 16.549749F, 63.072006F);
      ((Path)localObject).cubicTo(16.831148F, 63.104713F, 17.116058F, 63.057068F, 17.371504F, 62.934578F);
      ((Path)localObject).lineTo(26.320362F, 58.643509F);
      ((Path)localObject).cubicTo(29.357191F, 59.522919F, 32.613049F, 60.0F, 36.0F, 60.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.zh
 * JD-Core Version:    0.6.2
 */