package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class acx extends btd
{
  public String Title;
  public LinkedList<String> wkF;
  public String wkG;
  public LinkedList<String> wkH;
  public LinkedList<String> wkI;
  public LinkedList<acy> wkJ;

  public acx()
  {
    AppMethodBeat.i(112423);
    this.wkF = new LinkedList();
    this.wkH = new LinkedList();
    this.wkI = new LinkedList();
    this.wkJ = new LinkedList();
    AppMethodBeat.o(112423);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112424);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(112424);
        throw paramArrayOfObject;
      }
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(112424);
        throw paramArrayOfObject;
      }
      if (this.wkG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: JsonData");
        AppMethodBeat.o(112424);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      paramArrayOfObject.e(3, 1, this.wkF);
      if (this.wkG != null)
        paramArrayOfObject.e(4, this.wkG);
      paramArrayOfObject.e(5, 1, this.wkH);
      paramArrayOfObject.e(6, 1, this.wkI);
      paramArrayOfObject.e(7, 8, this.wkJ);
      AppMethodBeat.o(112424);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label918;
    label918: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Title);
      i += e.a.a.a.c(3, 1, this.wkF);
      paramInt = i;
      if (this.wkG != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wkG);
      paramInt = paramInt + e.a.a.a.c(5, 1, this.wkH) + e.a.a.a.c(6, 1, this.wkI) + e.a.a.a.c(7, 8, this.wkJ);
      AppMethodBeat.o(112424);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wkF.clear();
        this.wkH.clear();
        this.wkI.clear();
        this.wkJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(112424);
          throw paramArrayOfObject;
        }
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(112424);
          throw paramArrayOfObject;
        }
        if (this.wkG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: JsonData");
          AppMethodBeat.o(112424);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(112424);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        acx localacx = (acx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112424);
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
            localacx.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(112424);
          paramInt = i;
          break;
        case 2:
          localacx.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112424);
          paramInt = i;
          break;
        case 3:
          localacx.wkF.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(112424);
          paramInt = i;
          break;
        case 4:
          localacx.wkG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112424);
          paramInt = i;
          break;
        case 5:
          localacx.wkH.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(112424);
          paramInt = i;
          break;
        case 6:
          localacx.wkI.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(112424);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new acy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((acy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localacx.wkJ.add(localObject1);
          }
          AppMethodBeat.o(112424);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112424);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acx
 * JD-Core Version:    0.6.2
 */