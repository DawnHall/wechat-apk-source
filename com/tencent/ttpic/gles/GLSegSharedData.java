package com.tencent.ttpic.gles;

import android.opengl.EGLContext;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GLSegSharedData
{
  public EGLContext mSharedContext;
  public SegmentDataPipe[] mTexturePile;

  public GLSegSharedData(EGLContext paramEGLContext)
  {
    AppMethodBeat.i(83229);
    this.mSharedContext = paramEGLContext;
    this.mTexturePile = new SegmentDataPipe[2];
    this.mTexturePile[0] = new SegmentDataPipe();
    this.mTexturePile[1] = new SegmentDataPipe();
    AppMethodBeat.o(83229);
  }

  public void clear()
  {
    AppMethodBeat.i(83233);
    SegmentDataPipe[] arrayOfSegmentDataPipe = this.mTexturePile;
    int i = arrayOfSegmentDataPipe.length;
    for (int j = 0; j < i; j++)
      arrayOfSegmentDataPipe[j].release();
    AppMethodBeat.o(83233);
  }

  public SegmentDataPipe getCurrentTexturePile()
  {
    AppMethodBeat.i(83230);
    int i;
    int j;
    label35: SegmentDataPipe localSegmentDataPipe;
    if (this.mTexturePile[0].getTexureCurrentStatus() == 2)
    {
      i = 1;
      if (this.mTexturePile[1].getTexureCurrentStatus() != 2)
        break label84;
      j = 1;
      if ((i == 0) || (j == 0))
        break label99;
      if (this.mTexturePile[0].mTimestamp >= this.mTexturePile[1].mTimestamp)
        break label89;
      localSegmentDataPipe = this.mTexturePile[0];
    }
    while (true)
    {
      AppMethodBeat.o(83230);
      return localSegmentDataPipe;
      i = 0;
      break;
      label84: j = 0;
      break label35;
      label89: localSegmentDataPipe = this.mTexturePile[1];
      continue;
      label99: if (i != 0)
        localSegmentDataPipe = this.mTexturePile[0];
      else if (j != 0)
        localSegmentDataPipe = this.mTexturePile[1];
      else
        localSegmentDataPipe = null;
    }
  }

  public SegmentDataPipe getFreeTexturePileMakeBusy()
  {
    AppMethodBeat.i(83231);
    int i = 0;
    SegmentDataPipe localSegmentDataPipe;
    if (i < this.mTexturePile.length)
      if (this.mTexturePile[i].getTexureCurrentStatus() == 0)
      {
        localSegmentDataPipe = this.mTexturePile[i];
        localSegmentDataPipe.makeBusy();
      }
    while (true)
    {
      AppMethodBeat.o(83231);
      return localSegmentDataPipe;
      i++;
      break;
      localSegmentDataPipe = null;
    }
  }

  public boolean judgeBrotherTextureIsReady(SegmentDataPipe paramSegmentDataPipe)
  {
    AppMethodBeat.i(83232);
    SegmentDataPipe localSegmentDataPipe = this.mTexturePile[0];
    if (this.mTexturePile[0] == paramSegmentDataPipe)
      localSegmentDataPipe = this.mTexturePile[1];
    if (localSegmentDataPipe.getTexureCurrentStatus() == 2)
      AppMethodBeat.o(83232);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(83232);
    }
  }

  public void makeBrotherTextureFree(SegmentDataPipe paramSegmentDataPipe)
  {
    AppMethodBeat.i(83235);
    SegmentDataPipe localSegmentDataPipe = this.mTexturePile[0];
    if (this.mTexturePile[0] == paramSegmentDataPipe)
      localSegmentDataPipe = this.mTexturePile[1];
    localSegmentDataPipe.makeFree();
    AppMethodBeat.o(83235);
  }

  public void reset()
  {
    AppMethodBeat.i(83234);
    SegmentDataPipe[] arrayOfSegmentDataPipe = this.mTexturePile;
    int i = arrayOfSegmentDataPipe.length;
    for (int j = 0; j < i; j++)
      arrayOfSegmentDataPipe[j].makeFree();
    AppMethodBeat.o(83234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.gles.GLSegSharedData
 * JD-Core Version:    0.6.2
 */