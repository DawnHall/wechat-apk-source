package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoFilterUtil$RATIO_MODE
{
  public final String value;

  static
  {
    AppMethodBeat.i(83989);
    RATIO_MODE_1_1 = new RATIO_MODE("RATIO_MODE_1_1", 0, "1:1");
    RATIO_MODE_4_3 = new RATIO_MODE("RATIO_MODE_4_3", 1, "4:3");
    RATIO_MODE_16_9 = new RATIO_MODE("RATIO_MODE_16_9", 2, "16:9");
    $VALUES = new RATIO_MODE[] { RATIO_MODE_1_1, RATIO_MODE_4_3, RATIO_MODE_16_9 };
    AppMethodBeat.o(83989);
  }

  private VideoFilterUtil$RATIO_MODE(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoFilterUtil.RATIO_MODE
 * JD-Core Version:    0.6.2
 */