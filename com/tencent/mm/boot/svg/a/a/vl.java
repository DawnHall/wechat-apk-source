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

public final class vl extends c
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
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.k(paramArrayOfObject);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject3).setColor(-5592406);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 6.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject1 = c.l(paramArrayOfObject);
      ((Path)localObject1).moveTo(47.930031F, 28.938629F);
      ((Path)localObject1).cubicTo(46.569485F, 28.938629F, 45.481049F, 27.860409F, 45.481049F, 26.512636F);
      ((Path)localObject1).cubicTo(45.481049F, 25.164862F, 46.569485F, 24.086643F, 47.930031F, 24.086643F);
      ((Path)localObject1).cubicTo(49.290573F, 24.086643F, 50.379009F, 25.164862F, 50.379009F, 26.512636F);
      ((Path)localObject1).cubicTo(50.379009F, 27.79302F, 49.290573F, 28.938629F, 47.930031F, 28.938629F);
      ((Path)localObject1).moveTo(35.860058F, 28.938629F);
      ((Path)localObject1).cubicTo(34.499516F, 28.938629F, 33.411079F, 27.860409F, 33.411079F, 26.512636F);
      ((Path)localObject1).cubicTo(33.411079F, 25.164862F, 34.499516F, 24.086643F, 35.860058F, 24.086643F);
      ((Path)localObject1).cubicTo(37.220604F, 24.086643F, 38.309036F, 25.164862F, 38.309036F, 26.512636F);
      ((Path)localObject1).cubicTo(38.309036F, 27.79302F, 37.220604F, 28.938629F, 35.860058F, 28.938629F);
      ((Path)localObject1).moveTo(53.770905F, 42.555561F);
      ((Path)localObject1).cubicTo(57.588737F, 39.833344F, 60.0F, 35.783211F, 60.0F, 31.334707F);
      ((Path)localObject1).cubicTo(60.0F, 23.101652F, 51.962456F, 16.462093F, 41.982506F, 16.462093F);
      ((Path)localObject1).cubicTo(32.00256F, 16.462093F, 23.965015F, 23.101652F, 23.965015F, 31.334707F);
      ((Path)localObject1).cubicTo(23.965015F, 39.56776F, 32.00256F, 46.207317F, 41.982506F, 46.207317F);
      ((Path)localObject1).cubicTo(44.058872F, 46.207317F, 46.001278F, 45.941738F, 47.876705F, 45.410572F);
      ((Path)localObject1).cubicTo(48.010666F, 45.344177F, 48.211605F, 45.344177F, 48.41254F, 45.344177F);
      ((Path)localObject1).cubicTo(48.74744F, 45.344177F, 49.082336F, 45.476967F, 49.350254F, 45.60976F);
      ((Path)localObject1).lineTo(53.302048F, 47.86721F);
      ((Path)localObject1).cubicTo(53.436005F, 47.933605F, 53.502987F, 48.0F, 53.636944F, 48.0F);
      ((Path)localObject1).cubicTo(53.971844F, 48.0F, 54.239761F, 47.734417F, 54.239761F, 47.402439F);
      ((Path)localObject1).cubicTo(54.239761F, 47.26965F, 54.172783F, 47.136856F, 54.172783F, 46.937672F);
      ((Path)localObject1).cubicTo(54.172783F, 46.871273F, 53.636944F, 45.078594F, 53.369026F, 43.949867F);
      ((Path)localObject1).cubicTo(53.302048F, 43.817078F, 53.302048F, 43.684288F, 53.302048F, 43.551495F);
      ((Path)localObject1).cubicTo(53.235069F, 43.086727F, 53.436005F, 42.754749F, 53.770905F, 42.555561F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramArrayOfObject);
      localObject3 = c.l(paramArrayOfObject);
      ((Path)localObject3).moveTo(28.688047F, 14.902527F);
      ((Path)localObject3).cubicTo(27.125906F, 14.902527F, 25.889214F, 13.677441F, 25.889214F, 12.129964F);
      ((Path)localObject3).cubicTo(25.889214F, 10.582487F, 27.125906F, 9.357401F, 28.688047F, 9.357401F);
      ((Path)localObject3).cubicTo(30.250187F, 9.357401F, 31.486881F, 10.582487F, 31.486881F, 12.129964F);
      ((Path)localObject3).cubicTo(31.486881F, 13.612963F, 30.250187F, 14.902527F, 28.688047F, 14.902527F);
      ((Path)localObject3).moveTo(14.344024F, 14.902527F);
      ((Path)localObject3).cubicTo(12.781883F, 14.902527F, 11.54519F, 13.677441F, 11.54519F, 12.129964F);
      ((Path)localObject3).cubicTo(11.54519F, 10.582487F, 12.781883F, 9.357401F, 14.344024F, 9.357401F);
      ((Path)localObject3).cubicTo(15.906163F, 9.357401F, 17.142857F, 10.582487F, 17.142857F, 12.129964F);
      ((Path)localObject3).cubicTo(17.142857F, 13.612963F, 15.906163F, 14.902527F, 14.344024F, 14.902527F);
      ((Path)localObject3).moveTo(21.683867F, 0.0F);
      ((Path)localObject3).cubicTo(9.734243F, 0.0F, 0.0F, 7.952879F, 0.0F, 17.827703F);
      ((Path)localObject3).cubicTo(0.0F, 23.195896F, 2.886707F, 28.033897F, 7.518864F, 31.281322F);
      ((Path)localObject3).cubicTo(7.854528F, 31.546419F, 8.123058F, 31.944063F, 8.123058F, 32.474255F);
      ((Path)localObject3).cubicTo(8.123058F, 32.606804F, 8.055925F, 32.805626F, 8.055925F, 32.938171F);
      ((Path)localObject3).cubicTo(7.720262F, 34.263653F, 7.116068F, 36.450695F, 7.048935F, 36.516968F);
      ((Path)localObject3).cubicTo(6.981803F, 36.71579F, 6.91467F, 36.848339F, 6.91467F, 37.047161F);
      ((Path)localObject3).cubicTo(6.91467F, 37.444805F, 7.250333F, 37.776173F, 7.65313F, 37.776173F);
      ((Path)localObject3).cubicTo(7.787395F, 37.776173F, 7.92166F, 37.7099F, 8.055925F, 37.643627F);
      ((Path)localObject3).lineTo(12.822349F, 34.926392F);
      ((Path)localObject3).cubicTo(13.158012F, 34.72757F, 13.560808F, 34.59502F, 13.963605F, 34.59502F);
      ((Path)localObject3).cubicTo(14.165003F, 34.59502F, 14.366401F, 34.59502F, 14.567799F, 34.661297F);
      ((Path)localObject3).cubicTo(16.783178F, 35.257763F, 19.199957F, 35.655407F, 21.616734F, 35.655407F);
      ((Path)localObject3).lineTo(22.825123F, 35.655407F);
      ((Path)localObject3).cubicTo(22.355194F, 34.263653F, 22.086662F, 32.805626F, 22.086662F, 31.281322F);
      ((Path)localObject3).cubicTo(22.086662F, 22.334333F, 30.948181F, 15.044195F, 41.823681F, 15.044195F);
      ((Path)localObject3).lineTo(43.03207F, 15.044195F);
      ((Path)localObject3).cubicTo(41.488018F, 6.494851F, 32.492233F, 0.0F, 21.683867F, 0.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.vl
 * JD-Core Version:    0.6.2
 */