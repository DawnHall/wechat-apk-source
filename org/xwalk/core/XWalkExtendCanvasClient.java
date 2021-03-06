package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class XWalkExtendCanvasClient
{
  private static final String TAG = "XWalkExtendCanvasClient";
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;
  private ReflectMethod sendAsyncMethodsMethod;

  static
  {
    AppMethodBeat.i(85629);
    if (!XWalkExtendCanvasClient.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(85629);
      return;
    }
  }

  public XWalkExtendCanvasClient(XWalkView paramXWalkView)
  {
    AppMethodBeat.i(85625);
    this.sendAsyncMethodsMethod = new ReflectMethod(null, "sendAsyncMethods", new Class[0]);
    this.constructorTypes = new ArrayList();
    this.constructorTypes.add("XWalkViewBridge");
    this.constructorParams = new ArrayList();
    this.constructorParams.add(paramXWalkView);
    reflectionInit();
    AppMethodBeat.o(85625);
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public void onAsycResultCallback(int paramInt1, int paramInt2, String paramString)
  {
  }

  public void onCanvasTouch(String paramString1, int paramInt, String paramString2)
  {
  }

  public void onSendJsonMessage(String paramString)
  {
  }

  void reflectionInit()
  {
    AppMethodBeat.i(85628);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(85628);
    }
    while (true)
    {
      return;
      int i = this.constructorTypes.size();
      Class[] arrayOfClass = new Class[i + 1];
      int j = 0;
      if (j < i)
      {
        localObject = this.constructorTypes.get(j);
        if ((localObject instanceof String))
        {
          arrayOfClass[j] = this.coreWrapper.getBridgeClass((String)localObject);
          this.constructorParams.set(j, this.coreWrapper.getBridgeObject(this.constructorParams.get(j)));
        }
        label136: 
        do
          while (true)
          {
            j++;
            break;
            if (!(localObject instanceof Class))
              break label136;
            arrayOfClass[j] = ((Class)localObject);
          }
        while ($assertionsDisabled);
        localObject = new AssertionError();
        AppMethodBeat.o(85628);
        throw ((Throwable)localObject);
      }
      arrayOfClass[i] = Object.class;
      this.constructorParams.add(this);
      Object localObject = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkExtendCanvasClientBridge"), arrayOfClass);
      try
      {
        this.bridge = ((ReflectConstructor)localObject).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        this.sendAsyncMethodsMethod.init(this.bridge, null, "sendAsyncMethods", new Class[] { String.class, Integer.TYPE });
        AppMethodBeat.o(85628);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        AppMethodBeat.o(85628);
      }
    }
  }

  public void sendAsyncMethods(String paramString)
  {
    AppMethodBeat.i(85626);
    sendAsyncMethods(paramString, 0);
    AppMethodBeat.o(85626);
  }

  public void sendAsyncMethods(String paramString, int paramInt)
  {
    AppMethodBeat.i(85627);
    Log.d("XWalkExtendCanvasClient", "sendAsyncMethods called! methods:" + paramString + ",reply_id:" + paramInt);
    try
    {
      this.sendAsyncMethodsMethod.invoke(new Object[] { paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(85627);
      return;
    }
    catch (UnsupportedOperationException paramString)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          paramString = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85627);
          throw paramString;
        }
        XWalkCoreWrapper.handleRuntimeError(paramString);
        AppMethodBeat.o(85627);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkExtendCanvasClient
 * JD-Core Version:    0.6.2
 */