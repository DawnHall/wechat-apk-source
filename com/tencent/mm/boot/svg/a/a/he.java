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

public final class he extends c
{
  private final int height = 120;
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
        paramInt = 120;
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
      localPaint2.setColor(-372399);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 12.0F);
      localPath.cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.cubicTo(114.62742F, 0.0F, 120.0F, 5.372582F, 120.0F, 12.0F);
      localPath.lineTo(120.0F, 108.0F);
      localPath.cubicTo(120.0F, 114.62742F, 114.62742F, 120.0F, 108.0F, 120.0F);
      localPath.lineTo(12.0F, 120.0F);
      localPath.cubicTo(5.372582F, 120.0F, 0.0F, 114.62742F, 0.0F, 108.0F);
      localPath.lineTo(0.0F, 12.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 23.0F, 0.0F, 1.0F, 41.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(56.837322F, 34.382229F);
      ((Path)localObject1).lineTo(56.837322F, 4.36973F);
      ((Path)localObject1).lineTo(14.724756F, 4.36973F);
      ((Path)localObject1).lineTo(14.724756F, 34.382229F);
      ((Path)localObject1).lineTo(56.837322F, 34.382229F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(10.331462F, 1.136868E-013F);
      ((Path)localObject1).lineTo(61.230618F, 1.136868E-013F);
      ((Path)localObject1).lineTo(61.230618F, 38.751701F);
      ((Path)localObject1).lineTo(10.331462F, 38.751701F);
      ((Path)localObject1).lineTo(10.331462F, 1.136868E-013F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(4.393229F, 38.751701F);
      ((Path)localObject1).lineTo(1.696647F, 38.751701F);
      ((Path)localObject1).cubicTo(2.273737E-013F, 38.751701F, 2.2747E-013F, 37.909233F, 2.2747E-013F, 37.909233F);
      ((Path)localObject1).lineTo(2.489629F, 0.842595F);
      ((Path)localObject1).cubicTo(2.515041F, 0.367076F, 2.912945F, -0.00428691F, 3.392444F, -9.633928E-014F);
      ((Path)localObject1).lineTo(6.938233F, -3.674223E-005F);
      ((Path)localObject1).lineTo(4.393229F, 38.751701F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(67.168854F, 38.751701F);
      ((Path)localObject1).lineTo(64.623848F, -3.674223E-005F);
      ((Path)localObject1).lineTo(68.16964F, -9.633928E-014F);
      ((Path)localObject1).cubicTo(68.649132F, -0.00428691F, 69.047035F, 0.367076F, 69.072449F, 0.842595F);
      ((Path)localObject1).lineTo(71.56208F, 37.909233F);
      ((Path)localObject1).cubicTo(71.56208F, 37.909233F, 71.56208F, 38.751701F, 69.865433F, 38.751701F);
      ((Path)localObject1).lineTo(67.168854F, 38.751701F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.he
 * JD-Core Version:    0.6.2
 */