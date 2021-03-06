package com.tencent.mm.plugin.appbrand.media.music;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class AppBrandMusicClientService
{
  public static AppBrandMusicClientService ikP;
  public HashMap<String, AppBrandMusicClientService.a> ikO;
  public volatile String ikQ;

  static
  {
    AppMethodBeat.i(137835);
    ikP = new AppBrandMusicClientService();
    AppMethodBeat.o(137835);
  }

  private AppBrandMusicClientService()
  {
    AppMethodBeat.i(137833);
    this.ikO = new HashMap();
    this.ikQ = "";
    AppMethodBeat.o(137833);
  }

  public static boolean Cu(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(137834);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(137834);
    while (true)
    {
      return bool;
      AppBrandMusicClientService.IPCQueryPlaying localIPCQueryPlaying = new AppBrandMusicClientService.IPCQueryPlaying();
      AppBrandMusicClientService.IPCQueryPlaying.a(localIPCQueryPlaying, paramString);
      if (AppBrandMainProcessService.b(localIPCQueryPlaying))
      {
        bool = AppBrandMusicClientService.IPCQueryPlaying.a(localIPCQueryPlaying);
        AppMethodBeat.o(137834);
      }
      else
      {
        AppMethodBeat.o(137834);
      }
    }
  }

  public static class StopBackgroundMusicTask extends MainProcessTask
  {
    public static final Parcelable.Creator<StopBackgroundMusicTask> CREATOR;
    public String appId;

    static
    {
      AppMethodBeat.i(137832);
      CREATOR = new AppBrandMusicClientService.StopBackgroundMusicTask.1();
      AppMethodBeat.o(137832);
    }

    public StopBackgroundMusicTask()
    {
    }

    public StopBackgroundMusicTask(Parcel paramParcel)
    {
      AppMethodBeat.i(137828);
      g(paramParcel);
      AppMethodBeat.o(137828);
    }

    public final void asP()
    {
      AppMethodBeat.i(137829);
      ab.i("MicroMsg.AppBrandMusicClientService", "runInMainProcess");
      String str = a.a.aId().ikS;
      if ((!bo.isNullOrNil(str)) && (!str.equals(this.appId)))
      {
        ab.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { str, this.appId });
        aCb();
        AppMethodBeat.o(137829);
      }
      while (true)
      {
        return;
        if (a.a.aId().Cw(this.appId))
          break;
        ab.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, can't not stop, preAppId:%s, appId:%s", new Object[] { str, this.appId });
        aCb();
        AppMethodBeat.o(137829);
      }
      if (b.ail())
        ab.i("MicroMsg.AppBrandMusicClientService", "stop music ok");
      while (true)
      {
        aCb();
        AppMethodBeat.o(137829);
        break;
        ab.e("MicroMsg.AppBrandMusicClientService", "stop music fail");
      }
    }

    public final void g(Parcel paramParcel)
    {
      AppMethodBeat.i(137830);
      this.appId = paramParcel.readString();
      AppMethodBeat.o(137830);
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(137831);
      paramParcel.writeString(this.appId);
      AppMethodBeat.o(137831);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService
 * JD-Core Version:    0.6.2
 */