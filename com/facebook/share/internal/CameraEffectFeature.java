package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum CameraEffectFeature
  implements DialogFeature
{
  private int minVersion;

  static
  {
    AppMethodBeat.i(96943);
    SHARE_CAMERA_EFFECT = new CameraEffectFeature("SHARE_CAMERA_EFFECT", 0, 20170417);
    $VALUES = new CameraEffectFeature[] { SHARE_CAMERA_EFFECT };
    AppMethodBeat.o(96943);
  }

  private CameraEffectFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final String getAction()
  {
    return "com.facebook.platform.action.request.CAMERA_EFFECT";
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.CameraEffectFeature
 * JD-Core Version:    0.6.2
 */