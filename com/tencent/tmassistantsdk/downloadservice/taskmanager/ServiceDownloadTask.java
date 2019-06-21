package com.tencent.tmassistantsdk.downloadservice.taskmanager;

public class ServiceDownloadTask
{
  public String mClientKey = null;
  public long mProgressUpdateTimestamp = 0L;
  public long mReceivedBytes = 0L;
  public int mState = 0;
  public long mTotalBytes = 0L;
  public String mUrl = null;

  public ServiceDownloadTask(String paramString1, String paramString2)
  {
    this.mClientKey = paramString1;
    this.mUrl = paramString2;
  }

  public boolean checkIsNeedUpdateProgress(long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool = true;
    if (paramLong1 == paramLong2)
    {
      this.mReceivedBytes = paramLong1;
      this.mTotalBytes = paramLong2;
      this.mProgressUpdateTimestamp = paramLong3;
    }
    while (true)
    {
      return bool;
      if ((paramLong3 - this.mProgressUpdateTimestamp >= 1000L) && (paramLong1 != this.mReceivedBytes))
      {
        this.mReceivedBytes = paramLong1;
        this.mTotalBytes = paramLong2;
        this.mProgressUpdateTimestamp = paramLong3;
      }
      else if ((paramLong2 > 0L) && (((float)paramLong1 * 1.0F - (float)this.mReceivedBytes * 1.0F) / (float)paramLong2 * 1.0F > 0.009999999776482582D))
      {
        this.mReceivedBytes = paramLong1;
        this.mTotalBytes = paramLong2;
        this.mProgressUpdateTimestamp = paramLong3;
      }
      else
      {
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask
 * JD-Core Version:    0.6.2
 */