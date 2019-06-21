package com.tencent.tmassistantsdk.util;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;

public class Res
{
  private static final String TAG = "Res";
  protected final String RclassName;
  protected Context ctx;

  public Res(Context paramContext)
  {
    AppMethodBeat.i(76281);
    this.ctx = paramContext;
    this.RclassName = (this.ctx.getPackageName() + ".R");
    AppMethodBeat.o(76281);
  }

  private int reflectResouce(String paramString1, String paramString2)
  {
    int i = -1;
    AppMethodBeat.i(76282);
    if ((this.RclassName == null) || (paramString1 == null) || (paramString2 == null))
    {
      AppMethodBeat.o(76282);
      i = 0;
    }
    while (true)
    {
      return i;
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString1 = Class.forName(this.RclassName + "$" + paramString1);
        int j = bo.getInt(paramString1.getField(paramString2).get(paramString1.newInstance()).toString(), -1);
        i = j;
        AppMethodBeat.o(76282);
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("Res", paramString1, "", new Object[0]);
        AppMethodBeat.o(76282);
      }
    }
  }

  public int drawable(String paramString)
  {
    AppMethodBeat.i(76284);
    int i = reflectResouce("drawable", paramString);
    AppMethodBeat.o(76284);
    return i;
  }

  public int id(String paramString)
  {
    AppMethodBeat.i(76286);
    int i = reflectResouce("id", paramString);
    AppMethodBeat.o(76286);
    return i;
  }

  public int layout(String paramString)
  {
    AppMethodBeat.i(76285);
    int i = reflectResouce("layout", paramString);
    AppMethodBeat.o(76285);
    return i;
  }

  public int string(String paramString)
  {
    AppMethodBeat.i(76283);
    int i = reflectResouce("string", paramString);
    AppMethodBeat.o(76283);
    return i;
  }

  public int style(String paramString)
  {
    AppMethodBeat.i(76287);
    int i = reflectResouce("style", paramString);
    AppMethodBeat.o(76287);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.Res
 * JD-Core Version:    0.6.2
 */