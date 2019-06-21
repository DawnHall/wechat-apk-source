package com.eclipsesource.v8.utils.typedarrays;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class UInt8ClampedArray extends TypedArray
{
  public UInt8ClampedArray(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
    AppMethodBeat.i(75080);
    AppMethodBeat.o(75080);
  }

  public UInt8ClampedArray(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }

  public short get(int paramInt)
  {
    AppMethodBeat.i(75081);
    short s = (short)(this.buffer.get(paramInt) & 0xFF);
    AppMethodBeat.o(75081);
    return s;
  }

  public int getType()
  {
    return 12;
  }

  public int length()
  {
    AppMethodBeat.i(75082);
    int i = this.buffer.limit();
    AppMethodBeat.o(75082);
    return i;
  }

  public void put(int paramInt, short paramShort)
  {
    AppMethodBeat.i(75083);
    if (paramShort > 255)
    {
      this.buffer.put(paramInt, (byte)-1);
      AppMethodBeat.o(75083);
    }
    while (true)
    {
      return;
      if (paramShort < 0)
      {
        this.buffer.put(paramInt, (byte)0);
        AppMethodBeat.o(75083);
      }
      else
      {
        this.buffer.put(paramInt, (byte)paramShort);
        AppMethodBeat.o(75083);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.typedarrays.UInt8ClampedArray
 * JD-Core Version:    0.6.2
 */