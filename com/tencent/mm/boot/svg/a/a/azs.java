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

public final class azs extends c
{
  private final int height = 36;
  private final int width = 36;

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
        paramInt = 36;
        continue;
        paramInt = 36;
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
      localPaint2 = c.a(localPaint1, paramArrayOfObject);
      localPaint2.setColor(-3552823);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -259.0F, 0.0F, 1.0F, -131.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 259.0F, 0.0F, 1.0F, 131.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint2, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(17.672131F, 35.344261F);
      ((Path)localObject1).cubicTo(7.912082F, 35.344261F, 0.0F, 27.432177F, 0.0F, 17.672131F);
      ((Path)localObject1).cubicTo(0.0F, 7.912082F, 7.912082F, 0.0F, 17.672131F, 0.0F);
      ((Path)localObject1).cubicTo(27.432177F, 0.0F, 35.344261F, 7.912082F, 35.344261F, 17.672131F);
      ((Path)localObject1).cubicTo(35.344261F, 27.432177F, 27.432177F, 35.344261F, 17.672131F, 35.344261F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(7.061935F, 18.702524F);
      ((Path)localObject1).cubicTo(7.008005F, 18.810345F, 7.029141F, 18.94058F, 7.114404F, 19.02581F);
      ((Path)localObject1).lineTo(7.114404F, 19.02581F);
      ((Path)localObject1).lineTo(13.854528F, 25.76321F);
      ((Path)localObject1).cubicTo(13.963866F, 25.872507F, 14.141094F, 25.872507F, 14.250432F, 25.76321F);
      ((Path)localObject1).lineTo(14.250508F, 25.763287F);
      ((Path)localObject1).lineTo(28.901352F, 11.118186F);
      ((Path)localObject1).cubicTo(28.901379F, 11.118161F, 28.901403F, 11.118136F, 28.901428F, 11.118111F);
      ((Path)localObject1).cubicTo(29.010754F, 11.008743F, 29.010719F, 10.831457F, 28.901352F, 10.722131F);
      ((Path)localObject1).lineTo(28.901278F, 10.722207F);
      ((Path)localObject1).lineTo(28.675867F, 10.496883F);
      ((Path)localObject1).lineTo(28.392729F, 10.213852F);
      ((Path)localObject1).cubicTo(28.291279F, 10.112441F, 28.129597F, 10.104101F, 28.018251F, 10.194535F);
      ((Path)localObject1).lineTo(28.018251F, 10.194535F);
      ((Path)localObject1).lineTo(14.218084F, 21.402889F);
      ((Path)localObject1).cubicTo(14.120261F, 21.48234F, 13.981415F, 21.48665F, 13.878853F, 21.41342F);
      ((Path)localObject1).lineTo(8.123317F, 17.303892F);
      ((Path)localObject1).cubicTo(8.111442F, 17.295412F, 8.098921F, 17.287874F, 8.08587F, 17.281345F);
      ((Path)localObject1).cubicTo(7.947567F, 17.212168F, 7.779369F, 17.268206F, 7.710191F, 17.406509F);
      ((Path)localObject1).lineTo(7.710191F, 17.406509F);
      ((Path)localObject1).lineTo(7.061935F, 18.702524F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.azs
 * JD-Core Version:    0.6.2
 */