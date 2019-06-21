package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_mbcs$CharsetRecog_big5 extends CharsetRecog_mbcs
{
  static int[] commonChars = { 41280, 41281, 41282, 41283, 41287, 41289, 41333, 41334, 42048, 42054, 42055, 42056, 42065, 42068, 42071, 42084, 42090, 42092, 42103, 42147, 42148, 42151, 42177, 42190, 42193, 42207, 42216, 42237, 42304, 42312, 42328, 42345, 42445, 42471, 42583, 42593, 42594, 42600, 42608, 42664, 42675, 42681, 42707, 42715, 42726, 42738, 42816, 42833, 42841, 42970, 43171, 43173, 43181, 43217, 43219, 43236, 43260, 43456, 43474, 43507, 43627, 43706, 43710, 43724, 43772, 44103, 44111, 44208, 44242, 44377, 44745, 45024, 45290, 45423, 45747, 45764, 45935, 46156, 46158, 46412, 46501, 46525, 46544, 46552, 46705, 47085, 47207, 47428, 47832, 47940, 48033, 48593, 49860, 50105, 50240, 50271 };

  public String getLanguage()
  {
    return "zh";
  }

  String getName()
  {
    return "Big5";
  }

  CharsetMatch match(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104759);
    int i = match(paramCharsetDetector, commonChars);
    if (i == 0)
    {
      paramCharsetDetector = null;
      AppMethodBeat.o(104759);
    }
    while (true)
    {
      return paramCharsetDetector;
      paramCharsetDetector = new CharsetMatch(paramCharsetDetector, this, i);
      AppMethodBeat.o(104759);
    }
  }

  boolean nextChar(CharsetRecog_mbcs.iteratedChar paramiteratedChar, CharsetDetector paramCharsetDetector)
  {
    boolean bool = false;
    AppMethodBeat.i(104758);
    paramiteratedChar.error = false;
    int i = paramiteratedChar.nextByte(paramCharsetDetector);
    paramiteratedChar.charValue = i;
    if (i < 0)
      AppMethodBeat.o(104758);
    while (true)
    {
      return bool;
      if ((i <= 127) || (i == 255))
      {
        AppMethodBeat.o(104758);
        bool = true;
      }
      else
      {
        i = paramiteratedChar.nextByte(paramCharsetDetector);
        if (i < 0)
        {
          AppMethodBeat.o(104758);
        }
        else
        {
          paramiteratedChar.charValue = (paramiteratedChar.charValue << 8 | i);
          if ((i < 64) || (i == 127) || (i == 255))
            paramiteratedChar.error = true;
          AppMethodBeat.o(104758);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_mbcs.CharsetRecog_big5
 * JD-Core Version:    0.6.2
 */