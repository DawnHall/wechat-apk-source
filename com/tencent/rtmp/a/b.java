package com.tencent.rtmp.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b
  implements a
{
  private final BitmapFactory.Options a;
  private HandlerThread b;
  private Handler c;
  private List<c> d;
  private Map<String, BitmapRegionDecoder> e;

  public b()
  {
    AppMethodBeat.i(65979);
    this.a = new BitmapFactory.Options();
    this.d = new ArrayList();
    this.d = Collections.synchronizedList(this.d);
    this.e = new HashMap();
    this.e = Collections.synchronizedMap(this.e);
    AppMethodBeat.o(65979);
  }

  private c a(int paramInt1, int paramInt2, float paramFloat)
  {
    AppMethodBeat.i(65983);
    int i = (paramInt2 - paramInt1) / 2 + paramInt1;
    c localc;
    if ((((c)this.d.get(i)).a <= paramFloat) && (((c)this.d.get(i)).b > paramFloat))
    {
      localc = (c)this.d.get(i);
      AppMethodBeat.o(65983);
    }
    while (true)
    {
      return localc;
      if (paramInt1 >= paramInt2)
      {
        localc = (c)this.d.get(paramInt1);
        AppMethodBeat.o(65983);
      }
      else
      {
        if (paramFloat >= ((c)this.d.get(i)).b)
        {
          paramInt1 = i + 1;
          break;
        }
        if (paramFloat < ((c)this.d.get(i)).a)
        {
          paramInt2 = i - 1;
          break;
        }
        localc = null;
        AppMethodBeat.o(65983);
      }
    }
  }

  private InputStream a(String paramString)
  {
    AppMethodBeat.i(65986);
    paramString = new URL(paramString).openConnection();
    paramString.connect();
    paramString.getInputStream();
    paramString.setConnectTimeout(15000);
    paramString.setReadTimeout(15000);
    paramString = paramString.getInputStream();
    AppMethodBeat.o(65986);
    return paramString;
  }

  private void a()
  {
    AppMethodBeat.i(65984);
    if (this.b == null)
    {
      this.b = new HandlerThread("SuperVodThumbnailsWorkThread");
      this.b.start();
      this.c = new Handler(this.b.getLooper());
    }
    AppMethodBeat.o(65984);
  }

  private void b()
  {
    AppMethodBeat.i(65985);
    if (this.c != null)
    {
      TXCLog.i("TXImageSprite", " remove all tasks!");
      this.c.removeCallbacksAndMessages(null);
      this.c.post(new b.1(this));
    }
    AppMethodBeat.o(65985);
  }

  public Bitmap getThumbnail(float paramFloat)
  {
    AppMethodBeat.i(65981);
    Object localObject1;
    if (this.d.size() == 0)
    {
      AppMethodBeat.o(65981);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      localObject1 = a(0, this.d.size() - 1, paramFloat);
      if (localObject1 == null)
      {
        AppMethodBeat.o(65981);
        localObject1 = null;
      }
      else
      {
        Object localObject2 = ((c)localObject1).d;
        BitmapRegionDecoder localBitmapRegionDecoder = (BitmapRegionDecoder)this.e.get(localObject2);
        if (localBitmapRegionDecoder == null)
        {
          AppMethodBeat.o(65981);
          localObject1 = null;
        }
        else
        {
          localObject2 = new Rect();
          ((Rect)localObject2).left = ((c)localObject1).e;
          ((Rect)localObject2).top = ((c)localObject1).f;
          ((Rect)localObject2).right = (((c)localObject1).e + ((c)localObject1).g);
          int i = ((c)localObject1).f;
          ((Rect)localObject2).bottom = (((c)localObject1).h + i);
          localObject1 = localBitmapRegionDecoder.decodeRegion((Rect)localObject2, this.a);
          AppMethodBeat.o(65981);
        }
      }
    }
  }

  public void release()
  {
    AppMethodBeat.i(65982);
    b();
    if ((this.b != null) && (this.c != null))
    {
      if (Build.VERSION.SDK_INT < 18)
        break label55;
      this.b.quitSafely();
    }
    while (true)
    {
      this.c = null;
      this.b = null;
      AppMethodBeat.o(65982);
      return;
      label55: this.b.quit();
    }
  }

  public void setVTTUrlAndImageUrls(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(65980);
    if (TextUtils.isEmpty(paramString))
    {
      TXCLog.e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
      AppMethodBeat.o(65980);
    }
    while (true)
    {
      return;
      b();
      a();
      this.c.post(new b.a(this, paramString));
      if ((paramList != null) && (paramList.size() != 0))
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          String str = (String)paramList.next();
          this.c.post(new b.b(this, paramString, str));
        }
      }
      AppMethodBeat.o(65980);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.a.b
 * JD-Core Version:    0.6.2
 */