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

public final class nc extends c
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
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 14.0F, 0.0F, 1.0F, 27.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(2.388248F, 1.499129F);
      ((Path)localObject2).cubicTo(3.786483F, 0.7005225F, 5.52429F, 1.149739F, 7.062349F, 1.0F);
      ((Path)localObject2).cubicTo(20.05595F, 1.079861F, 33.049549F, 0.930122F, 46.043152F, 1.069878F);
      ((Path)localObject2).cubicTo(48.050617F, 0.9401045F, 49.239117F, 3.136273F, 48.959473F, 4.913173F);
      ((Path)localObject2).cubicTo(48.959473F, 15.664417F, 48.96946F, 26.415661F, 48.949482F, 37.156921F);
      ((Path)localObject2).cubicTo(49.22913F, 38.903873F, 48.000683F, 41.020184F, 46.063126F, 40.900391F);
      ((Path)localObject2).cubicTo(32.36042F, 41.020184F, 18.647728F, 40.920357F, 4.945021F, 40.950302F);
      ((Path)localObject2).cubicTo(3.167265F, 41.259766F, 0.9800252F, 40.101784F, 1.079899F, 38.095284F);
      ((Path)localObject2).cubicTo(0.9300882F, 27.403936F, 1.079899F, 16.702606F, 1.0F, 6.001275F);
      ((Path)localObject2).cubicTo(1.049937F, 4.434009F, 0.7902647F, 2.42751F, 2.388248F, 1.499129F);
      ((Path)localObject2).lineTo(2.388248F, 1.499129F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(52.016293F, 14.441051F);
      ((Path)localObject1).cubicTo(57.033634F, 10.007826F, 61.711834F, 5.170664F, 66.958595F, 1.0F);
      ((Path)localObject1).cubicTo(68.434875F, 3.02979F, 67.876282F, 5.604898F, 67.976028F, 7.947741F);
      ((Path)localObject1).cubicTo(67.846359F, 18.36935F, 68.185501F, 28.821257F, 67.816437F, 39.232769F);
      ((Path)localObject1).cubicTo(67.596985F, 39.667004F, 67.158096F, 40.555668F, 66.938652F, 41.0F);
      ((Path)localObject1).cubicTo(61.711834F, 36.879829F, 57.123409F, 32.002274F, 52.066166F, 27.670033F);
      ((Path)localObject1).cubicTo(51.956444F, 23.257006F, 52.016293F, 18.854076F, 52.016293F, 14.441051F);
      ((Path)localObject1).lineTo(52.016293F, 14.441051F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.nc
 * JD-Core Version:    0.6.2
 */