package kotlinx.coroutines.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"ALREADY_REMOVED", "", "ALREADY_REMOVED$annotations", "()V", "getALREADY_REMOVED", "()Ljava/lang/Object;", "CONDITION_FALSE", "CONDITION_FALSE$annotations", "getCONDITION_FALSE", "FAILURE", "", "FAILURE$annotations", "LIST_EMPTY", "LIST_EMPTY$annotations", "getLIST_EMPTY", "REMOVE_PREPARED", "SUCCESS", "SUCCESS$annotations", "UNDECIDED", "UNDECIDED$annotations", "unwrap", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "AbstractAtomicDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "AddLastDesc", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Node", "RemoveFirstDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "kotlinx-coroutines-core"})
public final class g
{
  private static final Object BRl;
  private static final Object BRm;
  private static final Object BRn;
  private static final Object BRo;

  static
  {
    AppMethodBeat.i(118436);
    BRl = new m("CONDITION_FALSE");
    BRm = new m("ALREADY_REMOVED");
    BRn = new m("LIST_EMPTY");
    BRo = new m("REMOVE_PREPARED");
    AppMethodBeat.o(118436);
  }

  public static final Object elH()
  {
    return BRl;
  }

  public static final h em(Object paramObject)
  {
    AppMethodBeat.i(118435);
    j.p(paramObject, "receiver$0");
    if (!(paramObject instanceof l));
    for (Object localObject = null; ; localObject = paramObject)
    {
      localObject = (l)localObject;
      if (localObject != null)
      {
        localObject = ((l)localObject).BRF;
        if (localObject != null)
          break label50;
      }
      label50: for (paramObject = (h)paramObject; ; paramObject = localObject)
      {
        AppMethodBeat.o(118435);
        return paramObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.g
 * JD-Core Version:    0.6.2
 */