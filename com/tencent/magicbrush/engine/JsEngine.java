package com.tencent.magicbrush.engine;

import com.tencent.magicbrush.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

class JsEngine
{
  static
  {
    AppMethodBeat.i(115881);
    b.yB();
    AppMethodBeat.o(115881);
  }

  static native void addJsInterface(long paramLong, Object paramObject, String paramString);

  static native long createVM(String paramString, byte[] paramArrayOfByte);

  static native long createVMContext(long paramLong, int paramInt);

  static native String evaluateJavascript(long paramLong, String paramString);

  static native String evaluateJavascriptCache(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4);

  static native String evaluateJavascriptDebug(long paramLong, String paramString1, String paramString2);

  static native String evaluateJavascriptFile(long paramLong, String paramString1, String paramString2);

  static native ByteBuffer getNativeBuffer(int paramInt, long paramLong);

  static native int getNativeBufferId();

  static native void pumpMessageLoop(long paramLong);

  static native boolean pushObject(long paramLong1, long paramLong2, String paramString);

  static native void releaseVM(long paramLong);

  static native void releaseVMContext(long paramLong);

  static native boolean removeJsInterface(long paramLong, String paramString);

  static native boolean removeObject(long paramLong, String paramString);

  static native void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer);

  static native void waitForDebuger(long paramLong, String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.engine.JsEngine
 * JD-Core Version:    0.6.2
 */