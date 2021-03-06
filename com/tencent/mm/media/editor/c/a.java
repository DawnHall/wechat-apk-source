package com.tencent.mm.media.editor.c;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.y;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/touch/MatrixChecker;", "", "()V", "bounds", "Landroid/graphics/RectF;", "getBounds", "()Landroid/graphics/RectF;", "setBounds", "(Landroid/graphics/RectF;)V", "maxScale", "", "getMaxScale", "()F", "setMaxScale", "(F)V", "minScale", "getMinScale", "setMinScale", "pivot", "", "getPivot", "()[F", "setPivot", "([F)V", "clamp", "value", "min", "max", "interpolate", "from", "to", "input", "resolve", "", "matrix", "Landroid/graphics/Matrix;", "updateCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "plugin-mediaeditor_release"})
public final class a
{
  public float aJf;
  public float aJg;
  private RectF eUx;
  float[] eUy;

  public a()
  {
    AppMethodBeat.i(12905);
    this.eUx = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.eUy = new float[2];
    this.aJg = 1.0F;
    this.aJf = 1.0F;
    AppMethodBeat.o(12905);
  }

  private static float i(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(12904);
    paramFloat1 = Math.max(paramFloat2, Math.min(paramFloat1, paramFloat3));
    AppMethodBeat.o(12904);
    return paramFloat1;
  }

  public final void a(Matrix paramMatrix, b<? super Matrix, y> paramb)
  {
    AppMethodBeat.i(12903);
    j.p(paramMatrix, "matrix");
    float[] arrayOfFloat1 = new float[2];
    paramMatrix.mapPoints(arrayOfFloat1, this.eUy);
    float f1 = i(arrayOfFloat1[0], this.eUx.left, this.eUx.right);
    float f2 = i(arrayOfFloat1[1], this.eUx.top, this.eUx.bottom);
    float[] arrayOfFloat2 = new float[9];
    paramMatrix.getValues(arrayOfFloat2);
    double d1 = arrayOfFloat2[0];
    double d2 = arrayOfFloat2[3];
    double d3 = arrayOfFloat2[4];
    float f3 = (float)Math.sqrt(d1 * d1 + d2 * d2);
    float f4 = (float)Math.round(Math.atan2(d2, d3) * 57.295779513082323D);
    float f5 = i(f3, this.aJg, this.aJf);
    paramMatrix = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    j.o(paramMatrix, "animator");
    paramMatrix.setDuration(100L);
    paramMatrix.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new a.a(this, f3, f5, f4, arrayOfFloat1, new float[] { f1, f2 }, paramb));
    paramMatrix.start();
    AppMethodBeat.o(12903);
  }

  public final void b(RectF paramRectF)
  {
    AppMethodBeat.i(12901);
    j.p(paramRectF, "<set-?>");
    this.eUx = paramRectF;
    AppMethodBeat.o(12901);
  }

  public final void g(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(12902);
    j.p(paramArrayOfFloat, "<set-?>");
    this.eUy = paramArrayOfFloat;
    AppMethodBeat.o(12902);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.c.a
 * JD-Core Version:    0.6.2
 */