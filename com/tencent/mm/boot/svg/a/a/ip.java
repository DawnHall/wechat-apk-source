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

public final class ip extends c
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
      localPaint.setColor(-15028967);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(210.0F, 106.2963F);
      localPath.cubicTo(210.0F, 47.008888F, 162.9911F, 0.0F, 103.7037F, 0.0F);
      localPath.cubicTo(47.008888F, 0.0F, 0.0F, 47.008888F, 0.0F, 106.2963F);
      localPath.cubicTo(0.0F, 162.9911F, 47.008888F, 210.0F, 103.7037F, 210.0F);
      localPath.cubicTo(162.9911F, 210.0F, 210.0F, 162.9911F, 210.0F, 106.2963F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-1);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(54.281837F, 109.43951F);
      ((Path)localObject).lineTo(58.179451F, 104.19687F);
      ((Path)localObject).lineTo(58.179451F, 104.19687F);
      ((Path)localObject).cubicTo(58.640762F, 103.57636F, 59.51775F, 103.44731F, 60.138256F, 103.90862F);
      ((Path)localObject).cubicTo(60.141663F, 103.91116F, 60.145058F, 103.9137F, 60.148438F, 103.91627F);
      ((Path)localObject).lineTo(84.999481F, 122.74494F);
      ((Path)localObject).lineTo(84.999481F, 122.74494F);
      ((Path)localObject).cubicTo(85.516304F, 123.13652F, 86.234398F, 123.12196F, 86.734932F, 122.70975F);
      ((Path)localObject).lineTo(147.92569F, 72.31694F);
      ((Path)localObject).lineTo(147.92569F, 72.31694F);
      ((Path)localObject).cubicTo(148.47726F, 71.862701F, 149.28241F, 71.896729F, 149.79369F, 72.395882F);
      ((Path)localObject).lineTo(153.3208F, 75.839348F);
      ((Path)localObject).lineTo(153.3208F, 75.839348F);
      ((Path)localObject).cubicTo(153.87405F, 76.379478F, 153.8847F, 77.265846F, 153.34456F, 77.819099F);
      ((Path)localObject).cubicTo(153.33617F, 77.827698F, 153.32767F, 77.836189F, 153.31905F, 77.844566F);
      ((Path)localObject).lineTo(86.880226F, 142.48117F);
      ((Path)localObject).lineTo(86.880226F, 142.48117F);
      ((Path)localObject).cubicTo(86.326942F, 143.01945F, 85.44236F, 143.00832F, 84.902794F, 142.4563F);
      ((Path)localObject).lineTo(54.404179F, 111.25338F);
      ((Path)localObject).lineTo(54.404179F, 111.25338F);
      ((Path)localObject).cubicTo(53.922985F, 110.76107F, 53.871113F, 109.99198F, 54.281837F, 109.43951F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ip
 * JD-Core Version:    0.6.2
 */