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

public final class azg extends c
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
      float[] arrayOfFloat = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.k(paramArrayOfObject);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      c.a((Paint)localObject2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, 14.0F, 0.0F, 1.0F, 14.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-499359);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(44.308483F, 25.295759F);
      ((Path)localObject2).cubicTo(44.610649F, 25.603817F, 44.89724F, 25.926746F, 45.171368F, 26.262423F);
      ((Path)localObject2).lineTo(45.171368F, 1.652887F);
      ((Path)localObject2).cubicTo(41.895321F, 0.586371F, 38.409523F, 0.0F, 34.787697F, 0.0F);
      ((Path)localObject2).cubicTo(30.288454F, 0.0F, 25.996883F, 0.8986778F, 22.060434F, 2.511199F);
      ((Path)localObject2).lineTo(44.320946F, 25.284075F);
      ((Path)localObject2).lineTo(44.308483F, 25.295759F);
      ((Path)localObject2).lineTo(44.308483F, 25.295759F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-16384);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(34.457825F, 20.949333F);
      ((Path)localObject1).cubicTo(34.466087F, 20.949333F, 34.47435F, 20.948307F, 34.482613F, 20.948307F);
      ((Path)localObject1).cubicTo(34.898861F, 20.948307F, 35.309944F, 20.97296F, 35.716896F, 21.009939F);
      ((Path)localObject1).lineTo(18.817053F, 4.201988F);
      ((Path)localObject1).cubicTo(11.838973F, 7.80127F, 6.268697F, 13.724062F, 3.151491F, 20.947279F);
      ((Path)localObject1).lineTo(34.457825F, 20.947279F);
      ((Path)localObject1).lineTo(34.457825F, 20.949333F);
      ((Path)localObject1).lineTo(34.457825F, 20.949333F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-9676047);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(48.385487F, 3.151491F);
      ((Path)localObject1).lineTo(48.385487F, 34.457829F);
      ((Path)localObject1).cubicTo(48.385487F, 34.883022F, 48.361874F, 35.302021F, 48.322857F, 35.716896F);
      ((Path)localObject1).lineTo(65.130806F, 18.82169F);
      ((Path)localObject1).cubicTo(61.534313F, 11.840071F, 55.611336F, 6.268192F, 48.385487F, 3.151491F);
      ((Path)localObject1).lineTo(48.385487F, 3.151491F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-5117108);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(4.201988F, 50.517994F);
      ((Path)localObject2).cubicTo(7.794966F, 57.492313F, 13.706954F, 63.060619F, 20.920628F, 66.181305F);
      ((Path)localObject2).lineTo(20.920628F, 34.900101F);
      ((Path)localObject2).lineTo(20.947317F, 34.900101F);
      ((Path)localObject2).cubicTo(20.947317F, 34.891842F, 20.946291F, 34.884617F, 20.946291F, 34.877392F);
      ((Path)localObject2).cubicTo(20.946291F, 34.451042F, 20.969902F, 34.030891F, 21.009939F, 33.615902F);
      ((Path)localObject2).lineTo(4.201988F, 50.517994F);
      ((Path)localObject2).lineTo(4.201988F, 50.517994F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-10818218);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(25.049591F, 44.06353F);
      ((Path)localObject1).cubicTo(24.737955F, 43.747334F, 24.441902F, 43.416279F, 24.161428F, 43.070374F);
      ((Path)localObject1).lineTo(24.161428F, 67.673294F);
      ((Path)localObject1).cubicTo(27.447113F, 68.743904F, 30.942631F, 69.332794F, 34.575268F, 69.332794F);
      ((Path)localObject1).cubicTo(39.062828F, 69.332794F, 43.34367F, 68.440437F, 47.272362F, 66.838234F);
      ((Path)localObject1).lineTo(25.012196F, 44.10173F);
      ((Path)localObject1).lineTo(25.049591F, 44.06353F);
      ((Path)localObject1).lineTo(25.049591F, 44.06353F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject2).setColor(-12799249);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(66.830704F, 22.060434F);
      ((Path)localObject1).lineTo(44.075241F, 44.319214F);
      ((Path)localObject1).lineTo(44.051899F, 44.296379F);
      ((Path)localObject1).cubicTo(43.739933F, 44.602573F, 43.410988F, 44.894234F, 43.070374F, 45.171368F);
      ((Path)localObject1).lineTo(67.674286F, 45.171368F);
      ((Path)localObject1).cubicTo(68.744942F, 41.889378F, 69.332794F, 38.396687F, 69.332794F, 34.766983F);
      ((Path)localObject1).cubicTo(69.332794F, 30.27475F, 68.437218F, 25.990103F, 66.830704F, 22.060434F);
      ((Path)localObject1).lineTo(66.830704F, 22.060434F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject1).setColor(-11083026);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(34.900158F, 48.386475F);
      ((Path)localObject2).cubicTo(34.466915F, 48.386475F, 34.03883F, 48.362873F, 33.615902F, 48.322857F);
      ((Path)localObject2).lineTo(50.513397F, 65.130806F);
      ((Path)localObject2).cubicTo(57.490665F, 61.540611F, 63.060928F, 55.627407F, 66.181305F, 48.412125F);
      ((Path)localObject2).lineTo(34.900158F, 48.412125F);
      ((Path)localObject2).lineTo(34.900158F, 48.386475F);
      ((Path)localObject2).lineTo(34.900158F, 48.386475F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-1124019);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(25.284075F, 25.037481F);
      ((Path)localObject1).cubicTo(25.59532F, 24.730915F, 25.923559F, 24.438898F, 26.262423F, 24.161428F);
      ((Path)localObject1).lineTo(1.652887F, 24.161428F);
      ((Path)localObject1).cubicTo(0.586371F, 27.440128F, 0.0F, 30.928747F, 0.0F, 34.553501F);
      ((Path)localObject1).cubicTo(0.0F, 39.050152F, 0.8954909F, 43.338963F, 2.503763F, 47.272362F);
      ((Path)localObject1).lineTo(25.257519F, 25.011501F);
      ((Path)localObject1).lineTo(25.284075F, 25.037481F);
      ((Path)localObject1).lineTo(25.284075F, 25.037481F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azg
 * JD-Core Version:    0.6.2
 */