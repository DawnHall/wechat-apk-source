package com.tencent.ttpic.logic.watermark;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map.Entry;

class LogicDataManager$59
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$59(LogicDataManager paramLogicDataManager, Map.Entry paramEntry)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83326);
    String str = (String)this.val$entry.getValue();
    AppMethodBeat.o(83326);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.59
 * JD-Core Version:    0.6.2
 */