package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cwm extends btd
{
  public cwg vXT;
  public LinkedList<cwu> xsh;

  public cwm()
  {
    AppMethodBeat.i(114999);
    this.xsh = new LinkedList();
    AppMethodBeat.o(114999);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115000);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.xsh);
      if (this.vXT != null)
      {
        paramArrayOfObject.iy(3, this.vXT.computeSize());
        this.vXT.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(115000);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label627;
    label627: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.xsh);
      paramInt = i;
      if (this.vXT != null)
        paramInt = i + e.a.a.a.ix(3, this.vXT.computeSize());
      AppMethodBeat.o(115000);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xsh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115000);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cwm localcwm = (cwm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115000);
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
            localcwm.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(115000);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cwu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cwu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcwm.xsh.add(localObject1);
          }
          AppMethodBeat.o(115000);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cwg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cwg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcwm.vXT = ((cwg)localObject1);
          }
          AppMethodBeat.o(115000);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(115000);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwm
 * JD-Core Version:    0.6.2
 */