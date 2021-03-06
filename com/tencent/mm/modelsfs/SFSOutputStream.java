package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.OutputStream;

public class SFSOutputStream extends OutputStream
{
  private StackTraceElement[] fOm;
  private long mNativePtr;

  public SFSOutputStream(long paramLong)
  {
    AppMethodBeat.i(93263);
    this.mNativePtr = paramLong;
    this.fOm = Thread.currentThread().getStackTrace();
    AppMethodBeat.o(93263);
  }

  private static native int nativeClose(long paramLong);

  private static native int nativeWrite(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public void close()
  {
    AppMethodBeat.i(93264);
    if (this.mNativePtr == 0L)
      AppMethodBeat.o(93264);
    while (true)
    {
      return;
      if (nativeClose(this.mNativePtr) == -1)
      {
        IOException localIOException = new IOException(SFSContext.nativeErrorMessage());
        AppMethodBeat.o(93264);
        throw localIOException;
      }
      this.mNativePtr = 0L;
      AppMethodBeat.o(93264);
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(93267);
    if (this.mNativePtr != 0L)
    {
      StringBuilder localStringBuilder = new StringBuilder("SFSOutputStream leaked:\n");
      StackTraceElement[] arrayOfStackTraceElement = this.fOm;
      int i = arrayOfStackTraceElement.length;
      for (int j = 0; j < i; j++)
        localStringBuilder.append(arrayOfStackTraceElement[j].toString()).append('\n');
      ab.e("MicroMsg.SFSOutputStream", localStringBuilder.toString());
      close();
    }
    super.finalize();
    AppMethodBeat.o(93267);
  }

  public void write(int paramInt)
  {
    AppMethodBeat.i(93265);
    IOException localIOException;
    if (this.mNativePtr == 0L)
    {
      localIOException = new IOException("Stream already closed.");
      AppMethodBeat.o(93265);
      throw localIOException;
    }
    int i = (byte)paramInt;
    if (nativeWrite(this.mNativePtr, new byte[] { i }, 0, 1) != 1)
    {
      localIOException = new IOException(SFSContext.nativeErrorMessage());
      AppMethodBeat.o(93265);
      throw localIOException;
    }
    AppMethodBeat.o(93265);
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93266);
    if (this.mNativePtr == 0L)
    {
      paramArrayOfByte = new IOException("Stream already closed.");
      AppMethodBeat.o(93266);
      throw paramArrayOfByte;
    }
    if (((paramInt1 | paramInt2) < 0) || (paramInt1 > paramArrayOfByte.length) || (paramArrayOfByte.length - paramInt1 < paramInt2))
    {
      paramArrayOfByte = new ArrayIndexOutOfBoundsException("length = " + paramArrayOfByte.length + "offset = " + paramInt1 + "count = " + paramInt2);
      AppMethodBeat.o(93266);
      throw paramArrayOfByte;
    }
    if (nativeWrite(this.mNativePtr, paramArrayOfByte, paramInt1, paramInt2) != paramInt2)
    {
      paramArrayOfByte = new IOException(SFSContext.nativeErrorMessage());
      AppMethodBeat.o(93266);
      throw paramArrayOfByte;
    }
    AppMethodBeat.o(93266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.SFSOutputStream
 * JD-Core Version:    0.6.2
 */