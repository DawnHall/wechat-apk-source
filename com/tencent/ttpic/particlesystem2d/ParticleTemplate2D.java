package com.tencent.ttpic.particlesystem2d;

public class ParticleTemplate2D
{
  double mEmitRate;
  String mIdx = "0";
  String mLife = "0";
  int mMaxCount;
  String mP0 = "0";
  String mP1 = "0";
  String mP2 = "0";
  String mPosX = "0";
  String mPosY = "0";
  String mRotate = "0";
  String mScale = "0";

  ParticleTemplate2D(int paramInt, double paramDouble, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.mMaxCount = paramInt;
    this.mEmitRate = paramDouble;
    this.mLife = paramString1;
    this.mPosX = paramString2;
    this.mPosY = paramString3;
    this.mScale = paramString4;
    this.mRotate = paramString5;
    this.mP0 = paramString6;
    this.mP1 = paramString7;
    this.mP2 = paramString8;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.particlesystem2d.ParticleTemplate2D
 * JD-Core Version:    0.6.2
 */