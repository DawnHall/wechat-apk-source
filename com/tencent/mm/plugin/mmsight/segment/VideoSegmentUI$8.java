package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.vfs.FileSystem.a;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.List;

final class VideoSegmentUI$8
  implements Runnable
{
  VideoSegmentUI$8(VideoSegmentUI paramVideoSegmentUI, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55039);
    Object localObject = e.cl(CaptureMMProxy.getInstance().getAccVideoPath(), false);
    if (localObject == null)
      AppMethodBeat.o(55039);
    while (true)
    {
      return;
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        FileSystem.a locala = (FileSystem.a)((Iterator)localObject).next();
        if ((locala.name != null) && (((locala.name.startsWith("vsg_output_")) && (!locala.name.equals(this.ozS))) || ((locala.name.startsWith("vsg_thumb_")) && (!locala.name.equals(this.ozT)))))
          locala.delete();
      }
      AppMethodBeat.o(55039);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.8
 * JD-Core Version:    0.6.2
 */