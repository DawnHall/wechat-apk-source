package com.tencent.ttpic.ar.sensor.representation;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Vector4f
{
  protected float[] points;

  public Vector4f()
  {
    AppMethodBeat.i(81741);
    this.points = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };
    this.points[0] = 0.0F;
    this.points[1] = 0.0F;
    this.points[2] = 0.0F;
    this.points[3] = 0.0F;
    AppMethodBeat.o(81741);
  }

  public Vector4f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(81740);
    this.points = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };
    this.points[0] = paramFloat1;
    this.points[1] = paramFloat2;
    this.points[2] = paramFloat3;
    this.points[3] = paramFloat4;
    AppMethodBeat.o(81740);
  }

  public Vector4f(Vector3f paramVector3f, float paramFloat)
  {
    AppMethodBeat.i(81742);
    this.points = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };
    this.points[0] = paramVector3f.x();
    this.points[1] = paramVector3f.y();
    this.points[2] = paramVector3f.z();
    this.points[3] = paramFloat;
    AppMethodBeat.o(81742);
  }

  public void add(Vector3f paramVector3f, float paramFloat)
  {
    AppMethodBeat.i(81743);
    float[] arrayOfFloat = this.points;
    arrayOfFloat[0] += paramVector3f.x();
    arrayOfFloat = this.points;
    arrayOfFloat[1] += paramVector3f.y();
    arrayOfFloat = this.points;
    arrayOfFloat[2] += paramVector3f.z();
    paramVector3f = this.points;
    paramVector3f[3] += paramFloat;
    AppMethodBeat.o(81743);
  }

  public void add(Vector4f paramVector4f)
  {
    float[] arrayOfFloat = this.points;
    arrayOfFloat[0] += paramVector4f.points[0];
    arrayOfFloat = this.points;
    arrayOfFloat[1] += paramVector4f.points[1];
    arrayOfFloat = this.points;
    arrayOfFloat[2] += paramVector4f.points[2];
    arrayOfFloat = this.points;
    arrayOfFloat[3] += paramVector4f.points[3];
  }

  public float[] array()
  {
    return this.points;
  }

  public boolean compareTo(Vector4f paramVector4f)
  {
    boolean bool = true;
    if ((this.points[0] == paramVector4f.points[0]) && (this.points[1] == paramVector4f.points[1]) && (this.points[2] == paramVector4f.points[2]) && (this.points[3] == paramVector4f.points[3]));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public void copyFromV3f(Vector3f paramVector3f, float paramFloat)
  {
    AppMethodBeat.i(81746);
    this.points[0] = paramVector3f.x();
    this.points[1] = paramVector3f.y();
    this.points[2] = paramVector3f.z();
    this.points[3] = paramFloat;
    AppMethodBeat.o(81746);
  }

  public void copyVec4(Vector4f paramVector4f)
  {
    this.points[0] = paramVector4f.points[0];
    this.points[1] = paramVector4f.points[1];
    this.points[2] = paramVector4f.points[2];
    this.points[3] = paramVector4f.points[3];
  }

  public float dotProduct(Vector4f paramVector4f)
  {
    return this.points[0] * paramVector4f.points[0] + this.points[1] * paramVector4f.points[1] + this.points[2] * paramVector4f.points[2] + this.points[3] * paramVector4f.points[3];
  }

  public float getW()
  {
    return this.points[3];
  }

  public float getX()
  {
    return this.points[0];
  }

  public float getY()
  {
    return this.points[1];
  }

  public float getZ()
  {
    return this.points[2];
  }

  public void lerp(Vector4f paramVector4f1, Vector4f paramVector4f2, float paramFloat)
  {
    paramVector4f2.points[0] = (this.points[0] * (1.0F * paramFloat) + paramVector4f1.points[0] * paramFloat);
    paramVector4f2.points[1] = (this.points[1] * (1.0F * paramFloat) + paramVector4f1.points[1] * paramFloat);
    paramVector4f2.points[2] = (this.points[2] * (1.0F * paramFloat) + paramVector4f1.points[2] * paramFloat);
    paramVector4f2.points[3] = (this.points[3] * (1.0F * paramFloat) + paramVector4f1.points[3] * paramFloat);
  }

  public void multiplyByScalar(float paramFloat)
  {
    float[] arrayOfFloat = this.points;
    arrayOfFloat[0] *= paramFloat;
    arrayOfFloat = this.points;
    arrayOfFloat[1] *= paramFloat;
    arrayOfFloat = this.points;
    arrayOfFloat[2] *= paramFloat;
    arrayOfFloat = this.points;
    arrayOfFloat[3] *= paramFloat;
  }

  public void normalize()
  {
    AppMethodBeat.i(81745);
    if (this.points[3] == 0.0F)
      AppMethodBeat.o(81745);
    while (true)
    {
      return;
      float[] arrayOfFloat = this.points;
      arrayOfFloat[0] /= this.points[3];
      arrayOfFloat = this.points;
      arrayOfFloat[1] /= this.points[3];
      arrayOfFloat = this.points;
      arrayOfFloat[2] /= this.points[3];
      double d = Math.sqrt(this.points[0] * this.points[0] + this.points[1] * this.points[1] + this.points[2] * this.points[2]);
      this.points[0] = ((float)(this.points[0] / d));
      this.points[1] = ((float)(this.points[1] / d));
      this.points[2] = ((float)(this.points[2] / d));
      AppMethodBeat.o(81745);
    }
  }

  public void setW(float paramFloat)
  {
    this.points[3] = paramFloat;
  }

  public void setX(float paramFloat)
  {
    this.points[0] = paramFloat;
  }

  public void setXYZW(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.points[0] = paramFloat1;
    this.points[1] = paramFloat2;
    this.points[2] = paramFloat3;
    this.points[3] = paramFloat4;
  }

  public void setY(float paramFloat)
  {
    this.points[1] = paramFloat;
  }

  public void setZ(float paramFloat)
  {
    this.points[2] = paramFloat;
  }

  public void subdivide(Vector4f paramVector4f)
  {
    float[] arrayOfFloat = this.points;
    arrayOfFloat[0] /= paramVector4f.points[0];
    arrayOfFloat = this.points;
    arrayOfFloat[1] /= paramVector4f.points[1];
    arrayOfFloat = this.points;
    arrayOfFloat[2] /= paramVector4f.points[2];
    arrayOfFloat = this.points;
    arrayOfFloat[3] /= paramVector4f.points[3];
  }

  public void subtract(Vector4f paramVector4f)
  {
    float[] arrayOfFloat = this.points;
    arrayOfFloat[0] -= paramVector4f.points[0];
    arrayOfFloat = this.points;
    arrayOfFloat[1] -= paramVector4f.points[1];
    arrayOfFloat = this.points;
    arrayOfFloat[2] -= paramVector4f.points[2];
    arrayOfFloat = this.points;
    arrayOfFloat[3] -= paramVector4f.points[3];
  }

  public void subtract(Vector4f paramVector4f1, Vector4f paramVector4f2)
  {
    AppMethodBeat.i(81744);
    paramVector4f2.setXYZW(this.points[0] - paramVector4f1.points[0], this.points[1] - paramVector4f1.points[1], this.points[2] - paramVector4f1.points[2], this.points[3] - paramVector4f1.points[3]);
    AppMethodBeat.o(81744);
  }

  public String toString()
  {
    AppMethodBeat.i(81747);
    String str = "X:" + this.points[0] + " Y:" + this.points[1] + " Z:" + this.points[2] + " W:" + this.points[3];
    AppMethodBeat.o(81747);
    return str;
  }

  public float w()
  {
    return this.points[3];
  }

  public void w(float paramFloat)
  {
    this.points[3] = paramFloat;
  }

  public float x()
  {
    return this.points[0];
  }

  public void x(float paramFloat)
  {
    this.points[0] = paramFloat;
  }

  public float y()
  {
    return this.points[1];
  }

  public void y(float paramFloat)
  {
    this.points[1] = paramFloat;
  }

  public float z()
  {
    return this.points[2];
  }

  public void z(float paramFloat)
  {
    this.points[2] = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.ar.sensor.representation.Vector4f
 * JD-Core Version:    0.6.2
 */