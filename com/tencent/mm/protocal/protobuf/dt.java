package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dt extends com.tencent.mm.bt.a
{
  public String vFA;
  public String vFB;
  public String vFz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94508);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFz != null)
        paramArrayOfObject.e(1, this.vFz);
      if (this.vFA != null)
        paramArrayOfObject.e(2, this.vFA);
      if (this.vFB != null)
        paramArrayOfObject.e(3, this.vFB);
      AppMethodBeat.o(94508);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vFz == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.vFz) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vFA != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vFA);
      i = paramInt;
      if (this.vFB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vFB);
      AppMethodBeat.o(94508);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94508);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dt localdt = (dt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94508);
          break;
        case 1:
          localdt.vFz = locala.BTU.readString();
          AppMethodBeat.o(94508);
          paramInt = i;
          break;
        case 2:
          localdt.vFA = locala.BTU.readString();
          AppMethodBeat.o(94508);
          paramInt = i;
          break;
        case 3:
          localdt.vFB = locala.BTU.readString();
          AppMethodBeat.o(94508);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94508);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dt
 * JD-Core Version:    0.6.2
 */