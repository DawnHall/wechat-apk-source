package com.tencent.youtu.ytposedetect;

public abstract interface YTPoseDetectInterface$PoseDetectResult
{
  public static final int ERROR_AUTH_FAILED = 1;
  public static final int ERROR_NOT_INIT_MODEL = 2;
  public static final int SUCCESS = 0;

  public abstract void onFailed(int paramInt, String paramString1, String paramString2);

  public abstract void onSuccess();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult
 * JD-Core Version:    0.6.2
 */