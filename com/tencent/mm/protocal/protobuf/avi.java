package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class avi extends com.tencent.mm.bt.a
{
  public int cyE;
  public String cyF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96249);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.cyE);
      if (this.cyF != null)
        paramArrayOfObject.e(2, this.cyF);
      AppMethodBeat.o(96249);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.cyE) + 0;
        paramInt = i;
        if (this.cyF != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.cyF);
        AppMethodBeat.o(96249);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96249);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        avi localavi = (avi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(96249);
          paramInt = -1;
          break;
        case 1:
          localavi.cyE = locala.BTU.vd();
          AppMethodBeat.o(96249);
          paramInt = 0;
          break;
        case 2:
          localavi.cyF = locala.BTU.readString();
          AppMethodBeat.o(96249);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(96249);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avi
 * JD-Core Version:    0.6.2
 */