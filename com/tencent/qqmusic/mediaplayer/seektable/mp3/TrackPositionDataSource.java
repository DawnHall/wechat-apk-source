package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

class TrackPositionDataSource
{
  private final IDataSource mDataSource;
  private long mPosition = 0L;

  TrackPositionDataSource(IDataSource paramIDataSource)
  {
    this.mDataSource = paramIDataSource;
  }

  public long getCurPosition()
  {
    return this.mPosition;
  }

  public long getSize()
  {
    AppMethodBeat.i(128506);
    long l = this.mDataSource.getSize();
    AppMethodBeat.o(128506);
    return l;
  }

  public int read(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(128504);
    paramInt = this.mDataSource.readAt(this.mPosition, paramArrayOfByte, 0, paramInt);
    this.mPosition += paramInt;
    AppMethodBeat.o(128504);
    return paramInt;
  }

  public long seek(long paramLong)
  {
    AppMethodBeat.i(128505);
    if (paramLong < this.mDataSource.getSize())
      this.mPosition = paramLong;
    while (true)
    {
      AppMethodBeat.o(128505);
      return paramLong;
      paramLong = -1L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource
 * JD-Core Version:    0.6.2
 */