package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cue extends com.tencent.mm.bt.a
{
  public LinkedList<cuc> wtc;
  public boolean xqF;
  public boolean xqq;

  public cue()
  {
    AppMethodBeat.i(28742);
    this.wtc = new LinkedList();
    AppMethodBeat.o(28742);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28743);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.xqq);
      paramArrayOfObject.e(2, 8, this.wtc);
      paramArrayOfObject.aO(3, this.xqF);
      AppMethodBeat.o(28743);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 1 + 0 + e.a.a.a.c(2, 8, this.wtc) + (e.a.a.b.b.a.fv(3) + 1);
        AppMethodBeat.o(28743);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wtc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28743);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cue localcue = (cue)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28743);
          break;
        case 1:
          localcue.xqq = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28743);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cuc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cuc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcue.wtc.add(localObject1);
          }
          AppMethodBeat.o(28743);
          paramInt = 0;
          break;
        case 3:
          localcue.xqF = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28743);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28743);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cue
 * JD-Core Version:    0.6.2
 */