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

public final class aki extends c
{
  private final int height = 210;
  private final int width = 210;

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
        paramInt = 210;
        continue;
        paramInt = 210;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -335.0F, 0.0F, 1.0F, -284.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 335.0F, 0.0F, 1.0F, 284.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-2565928);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(0.0F, 12.0F);
      ((Path)localObject2).cubicTo(0.0F, 5.372582F, 5.372582F, 0.0F, 12.0F, 0.0F);
      ((Path)localObject2).lineTo(198.0F, 0.0F);
      ((Path)localObject2).cubicTo(204.62741F, 0.0F, 210.0F, 5.372582F, 210.0F, 12.0F);
      ((Path)localObject2).lineTo(210.0F, 198.0F);
      ((Path)localObject2).cubicTo(210.0F, 204.62741F, 204.62741F, 210.0F, 198.0F, 210.0F);
      ((Path)localObject2).lineTo(12.0F, 210.0F);
      ((Path)localObject2).cubicTo(5.372582F, 210.0F, 0.0F, 204.62741F, 0.0F, 198.0F);
      ((Path)localObject2).lineTo(0.0F, 12.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject1).setColor(-1);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(157.64894F, 92.3088F);
      ((Path)localObject3).lineTo(144.74844F, 105.2093F);
      ((Path)localObject3).lineTo(138.95433F, 99.415192F);
      ((Path)localObject3).lineTo(151.85483F, 86.514694F);
      ((Path)localObject3).cubicTo(159.84056F, 78.528969F, 159.70537F, 65.697449F, 151.70346F, 57.695538F);
      ((Path)localObject3).cubicTo(143.70525F, 49.697327F, 130.86548F, 49.562988F, 122.88431F, 57.544167F);
      ((Path)localObject3).lineTo(97.083305F, 83.345169F);
      ((Path)localObject3).cubicTo(89.09758F, 91.330887F, 89.232765F, 104.16241F, 97.23468F, 112.16432F);
      ((Path)localObject3).lineTo(91.501122F, 117.89788F);
      ((Path)localObject3).cubicTo(80.298676F, 106.69543F, 80.200867F, 88.639397F, 91.2892F, 77.551064F);
      ((Path)localObject3).lineTo(117.0902F, 51.750061F);
      ((Path)localObject3).cubicTo(128.17189F, 40.668373F, 146.23703F, 40.761997F, 157.43701F, 51.961983F);
      ((Path)localObject3).cubicTo(168.63947F, 63.164429F, 168.73727F, 81.220467F, 157.64894F, 92.3088F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(51.753483F, 117.08678F);
      ((Path)localObject3).lineTo(64.653984F, 104.18628F);
      ((Path)localObject3).lineTo(70.44809F, 109.98038F);
      ((Path)localObject3).lineTo(57.547588F, 122.88088F);
      ((Path)localObject3).cubicTo(49.561871F, 130.86661F, 49.697052F, 143.69812F, 57.698963F, 151.70004F);
      ((Path)localObject3).cubicTo(65.697174F, 159.69824F, 78.536942F, 159.83258F, 86.51812F, 151.85141F);
      ((Path)localObject3).lineTo(112.31912F, 126.05041F);
      ((Path)localObject3).cubicTo(120.30484F, 118.06469F, 120.16966F, 105.23316F, 112.16775F, 97.231255F);
      ((Path)localObject3).lineTo(117.90131F, 91.497696F);
      ((Path)localObject3).cubicTo(129.10376F, 102.70014F, 129.20155F, 120.75618F, 118.11323F, 131.84451F);
      ((Path)localObject3).lineTo(92.312225F, 157.64552F);
      ((Path)localObject3).cubicTo(81.230537F, 168.7272F, 63.165394F, 168.63358F, 51.965405F, 157.43359F);
      ((Path)localObject3).cubicTo(40.762959F, 146.23114F, 40.665154F, 128.17511F, 51.753483F, 117.08678F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.aki
 * JD-Core Version:    0.6.2
 */