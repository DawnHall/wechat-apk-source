package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bba extends com.tencent.mm.bt.a
{
  public int ggb;
  public int wFN;
  public int wFO;
  public int wFP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(2543);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wFN);
      paramArrayOfObject.iz(2, this.wFO);
      paramArrayOfObject.iz(3, this.wFP);
      paramArrayOfObject.iz(4, this.ggb);
      AppMethodBeat.o(2543);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wFN) + 0 + e.a.a.b.b.a.bs(2, this.wFO) + e.a.a.b.b.a.bs(3, this.wFP) + e.a.a.b.b.a.bs(4, this.ggb);
        AppMethodBeat.o(2543);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2543);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bba localbba = (bba)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(2543);
          break;
        case 1:
          localbba.wFN = locala.BTU.vd();
          AppMethodBeat.o(2543);
          paramInt = 0;
          break;
        case 2:
          localbba.wFO = locala.BTU.vd();
          AppMethodBeat.o(2543);
          paramInt = 0;
          break;
        case 3:
          localbba.wFP = locala.BTU.vd();
          AppMethodBeat.o(2543);
          paramInt = 0;
          break;
        case 4:
          localbba.ggb = locala.BTU.vd();
          AppMethodBeat.o(2543);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(2543);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bba
 * JD-Core Version:    0.6.2
 */