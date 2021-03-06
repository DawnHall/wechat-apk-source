package com.tencent.youtu.ytagreflectlivecheck;

import com.tencent.youtu.ytagreflectlivecheck.requester.LightDiffResponse;

public abstract interface YTAGReflectLiveCheckInterface$LightLiveCheckResult
{
  public static final int AUTH_FAILED = 1;
  public static final int FINISH_ERRORBASE = 300;
  public static final int INIT_ERRORBASE = 100;
  public static final int NOT_INIT_MODEL = 2;
  public static final int REFLECT_ERRORBASE = 200;
  public static final int SUCCESS = 0;
  public static final int USER_CANCEL = 3;

  public abstract void onFailed(int paramInt, String paramString1, String paramString2);

  public abstract void onSuccess(boolean paramBoolean, LightDiffResponse paramLightDiffResponse);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
 * JD-Core Version:    0.6.2
 */