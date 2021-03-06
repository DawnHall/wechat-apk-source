package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class XWalkNativeExtensionLoader
{
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;
  private ReflectMethod registerNativeExtensionsInPathStringMethod;

  static
  {
    AppMethodBeat.i(85713);
    if (!XWalkNativeExtensionLoader.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(85713);
      return;
    }
  }

  public XWalkNativeExtensionLoader()
  {
    AppMethodBeat.i(85710);
    this.registerNativeExtensionsInPathStringMethod = new ReflectMethod(null, "registerNativeExtensionsInPath", new Class[0]);
    this.constructorTypes = new ArrayList();
    this.constructorParams = new ArrayList();
    reflectionInit();
    AppMethodBeat.o(85710);
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  void reflectionInit()
  {
    AppMethodBeat.i(85712);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(85712);
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
        AppMethodBeat.o(85712);
        throw ((Throwable)localObject);
      }
      arrayOfClass[i] = Object.class;
      this.constructorParams.add(this);
      Object localObject = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkNativeExtensionLoaderBridge"), arrayOfClass);
      try
      {
        this.bridge = ((ReflectConstructor)localObject).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        this.registerNativeExtensionsInPathStringMethod.init(this.bridge, null, "registerNativeExtensionsInPathSuper", new Class[] { String.class });
        AppMethodBeat.o(85712);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        AppMethodBeat.o(85712);
      }
    }
  }

  public void registerNativeExtensionsInPath(String paramString)
  {
    AppMethodBeat.i(85711);
    try
    {
      this.registerNativeExtensionsInPathStringMethod.invoke(new Object[] { paramString });
      AppMethodBeat.o(85711);
      return;
    }
    catch (UnsupportedOperationException paramString)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          paramString = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85711);
          throw paramString;
        }
        XWalkCoreWrapper.handleRuntimeError(paramString);
        AppMethodBeat.o(85711);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkNativeExtensionLoader
 * JD-Core Version:    0.6.2
 */