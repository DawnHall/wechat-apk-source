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

public final class akb extends c
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
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(419430400);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(36.0F, 1.5F);
      localPath.cubicTo(55.053825F, 1.5F, 70.5F, 16.946175F, 70.5F, 36.0F);
      localPath.cubicTo(70.5F, 55.053825F, 55.053825F, 70.5F, 36.0F, 70.5F);
      localPath.cubicTo(16.946175F, 70.5F, 1.5F, 55.053825F, 1.5F, 36.0F);
      localPath.cubicTo(1.5F, 16.946175F, 16.946175F, 1.5F, 36.0F, 1.5F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-1710619);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(36.0F, 72.0F);
      localPath.cubicTo(55.882252F, 72.0F, 72.0F, 55.882252F, 72.0F, 36.0F);
      localPath.cubicTo(72.0F, 16.117748F, 55.882252F, 0.0F, 36.0F, 0.0F);
      localPath.cubicTo(16.117748F, 0.0F, 0.0F, 16.117748F, 0.0F, 36.0F);
      localPath.cubicTo(0.0F, 55.882252F, 16.117748F, 72.0F, 36.0F, 72.0F);
      localPath.close();
      localPath.moveTo(36.0F, 67.5F);
      localPath.cubicTo(53.396969F, 67.5F, 67.5F, 53.396969F, 67.5F, 36.0F);
      localPath.cubicTo(67.5F, 18.603031F, 53.396969F, 4.5F, 36.0F, 4.5F);
      localPath.cubicTo(18.603031F, 4.5F, 4.5F, 18.603031F, 4.5F, 36.0F);
      localPath.cubicTo(4.5F, 53.396969F, 18.603031F, 67.5F, 36.0F, 67.5F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1710619);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(24.0F, 27.0F);
      ((Path)localObject).cubicTo(24.0F, 25.343145F, 25.343145F, 24.0F, 27.0F, 24.0F);
      ((Path)localObject).lineTo(45.0F, 24.0F);
      ((Path)localObject).cubicTo(46.656853F, 24.0F, 48.0F, 25.343145F, 48.0F, 27.0F);
      ((Path)localObject).lineTo(48.0F, 45.0F);
      ((Path)localObject).cubicTo(48.0F, 46.656853F, 46.656853F, 48.0F, 45.0F, 48.0F);
      ((Path)localObject).lineTo(27.0F, 48.0F);
      ((Path)localObject).cubicTo(25.343145F, 48.0F, 24.0F, 46.656853F, 24.0F, 45.0F);
      ((Path)localObject).lineTo(24.0F, 27.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.akb
 * JD-Core Version:    0.6.2
 */