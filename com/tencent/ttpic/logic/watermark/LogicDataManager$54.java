package com.tencent.ttpic.logic.watermark;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LogicDataManager$54
  implements LogicDataManager.LogicValueProvider
{
  LogicDataManager$54(LogicDataManager paramLogicDataManager)
  {
  }

  public String getValue()
  {
    AppMethodBeat.i(83321);
    String str;
    if ((!TextUtils.isEmpty(LogicDataManager.access$3900(this.this$0))) && (LogicDataManager.access$3900(this.this$0).length() > 3))
    {
      str = LogicDataManager.access$3900(this.this$0).substring(3, 4);
      AppMethodBeat.o(83321);
    }
    while (true)
    {
      return str;
      str = LogicDataManager.access$300(this.this$0, 3);
      AppMethodBeat.o(83321);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.logic.watermark.LogicDataManager.54
 * JD-Core Version:    0.6.2
 */