package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bt extends com.tencent.mm.bt.a
{
  public long eRt;
  public String fns;
  public int key;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72614);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.key);
      if (this.fns != null)
        paramArrayOfObject.e(2, this.fns);
      paramArrayOfObject.ai(3, this.eRt);
      AppMethodBeat.o(72614);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.key) + 0;
        paramInt = i;
        if (this.fns != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.fns);
        paramInt += e.a.a.b.b.a.o(3, this.eRt);
        AppMethodBeat.o(72614);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72614);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bt localbt = (bt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72614);
          break;
        case 1:
          localbt.key = locala.BTU.vd();
          AppMethodBeat.o(72614);
          paramInt = 0;
          break;
        case 2:
          localbt.fns = locala.BTU.readString();
          AppMethodBeat.o(72614);
          paramInt = 0;
          break;
        case 3:
          localbt.eRt = locala.BTU.ve();
          AppMethodBeat.o(72614);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72614);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bt
 * JD-Core Version:    0.6.2
 */