package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ap extends com.tencent.mm.bt.a
{
  public String kcU;
  public String kcV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89001);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kcU != null)
        paramArrayOfObject.e(1, this.kcU);
      if (this.kcV != null)
        paramArrayOfObject.e(2, this.kcV);
      AppMethodBeat.o(89001);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kcU == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.kcU) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kcV != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.kcV);
      AppMethodBeat.o(89001);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89001);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ap localap = (ap)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(89001);
          paramInt = -1;
          break;
        case 1:
          localap.kcU = locala.BTU.readString();
          AppMethodBeat.o(89001);
          paramInt = i;
          break;
        case 2:
          localap.kcV = locala.BTU.readString();
          AppMethodBeat.o(89001);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(89001);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ap
 * JD-Core Version:    0.6.2
 */