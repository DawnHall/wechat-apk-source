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

public final class so extends c
{
  private final int height = 60;
  private final int width = 60;

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
        paramInt = 60;
        continue;
        paramInt = 60;
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
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-16216826);
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(27.52F, 0.0F);
      localPath.lineTo(32.07F, 0.0F);
      localPath.cubicTo(46.450001F, 0.9F, 58.830002F, 13.19F, 60.0F, 27.52F);
      localPath.lineTo(60.0F, 32.080002F);
      localPath.cubicTo(59.09F, 46.459999F, 46.799999F, 58.830002F, 32.48F, 60.0F);
      localPath.lineTo(27.93F, 60.0F);
      localPath.cubicTo(13.55F, 59.099998F, 1.17F, 46.810001F, 0.0F, 32.48F);
      localPath.lineTo(0.0F, 27.93F);
      localPath.cubicTo(0.9F, 13.55F, 13.2F, 1.17F, 27.52F, 0.0F);
      localPath.lineTo(27.52F, 0.0F);
      localPath.lineTo(27.52F, 0.0F);
      localPath.close();
      localPath.moveTo(24.383501F, 3.670378F);
      localPath.cubicTo(11.597891F, 6.255954F, 1.808907F, 19.054052F, 3.117434F, 32.111706F);
      localPath.cubicTo(3.926524F, 46.387276F, 17.730988F, 58.336826F, 32.024902F, 56.879322F);
      localPath.cubicTo(46.738342F, 56.090672F, 58.884674F, 41.515614F, 56.757069F, 26.890642F);
      localPath.cubicTo(55.318687F, 11.726592F, 39.286728F, 0.02661415F, 24.383501F, 3.670378F);
      localPath.lineTo(24.383501F, 3.670378F);
      localPath.lineTo(24.383501F, 3.670378F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      localPath = c.l(paramArrayOfObject);
      localPath.moveTo(25.0F, 15.0F);
      localPath.lineTo(36.0F, 15.0F);
      localPath.lineTo(36.0F, 31.0F);
      localPath.lineTo(25.0F, 31.0F);
      localPath.lineTo(25.0F, 15.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(14.176433F, 30.047743F);
      ((Path)localObject).lineTo(30.5319F, 46.112846F);
      ((Path)localObject).lineTo(46.914063F, 30.035374F);
      ((Path)localObject).lineTo(14.176433F, 30.047743F);
      ((Path)localObject).lineTo(14.176433F, 30.047743F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.so
 * JD-Core Version:    0.6.2
 */