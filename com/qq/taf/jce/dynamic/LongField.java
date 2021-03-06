package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class LongField extends NumberField
{
  private long data;

  LongField(long paramLong, int paramInt)
  {
    super(paramInt);
    this.data = paramLong;
  }

  public long get()
  {
    return this.data;
  }

  public Number getNumber()
  {
    AppMethodBeat.i(117014);
    long l = this.data;
    AppMethodBeat.o(117014);
    return Long.valueOf(l);
  }

  public void set(long paramLong)
  {
    this.data = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.LongField
 * JD-Core Version:    0.6.2
 */