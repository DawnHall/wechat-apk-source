package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class csv extends btd
{
  public int vOq;
  public String vOy;
  public int wCB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93810);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wCB);
      paramArrayOfObject.iz(3, this.vOq);
      if (this.vOy != null)
        paramArrayOfObject.e(4, this.vOy);
      AppMethodBeat.o(93810);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label481;
    label481: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wCB) + e.a.a.b.b.a.bs(3, this.vOq);
      paramInt = i;
      if (this.vOy != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vOy);
      AppMethodBeat.o(93810);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(93810);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        csv localcsv = (csv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(93810);
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
            localcsv.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(93810);
          paramInt = i;
          break;
        case 2:
          localcsv.wCB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93810);
          paramInt = i;
          break;
        case 3:
          localcsv.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93810);
          paramInt = i;
          break;
        case 4:
          localcsv.vOy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93810);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93810);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csv
 * JD-Core Version:    0.6.2
 */