package com.tencent.ttpic.particlesystem2d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.Transition;
import java.util.ArrayList;
import java.util.List;

public class ParticleSystem2D
{
  private static final String TAG;
  private List<ParticleTemplate2D> mClouds;
  final Context mContext;
  private long mNativeCtx;

  static
  {
    AppMethodBeat.i(83659);
    try
    {
      System.loadLibrary("ParticleSystem");
      TAG = ParticleSystem2D.class.getSimpleName();
      AppMethodBeat.o(83659);
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
        LogUtils.e(localUnsatisfiedLinkError);
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        LogUtils.e(localRuntimeException);
    }
    catch (Exception localException)
    {
      while (true)
        LogUtils.e(localException);
    }
  }

  public ParticleSystem2D(Context paramContext)
  {
    AppMethodBeat.i(83651);
    this.mClouds = new ArrayList();
    this.mContext = paramContext;
    this.mNativeCtx = nativeInit();
    AppMethodBeat.o(83651);
  }

  private void loadFinish()
  {
    AppMethodBeat.i(83652);
    for (int i = 0; i < this.mClouds.size(); i++)
      this.mClouds.get(i);
    nativeRegisterTemplate(this.mNativeCtx, this.mClouds.toArray());
    AppMethodBeat.o(83652);
  }

  public static native int nativeAdvance(long paramLong, Object[] paramArrayOfObject, int paramInt);

  public static native int nativeClearParticles(long paramLong, int paramInt);

  public static native long nativeEmitAt(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3);

  public static native long nativeInit();

  public static native void nativeRegisterTemplate(long paramLong, Object[] paramArrayOfObject);

  public static native void nativeRelease(long paramLong);

  public static native int nativeReset(long paramLong);

  public int advance(ParticleItem[] paramArrayOfParticleItem, int paramInt)
  {
    AppMethodBeat.i(83654);
    int i = paramArrayOfParticleItem.length;
    for (int j = 0; j < i; j++)
    {
      Particle[] arrayOfParticle = paramArrayOfParticleItem[j].particles;
      int k = arrayOfParticle.length;
      for (int m = 0; m < k; m++)
        arrayOfParticle[m].alive = false;
    }
    paramInt = nativeAdvance(this.mNativeCtx, paramArrayOfParticleItem, paramInt);
    AppMethodBeat.o(83654);
    return paramInt;
  }

  public int clearParticles(int paramInt)
  {
    AppMethodBeat.i(83655);
    paramInt = nativeClearParticles(this.mNativeCtx, paramInt);
    AppMethodBeat.o(83655);
    return paramInt;
  }

  public void createParticles(List<StickerItem> paramList)
  {
    AppMethodBeat.i(83653);
    if (paramList != null)
    {
      for (int i = 0; i < paramList.size(); i++)
      {
        Object localObject = ((StickerItem)paramList.get(i)).transition;
        if (localObject != null)
        {
          localObject = new ParticleTemplate2D(((Transition)localObject).particleCountMax, ((Transition)localObject).emissionRate, ((Transition)localObject).life, ((Transition)localObject).positionX, ((Transition)localObject).positionY, ((Transition)localObject).scale, ((Transition)localObject).rotate, ((Transition)localObject).p0, ((Transition)localObject).p1, ((Transition)localObject).p2);
          this.mClouds.add(localObject);
        }
      }
      loadFinish();
    }
    AppMethodBeat.o(83653);
  }

  public long emitImmediately(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(83658);
    long l = nativeEmitAt(this.mNativeCtx, paramFloat1, paramFloat2, paramFloat3);
    AppMethodBeat.o(83658);
    return l;
  }

  public void release()
  {
    AppMethodBeat.i(83657);
    if (this.mNativeCtx != -1L)
    {
      nativeRelease(this.mNativeCtx);
      this.mNativeCtx = -1L;
    }
    AppMethodBeat.o(83657);
  }

  public int reset()
  {
    AppMethodBeat.i(83656);
    int i = nativeReset(this.mNativeCtx);
    AppMethodBeat.o(83656);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.particlesystem2d.ParticleSystem2D
 * JD-Core Version:    0.6.2
 */