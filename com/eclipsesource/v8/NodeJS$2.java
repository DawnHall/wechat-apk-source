package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

class NodeJS$2
  implements JavaCallback
{
  NodeJS$2(NodeJS paramNodeJS, File paramFile)
  {
  }

  public Object invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(74992);
    paramV8Object = new V8Array(NodeJS.access$100(this.this$0));
    try
    {
      paramV8Object.push(this.val$file.getAbsolutePath());
      paramV8Array = NodeJS.access$200(this.this$0).call(null, paramV8Object);
      return paramV8Array;
    }
    finally
    {
      paramV8Object.release();
      AppMethodBeat.o(74992);
    }
    throw paramV8Array;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.NodeJS.2
 * JD-Core Version:    0.6.2
 */