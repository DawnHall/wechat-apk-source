package com.tencent.mm.plugin.zero.tasks;

import com.tencent.mars.xlog.Xlog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.MMProtocalJni;

class LoadProtocolJNITask$2
  implements Runnable
{
  LoadProtocolJNITask$2(LoadProtocolJNITask paramLoadProtocolJNITask)
  {
  }

  public void run()
  {
    AppMethodBeat.i(58782);
    MMProtocalJni.setProtocalJniLogLevel(new Xlog().getLogLevel());
    AppMethodBeat.o(58782);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.tasks.LoadProtocolJNITask.2
 * JD-Core Version:    0.6.2
 */