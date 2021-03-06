package com.tencent.liteav.renderer;

import android.opengl.GLDebugHelper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

public class TXCGLSurfaceViewBase$h
{
  EGL10 a;
  EGLDisplay b;
  EGLSurface c;
  EGLConfig d;
  EGLContext e;
  private WeakReference<TXCGLSurfaceViewBase> f;

  public TXCGLSurfaceViewBase$h(WeakReference<TXCGLSurfaceViewBase> paramWeakReference)
  {
    this.f = paramWeakReference;
  }

  private void a(String paramString)
  {
    AppMethodBeat.i(67179);
    a(paramString, this.a.eglGetError());
    AppMethodBeat.o(67179);
  }

  public static void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(67180);
    paramString = new RuntimeException(b(paramString, paramInt));
    AppMethodBeat.o(67180);
    throw paramString;
  }

  public static void a(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(67181);
    TXCLog.w(paramString1, b(paramString2, paramInt));
    AppMethodBeat.o(67181);
  }

  public static String b(String paramString, int paramInt)
  {
    AppMethodBeat.i(67182);
    paramString = paramString + " failed: " + paramInt;
    AppMethodBeat.o(67182);
    return paramString;
  }

  private void h()
  {
    AppMethodBeat.i(67177);
    if ((this.c != null) && (this.c != EGL10.EGL_NO_SURFACE))
    {
      EGL10 localEGL10 = this.a;
      Object localObject = this.b;
      EGLSurface localEGLSurface = EGL10.EGL_NO_SURFACE;
      localEGL10.eglMakeCurrent((EGLDisplay)localObject, localEGLSurface, localEGLSurface, EGL10.EGL_NO_CONTEXT);
      localObject = (TXCGLSurfaceViewBase)this.f.get();
      if (localObject != null)
      {
        TXCGLSurfaceViewBase.e((TXCGLSurfaceViewBase)localObject).a(this.a, this.b, this.c);
        ((TXCGLSurfaceViewBase)localObject).e = false;
      }
      this.c = null;
    }
    AppMethodBeat.o(67177);
  }

  public void a()
  {
    AppMethodBeat.i(67171);
    this.a = ((EGL10)EGLContext.getEGL());
    this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    if (this.b == EGL10.EGL_NO_DISPLAY)
    {
      localObject = new RuntimeException("eglGetDisplay failed");
      AppMethodBeat.o(67171);
      throw ((Throwable)localObject);
    }
    Object localObject = new int[2];
    if (!this.a.eglInitialize(this.b, (int[])localObject))
    {
      localObject = new RuntimeException("eglInitialize failed");
      AppMethodBeat.o(67171);
      throw ((Throwable)localObject);
    }
    localObject = (TXCGLSurfaceViewBase)this.f.get();
    if (localObject == null)
      this.d = null;
    for (this.e = null; ; this.e = TXCGLSurfaceViewBase.d((TXCGLSurfaceViewBase)localObject).a(this.a, this.b, this.d))
    {
      if ((this.e == null) || (this.e == EGL10.EGL_NO_CONTEXT))
      {
        this.e = null;
        a("createContext");
      }
      if (localObject != null)
        ((TXCGLSurfaceViewBase)localObject).f = true;
      this.c = null;
      AppMethodBeat.o(67171);
      return;
      this.d = TXCGLSurfaceViewBase.c((TXCGLSurfaceViewBase)localObject).a(this.a, this.b);
    }
  }

  public boolean b()
  {
    AppMethodBeat.i(67172);
    if (this.a == null)
    {
      localObject = new RuntimeException("egl not initialized");
      AppMethodBeat.o(67172);
      throw ((Throwable)localObject);
    }
    if (this.b == null)
    {
      localObject = new RuntimeException("eglDisplay not initialized");
      AppMethodBeat.o(67172);
      throw ((Throwable)localObject);
    }
    if (this.d == null)
    {
      localObject = new RuntimeException("mEglConfig not initialized");
      AppMethodBeat.o(67172);
      throw ((Throwable)localObject);
    }
    h();
    Object localObject = (TXCGLSurfaceViewBase)this.f.get();
    boolean bool;
    if (localObject != null)
    {
      this.c = TXCGLSurfaceViewBase.e((TXCGLSurfaceViewBase)localObject).a(this.a, this.b, this.d, ((TXCGLSurfaceViewBase)localObject).getHolder());
      if ((this.c != null) && (this.c != EGL10.EGL_NO_SURFACE))
        break label181;
      if (this.a.eglGetError() == 12299)
        TXCLog.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
      AppMethodBeat.o(67172);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.c = null;
      break;
      label181: if (!this.a.eglMakeCurrent(this.b, this.c, this.c, this.e))
      {
        a("EGLHelper", "eglMakeCurrent", this.a.eglGetError());
        AppMethodBeat.o(67172);
        bool = false;
      }
      else
      {
        if (localObject != null)
          ((TXCGLSurfaceViewBase)localObject).e = true;
        AppMethodBeat.o(67172);
        bool = true;
      }
    }
  }

  public int c()
  {
    AppMethodBeat.i(67173);
    int i = e();
    AppMethodBeat.o(67173);
    return i;
  }

  GL d()
  {
    AppMethodBeat.i(67174);
    GL localGL1 = this.e.getGL();
    TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.f.get();
    Object localObject = localGL1;
    GL localGL2;
    int i;
    if (localTXCGLSurfaceViewBase != null)
    {
      localGL2 = localGL1;
      if (TXCGLSurfaceViewBase.f(localTXCGLSurfaceViewBase) != null)
        localGL2 = TXCGLSurfaceViewBase.f(localTXCGLSurfaceViewBase).a(localGL1);
      localObject = localGL2;
      if ((TXCGLSurfaceViewBase.g(localTXCGLSurfaceViewBase) & 0x3) != 0)
      {
        i = 0;
        if ((TXCGLSurfaceViewBase.g(localTXCGLSurfaceViewBase) & 0x1) != 0)
          i = 1;
        if ((TXCGLSurfaceViewBase.g(localTXCGLSurfaceViewBase) & 0x2) == 0)
          break label112;
      }
    }
    label112: for (localObject = new TXCGLSurfaceViewBase.l(); ; localObject = null)
    {
      localObject = GLDebugHelper.wrap(localGL2, i, (Writer)localObject);
      AppMethodBeat.o(67174);
      return localObject;
    }
  }

  public int e()
  {
    AppMethodBeat.i(67175);
    int i;
    if (!this.a.eglSwapBuffers(this.b, this.c))
    {
      i = this.a.eglGetError();
      AppMethodBeat.o(67175);
    }
    while (true)
    {
      return i;
      i = 12288;
      AppMethodBeat.o(67175);
    }
  }

  public void f()
  {
    AppMethodBeat.i(67176);
    h();
    AppMethodBeat.o(67176);
  }

  public void g()
  {
    AppMethodBeat.i(67178);
    if (this.e != null)
    {
      TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.f.get();
      if (localTXCGLSurfaceViewBase != null)
        TXCGLSurfaceViewBase.d(localTXCGLSurfaceViewBase).a(this.a, this.b, this.e);
      this.e = null;
    }
    if (this.b != null)
    {
      this.a.eglTerminate(this.b);
      this.b = null;
    }
    AppMethodBeat.o(67178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCGLSurfaceViewBase.h
 * JD-Core Version:    0.6.2
 */