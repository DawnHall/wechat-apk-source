package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

class V8Executor$ExecutorTermination
  implements JavaVoidCallback
{
  V8Executor$ExecutorTermination(V8Executor paramV8Executor)
  {
  }

  public void invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(75084);
    if (V8Executor.access$000(this.this$0))
    {
      paramV8Object = new RuntimeException("V8Thread Termination");
      AppMethodBeat.o(75084);
      throw paramV8Object;
    }
    AppMethodBeat.o(75084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.V8Executor.ExecutorTermination
 * JD-Core Version:    0.6.2
 */