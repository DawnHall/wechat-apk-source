package com.tencent.mm.plugin.sns.h;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h extends com.tencent.mm.bt.a
{
  public String qsx;
  public int state;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(36831);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.qsx != null)
        paramArrayOfObject.e(1, this.qsx);
      paramArrayOfObject.iz(2, this.state);
      AppMethodBeat.o(36831);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.qsx == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.qsx) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.state);
      AppMethodBeat.o(36831);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(36831);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        h localh = (h)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(36831);
          paramInt = -1;
          break;
        case 1:
          localh.qsx = locala.BTU.readString();
          AppMethodBeat.o(36831);
          paramInt = i;
          break;
        case 2:
          localh.state = locala.BTU.vd();
          AppMethodBeat.o(36831);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(36831);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.h.h
 * JD-Core Version:    0.6.2
 */