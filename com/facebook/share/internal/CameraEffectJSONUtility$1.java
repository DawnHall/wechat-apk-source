package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class CameraEffectJSONUtility$1
  implements CameraEffectJSONUtility.Setter
{
  public final void setOnArgumentsBuilder(CameraEffectArguments.Builder paramBuilder, String paramString, Object paramObject)
  {
    AppMethodBeat.i(96944);
    paramBuilder.putArgument(paramString, (String)paramObject);
    AppMethodBeat.o(96944);
  }

  public final void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(96945);
    paramJSONObject.put(paramString, paramObject);
    AppMethodBeat.o(96945);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility.1
 * JD-Core Version:    0.6.2
 */