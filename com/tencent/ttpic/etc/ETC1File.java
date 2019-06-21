package com.tencent.ttpic.etc;

import android.opengl.ETC1Util.ETC1Texture;

public class ETC1File
{
  private String name;
  private ETC1Util.ETC1Texture texutre;

  public ETC1File(String paramString, ETC1Util.ETC1Texture paramETC1Texture)
  {
    this.name = paramString;
    this.texutre = paramETC1Texture;
  }

  public String getName()
  {
    return this.name;
  }

  public ETC1Util.ETC1Texture getTexutre()
  {
    return this.texutre;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void setTexutre(ETC1Util.ETC1Texture paramETC1Texture)
  {
    this.texutre = paramETC1Texture;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.etc.ETC1File
 * JD-Core Version:    0.6.2
 */