package com.tencent.youtu.ytagreflectlivecheck.controller;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ReflectController$3
  implements Camera.PreviewCallback
{
  ReflectController$3(ReflectController paramReflectController)
  {
  }

  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(123154);
    ReflectController.access$1300(this.this$0, paramArrayOfByte, paramCamera);
    AppMethodBeat.o(123154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.controller.ReflectController.3
 * JD-Core Version:    0.6.2
 */