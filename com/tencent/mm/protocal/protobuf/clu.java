package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class clu extends com.tencent.mm.bt.a
{
  public int ptw;
  public int ptx;
  public int pty;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28689);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ptw);
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.pty);
      AppMethodBeat.o(28689);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.ptw) + 0 + e.a.a.b.b.a.bs(2, this.ptx) + e.a.a.b.b.a.bs(3, this.pty);
        AppMethodBeat.o(28689);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28689);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        clu localclu = (clu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28689);
          break;
        case 1:
          localclu.ptw = locala.BTU.vd();
          AppMethodBeat.o(28689);
          paramInt = 0;
          break;
        case 2:
          localclu.ptx = locala.BTU.vd();
          AppMethodBeat.o(28689);
          paramInt = 0;
          break;
        case 3:
          localclu.pty = locala.BTU.vd();
          AppMethodBeat.o(28689);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28689);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clu
 * JD-Core Version:    0.6.2
 */