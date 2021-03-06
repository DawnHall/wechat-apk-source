package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsVirtualMachine;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public final class JsVirtualMachine
{
  private final Context a;
  private final IX5JsVirtualMachine b;
  private final HashSet<WeakReference<JsVirtualMachine.a>> c;

  public JsVirtualMachine(Context paramContext)
  {
    this(paramContext, null);
  }

  public JsVirtualMachine(Context paramContext, Looper paramLooper)
  {
    AppMethodBeat.i(63970);
    this.c = new HashSet();
    this.a = paramContext;
    this.b = X5JsCore.a(paramContext, paramLooper);
    AppMethodBeat.o(63970);
  }

  protected final IX5JsContext a()
  {
    AppMethodBeat.i(63971);
    Object localObject;
    if (this.b == null)
    {
      localObject = new JsVirtualMachine.a(this.a);
      this.c.add(new WeakReference(localObject));
    }
    while (true)
    {
      AppMethodBeat.o(63971);
      return localObject;
      localObject = this.b.createJsContext();
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(63972);
    if (this.b != null)
    {
      this.b.destroy();
      AppMethodBeat.o(63972);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if (localWeakReference.get() != null)
          ((JsVirtualMachine.a)localWeakReference.get()).destroy();
      }
      AppMethodBeat.o(63972);
    }
  }

  public final Looper getLooper()
  {
    AppMethodBeat.i(63973);
    Looper localLooper;
    if (this.b != null)
    {
      localLooper = this.b.getLooper();
      AppMethodBeat.o(63973);
    }
    while (true)
    {
      return localLooper;
      localLooper = Looper.myLooper();
      AppMethodBeat.o(63973);
    }
  }

  public final boolean isFallback()
  {
    if (this.b == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void onPause()
  {
    AppMethodBeat.i(63974);
    if (this.b != null)
    {
      this.b.onPause();
      AppMethodBeat.o(63974);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if (localWeakReference.get() != null)
          ((JsVirtualMachine.a)localWeakReference.get()).a();
      }
      AppMethodBeat.o(63974);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(63975);
    if (this.b != null)
    {
      this.b.onResume();
      AppMethodBeat.o(63975);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if (localWeakReference.get() != null)
          ((JsVirtualMachine.a)localWeakReference.get()).b();
      }
      AppMethodBeat.o(63975);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.JsVirtualMachine
 * JD-Core Version:    0.6.2
 */