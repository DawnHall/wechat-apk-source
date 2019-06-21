package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import java.nio.charset.Charset;
import java.util.Arrays;

public abstract class Box
  implements IMpeg4Box
{
  private long largeSize;
  private int size;
  private byte[] type;
  private byte[] userType;

  public final long getSize()
  {
    if (this.largeSize != 0L);
    for (long l = this.largeSize; ; l = this.size)
      return l;
  }

  public final String getType()
  {
    return new String(this.type, Charset.defaultCharset());
  }

  public void parse(Parsable paramParsable, Box paramBox)
  {
    if (paramBox == null)
    {
      this.size = paramParsable.readInt();
      this.type = new byte[4];
      paramParsable.readBytes(this.type, 0, this.type.length);
      if (this.size == 1)
      {
        this.largeSize = paramParsable.readLong();
        if (this.largeSize == 0L)
          throw new InvalidBoxException("invalid [" + getType() + "]: largeSize is 0!");
      }
      else
      {
        if (this.size != 0)
          break label153;
        this.largeSize = paramParsable.available();
      }
    }
    while (true)
    {
      if (Arrays.equals(this.type, "uuid".getBytes()))
      {
        this.userType = new byte[16];
        paramParsable.readBytes(this.userType, 0, this.userType.length);
      }
      while (true)
      {
        return;
        label153: if (this.size >= 8)
          break;
        throw new InvalidBoxException("invalid [" + getType() + "]: size is less than 8!");
        this.size = paramBox.size;
        this.type = paramBox.type;
        this.largeSize = paramBox.largeSize;
        this.userType = paramBox.userType;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box
 * JD-Core Version:    0.6.2
 */