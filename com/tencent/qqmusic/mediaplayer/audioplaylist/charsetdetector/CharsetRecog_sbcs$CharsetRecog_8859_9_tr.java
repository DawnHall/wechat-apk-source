package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_sbcs$CharsetRecog_8859_9_tr extends CharsetRecog_sbcs.CharsetRecog_8859_9
{
  private static int[] ngrams = { 2122337, 2122345, 2122357, 2122849, 2122853, 2123621, 2123873, 2124140, 2124641, 2124655, 2125153, 2125676, 2126689, 2126945, 2127461, 2128225, 6365282, 6384416, 6384737, 6384993, 6385184, 6385405, 6386208, 6386273, 6386429, 6386685, 6388065, 6449522, 6578464, 6579488, 6580512, 6627426, 6627435, 6644841, 6647328, 6648352, 6648425, 6648681, 6909029, 6909472, 6909545, 6910496, 7102830, 7102834, 7103776, 7103858, 7217249, 7217250, 7217259, 7234657, 7234661, 7234848, 7235872, 7235950, 7273760, 7498094, 7535982, 7759136, 7954720, 7958386, 16608800, 16608868, 16609021, 16642301 };

  public String getLanguage()
  {
    return "tr";
  }

  public CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104745);
    String str;
    int i;
    if (paramCharsetDetector.fC1Bytes)
    {
      str = "windows-1254";
      i = match(paramCharsetDetector, ngrams, byteMap);
      if (i != 0)
        break label46;
      paramCharsetDetector = null;
      AppMethodBeat.o(104745);
    }
    while (true)
    {
      return paramCharsetDetector;
      str = "ISO-8859-9";
      break;
      label46: paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, i, str, "tr");
      AppMethodBeat.o(104745);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.CharsetRecog_8859_9_tr
 * JD-Core Version:    0.6.2
 */