package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DefaultDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import org.json.JSONArray;

public final class m
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103218);
    paramCanvas.restore();
    paramd.restore();
    AppMethodBeat.o(103218);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103219);
    boolean bool = a(paramd, paramCanvas);
    AppMethodBeat.o(103219);
    return bool;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103217);
    boolean bool = a(paramd, paramCanvas);
    AppMethodBeat.o(103217);
    return bool;
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103216);
    DefaultDrawActionArg localDefaultDrawActionArg = new DefaultDrawActionArg();
    AppMethodBeat.o(103216);
    return localDefaultDrawActionArg;
  }

  public final String getMethod()
  {
    return "restore";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.m
 * JD-Core Version:    0.6.2
 */