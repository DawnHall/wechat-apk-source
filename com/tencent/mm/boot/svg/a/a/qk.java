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

public final class qk extends c
{
  private final int height = 192;
  private final int width = 192;

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
        paramInt = 192;
        continue;
        paramInt = 192;
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
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-14187817);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(192.0F, 0.0F);
      localPath.lineTo(192.0F, 192.0F);
      localPath.lineTo(0.0F, 192.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(110.90694F, 140.57062F);
      ((Path)localObject).cubicTo(115.39648F, 133.81949F, 120.51495F, 125.827F, 125.18189F, 117.83344F);
      ((Path)localObject).cubicTo(132.51469F, 105.2738F, 118.94228F, 91.864136F, 121.05859F, 88.239304F);
      ((Path)localObject).lineTo(133.68159F, 66.618614F);
      ((Path)localObject).lineTo(137.24696F, 68.654198F);
      ((Path)localObject).lineTo(140.59984F, 62.911388F);
      ((Path)localObject).lineTo(114.81622F, 48.190643F);
      ((Path)localObject).lineTo(111.46334F, 53.933456F);
      ((Path)localObject).lineTo(113.82504F, 55.28183F);
      ((Path)localObject).lineTo(113.82504F, 55.28183F);
      ((Path)localObject).cubicTo(110.08315F, 61.690948F, 102.82417F, 74.124138F, 101.20204F, 76.902527F);
      ((Path)localObject).cubicTo(98.993179F, 80.68586F, 81.064964F, 75.494469F, 73.554855F, 88.357811F);
      ((Path)localObject).cubicTo(67.732887F, 98.329674F, 53.740925F, 118.98361F, 48.758373F, 126.29124F);
      ((Path)localObject).cubicTo(59.070412F, 125.45091F, 74.24749F, 125.95091F, 88.187302F, 133.06181F);
      ((Path)localObject).cubicTo(96.197433F, 137.1479F, 103.82269F, 139.4944F, 110.90694F, 140.57062F);
      ((Path)localObject).lineTo(110.90694F, 140.57062F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(132.08064F, 36.413792F);
      ((Path)localObject).lineTo(124.87423F, 49.809467F);
      ((Path)localObject).lineTo(135.35979F, 56.026367F);
      ((Path)localObject).lineTo(149.97533F, 45.104786F);
      ((Path)localObject).lineTo(132.08064F, 36.413792F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(157.39185F, 138.754F);
      ((Path)localObject).cubicTo(157.39185F, 138.754F, 137.7422F, 158.59561F, 114.86281F, 158.59561F);
      ((Path)localObject).cubicTo(65.0383F, 158.59561F, 84.342834F, 136.63341F, 26.482759F, 134.37212F);
      ((Path)localObject).cubicTo(26.479265F, 134.37747F, 58.087933F, 125.80052F, 85.269302F, 138.754F);
      ((Path)localObject).cubicTo(126.68277F, 158.48987F, 157.39185F, 138.754F, 157.39185F, 138.754F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.qk
 * JD-Core Version:    0.6.2
 */