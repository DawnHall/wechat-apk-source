package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends com.tencent.mm.bt.a
{
  public int kKI;
  public boolean kKJ;
  public long kKK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35523);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.kKI);
      paramArrayOfObject.aO(2, this.kKJ);
      paramArrayOfObject.ai(3, this.kKK);
      AppMethodBeat.o(35523);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.kKI) + 0 + (e.a.a.b.b.a.fv(2) + 1) + e.a.a.b.b.a.o(3, this.kKK);
        AppMethodBeat.o(35523);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35523);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        n localn = (n)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35523);
          break;
        case 1:
          localn.kKI = locala.BTU.vd();
          AppMethodBeat.o(35523);
          paramInt = 0;
          break;
        case 2:
          localn.kKJ = locala.BTU.ehX();
          AppMethodBeat.o(35523);
          paramInt = 0;
          break;
        case 3:
          localn.kKK = locala.BTU.ve();
          AppMethodBeat.o(35523);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(35523);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.a.a.n
 * JD-Core Version:    0.6.2
 */