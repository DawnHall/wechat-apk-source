package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class als extends c
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
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      Paint localPaint2 = c.a(localPaint1, paramArrayOfObject);
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 40.799999F, 0.0F, 1.0F, 45.599998F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(3.6F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(17.280001F, 4.4F);
      ((Path)localObject2).lineTo(64.800003F, 4.4F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(3.6F);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(17.280001F, 26.4F);
      ((Path)localObject2).lineTo(64.800003F, 26.4F);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(3.6F);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(17.280001F, 48.400002F);
      ((Path)localObject3).lineTo(64.800003F, 48.400002F);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject1).setColor(-16777216);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(3.456F, 0.0F);
      ((Path)localObject3).cubicTo(5.364697F, 0.0F, 6.912F, 1.544618F, 6.912F, 3.45F);
      ((Path)localObject3).cubicTo(6.912F, 5.355382F, 5.364697F, 6.9F, 3.456F, 6.9F);
      ((Path)localObject3).cubicTo(1.547304F, 6.9F, 0.0F, 5.355382F, 0.0F, 3.45F);
      ((Path)localObject3).cubicTo(0.0F, 1.544618F, 1.547304F, 0.0F, 3.456F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint1, paramArrayOfObject);
      ((Paint)localObject3).setColor(-16777216);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(3.456F, 22.0F);
      ((Path)localObject1).cubicTo(5.364697F, 22.0F, 6.912F, 23.575958F, 6.912F, 25.52F);
      ((Path)localObject1).cubicTo(6.912F, 27.464043F, 5.364697F, 29.040001F, 3.456F, 29.040001F);
      ((Path)localObject1).cubicTo(1.547304F, 29.040001F, 0.0F, 27.464043F, 0.0F, 25.52F);
      ((Path)localObject1).cubicTo(0.0F, 23.575958F, 1.547304F, 22.0F, 3.456F, 22.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-16777216);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(3.456F, 44.0F);
      ((Path)localObject3).cubicTo(5.364697F, 44.0F, 6.912F, 45.575958F, 6.912F, 47.52F);
      ((Path)localObject3).cubicTo(6.912F, 49.464043F, 5.364697F, 51.040001F, 3.456F, 51.040001F);
      ((Path)localObject3).cubicTo(1.547304F, 51.040001F, 0.0F, 49.464043F, 0.0F, 47.52F);
      ((Path)localObject3).cubicTo(0.0F, 45.575958F, 1.547304F, 44.0F, 3.456F, 44.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.als
 * JD-Core Version:    0.6.2
 */