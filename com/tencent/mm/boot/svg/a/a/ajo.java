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

public final class ajo extends c
{
  private final int height = 24;
  private final int width = 120;

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
        paramInt = 120;
        continue;
        paramInt = 24;
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
      ((Paint)localObject).setColor(-1);
      localCanvas.saveLayerAlpha(null, 76, 4);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(60.0F, 24.0F);
      localPath.cubicTo(66.627419F, 24.0F, 72.0F, 18.627417F, 72.0F, 12.0F);
      localPath.cubicTo(72.0F, 5.372583F, 66.627419F, 0.0F, 60.0F, 0.0F);
      localPath.cubicTo(53.372581F, 0.0F, 48.0F, 5.372583F, 48.0F, 12.0F);
      localPath.cubicTo(48.0F, 18.627417F, 53.372581F, 24.0F, 60.0F, 24.0F);
      localPath.close();
      localPath.moveTo(12.0F, 24.0F);
      localPath.cubicTo(18.627417F, 24.0F, 24.0F, 18.627417F, 24.0F, 12.0F);
      localPath.cubicTo(24.0F, 5.372583F, 18.627417F, 0.0F, 12.0F, 0.0F);
      localPath.cubicTo(5.372583F, 0.0F, 0.0F, 5.372583F, 0.0F, 12.0F);
      localPath.cubicTo(0.0F, 18.627417F, 5.372583F, 24.0F, 12.0F, 24.0F);
      localPath.close();
      localPath.moveTo(108.0F, 24.0F);
      localPath.cubicTo(114.62742F, 24.0F, 120.0F, 18.627417F, 120.0F, 12.0F);
      localPath.cubicTo(120.0F, 5.372583F, 114.62742F, 0.0F, 108.0F, 0.0F);
      localPath.cubicTo(101.37258F, 0.0F, 96.0F, 5.372583F, 96.0F, 12.0F);
      localPath.cubicTo(96.0F, 18.627417F, 101.37258F, 24.0F, 108.0F, 24.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(108.0F, 0.0F);
      ((Path)localObject).cubicTo(114.62742F, 0.0F, 120.0F, 5.372582F, 120.0F, 12.0F);
      ((Path)localObject).cubicTo(120.0F, 18.627419F, 114.62742F, 24.0F, 108.0F, 24.0F);
      ((Path)localObject).cubicTo(101.37258F, 24.0F, 96.0F, 18.627419F, 96.0F, 12.0F);
      ((Path)localObject).cubicTo(96.0F, 5.372582F, 101.37258F, 0.0F, 108.0F, 0.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ajo
 * JD-Core Version:    0.6.2
 */