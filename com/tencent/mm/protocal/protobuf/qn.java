package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class qn extends btd
{
  public String guQ;
  public String vXA;
  public int vXy;
  public String vXz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28354);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28354);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.guQ != null)
        paramArrayOfObject.e(2, this.guQ);
      paramArrayOfObject.iz(3, this.vXy);
      if (this.vXz != null)
        paramArrayOfObject.e(4, this.vXz);
      if (this.vXA != null)
        paramArrayOfObject.e(5, this.vXA);
      AppMethodBeat.o(28354);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label623;
    label623: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.guQ);
      i += e.a.a.b.b.a.bs(3, this.vXy);
      paramInt = i;
      if (this.vXz != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vXz);
      i = paramInt;
      if (this.vXA != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vXA);
      AppMethodBeat.o(28354);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28354);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28354);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qn localqn = (qn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28354);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localqn.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28354);
          paramInt = i;
          break;
        case 2:
          localqn.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28354);
          paramInt = i;
          break;
        case 3:
          localqn.vXy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28354);
          paramInt = i;
          break;
        case 4:
          localqn.vXz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28354);
          paramInt = i;
          break;
        case 5:
          localqn.vXA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28354);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28354);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qn
 * JD-Core Version:    0.6.2
 */