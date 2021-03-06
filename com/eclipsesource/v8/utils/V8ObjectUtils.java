package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8TypedArray;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.utils.typedarrays.ArrayBuffer;
import com.eclipsesource.v8.utils.typedarrays.Float32Array;
import com.eclipsesource.v8.utils.typedarrays.Float64Array;
import com.eclipsesource.v8.utils.typedarrays.Int16Array;
import com.eclipsesource.v8.utils.typedarrays.Int32Array;
import com.eclipsesource.v8.utils.typedarrays.Int8Array;
import com.eclipsesource.v8.utils.typedarrays.TypedArray;
import com.eclipsesource.v8.utils.typedarrays.UInt16Array;
import com.eclipsesource.v8.utils.typedarrays.UInt32Array;
import com.eclipsesource.v8.utils.typedarrays.UInt8Array;
import com.eclipsesource.v8.utils.typedarrays.UInt8ClampedArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class V8ObjectUtils
{
  private static final TypeAdapter DEFAULT_TYPE_ADAPTER;
  private static final Object IGNORE;

  static
  {
    AppMethodBeat.i(75144);
    IGNORE = new Object();
    DEFAULT_TYPE_ADAPTER = new V8ObjectUtils.DefaultTypeAdapter();
    AppMethodBeat.o(75144);
  }

  public static Object getTypedArray(V8Array paramV8Array, int paramInt)
  {
    AppMethodBeat.i(75113);
    int i = paramV8Array.length();
    if (paramInt == 1)
    {
      paramV8Array = paramV8Array.getIntegers(0, i);
      AppMethodBeat.o(75113);
    }
    while (true)
    {
      return paramV8Array;
      if (paramInt == 2)
      {
        paramV8Array = paramV8Array.getDoubles(0, i);
        AppMethodBeat.o(75113);
      }
      else if (paramInt == 3)
      {
        paramV8Array = paramV8Array.getBooleans(0, i);
        AppMethodBeat.o(75113);
      }
      else
      {
        if (paramInt != 4)
          break;
        paramV8Array = paramV8Array.getStrings(0, i);
        AppMethodBeat.o(75113);
      }
    }
    paramV8Array = new RuntimeException("Unsupported bulk load type: ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(75113);
    throw paramV8Array;
  }

  public static Object getTypedArray(V8Array paramV8Array, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(75112);
    int i = paramV8Array.length();
    Object localObject;
    if (paramInt == 1)
    {
      localObject = (int[])paramObject;
      if (localObject != null)
      {
        paramObject = localObject;
        if (localObject.length >= i);
      }
      else
      {
        paramObject = new int[i];
      }
      paramV8Array.getIntegers(0, i, paramObject);
      AppMethodBeat.o(75112);
      paramV8Array = paramObject;
    }
    while (true)
    {
      return paramV8Array;
      if (paramInt == 2)
      {
        localObject = (double[])paramObject;
        if (localObject != null)
        {
          paramObject = localObject;
          if (localObject.length >= i);
        }
        else
        {
          paramObject = new double[i];
        }
        paramV8Array.getDoubles(0, i, paramObject);
        AppMethodBeat.o(75112);
        paramV8Array = paramObject;
      }
      else if (paramInt == 3)
      {
        localObject = (boolean[])paramObject;
        if (localObject != null)
        {
          paramObject = localObject;
          if (localObject.length >= i);
        }
        else
        {
          paramObject = new boolean[i];
        }
        paramV8Array.getBooleans(0, i, paramObject);
        AppMethodBeat.o(75112);
        paramV8Array = paramObject;
      }
      else if (paramInt == 4)
      {
        localObject = (String[])paramObject;
        if (localObject != null)
        {
          paramObject = localObject;
          if (localObject.length >= i);
        }
        else
        {
          paramObject = new String[i];
        }
        paramV8Array.getStrings(0, i, paramObject);
        AppMethodBeat.o(75112);
        paramV8Array = paramObject;
      }
      else
      {
        if (paramInt != 9)
          break;
        localObject = (byte[])paramObject;
        if (localObject != null)
        {
          paramObject = localObject;
          if (localObject.length >= i);
        }
        else
        {
          paramObject = new byte[i];
        }
        paramV8Array.getBytes(0, i, paramObject);
        AppMethodBeat.o(75112);
        paramV8Array = paramObject;
      }
    }
    paramV8Array = new RuntimeException("Unsupported bulk load type: ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(75112);
    throw paramV8Array;
  }

  public static Object getV8Result(V8 paramV8, Object paramObject)
  {
    AppMethodBeat.i(75118);
    if (paramObject == null)
    {
      paramV8 = null;
      AppMethodBeat.o(75118);
    }
    while (true)
    {
      return paramV8;
      Hashtable localHashtable = new Hashtable();
      try
      {
        paramV8 = getV8Result(paramV8, paramObject, localHashtable);
        if ((paramV8 instanceof V8Object))
        {
          paramV8 = ((V8Object)paramV8).twin();
          paramObject = localHashtable.values().iterator();
          while (paramObject.hasNext())
            ((V8Value)paramObject.next()).release();
          AppMethodBeat.o(75118);
          continue;
        }
        paramObject = localHashtable.values().iterator();
        while (paramObject.hasNext())
          ((V8Value)paramObject.next()).release();
        AppMethodBeat.o(75118);
      }
      finally
      {
        paramObject = localHashtable.values().iterator();
        while (paramObject.hasNext())
          ((V8Value)paramObject.next()).release();
        AppMethodBeat.o(75118);
      }
    }
  }

  private static Object getV8Result(V8 paramV8, Object paramObject, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75136);
    if (paramMap.containsKey(paramObject))
    {
      paramObject = paramMap.get(paramObject);
      AppMethodBeat.o(75136);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof Map))
      {
        paramObject = toV8Object(paramV8, (Map)paramObject, paramMap);
        AppMethodBeat.o(75136);
      }
      else if ((paramObject instanceof List))
      {
        paramObject = toV8Array(paramV8, (List)paramObject, paramMap);
        AppMethodBeat.o(75136);
      }
      else if ((paramObject instanceof TypedArray))
      {
        paramObject = toV8TypedArray(paramV8, (TypedArray)paramObject, paramMap);
        AppMethodBeat.o(75136);
      }
      else if ((paramObject instanceof ArrayBuffer))
      {
        paramObject = toV8ArrayBuffer(paramV8, (ArrayBuffer)paramObject, paramMap);
        AppMethodBeat.o(75136);
      }
      else
      {
        AppMethodBeat.o(75136);
      }
    }
  }

  public static Object getV8Result(V8Context paramV8Context, Object paramObject)
  {
    AppMethodBeat.i(75119);
    if (paramObject == null)
    {
      paramV8Context = null;
      AppMethodBeat.o(75119);
    }
    while (true)
    {
      return paramV8Context;
      Hashtable localHashtable = new Hashtable();
      try
      {
        paramV8Context = getV8Result(paramV8Context, paramObject, localHashtable);
        if ((paramV8Context instanceof V8Object))
        {
          paramV8Context = ((V8Object)paramV8Context).twin();
          paramObject = localHashtable.values().iterator();
          while (paramObject.hasNext())
            ((V8Value)paramObject.next()).release();
          AppMethodBeat.o(75119);
          continue;
        }
        paramObject = localHashtable.values().iterator();
        while (paramObject.hasNext())
          ((V8Value)paramObject.next()).release();
        AppMethodBeat.o(75119);
      }
      finally
      {
        paramObject = localHashtable.values().iterator();
        while (paramObject.hasNext())
          ((V8Value)paramObject.next()).release();
        AppMethodBeat.o(75119);
      }
    }
  }

  private static Object getV8Result(V8Context paramV8Context, Object paramObject, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75137);
    if (paramMap.containsKey(paramObject))
    {
      paramObject = paramMap.get(paramObject);
      AppMethodBeat.o(75137);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof Map))
      {
        paramObject = toV8Object(paramV8Context, (Map)paramObject, paramMap);
        AppMethodBeat.o(75137);
      }
      else if ((paramObject instanceof List))
      {
        paramObject = toV8Array(paramV8Context, (List)paramObject, paramMap);
        AppMethodBeat.o(75137);
      }
      else if ((paramObject instanceof TypedArray))
      {
        paramObject = toV8TypedArray(paramV8Context, (TypedArray)paramObject, paramMap);
        AppMethodBeat.o(75137);
      }
      else if ((paramObject instanceof ArrayBuffer))
      {
        paramObject = toV8ArrayBuffer(paramV8Context, (ArrayBuffer)paramObject, paramMap);
        AppMethodBeat.o(75137);
      }
      else
      {
        AppMethodBeat.o(75137);
      }
    }
  }

  public static Object getValue(V8Array paramV8Array, int paramInt)
  {
    AppMethodBeat.i(75122);
    V8Map localV8Map = new V8Map();
    Object localObject1 = null;
    try
    {
      Object localObject2 = paramV8Array.get(paramInt);
      localObject1 = localObject2;
      paramV8Array = getValue(localObject2, paramV8Array.getType(paramInt), localV8Map, DEFAULT_TYPE_ADAPTER);
      return paramV8Array;
    }
    finally
    {
      if ((localObject1 instanceof Releasable))
        ((Releasable)localObject1).release();
      localV8Map.release();
      AppMethodBeat.o(75122);
    }
    throw paramV8Array;
  }

  public static Object getValue(V8Array paramV8Array, int paramInt, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75123);
    V8Map localV8Map = new V8Map();
    Object localObject1 = null;
    try
    {
      Object localObject2 = paramV8Array.get(paramInt);
      localObject1 = localObject2;
      paramV8Array = getValue(localObject2, paramV8Array.getType(paramInt), localV8Map, paramTypeAdapter);
      return paramV8Array;
    }
    finally
    {
      if ((localObject1 instanceof Releasable))
        ((Releasable)localObject1).release();
      localV8Map.release();
      AppMethodBeat.o(75123);
    }
    throw paramV8Array;
  }

  public static Object getValue(V8Object paramV8Object, String paramString)
  {
    AppMethodBeat.i(75124);
    paramV8Object = getValue(paramV8Object, paramString, DEFAULT_TYPE_ADAPTER);
    AppMethodBeat.o(75124);
    return paramV8Object;
  }

  public static Object getValue(V8Object paramV8Object, String paramString, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75125);
    V8Map localV8Map = new V8Map();
    Object localObject1 = null;
    try
    {
      Object localObject2 = paramV8Object.get(paramString);
      localObject1 = localObject2;
      paramV8Object = getValue(localObject2, paramV8Object.getType(paramString), localV8Map, paramTypeAdapter);
      return paramV8Object;
    }
    finally
    {
      if ((localObject1 instanceof Releasable))
        ((Releasable)localObject1).release();
      localV8Map.release();
      AppMethodBeat.o(75125);
    }
    throw paramV8Object;
  }

  public static Object getValue(Object paramObject)
  {
    AppMethodBeat.i(75106);
    paramObject = getValue(paramObject, DEFAULT_TYPE_ADAPTER);
    AppMethodBeat.o(75106);
    return paramObject;
  }

  private static Object getValue(Object paramObject, int paramInt, V8Map<Object> paramV8Map, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75142);
    Object localObject = paramTypeAdapter.adapt(paramInt, paramObject);
    if (TypeAdapter.DEFAULT != localObject)
    {
      AppMethodBeat.o(75142);
      paramObject = localObject;
    }
    while (true)
    {
      return paramObject;
      switch (paramInt)
      {
      default:
        paramObject = new IllegalStateException("Cannot convert type " + V8Value.getStringRepresentation(paramInt));
        AppMethodBeat.o(75142);
        throw paramObject;
      case 1:
      case 2:
      case 3:
      case 4:
        AppMethodBeat.o(75142);
        break;
      case 7:
        paramObject = IGNORE;
        AppMethodBeat.o(75142);
        break;
      case 10:
        paramObject = new ArrayBuffer(((V8ArrayBuffer)paramObject).getBackingStore());
        AppMethodBeat.o(75142);
        break;
      case 8:
        paramObject = toTypedArray((V8Array)paramObject);
        AppMethodBeat.o(75142);
        break;
      case 5:
        paramObject = toList((V8Array)paramObject, paramV8Map, paramTypeAdapter);
        AppMethodBeat.o(75142);
        break;
      case 6:
        paramObject = toMap((V8Object)paramObject, paramV8Map, paramTypeAdapter);
        AppMethodBeat.o(75142);
        break;
      case 0:
        paramObject = null;
        AppMethodBeat.o(75142);
        break;
      case 99:
        paramObject = V8.getUndefined();
        AppMethodBeat.o(75142);
      }
    }
  }

  public static Object getValue(Object paramObject, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75107);
    V8Map localV8Map = new V8Map();
    try
    {
      if ((paramObject instanceof V8Value))
      {
        paramObject = getValue(paramObject, ((V8Value)paramObject).getV8Type(), localV8Map, paramTypeAdapter);
        return paramObject;
      }
      localV8Map.release();
      AppMethodBeat.o(75107);
    }
    finally
    {
      localV8Map.release();
      AppMethodBeat.o(75107);
    }
  }

  public static void pushValue(V8 paramV8, V8Array paramV8Array, Object paramObject)
  {
    AppMethodBeat.i(75120);
    Hashtable localHashtable = new Hashtable();
    try
    {
      pushValue(paramV8, paramV8Array, paramObject, localHashtable);
      return;
    }
    finally
    {
      paramV8Array = localHashtable.values().iterator();
      while (paramV8Array.hasNext())
        ((V8Value)paramV8Array.next()).release();
      AppMethodBeat.o(75120);
    }
    throw paramV8;
  }

  private static void pushValue(V8 paramV8, V8Array paramV8Array, Object paramObject, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75138);
    if (paramObject == null)
    {
      paramV8Array.pushUndefined();
      AppMethodBeat.o(75138);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof Long))
      {
        paramV8Array.push(new Double(((Long)paramObject).longValue()));
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof Double))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof Float))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof String))
      {
        paramV8Array.push((String)paramObject);
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof Boolean))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof V8Object))
      {
        paramV8Array.push((V8Object)paramObject);
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof TypedArray))
      {
        paramV8Array.push(toV8TypedArray(paramV8, (TypedArray)paramObject, paramMap));
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof ArrayBuffer))
      {
        paramV8Array.push(toV8ArrayBuffer(paramV8, (ArrayBuffer)paramObject, paramMap));
        AppMethodBeat.o(75138);
      }
      else if ((paramObject instanceof Map))
      {
        paramV8Array.push(toV8Object(paramV8, (Map)paramObject, paramMap));
        AppMethodBeat.o(75138);
      }
      else
      {
        if (!(paramObject instanceof List))
          break;
        paramV8Array.push(toV8Array(paramV8, (List)paramObject, paramMap));
        AppMethodBeat.o(75138);
      }
    }
    paramV8 = new IllegalStateException("Unsupported Object of type: " + paramObject.getClass());
    AppMethodBeat.o(75138);
    throw paramV8;
  }

  public static void pushValue(V8Context paramV8Context, V8Array paramV8Array, Object paramObject)
  {
    AppMethodBeat.i(75121);
    Hashtable localHashtable = new Hashtable();
    try
    {
      pushValue(paramV8Context, paramV8Array, paramObject, localHashtable);
      return;
    }
    finally
    {
      paramV8Array = localHashtable.values().iterator();
      while (paramV8Array.hasNext())
        ((V8Value)paramV8Array.next()).release();
      AppMethodBeat.o(75121);
    }
    throw paramV8Context;
  }

  private static void pushValue(V8Context paramV8Context, V8Array paramV8Array, Object paramObject, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75139);
    if (paramObject == null)
    {
      paramV8Array.pushUndefined();
      AppMethodBeat.o(75139);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof Long))
      {
        paramV8Array.push(new Double(((Long)paramObject).longValue()));
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof Double))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof Float))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof String))
      {
        paramV8Array.push((String)paramObject);
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof Boolean))
      {
        paramV8Array.push(paramObject);
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof V8Object))
      {
        paramV8Array.push((V8Object)paramObject);
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof TypedArray))
      {
        paramV8Array.push(toV8TypedArray(paramV8Context, (TypedArray)paramObject, paramMap));
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof ArrayBuffer))
      {
        paramV8Array.push(toV8ArrayBuffer(paramV8Context, (ArrayBuffer)paramObject, paramMap));
        AppMethodBeat.o(75139);
      }
      else if ((paramObject instanceof Map))
      {
        paramV8Array.push(toV8Object(paramV8Context, (Map)paramObject, paramMap));
        AppMethodBeat.o(75139);
      }
      else
      {
        if (!(paramObject instanceof List))
          break;
        paramV8Array.push(toV8Array(paramV8Context, (List)paramObject, paramMap));
        AppMethodBeat.o(75139);
      }
    }
    paramV8Context = new IllegalStateException("Unsupported Object of type: " + paramObject.getClass());
    AppMethodBeat.o(75139);
    throw paramV8Context;
  }

  private static void setValue(V8 paramV8, V8Object paramV8Object, String paramString, Object paramObject, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75140);
    if (paramObject == null)
    {
      paramV8Object.addUndefined(paramString);
      AppMethodBeat.o(75140);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramV8Object.add(paramString, ((Integer)paramObject).intValue());
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof Long))
      {
        paramV8Object.add(paramString, ((Long)paramObject).longValue());
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof Double))
      {
        paramV8Object.add(paramString, ((Double)paramObject).doubleValue());
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof Float))
      {
        paramV8Object.add(paramString, ((Float)paramObject).floatValue());
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof String))
      {
        paramV8Object.add(paramString, (String)paramObject);
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof Boolean))
      {
        paramV8Object.add(paramString, ((Boolean)paramObject).booleanValue());
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof V8Object))
      {
        paramV8Object.add(paramString, (V8Object)paramObject);
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof TypedArray))
      {
        paramV8Object.add(paramString, toV8TypedArray(paramV8, (TypedArray)paramObject, paramMap));
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof ArrayBuffer))
      {
        paramV8Object.add(paramString, toV8ArrayBuffer(paramV8, (ArrayBuffer)paramObject, paramMap));
        AppMethodBeat.o(75140);
      }
      else if ((paramObject instanceof Map))
      {
        paramV8Object.add(paramString, toV8Object(paramV8, (Map)paramObject, paramMap));
        AppMethodBeat.o(75140);
      }
      else
      {
        if (!(paramObject instanceof List))
          break;
        paramV8Object.add(paramString, toV8Array(paramV8, (List)paramObject, paramMap));
        AppMethodBeat.o(75140);
      }
    }
    paramV8 = new IllegalStateException("Unsupported Object of type: " + paramObject.getClass());
    AppMethodBeat.o(75140);
    throw paramV8;
  }

  private static void setValue(V8Context paramV8Context, V8Object paramV8Object, String paramString, Object paramObject, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75141);
    if (paramObject == null)
    {
      paramV8Object.addUndefined(paramString);
      AppMethodBeat.o(75141);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramV8Object.add(paramString, ((Integer)paramObject).intValue());
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof Long))
      {
        paramV8Object.add(paramString, ((Long)paramObject).longValue());
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof Double))
      {
        paramV8Object.add(paramString, ((Double)paramObject).doubleValue());
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof Float))
      {
        paramV8Object.add(paramString, ((Float)paramObject).floatValue());
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof String))
      {
        paramV8Object.add(paramString, (String)paramObject);
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof Boolean))
      {
        paramV8Object.add(paramString, ((Boolean)paramObject).booleanValue());
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof V8Object))
      {
        paramV8Object.add(paramString, (V8Object)paramObject);
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof TypedArray))
      {
        paramV8Object.add(paramString, toV8TypedArray(paramV8Context, (TypedArray)paramObject, paramMap));
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof ArrayBuffer))
      {
        paramV8Object.add(paramString, toV8ArrayBuffer(paramV8Context, (ArrayBuffer)paramObject, paramMap));
        AppMethodBeat.o(75141);
      }
      else if ((paramObject instanceof Map))
      {
        paramV8Object.add(paramString, toV8Object(paramV8Context, (Map)paramObject, paramMap));
        AppMethodBeat.o(75141);
      }
      else
      {
        if (!(paramObject instanceof List))
          break;
        paramV8Object.add(paramString, toV8Array(paramV8Context, (List)paramObject, paramMap));
        AppMethodBeat.o(75141);
      }
    }
    paramV8Context = new IllegalStateException("Unsupported Object of type: " + paramObject.getClass());
    AppMethodBeat.o(75141);
    throw paramV8Context;
  }

  public static List<? super Object> toList(V8Array paramV8Array)
  {
    AppMethodBeat.i(75110);
    paramV8Array = toList(paramV8Array, DEFAULT_TYPE_ADAPTER);
    AppMethodBeat.o(75110);
    return paramV8Array;
  }

  public static List<? super Object> toList(V8Array paramV8Array, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75111);
    V8Map localV8Map = new V8Map();
    try
    {
      paramV8Array = toList(paramV8Array, localV8Map, paramTypeAdapter);
      return paramV8Array;
    }
    finally
    {
      localV8Map.release();
      AppMethodBeat.o(75111);
    }
    throw paramV8Array;
  }

  private static List<? super Object> toList(V8Array paramV8Array, V8Map<Object> paramV8Map, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75127);
    if (paramV8Array == null)
    {
      paramV8Array = Collections.emptyList();
      AppMethodBeat.o(75127);
    }
    while (true)
    {
      return paramV8Array;
      if (paramV8Map.containsKey(paramV8Array))
      {
        paramV8Array = (List)paramV8Map.get(paramV8Array);
        AppMethodBeat.o(75127);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        paramV8Map.put(paramV8Array, localArrayList);
        int i = 0;
        while (i < paramV8Array.length())
        {
          Object localObject1 = null;
          try
          {
            Object localObject2 = paramV8Array.get(i);
            localObject1 = localObject2;
            Object localObject3 = getValue(localObject2, paramV8Array.getType(i), paramV8Map, paramTypeAdapter);
            localObject1 = localObject2;
            if (localObject3 != IGNORE)
            {
              localObject1 = localObject2;
              localArrayList.add(localObject3);
            }
            if ((localObject2 instanceof Releasable))
              ((Releasable)localObject2).release();
            i++;
          }
          finally
          {
            if ((localObject1 instanceof Releasable))
              ((Releasable)localObject1).release();
            AppMethodBeat.o(75127);
          }
        }
        AppMethodBeat.o(75127);
        paramV8Array = localArrayList;
      }
    }
  }

  public static Map<String, ? super Object> toMap(V8Object paramV8Object)
  {
    AppMethodBeat.i(75108);
    paramV8Object = toMap(paramV8Object, DEFAULT_TYPE_ADAPTER);
    AppMethodBeat.o(75108);
    return paramV8Object;
  }

  public static Map<String, ? super Object> toMap(V8Object paramV8Object, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75109);
    V8Map localV8Map = new V8Map();
    try
    {
      paramV8Object = toMap(paramV8Object, localV8Map, paramTypeAdapter);
      return paramV8Object;
    }
    finally
    {
      localV8Map.release();
      AppMethodBeat.o(75109);
    }
    throw paramV8Object;
  }

  private static Map<String, ? super Object> toMap(V8Object paramV8Object, V8Map<Object> paramV8Map, TypeAdapter paramTypeAdapter)
  {
    AppMethodBeat.i(75126);
    if (paramV8Object == null)
    {
      paramV8Object = Collections.emptyMap();
      AppMethodBeat.o(75126);
    }
    while (true)
    {
      return paramV8Object;
      if (paramV8Map.containsKey(paramV8Object))
      {
        paramV8Object = (Map)paramV8Map.get(paramV8Object);
        AppMethodBeat.o(75126);
      }
      else
      {
        V8PropertyMap localV8PropertyMap = new V8PropertyMap();
        paramV8Map.put(paramV8Object, localV8PropertyMap);
        String[] arrayOfString = paramV8Object.getKeys();
        int i = arrayOfString.length;
        int j = 0;
        while (j < i)
        {
          String str = arrayOfString[j];
          Object localObject1 = null;
          try
          {
            Object localObject2 = paramV8Object.get(str);
            localObject1 = localObject2;
            Object localObject3 = getValue(localObject2, paramV8Object.getType(str), paramV8Map, paramTypeAdapter);
            localObject1 = localObject2;
            if (localObject3 != IGNORE)
            {
              localObject1 = localObject2;
              localV8PropertyMap.put(str, localObject3);
            }
            if ((localObject2 instanceof Releasable))
              ((Releasable)localObject2).release();
            j++;
          }
          finally
          {
            if ((localObject1 instanceof Releasable))
              ((Releasable)localObject1).release();
            AppMethodBeat.o(75126);
          }
        }
        AppMethodBeat.o(75126);
        paramV8Object = localV8PropertyMap;
      }
    }
  }

  private static Object toTypedArray(V8Array paramV8Array)
  {
    AppMethodBeat.i(75143);
    int i = paramV8Array.getType();
    paramV8Array = ((V8TypedArray)paramV8Array).getByteBuffer();
    switch (i)
    {
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 10:
    default:
      paramV8Array = new IllegalStateException("Known Typed Array type: " + V8Value.getStringRepresentation(i));
      AppMethodBeat.o(75143);
      throw paramV8Array;
    case 9:
      paramV8Array = new Int8Array(paramV8Array);
      AppMethodBeat.o(75143);
    case 11:
    case 12:
    case 13:
    case 14:
    case 1:
    case 15:
    case 16:
    case 2:
    }
    while (true)
    {
      return paramV8Array;
      paramV8Array = new UInt8Array(paramV8Array);
      AppMethodBeat.o(75143);
      continue;
      paramV8Array = new UInt8ClampedArray(paramV8Array);
      AppMethodBeat.o(75143);
      continue;
      paramV8Array = new Int16Array(paramV8Array);
      AppMethodBeat.o(75143);
      continue;
      paramV8Array = new UInt16Array(paramV8Array);
      AppMethodBeat.o(75143);
      continue;
      paramV8Array = new Int32Array(paramV8Array);
      AppMethodBeat.o(75143);
      continue;
      paramV8Array = new UInt32Array(paramV8Array);
      AppMethodBeat.o(75143);
      continue;
      paramV8Array = new Float32Array(paramV8Array);
      AppMethodBeat.o(75143);
      continue;
      paramV8Array = new Float64Array(paramV8Array);
      AppMethodBeat.o(75143);
    }
  }

  public static V8Array toV8Array(V8 paramV8, List<? extends Object> paramList)
  {
    AppMethodBeat.i(75116);
    Hashtable localHashtable = new Hashtable();
    try
    {
      paramV8 = toV8Array(paramV8, paramList, localHashtable).twin();
      return paramV8;
    }
    finally
    {
      paramList = localHashtable.values().iterator();
      while (paramList.hasNext())
        ((V8Value)paramList.next()).release();
      AppMethodBeat.o(75116);
    }
    throw paramV8;
  }

  private static V8Array toV8Array(V8 paramV8, List<? extends Object> paramList, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75130);
    if (paramMap.containsKey(new V8ObjectUtils.ListWrapper(paramList)))
    {
      paramV8 = (V8Array)paramMap.get(new V8ObjectUtils.ListWrapper(paramList));
      AppMethodBeat.o(75130);
    }
    while (true)
    {
      return paramV8;
      V8Array localV8Array = new V8Array(paramV8);
      paramMap.put(new V8ObjectUtils.ListWrapper(paramList), localV8Array);
      int i = 0;
      try
      {
        while (i < paramList.size())
        {
          pushValue(paramV8, localV8Array, paramList.get(i), paramMap);
          i++;
        }
      }
      catch (IllegalStateException paramV8)
      {
        localV8Array.release();
        AppMethodBeat.o(75130);
        throw paramV8;
      }
      AppMethodBeat.o(75130);
      paramV8 = localV8Array;
    }
  }

  public static V8Array toV8Array(V8Context paramV8Context, List<? extends Object> paramList)
  {
    AppMethodBeat.i(75117);
    Hashtable localHashtable = new Hashtable();
    try
    {
      paramV8Context = toV8Array(paramV8Context, paramList, localHashtable).twin();
      return paramV8Context;
    }
    finally
    {
      paramList = localHashtable.values().iterator();
      while (paramList.hasNext())
        ((V8Value)paramList.next()).release();
      AppMethodBeat.o(75117);
    }
    throw paramV8Context;
  }

  private static V8Array toV8Array(V8Context paramV8Context, List<? extends Object> paramList, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75131);
    if (paramMap.containsKey(new V8ObjectUtils.ListWrapper(paramList)))
    {
      paramV8Context = (V8Array)paramMap.get(new V8ObjectUtils.ListWrapper(paramList));
      AppMethodBeat.o(75131);
    }
    while (true)
    {
      return paramV8Context;
      V8Array localV8Array = paramV8Context.newV8Array();
      paramMap.put(new V8ObjectUtils.ListWrapper(paramList), localV8Array);
      int i = 0;
      try
      {
        while (i < paramList.size())
        {
          pushValue(paramV8Context, localV8Array, paramList.get(i), paramMap);
          i++;
        }
      }
      catch (IllegalStateException paramV8Context)
      {
        localV8Array.release();
        AppMethodBeat.o(75131);
        throw paramV8Context;
      }
      AppMethodBeat.o(75131);
      paramV8Context = localV8Array;
    }
  }

  private static V8ArrayBuffer toV8ArrayBuffer(V8 paramV8, ArrayBuffer paramArrayBuffer, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75132);
    if (paramMap.containsKey(paramArrayBuffer))
    {
      paramV8 = (V8ArrayBuffer)paramMap.get(paramArrayBuffer);
      AppMethodBeat.o(75132);
    }
    while (true)
    {
      return paramV8;
      paramV8 = new V8ArrayBuffer(paramV8, paramArrayBuffer.getByteBuffer());
      paramMap.put(paramArrayBuffer, paramV8);
      AppMethodBeat.o(75132);
    }
  }

  private static V8ArrayBuffer toV8ArrayBuffer(V8Context paramV8Context, ArrayBuffer paramArrayBuffer, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75133);
    if (paramMap.containsKey(paramArrayBuffer))
    {
      paramV8Context = (V8ArrayBuffer)paramMap.get(paramArrayBuffer);
      AppMethodBeat.o(75133);
    }
    while (true)
    {
      return paramV8Context;
      paramV8Context = paramV8Context.newV8ArrayBuffer(paramArrayBuffer.getByteBuffer());
      paramMap.put(paramArrayBuffer, paramV8Context);
      AppMethodBeat.o(75133);
    }
  }

  public static V8Object toV8Object(V8 paramV8, Map<String, ? extends Object> paramMap)
  {
    AppMethodBeat.i(75114);
    Hashtable localHashtable = new Hashtable();
    try
    {
      paramV8 = toV8Object(paramV8, paramMap, localHashtable).twin();
      return paramV8;
    }
    finally
    {
      paramMap = localHashtable.values().iterator();
      while (paramMap.hasNext())
        ((V8Value)paramMap.next()).release();
      AppMethodBeat.o(75114);
    }
    throw paramV8;
  }

  private static V8Object toV8Object(V8 paramV8, Map<String, ? extends Object> paramMap, Map<Object, V8Value> paramMap1)
  {
    AppMethodBeat.i(75128);
    if (paramMap1.containsKey(paramMap))
    {
      paramV8 = (V8Object)paramMap1.get(paramMap);
      AppMethodBeat.o(75128);
    }
    while (true)
    {
      return paramV8;
      V8Object localV8Object = new V8Object(paramV8);
      paramMap1.put(paramMap, localV8Object);
      try
      {
        paramMap = paramMap.entrySet().iterator();
        while (paramMap.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)paramMap.next();
          setValue(paramV8, localV8Object, (String)localEntry.getKey(), localEntry.getValue(), paramMap1);
        }
      }
      catch (IllegalStateException paramV8)
      {
        localV8Object.release();
        AppMethodBeat.o(75128);
        throw paramV8;
      }
      AppMethodBeat.o(75128);
      paramV8 = localV8Object;
    }
  }

  public static V8Object toV8Object(V8Context paramV8Context, Map<String, ? extends Object> paramMap)
  {
    AppMethodBeat.i(75115);
    Hashtable localHashtable = new Hashtable();
    try
    {
      paramV8Context = toV8Object(paramV8Context, paramMap, localHashtable).twin();
      return paramV8Context;
    }
    finally
    {
      paramMap = localHashtable.values().iterator();
      while (paramMap.hasNext())
        ((V8Value)paramMap.next()).release();
      AppMethodBeat.o(75115);
    }
    throw paramV8Context;
  }

  private static V8Object toV8Object(V8Context paramV8Context, Map<String, ? extends Object> paramMap, Map<Object, V8Value> paramMap1)
  {
    AppMethodBeat.i(75129);
    if (paramMap1.containsKey(paramMap))
    {
      paramV8Context = (V8Object)paramMap1.get(paramMap);
      AppMethodBeat.o(75129);
    }
    while (true)
    {
      return paramV8Context;
      V8Object localV8Object = paramV8Context.newV8Object();
      paramMap1.put(paramMap, localV8Object);
      try
      {
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          paramMap = (Map.Entry)localIterator.next();
          setValue(paramV8Context, localV8Object, (String)paramMap.getKey(), paramMap.getValue(), paramMap1);
        }
      }
      catch (IllegalStateException paramV8Context)
      {
        localV8Object.release();
        AppMethodBeat.o(75129);
        throw paramV8Context;
      }
      AppMethodBeat.o(75129);
      paramV8Context = localV8Object;
    }
  }

  private static V8TypedArray toV8TypedArray(V8 paramV8, TypedArray paramTypedArray, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75134);
    if (paramMap.containsKey(paramTypedArray))
    {
      paramV8 = (V8TypedArray)paramMap.get(paramTypedArray);
      AppMethodBeat.o(75134);
    }
    while (true)
    {
      return paramV8;
      V8ArrayBuffer localV8ArrayBuffer = new V8ArrayBuffer(paramV8, paramTypedArray.getByteBuffer());
      try
      {
        V8TypedArray localV8TypedArray = new com/eclipsesource/v8/V8TypedArray;
        localV8TypedArray.<init>(paramV8, localV8ArrayBuffer, paramTypedArray.getType(), 0, paramTypedArray.length());
        paramMap.put(paramTypedArray, localV8TypedArray);
        localV8ArrayBuffer.release();
        AppMethodBeat.o(75134);
        paramV8 = localV8TypedArray;
      }
      finally
      {
        localV8ArrayBuffer.release();
        AppMethodBeat.o(75134);
      }
    }
  }

  private static V8TypedArray toV8TypedArray(V8Context paramV8Context, TypedArray paramTypedArray, Map<Object, V8Value> paramMap)
  {
    AppMethodBeat.i(75135);
    if (paramMap.containsKey(paramTypedArray))
    {
      paramV8Context = (V8TypedArray)paramMap.get(paramTypedArray);
      AppMethodBeat.o(75135);
    }
    while (true)
    {
      return paramV8Context;
      V8ArrayBuffer localV8ArrayBuffer = paramV8Context.newV8ArrayBuffer(paramTypedArray.getByteBuffer());
      try
      {
        paramV8Context = paramV8Context.newV8TypedArray(localV8ArrayBuffer, paramTypedArray.getType(), 0, paramTypedArray.length());
        paramMap.put(paramTypedArray, paramV8Context);
        localV8ArrayBuffer.release();
        AppMethodBeat.o(75135);
      }
      finally
      {
        localV8ArrayBuffer.release();
        AppMethodBeat.o(75135);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.V8ObjectUtils
 * JD-Core Version:    0.6.2
 */