package com.tencent.qqmusic.mediaplayer.perf;

import android.net.Uri;

public abstract interface PlayerInfoCollector
{
  public abstract void putBoolean(String paramString, boolean paramBoolean);

  public abstract void putInt(String paramString, int paramInt);

  public abstract void putLong(String paramString, long paramLong);

  public abstract void putString(String paramString1, String paramString2);

  public abstract void putUri(String paramString, Uri paramUri);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
 * JD-Core Version:    0.6.2
 */