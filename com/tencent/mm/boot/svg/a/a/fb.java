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

public final class fb extends c
{
  private final int height = 200;
  private final int width = 200;

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
        paramInt = 200;
        continue;
        paramInt = 200;
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
      localPaint2.setColor(-1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 29.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(0.3197014F, 77.933189F);
      ((Path)localObject1).cubicTo(-0.06372429F, 77.536362F, -0.1085526F, 76.85273F, 0.219325F, 76.406593F);
      ((Path)localObject1).lineTo(9.792403F, 63.380688F);
      ((Path)localObject1).cubicTo(10.120393F, 62.934402F, 10.738718F, 62.842735F, 11.176576F, 63.178329F);
      ((Path)localObject1).lineTo(61.002815F, 101.36729F);
      ((Path)localObject1).cubicTo(62.317314F, 102.37477F, 64.420479F, 102.32714F, 65.687584F, 101.27154F);
      ((Path)localObject1).lineTo(186.95796F, 0.2435029F);
      ((Path)localObject1).cubicTo(187.37868F, -0.1069829F, 188.04178F, -0.07305191F, 188.42578F, 0.3061832F);
      ((Path)localObject1).lineTo(197.77451F, 9.538964F);
      ((Path)localObject1).cubicTo(198.16446F, 9.924068F, 198.16162F, 10.550133F, 197.76987F, 10.935685F);
      ((Path)localObject1).lineTo(64.80481F, 141.79317F);
      ((Path)localObject1).cubicTo(64.017342F, 142.56815F, 62.75824F, 142.55399F, 61.988094F, 141.75691F);
      ((Path)localObject1).lineTo(0.3197014F, 77.933189F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.fb
 * JD-Core Version:    0.6.2
 */