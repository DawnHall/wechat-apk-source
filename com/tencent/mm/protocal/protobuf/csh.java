package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class csh extends com.tencent.mm.bt.a
{
  public b xpD;
  public b xpE;
  public b xpF;
  public b xpG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56997);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpD != null)
        paramArrayOfObject.c(1, this.xpD);
      if (this.xpE != null)
        paramArrayOfObject.c(2, this.xpE);
      if (this.xpF != null)
        paramArrayOfObject.c(3, this.xpF);
      if (this.xpG != null)
        paramArrayOfObject.c(4, this.xpG);
      AppMethodBeat.o(56997);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpD == null)
        break label416;
    label416: for (i = e.a.a.b.b.a.b(1, this.xpD) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xpE != null)
        paramInt = i + e.a.a.b.b.a.b(2, this.xpE);
      i = paramInt;
      if (this.xpF != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.xpF);
      paramInt = i;
      if (this.xpG != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.xpG);
      AppMethodBeat.o(56997);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56997);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        csh localcsh = (csh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56997);
          break;
        case 1:
          localcsh.xpD = locala.BTU.emu();
          AppMethodBeat.o(56997);
          paramInt = i;
          break;
        case 2:
          localcsh.xpE = locala.BTU.emu();
          AppMethodBeat.o(56997);
          paramInt = i;
          break;
        case 3:
          localcsh.xpF = locala.BTU.emu();
          AppMethodBeat.o(56997);
          paramInt = i;
          break;
        case 4:
          localcsh.xpG = locala.BTU.emu();
          AppMethodBeat.o(56997);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56997);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csh
 * JD-Core Version:    0.6.2
 */