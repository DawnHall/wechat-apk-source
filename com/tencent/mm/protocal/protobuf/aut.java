package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aut extends bsr
{
  public int ehB;
  public LinkedList<bay> vEh;
  public bts vEi;
  public int wyV;
  public String wyW;

  public aut()
  {
    AppMethodBeat.i(5590);
    this.vEh = new LinkedList();
    AppMethodBeat.o(5590);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5591);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ChatRoomName");
        AppMethodBeat.o(5591);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ehB);
      paramArrayOfObject.e(3, 8, this.vEh);
      if (this.vEi != null)
      {
        paramArrayOfObject.iy(4, this.vEi.computeSize());
        this.vEi.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wyV);
      if (this.wyW != null)
        paramArrayOfObject.e(6, this.wyW);
      AppMethodBeat.o(5591);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label848;
    label848: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ehB) + e.a.a.a.c(3, 8, this.vEh);
      paramInt = i;
      if (this.vEi != null)
        paramInt = i + e.a.a.a.ix(4, this.vEi.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(5, this.wyV);
      paramInt = i;
      if (this.wyW != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wyW);
      AppMethodBeat.o(5591);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ChatRoomName");
          AppMethodBeat.o(5591);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5591);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aut localaut = (aut)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5591);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaut.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(5591);
          paramInt = i;
          break;
        case 2:
          localaut.ehB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5591);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bay();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaut.vEh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(5591);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaut.vEi = ((bts)localObject1);
          }
          AppMethodBeat.o(5591);
          paramInt = i;
          break;
        case 5:
          localaut.wyV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5591);
          paramInt = i;
          break;
        case 6:
          localaut.wyW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5591);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5591);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aut
 * JD-Core Version:    0.6.2
 */