package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aqi extends btd
{
  public int wug;
  public LinkedList<crw> wuh;

  public aqi()
  {
    AppMethodBeat.i(28496);
    this.wuh = new LinkedList();
    AppMethodBeat.o(28496);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28497);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28497);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wug);
      paramArrayOfObject.e(3, 8, this.wuh);
      AppMethodBeat.o(28497);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label575;
    label575: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wug) + e.a.a.a.c(3, 8, this.wuh);
      AppMethodBeat.o(28497);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wuh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28497);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28497);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aqi localaqi = (aqi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28497);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqi.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28497);
          paramInt = i;
          break;
        case 2:
          localaqi.wug = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28497);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new crw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((crw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqi.wuh.add(localObject1);
          }
          AppMethodBeat.o(28497);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28497);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aqi
 * JD-Core Version:    0.6.2
 */