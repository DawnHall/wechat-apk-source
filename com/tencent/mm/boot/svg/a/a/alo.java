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

public final class alo extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-855638017);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 28.799999F);
      localPath.cubicTo(0.0F, 12.894198F, 12.894198F, 0.0F, 28.799999F, 0.0F);
      localPath.lineTo(115.2F, 0.0F);
      localPath.cubicTo(131.1058F, 0.0F, 144.0F, 12.894198F, 144.0F, 28.799999F);
      localPath.lineTo(144.0F, 115.2F);
      localPath.cubicTo(144.0F, 131.1058F, 131.1058F, 144.0F, 115.2F, 144.0F);
      localPath.lineTo(28.799999F, 144.0F);
      localPath.cubicTo(12.894198F, 144.0F, 0.0F, 131.1058F, 0.0F, 115.2F);
      localPath.lineTo(0.0F, 28.799999F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 39.0F, 0.0F, 1.0F, 48.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.131651E-015F, 25.08F);
      ((Path)localObject1).lineTo(-3.131651E-015F, 21.719999F);
      ((Path)localObject1).lineTo(64.800003F, 21.719999F);
      ((Path)localObject1).lineTo(64.800003F, 25.08F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(-3.022274E-015F, 4.08F);
      ((Path)localObject1).lineTo(-3.022274E-015F, 0.72F);
      ((Path)localObject1).lineTo(3.456F, 0.72F);
      ((Path)localObject1).lineTo(3.456F, 4.08F);
      ((Path)localObject1).lineTo(-3.022274E-015F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(6.912F, 4.08F);
      ((Path)localObject1).lineTo(6.912F, 0.72F);
      ((Path)localObject1).lineTo(10.368F, 0.72F);
      ((Path)localObject1).lineTo(10.368F, 4.08F);
      ((Path)localObject1).lineTo(6.912F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(13.824F, 4.08F);
      ((Path)localObject1).lineTo(13.824F, 0.72F);
      ((Path)localObject1).lineTo(17.280001F, 0.72F);
      ((Path)localObject1).lineTo(17.280001F, 4.08F);
      ((Path)localObject1).lineTo(13.824F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(20.736F, 4.08F);
      ((Path)localObject1).lineTo(20.736F, 0.72F);
      ((Path)localObject1).lineTo(24.192001F, 0.72F);
      ((Path)localObject1).lineTo(24.192001F, 4.08F);
      ((Path)localObject1).lineTo(20.736F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(27.648001F, 4.08F);
      ((Path)localObject1).lineTo(27.648001F, 0.72F);
      ((Path)localObject1).lineTo(31.104F, 0.72F);
      ((Path)localObject1).lineTo(31.104F, 4.08F);
      ((Path)localObject1).lineTo(27.648001F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(34.560001F, 4.08F);
      ((Path)localObject1).lineTo(34.560001F, 0.72F);
      ((Path)localObject1).lineTo(38.016003F, 0.72F);
      ((Path)localObject1).lineTo(38.016003F, 4.08F);
      ((Path)localObject1).lineTo(34.560001F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(41.472F, 4.08F);
      ((Path)localObject1).lineTo(41.472F, 0.72F);
      ((Path)localObject1).lineTo(44.928001F, 0.72F);
      ((Path)localObject1).lineTo(44.928001F, 4.08F);
      ((Path)localObject1).lineTo(41.472F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(48.384003F, 4.08F);
      ((Path)localObject1).lineTo(48.384003F, 0.72F);
      ((Path)localObject1).lineTo(51.84F, 0.72F);
      ((Path)localObject1).lineTo(51.84F, 4.08F);
      ((Path)localObject1).lineTo(48.384003F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(55.296001F, 4.08F);
      ((Path)localObject1).lineTo(55.296001F, 0.72F);
      ((Path)localObject1).lineTo(58.752003F, 0.72F);
      ((Path)localObject1).lineTo(58.752003F, 4.08F);
      ((Path)localObject1).lineTo(55.296001F, 4.08F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(62.208F, 4.08F);
      ((Path)localObject1).lineTo(62.208F, 0.72F);
      ((Path)localObject1).lineTo(65.664001F, 0.72F);
      ((Path)localObject1).lineTo(65.664001F, 4.08F);
      ((Path)localObject1).lineTo(62.208F, 4.08F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(-3.454027E-015F, 46.080002F);
      ((Path)localObject1).lineTo(-3.454027E-015F, 42.720001F);
      ((Path)localObject1).lineTo(3.456F, 42.720001F);
      ((Path)localObject1).lineTo(3.456F, 46.080002F);
      ((Path)localObject1).lineTo(-3.454027E-015F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(6.912F, 46.080002F);
      ((Path)localObject1).lineTo(6.912F, 42.720001F);
      ((Path)localObject1).lineTo(10.368F, 42.720001F);
      ((Path)localObject1).lineTo(10.368F, 46.080002F);
      ((Path)localObject1).lineTo(6.912F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(13.824F, 46.080002F);
      ((Path)localObject1).lineTo(13.824F, 42.720001F);
      ((Path)localObject1).lineTo(17.280001F, 42.720001F);
      ((Path)localObject1).lineTo(17.280001F, 46.080002F);
      ((Path)localObject1).lineTo(13.824F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(20.736F, 46.080002F);
      ((Path)localObject1).lineTo(20.736F, 42.720001F);
      ((Path)localObject1).lineTo(24.192001F, 42.720001F);
      ((Path)localObject1).lineTo(24.192001F, 46.080002F);
      ((Path)localObject1).lineTo(20.736F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(27.648001F, 46.080002F);
      ((Path)localObject1).lineTo(27.648001F, 42.720001F);
      ((Path)localObject1).lineTo(31.104F, 42.720001F);
      ((Path)localObject1).lineTo(31.104F, 46.080002F);
      ((Path)localObject1).lineTo(27.648001F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(34.560001F, 46.080002F);
      ((Path)localObject1).lineTo(34.560001F, 42.720001F);
      ((Path)localObject1).lineTo(38.016003F, 42.720001F);
      ((Path)localObject1).lineTo(38.016003F, 46.080002F);
      ((Path)localObject1).lineTo(34.560001F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(41.472F, 46.080002F);
      ((Path)localObject1).lineTo(41.472F, 42.720001F);
      ((Path)localObject1).lineTo(44.928001F, 42.720001F);
      ((Path)localObject1).lineTo(44.928001F, 46.080002F);
      ((Path)localObject1).lineTo(41.472F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(48.384003F, 46.080002F);
      ((Path)localObject1).lineTo(48.384003F, 42.720001F);
      ((Path)localObject1).lineTo(51.84F, 42.720001F);
      ((Path)localObject1).lineTo(51.84F, 46.080002F);
      ((Path)localObject1).lineTo(48.384003F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(55.296001F, 46.080002F);
      ((Path)localObject1).lineTo(55.296001F, 42.720001F);
      ((Path)localObject1).lineTo(58.752003F, 42.720001F);
      ((Path)localObject1).lineTo(58.752003F, 46.080002F);
      ((Path)localObject1).lineTo(55.296001F, 46.080002F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(62.208F, 46.080002F);
      ((Path)localObject1).lineTo(62.208F, 42.720001F);
      ((Path)localObject1).lineTo(65.664001F, 42.720001F);
      ((Path)localObject1).lineTo(65.664001F, 46.080002F);
      ((Path)localObject1).lineTo(62.208F, 46.080002F);
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
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.alo
 * JD-Core Version:    0.6.2
 */