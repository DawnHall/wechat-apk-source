package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OpenGraphJSONUtility
{
  private static JSONArray toJSONArray(List paramList, PhotoJSONProcessor paramPhotoJSONProcessor)
  {
    AppMethodBeat.i(97164);
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext())
      localJSONArray.put(toJSONValue(paramList.next(), paramPhotoJSONProcessor));
    AppMethodBeat.o(97164);
    return localJSONArray;
  }

  public static JSONObject toJSONObject(ShareOpenGraphAction paramShareOpenGraphAction, PhotoJSONProcessor paramPhotoJSONProcessor)
  {
    AppMethodBeat.i(97162);
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramShareOpenGraphAction.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, toJSONValue(paramShareOpenGraphAction.get(str), paramPhotoJSONProcessor));
    }
    AppMethodBeat.o(97162);
    return localJSONObject;
  }

  private static JSONObject toJSONObject(ShareOpenGraphObject paramShareOpenGraphObject, PhotoJSONProcessor paramPhotoJSONProcessor)
  {
    AppMethodBeat.i(97163);
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramShareOpenGraphObject.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, toJSONValue(paramShareOpenGraphObject.get(str), paramPhotoJSONProcessor));
    }
    AppMethodBeat.o(97163);
    return localJSONObject;
  }

  public static Object toJSONValue(Object paramObject, PhotoJSONProcessor paramPhotoJSONProcessor)
  {
    AppMethodBeat.i(97165);
    if (paramObject == null)
    {
      paramObject = JSONObject.NULL;
      AppMethodBeat.o(97165);
    }
    while (true)
    {
      return paramObject;
      if (((paramObject instanceof String)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Double)) || ((paramObject instanceof Float)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)))
      {
        AppMethodBeat.o(97165);
      }
      else if ((paramObject instanceof SharePhoto))
      {
        if (paramPhotoJSONProcessor != null)
        {
          paramObject = paramPhotoJSONProcessor.toJSONObject((SharePhoto)paramObject);
          AppMethodBeat.o(97165);
        }
        else
        {
          paramObject = null;
          AppMethodBeat.o(97165);
        }
      }
      else if ((paramObject instanceof ShareOpenGraphObject))
      {
        paramObject = toJSONObject((ShareOpenGraphObject)paramObject, paramPhotoJSONProcessor);
        AppMethodBeat.o(97165);
      }
      else
      {
        if (!(paramObject instanceof List))
          break;
        paramObject = toJSONArray((List)paramObject, paramPhotoJSONProcessor);
        AppMethodBeat.o(97165);
      }
    }
    paramObject = new IllegalArgumentException("Invalid object found for JSON serialization: " + paramObject.toString());
    AppMethodBeat.o(97165);
    throw paramObject;
  }

  public static abstract interface PhotoJSONProcessor
  {
    public abstract JSONObject toJSONObject(SharePhoto paramSharePhoto);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.OpenGraphJSONUtility
 * JD-Core Version:    0.6.2
 */