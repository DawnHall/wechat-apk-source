package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cfz extends com.tencent.mm.bt.a
{
  public int wYL;
  public LinkedList<axg> wYM;

  public cfz()
  {
    AppMethodBeat.i(58934);
    this.wYM = new LinkedList();
    AppMethodBeat.o(58934);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58935);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wYL);
      paramArrayOfObject.e(2, 8, this.wYM);
      AppMethodBeat.o(58935);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wYL) + 0 + e.a.a.a.c(2, 8, this.wYM);
        AppMethodBeat.o(58935);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wYM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58935);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfz localcfz = (cfz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58935);
          paramInt = -1;
          break;
        case 1:
          localcfz.wYL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58935);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfz.wYM.add(paramArrayOfObject);
          }
          AppMethodBeat.o(58935);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(58935);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfz
 * JD-Core Version:    0.6.2
 */