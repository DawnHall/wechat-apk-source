package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cic extends bsr
{
  public String cDo;
  public String xcb;
  public String xcc;
  public String xcd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51775);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xcc != null)
        paramArrayOfObject.e(2, this.xcc);
      if (this.xcb != null)
        paramArrayOfObject.e(3, this.xcb);
      if (this.xcd != null)
        paramArrayOfObject.e(4, this.xcd);
      if (this.cDo != null)
        paramArrayOfObject.e(5, this.cDo);
      AppMethodBeat.o(51775);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label579;
    label579: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xcc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xcc);
      i = paramInt;
      if (this.xcb != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xcb);
      paramInt = i;
      if (this.xcd != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xcd);
      i = paramInt;
      if (this.cDo != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.cDo);
      AppMethodBeat.o(51775);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51775);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cic localcic = (cic)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51775);
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
            localcic.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(51775);
          paramInt = i;
          break;
        case 2:
          localcic.xcc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51775);
          paramInt = i;
          break;
        case 3:
          localcic.xcb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51775);
          paramInt = i;
          break;
        case 4:
          localcic.xcd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51775);
          paramInt = i;
          break;
        case 5:
          localcic.cDo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51775);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51775);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cic
 * JD-Core Version:    0.6.2
 */