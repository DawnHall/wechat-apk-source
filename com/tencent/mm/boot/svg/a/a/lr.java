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

public final class lr extends c
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-3289392);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(17.0F, 48.02F);
      ((Path)localObject).cubicTo(27.66F, 37.34F, 38.34F, 26.66F, 49.02F, 16.0F);
      ((Path)localObject).cubicTo(50.919998F, 17.879999F, 52.82F, 19.780001F, 54.700001F, 21.68F);
      ((Path)localObject).cubicTo(47.27F, 29.129999F, 39.82F, 36.560001F, 32.389999F, 44.009998F);
      ((Path)localObject).cubicTo(48.599998F, 44.029999F, 64.809998F, 44.009998F, 81.019997F, 44.02F);
      ((Path)localObject).cubicTo(81.019997F, 46.709999F, 81.019997F, 49.389999F, 81.010002F, 52.080002F);
      ((Path)localObject).cubicTo(64.830002F, 52.099998F, 48.639999F, 52.07F, 32.450001F, 52.09F);
      ((Path)localObject).cubicTo(39.860001F, 59.52F, 47.290001F, 66.93F, 54.700001F, 74.360001F);
      ((Path)localObject).cubicTo(52.82F, 76.260002F, 50.919998F, 78.160004F, 49.02F, 80.040001F);
      ((Path)localObject).cubicTo(38.34F, 69.379997F, 27.66F, 58.700001F, 17.0F, 48.02F);
      ((Path)localObject).lineTo(17.0F, 48.02F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.lr
 * JD-Core Version:    0.6.2
 */