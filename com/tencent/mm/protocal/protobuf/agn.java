package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class agn extends bsr
{
  public int cME;
  public String kKO;
  public String kLv;
  public String sign;
  public String vBu;
  public String vBv;
  public int vBw;
  public LinkedList<nx> vBz;
  public String wni;

  public agn()
  {
    AppMethodBeat.i(89079);
    this.vBz = new LinkedList();
    AppMethodBeat.o(89079);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89080);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vBz);
      paramArrayOfObject.iz(3, this.cME);
      if (this.kLv != null)
        paramArrayOfObject.e(4, this.kLv);
      if (this.kKO != null)
        paramArrayOfObject.e(5, this.kKO);
      if (this.sign != null)
        paramArrayOfObject.e(6, this.sign);
      if (this.vBu != null)
        paramArrayOfObject.e(7, this.vBu);
      if (this.vBv != null)
        paramArrayOfObject.e(8, this.vBv);
      if (this.wni != null)
        paramArrayOfObject.e(9, this.wni);
      paramArrayOfObject.iz(10, this.vBw);
      AppMethodBeat.o(89080);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label955;
    label955: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vBz) + e.a.a.b.b.a.bs(3, this.cME);
      paramInt = i;
      if (this.kLv != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kLv);
      int j = paramInt;
      if (this.kKO != null)
        j = paramInt + e.a.a.b.b.a.f(5, this.kKO);
      i = j;
      if (this.sign != null)
        i = j + e.a.a.b.b.a.f(6, this.sign);
      paramInt = i;
      if (this.vBu != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vBu);
      i = paramInt;
      if (this.vBv != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vBv);
      paramInt = i;
      if (this.wni != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wni);
      paramInt += e.a.a.b.b.a.bs(10, this.vBw);
      AppMethodBeat.o(89080);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vBz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89080);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agn localagn = (agn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89080);
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
            localagn.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new nx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagn.vBz.add(paramArrayOfObject);
          }
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 3:
          localagn.cME = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 4:
          localagn.kLv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 5:
          localagn.kKO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 6:
          localagn.sign = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 7:
          localagn.vBu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 8:
          localagn.vBv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 9:
          localagn.wni = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        case 10:
          localagn.vBw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89080);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89080);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agn
 * JD-Core Version:    0.6.2
 */