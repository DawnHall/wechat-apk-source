package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cqg extends bsr
{
  public long xlQ;
  public cqf xmK;
  public cqf xok;
  public cqf xol;
  public cqf xom;
  public cqf xon;
  public int xoo;
  public LinkedList<bts> xop;

  public cqg()
  {
    AppMethodBeat.i(5275);
    this.xop = new LinkedList();
    AppMethodBeat.o(5275);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5276);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xmK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReportData");
        AppMethodBeat.o(5276);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xmK != null)
      {
        paramArrayOfObject.iy(2, this.xmK.computeSize());
        this.xmK.writeFields(paramArrayOfObject);
      }
      if (this.xok != null)
      {
        paramArrayOfObject.iy(3, this.xok.computeSize());
        this.xok.writeFields(paramArrayOfObject);
      }
      if (this.xol != null)
      {
        paramArrayOfObject.iy(4, this.xol.computeSize());
        this.xol.writeFields(paramArrayOfObject);
      }
      if (this.xom != null)
      {
        paramArrayOfObject.iy(5, this.xom.computeSize());
        this.xom.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.xlQ);
      if (this.xon != null)
      {
        paramArrayOfObject.iy(7, this.xon.computeSize());
        this.xon.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.xoo);
      paramArrayOfObject.e(9, 8, this.xop);
      AppMethodBeat.o(5276);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1420;
    label1420: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xmK != null)
        paramInt = i + e.a.a.a.ix(2, this.xmK.computeSize());
      i = paramInt;
      if (this.xok != null)
        i = paramInt + e.a.a.a.ix(3, this.xok.computeSize());
      paramInt = i;
      if (this.xol != null)
        paramInt = i + e.a.a.a.ix(4, this.xol.computeSize());
      i = paramInt;
      if (this.xom != null)
        i = paramInt + e.a.a.a.ix(5, this.xom.computeSize());
      i += e.a.a.b.b.a.o(6, this.xlQ);
      paramInt = i;
      if (this.xon != null)
        paramInt = i + e.a.a.a.ix(7, this.xon.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.xoo) + e.a.a.a.c(9, 8, this.xop);
      AppMethodBeat.o(5276);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xop.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xmK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReportData");
          AppMethodBeat.o(5276);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5276);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cqg localcqg = (cqg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5276);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqg.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqg.xmK = paramArrayOfObject;
          }
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqg.xok = paramArrayOfObject;
          }
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqg.xol = paramArrayOfObject;
          }
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cqf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqg.xom = paramArrayOfObject;
          }
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 6:
          localcqg.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cqf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cqf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqg.xon = ((cqf)localObject1);
          }
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 8:
          localcqg.xoo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqg.xop.add(localObject1);
          }
          AppMethodBeat.o(5276);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5276);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqg
 * JD-Core Version:    0.6.2
 */