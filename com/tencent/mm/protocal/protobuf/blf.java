package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class blf extends com.tencent.mm.bt.a
{
  public int type;
  public String wOg;
  public String wOh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(114982);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.wOg != null)
        paramArrayOfObject.e(2, this.wOg);
      if (this.wOh != null)
        paramArrayOfObject.e(3, this.wOh);
      AppMethodBeat.o(114982);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.wOg != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wOg);
        i = paramInt;
        if (this.wOh != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wOh);
        AppMethodBeat.o(114982);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114982);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        blf localblf = (blf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114982);
          break;
        case 1:
          localblf.type = locala.BTU.vd();
          AppMethodBeat.o(114982);
          paramInt = 0;
          break;
        case 2:
          localblf.wOg = locala.BTU.readString();
          AppMethodBeat.o(114982);
          paramInt = 0;
          break;
        case 3:
          localblf.wOh = locala.BTU.readString();
          AppMethodBeat.o(114982);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(114982);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blf
 * JD-Core Version:    0.6.2
 */