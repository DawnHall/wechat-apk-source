package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cna extends btd
{
  public SKBuiltinBuffer_t vEF;
  public SKBuiltinBuffer_t vHJ;
  public String vHO;
  public SKBuiltinBuffer_t vHP;
  public bts vMa;
  public SKBuiltinBuffer_t vMb;
  public String wdB;
  public bts wtZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(60073);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(60073);
        throw paramArrayOfObject;
      }
      if (this.wtZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgSid");
        AppMethodBeat.o(60073);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(60073);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wtZ != null)
      {
        paramArrayOfObject.iy(2, this.wtZ.computeSize());
        this.wtZ.writeFields(paramArrayOfObject);
      }
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(3, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      if (this.wdB != null)
        paramArrayOfObject.e(4, this.wdB);
      if (this.vMa != null)
      {
        paramArrayOfObject.iy(5, this.vMa.computeSize());
        this.vMa.writeFields(paramArrayOfObject);
      }
      if (this.vHP != null)
      {
        paramArrayOfObject.iy(6, this.vHP.computeSize());
        this.vHP.writeFields(paramArrayOfObject);
      }
      if (this.vMb != null)
      {
        paramArrayOfObject.iy(7, this.vMb.computeSize());
        this.vMb.writeFields(paramArrayOfObject);
      }
      if (this.vHO != null)
        paramArrayOfObject.e(8, this.vHO);
      if (this.vHJ != null)
      {
        paramArrayOfObject.iy(9, this.vHJ.computeSize());
        this.vHJ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(60073);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1552;
    label1552: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wtZ != null)
        paramInt = i + e.a.a.a.ix(2, this.wtZ.computeSize());
      i = paramInt;
      if (this.vEF != null)
        i = paramInt + e.a.a.a.ix(3, this.vEF.computeSize());
      paramInt = i;
      if (this.wdB != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wdB);
      i = paramInt;
      if (this.vMa != null)
        i = paramInt + e.a.a.a.ix(5, this.vMa.computeSize());
      paramInt = i;
      if (this.vHP != null)
        paramInt = i + e.a.a.a.ix(6, this.vHP.computeSize());
      i = paramInt;
      if (this.vMb != null)
        i = paramInt + e.a.a.a.ix(7, this.vMb.computeSize());
      paramInt = i;
      if (this.vHO != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vHO);
      i = paramInt;
      if (this.vHJ != null)
        i = paramInt + e.a.a.a.ix(9, this.vHJ.computeSize());
      AppMethodBeat.o(60073);
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
          AppMethodBeat.o(60073);
          throw paramArrayOfObject;
        }
        if (this.wtZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgSid");
          AppMethodBeat.o(60073);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(60073);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(60073);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cna localcna = (cna)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60073);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcna.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcna.wtZ = ((bts)localObject1);
          }
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcna.vEF = paramArrayOfObject;
          }
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 4:
          localcna.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcna.vMa = ((bts)localObject1);
          }
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcna.vHP = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcna.vMb = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 8:
          localcna.vHO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcna.vHJ = paramArrayOfObject;
          }
          AppMethodBeat.o(60073);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(60073);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cna
 * JD-Core Version:    0.6.2
 */