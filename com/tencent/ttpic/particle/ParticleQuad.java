package com.tencent.ttpic.particle;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class ParticleQuad
{
  public TexturedColoredVertex bl;
  public TexturedColoredVertex br;
  public TexturedColoredVertex tl;
  public TexturedColoredVertex tr;

  public ParticleQuad()
  {
    AppMethodBeat.i(83632);
    this.bl = new TexturedColoredVertex();
    this.br = new TexturedColoredVertex();
    this.tl = new TexturedColoredVertex();
    this.tr = new TexturedColoredVertex();
    AppMethodBeat.o(83632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.particle.ParticleQuad
 * JD-Core Version:    0.6.2
 */