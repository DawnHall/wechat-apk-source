package com.tencent.mm.plugin.facedetect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class FaceDetectUI$2
  implements Runnable
{
  FaceDetectUI$2(FaceDetectUI paramFaceDetectUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(459);
    long l = bo.yz();
    Runtime.getRuntime().gc();
    ab.i("MicroMsg.FaceDetectUI", "hy: gc uses: %d ms", new Object[] { Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.2
 * JD-Core Version:    0.6.2
 */