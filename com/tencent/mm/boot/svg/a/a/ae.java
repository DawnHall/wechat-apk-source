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

public final class ae extends c
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
      localObject3 = c.a((Paint)localObject3, paramArrayOfObject);
      ((Paint)localObject3).setColor(-3355444);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 19.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(15.987003F, 13.975044F);
      ((Path)localObject2).cubicTo(22.005089F, 9.323351F, 28.003181F, 4.651693F, 34.021267F, 0.0F);
      ((Path)localObject2).lineTo(38.0F, 0.0F);
      ((Path)localObject2).lineTo(38.0F, 56.0F);
      ((Path)localObject2).cubicTo(36.340527F, 55.740463F, 34.401146F, 56.139751F, 33.031582F, 54.961853F);
      ((Path)localObject2).cubicTo(27.323397F, 50.619606F, 21.645203F, 46.247414F, 15.937019F, 41.91515F);
      ((Path)localObject2).cubicTo(11.648384F, 41.835293F, 7.339755F, 42.134758F, 3.061116F, 41.785381F);
      ((Path)localObject2).cubicTo(1.221701F, 41.605705F, 0.9317936F, 39.499466F, 1.011768F, 38.032085F);
      ((Path)localObject2).cubicTo(1.001771F, 31.314081F, 1.001771F, 24.596079F, 1.011768F, 17.878075F);
      ((Path)localObject2).cubicTo(0.9417905F, 16.440641F, 1.211705F, 14.274509F, 3.051119F, 14.144741F);
      ((Path)localObject2).cubicTo(7.349752F, 13.735473F, 11.678374F, 14.074866F, 15.987003F, 13.975044F);
      ((Path)localObject2).lineTo(15.987003F, 13.975044F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(53.339943F, 7.684289F);
      ((Path)localObject2).cubicTo(50.137051F, 5.601287F, 53.269878F, 0.3937841F, 56.58287F, 2.486704F);
      ((Path)localObject2).cubicTo(68.533661F, 9.856561F, 73.358017F, 26.480894F, 67.532761F, 39.147526F);
      ((Path)localObject2).cubicTo(65.270714F, 44.424461F, 61.207047F, 48.669819F, 56.58287F, 51.992699F);
      ((Path)localObject2).cubicTo(53.500084F, 52.151405F, 50.997826F, 49.701397F, 52.39909F, 46.686008F);
      ((Path)localObject2).cubicTo(60.506413F, 42.37122F, 65.410843F, 32.839008F, 63.689285F, 23.80275F);
      ((Path)localObject2).cubicTo(62.758446F, 17.206579F, 58.504604F, 11.681667F, 53.339943F, 7.684289F);
      ((Path)localObject2).lineTo(53.339943F, 7.684289F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(45.386761F, 13.448668F);
      ((Path)localObject3).cubicTo(48.041458F, 11.830107F, 49.881649F, 14.987299F, 51.440281F, 16.635832F);
      ((Path)localObject3).cubicTo(55.512833F, 20.991959F, 57.161964F, 27.55612F, 55.130718F, 33.21109F);
      ((Path)localObject3).cubicTo(53.984367F, 36.618057F, 51.440281F, 39.365616F, 48.574409F, 41.463749F);
      ((Path)localObject3).cubicTo(47.025837F, 42.682663F, 44.481747F, 41.693542F, 44.05941F, 39.805225F);
      ((Path)localObject3).cubicTo(43.808018F, 38.606289F, 44.421413F, 37.467304F, 44.652695F, 36.318325F);
      ((Path)localObject3).cubicTo(46.301826F, 35.149364F, 48.162128F, 34.02037F, 49.036972F, 32.112068F);
      ((Path)localObject3).cubicTo(51.239166F, 27.815887F, 49.348698F, 22.320776F, 45.477261F, 19.643158F);
      ((Path)localObject3).cubicTo(44.300747F, 17.834766F, 42.94323F, 14.857414F, 45.386761F, 13.448668F);
      ((Path)localObject3).lineTo(45.386761F, 13.448668F);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ae
 * JD-Core Version:    0.6.2
 */