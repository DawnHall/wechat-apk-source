package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cxx extends com.tencent.mm.bt.a
{
  public cxp xsZ;
  public int xtr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115025);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xsZ != null)
      {
        paramArrayOfObject.iy(1, this.xsZ.computeSize());
        this.xsZ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.xtr);
      AppMethodBeat.o(115025);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xsZ == null)
        break label370;
    label370: for (paramInt = e.a.a.a.ix(1, this.xsZ.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.xtr);
      AppMethodBeat.o(115025);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115025);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cxx localcxx = (cxx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(115025);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxx.xsZ = paramArrayOfObject;
          }
          AppMethodBeat.o(115025);
          paramInt = i;
          break;
        case 2:
          localcxx.xtr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(115025);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(115025);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxx
 * JD-Core Version:    0.6.2
 */