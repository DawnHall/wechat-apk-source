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

public final class apm extends c
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
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localObject = c.a((Paint)localObject, paramArrayOfObject);
      ((Paint)localObject).setColor(-1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(27.334614F, 45.865097F);
      ((Path)localObject).cubicTo(25.343315F, 46.878971F, 21.187138F, 52.730484F, 20.731934F, 57.04248F);
      ((Path)localObject).cubicTo(20.231934F, 61.778809F, 21.082403F, 65.689941F, 22.739258F, 65.689941F);
      ((Path)localObject).cubicTo(23.691587F, 65.689941F, 25.924526F, 64.051163F, 27.651304F, 61.766052F);
      ((Path)localObject).cubicTo(28.861832F, 64.05024F, 30.447872F, 66.10601F, 32.327477F, 67.851654F);
      ((Path)localObject).cubicTo(28.999271F, 69.187904F, 26.0F, 71.200111F, 26.0F, 73.5F);
      ((Path)localObject).cubicTo(26.0F, 77.520508F, 31.528564F, 80.111816F, 35.64502F, 80.111816F);
      ((Path)localObject).cubicTo(38.931198F, 80.111816F, 45.607635F, 78.173347F, 48.0F, 75.379387F);
      ((Path)localObject).lineTo(48.0F, 75.379387F);
      ((Path)localObject).cubicTo(50.392365F, 78.173347F, 57.068802F, 80.111816F, 60.35498F, 80.111816F);
      ((Path)localObject).cubicTo(64.471436F, 80.111816F, 70.0F, 77.520508F, 70.0F, 73.5F);
      ((Path)localObject).cubicTo(70.0F, 71.200111F, 67.000725F, 69.187904F, 63.672523F, 67.851654F);
      ((Path)localObject).lineTo(63.672523F, 67.851654F);
      ((Path)localObject).cubicTo(65.605003F, 66.0569F, 67.227173F, 63.934326F, 68.449966F, 61.572731F);
      ((Path)localObject).cubicTo(70.388344F, 63.958172F, 72.979736F, 65.689941F, 74.06749F, 65.689941F);
      ((Path)localObject).cubicTo(75.90844F, 65.689941F, 76.853409F, 61.778809F, 76.297852F, 57.04248F);
      ((Path)localObject).cubicTo(75.769608F, 52.539017F, 70.755882F, 46.356285F, 68.68161F, 45.759216F);
      ((Path)localObject).cubicTo(68.890808F, 44.375946F, 69.0F, 42.95274F, 69.0F, 41.5F);
      ((Path)localObject).cubicTo(69.0F, 27.969023F, 59.59798F, 17.0F, 48.0F, 17.0F);
      ((Path)localObject).cubicTo(36.40202F, 17.0F, 27.0F, 27.969023F, 27.0F, 41.5F);
      ((Path)localObject).cubicTo(27.0F, 42.989834F, 27.11484F, 44.448605F, 27.334614F, 45.865097F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.apm
 * JD-Core Version:    0.6.2
 */