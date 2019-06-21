package com.tencent.qqmusic.mediaplayer.upstream;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class StreamingRequest
{
  public final Map<String, String> headers;
  public final Uri uri;

  public StreamingRequest(Uri paramUri, Map<String, String> paramMap)
  {
    this.uri = paramUri;
    this.headers = paramMap;
  }

  public String toString()
  {
    AppMethodBeat.i(105509);
    String str = "StreamingRequest{uri='" + this.uri + '\'' + ", headers=" + this.headers + '}';
    AppMethodBeat.o(105509);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest
 * JD-Core Version:    0.6.2
 */