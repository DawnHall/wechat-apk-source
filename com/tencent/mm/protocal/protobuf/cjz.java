package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cjz extends bsr
{
  public String Name;
  public String vIk;
  public String wcI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73771);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wcI != null)
        paramArrayOfObject.e(2, this.wcI);
      if (this.Name != null)
        paramArrayOfObject.e(3, this.Name);
      if (this.vIk != null)
        paramArrayOfObject.e(4, this.vIk);
      AppMethodBeat.o(73771);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label516;
    label516: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wcI != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wcI);
      paramInt = i;
      if (this.Name != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Name);
      i = paramInt;
      if (this.vIk != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vIk);
      AppMethodBeat.o(73771);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73771);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cjz localcjz = (cjz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73771);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcjz.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(73771);
          paramInt = i;
          break;
        case 2:
          localcjz.wcI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73771);
          paramInt = i;
          break;
        case 3:
          localcjz.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73771);
          paramInt = i;
          break;
        case 4:
          localcjz.vIk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73771);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73771);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cjz
 * JD-Core Version:    0.6.2
 */