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

public final class sf extends c
{
  private final int height = 81;
  private final int width = 105;

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
        paramInt = 105;
        continue;
        paramInt = 81;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject = c.h(paramArrayOfObject);
      float[] arrayOfFloat = c.g(paramArrayOfObject);
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
      localPaint1.setColor(-2565928);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -741.0F, 0.0F, 1.0F, -55.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 741.0F, 0.0F, 1.0F, 55.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(86.71151F, 34.642452F);
      ((Path)localObject).cubicTo(85.820557F, 34.548286F, 84.915916F, 34.5F, 84.0F, 34.5F);
      ((Path)localObject).cubicTo(75.911758F, 34.5F, 68.703201F, 38.265427F, 64.031616F, 44.138985F);
      ((Path)localObject).cubicTo(62.993549F, 42.952747F, 62.684723F, 41.290863F, 63.354F, 39.4515F);
      ((Path)localObject).cubicTo(64.314003F, 36.816002F, 66.832497F, 34.591499F, 69.905998F, 33.561001F);
      ((Path)localObject).cubicTo(74.671501F, 31.823999F, 78.0F, 27.861F, 78.0F, 23.25F);
      ((Path)localObject).cubicTo(78.0F, 17.037001F, 71.955002F, 12.0F, 64.5F, 12.0F);
      ((Path)localObject).cubicTo(57.043499F, 12.0F, 51.0F, 17.037001F, 51.0F, 23.25F);
      ((Path)localObject).lineTo(51.0F, 57.75F);
      ((Path)localObject).cubicTo(51.0F, 66.047997F, 46.192501F, 73.322998F, 39.0F, 77.439003F);
      ((Path)localObject).cubicTo(35.078999F, 79.681503F, 30.460501F, 81.0F, 25.5F, 81.0F);
      ((Path)localObject).cubicTo(11.439F, 81.0F, 0.0F, 70.570503F, 0.0F, 57.75F);
      ((Path)localObject).cubicTo(0.0F, 53.669998F, 1.167F, 49.837502F, 3.1995F, 46.5F);
      ((Path)localObject).cubicTo(6.3465F, 41.335499F, 11.589F, 37.3815F, 17.869499F, 35.578499F);
      ((Path)localObject).cubicTo(17.8755F, 35.577F, 17.879999F, 35.5755F, 17.884501F, 35.574001F);
      ((Path)localObject).cubicTo(18.943501F, 35.243999F, 20.0415F, 35.061001F, 21.1245F, 35.061001F);
      ((Path)localObject).cubicTo(25.4685F, 35.061001F, 27.922501F, 37.994999F, 26.604F, 41.616001F);
      ((Path)localObject).cubicTo(25.7115F, 44.068501F, 23.306999F, 46.1805F, 20.5035F, 47.3055F);
      ((Path)localObject).cubicTo(20.169001F, 47.4165F, 19.8435F, 47.5425F, 19.522499F, 47.6745F);
      ((Path)localObject).cubicTo(15.069F, 49.5135F, 12.0F, 53.327999F, 12.0F, 57.75F);
      ((Path)localObject).cubicTo(12.0F, 63.963001F, 18.043501F, 69.0F, 25.5F, 69.0F);
      ((Path)localObject).cubicTo(32.955002F, 69.0F, 39.0F, 63.963001F, 39.0F, 57.75F);
      ((Path)localObject).lineTo(39.0F, 23.25F);
      ((Path)localObject).cubicTo(39.0F, 14.952F, 43.807499F, 7.677F, 51.0F, 3.561F);
      ((Path)localObject).cubicTo(54.921001F, 1.3185F, 59.539501F, 0.0F, 64.5F, 0.0F);
      ((Path)localObject).cubicTo(78.560997F, 0.0F, 90.0F, 10.4295F, 90.0F, 23.25F);
      ((Path)localObject).cubicTo(90.0F, 27.33F, 88.833F, 31.164F, 86.799004F, 34.5F);
      ((Path)localObject).cubicTo(86.770012F, 34.547588F, 86.740852F, 34.59507F, 86.71151F, 34.642452F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(105.0F, 60.0F);
      ((Path)localObject).cubicTo(105.0F, 71.598221F, 95.598221F, 81.0F, 84.0F, 81.0F);
      ((Path)localObject).cubicTo(72.401779F, 81.0F, 63.0F, 71.598221F, 63.0F, 60.0F);
      ((Path)localObject).cubicTo(63.0F, 48.401779F, 72.401779F, 39.0F, 84.0F, 39.0F);
      ((Path)localObject).cubicTo(95.598221F, 39.0F, 105.0F, 48.401779F, 105.0F, 60.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(81.306084F, 49.484344F);
      ((Path)localObject).lineTo(83.0F, 66.0F);
      ((Path)localObject).lineTo(85.0F, 66.0F);
      ((Path)localObject).lineTo(86.693916F, 49.484344F);
      ((Path)localObject).cubicTo(86.846512F, 47.996536F, 85.764107F, 46.666729F, 84.276299F, 46.514133F);
      ((Path)localObject).cubicTo(84.184502F, 46.504719F, 84.092278F, 46.5F, 84.0F, 46.5F);
      ((Path)localObject).cubicTo(82.504387F, 46.5F, 81.291954F, 47.712433F, 81.291954F, 49.208046F);
      ((Path)localObject).cubicTo(81.291954F, 49.300327F, 81.296669F, 49.392544F, 81.306084F, 49.484344F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(84.0F, 75.0F);
      ((Path)localObject).cubicTo(85.656853F, 75.0F, 87.0F, 73.656853F, 87.0F, 72.0F);
      ((Path)localObject).cubicTo(87.0F, 70.343147F, 85.656853F, 69.0F, 84.0F, 69.0F);
      ((Path)localObject).cubicTo(82.343147F, 69.0F, 81.0F, 70.343147F, 81.0F, 72.0F);
      ((Path)localObject).cubicTo(81.0F, 73.656853F, 82.343147F, 75.0F, 84.0F, 75.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.sf
 * JD-Core Version:    0.6.2
 */