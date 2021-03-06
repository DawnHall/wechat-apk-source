package com.tencent.qqmusic.mediaplayer.upstream;

public abstract interface Loader
{
  public abstract void cancelLoading();

  public abstract long getUpstreamSize();

  public abstract boolean isLoading();

  public abstract void prepare();

  public abstract void shutdown();

  public abstract void startLoading(Chunk paramChunk);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.Loader
 * JD-Core Version:    0.6.2
 */